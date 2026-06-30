package androidx.camera.camera2.internal;

/* loaded from: classes13.dex */
public class DisplayInfoManager {
    private static volatile androidx.camera.camera2.internal.DisplayInfoManager sInstance;
    private final android.hardware.display.DisplayManager mDisplayManager;
    private static final android.util.Size MAX_PREVIEW_SIZE = new android.util.Size(1920, 1080);
    private static final android.util.Size ABNORMAL_DISPLAY_SIZE_THRESHOLD = new android.util.Size(com.tencent.mapsdk.internal.km.f50100e, 240);
    private static final android.util.Size FALLBACK_DISPLAY_SIZE = new android.util.Size(640, 480);
    private static final java.lang.Object INSTANCE_LOCK = new java.lang.Object();
    private volatile android.util.Size mPreviewSize = null;
    private final androidx.camera.camera2.internal.compat.workaround.MaxPreviewSize mMaxPreviewSize = new androidx.camera.camera2.internal.compat.workaround.MaxPreviewSize();
    private final androidx.camera.camera2.internal.compat.workaround.DisplaySizeCorrector mDisplaySizeCorrector = new androidx.camera.camera2.internal.compat.workaround.DisplaySizeCorrector();

    private DisplayInfoManager(android.content.Context context) {
        this.mDisplayManager = (android.hardware.display.DisplayManager) context.getSystemService("display");
    }

    private android.util.Size calculatePreviewSize() {
        android.util.Size correctedDisplaySize = getCorrectedDisplaySize();
        int width = correctedDisplaySize.getWidth() * correctedDisplaySize.getHeight();
        android.util.Size size = MAX_PREVIEW_SIZE;
        if (width > size.getWidth() * size.getHeight()) {
            correctedDisplaySize = size;
        }
        return this.mMaxPreviewSize.getMaxPreviewResolution(correctedDisplaySize);
    }

    private android.util.Size getCorrectedDisplaySize() {
        android.graphics.Point point = new android.graphics.Point();
        getMaxSizeDisplay(false).getRealSize(point);
        android.util.Size size = new android.util.Size(point.x, point.y);
        if (androidx.camera.core.internal.utils.SizeUtil.isSmallerByArea(size, ABNORMAL_DISPLAY_SIZE_THRESHOLD) && (size = this.mDisplaySizeCorrector.getDisplaySize()) == null) {
            size = FALLBACK_DISPLAY_SIZE;
        }
        return size.getHeight() > size.getWidth() ? new android.util.Size(size.getHeight(), size.getWidth()) : size;
    }

    public static androidx.camera.camera2.internal.DisplayInfoManager getInstance(android.content.Context context) {
        if (sInstance == null) {
            synchronized (INSTANCE_LOCK) {
                if (sInstance == null) {
                    sInstance = new androidx.camera.camera2.internal.DisplayInfoManager(context);
                }
            }
        }
        return sInstance;
    }

    private android.view.Display getMaxSizeDisplayInternal(android.view.Display[] displayArr, boolean z17) {
        android.view.Display display = null;
        int i17 = -1;
        for (android.view.Display display2 : displayArr) {
            if (!z17 || display2.getState() != 1) {
                android.graphics.Point point = new android.graphics.Point();
                display2.getRealSize(point);
                int i18 = point.x;
                int i19 = point.y;
                if (i18 * i19 > i17) {
                    display = display2;
                    i17 = i18 * i19;
                }
            }
        }
        return display;
    }

    public static void releaseInstance() {
        sInstance = null;
    }

    public android.view.Display getMaxSizeDisplay(boolean z17) {
        android.view.Display[] displays = this.mDisplayManager.getDisplays();
        if (displays.length == 1) {
            return displays[0];
        }
        android.view.Display maxSizeDisplayInternal = getMaxSizeDisplayInternal(displays, z17);
        if (maxSizeDisplayInternal == null && z17) {
            maxSizeDisplayInternal = getMaxSizeDisplayInternal(displays, false);
        }
        if (maxSizeDisplayInternal != null) {
            return maxSizeDisplayInternal;
        }
        throw new java.lang.IllegalArgumentException("No display can be found from the input display manager!");
    }

    public android.util.Size getPreviewSize() {
        if (this.mPreviewSize != null) {
            return this.mPreviewSize;
        }
        this.mPreviewSize = calculatePreviewSize();
        return this.mPreviewSize;
    }

    public void refresh() {
        this.mPreviewSize = calculatePreviewSize();
    }
}
