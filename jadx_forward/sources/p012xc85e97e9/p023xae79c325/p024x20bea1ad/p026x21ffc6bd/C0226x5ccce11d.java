package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd;

/* renamed from: androidx.camera.camera2.internal.DisplayInfoManager */
/* loaded from: classes13.dex */
public class C0226x5ccce11d {

    /* renamed from: sInstance */
    private static volatile p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0226x5ccce11d f409xbfaed628;

    /* renamed from: mDisplayManager */
    private final android.hardware.display.DisplayManager f410x99489a58;

    /* renamed from: MAX_PREVIEW_SIZE */
    private static final android.util.Size f408xb1b1953 = new android.util.Size(1920, 1080);

    /* renamed from: ABNORMAL_DISPLAY_SIZE_THRESHOLD */
    private static final android.util.Size f405x87f55ca1 = new android.util.Size(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.km.f131633e, 240);

    /* renamed from: FALLBACK_DISPLAY_SIZE */
    private static final android.util.Size f406xdcd213bb = new android.util.Size(640, 480);

    /* renamed from: INSTANCE_LOCK */
    private static final java.lang.Object f407x69168695 = new java.lang.Object();

    /* renamed from: mPreviewSize */
    private volatile android.util.Size f413x5d16253c = null;

    /* renamed from: mMaxPreviewSize */
    private final p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p031xe2513c1e.C0418x1135c05 f412x437f99b2 = new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p031xe2513c1e.C0418x1135c05();

    /* renamed from: mDisplaySizeCorrector */
    private final p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p031xe2513c1e.C0411x72e10b4a f411xd0019337 = new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p031xe2513c1e.C0411x72e10b4a();

    private C0226x5ccce11d(android.content.Context context) {
        this.f410x99489a58 = (android.hardware.display.DisplayManager) context.getSystemService("display");
    }

    /* renamed from: calculatePreviewSize */
    private android.util.Size m3379x688dbca3() {
        android.util.Size m3380xde719e10 = m3380xde719e10();
        int width = m3380xde719e10.getWidth() * m3380xde719e10.getHeight();
        android.util.Size size = f408xb1b1953;
        if (width > size.getWidth() * size.getHeight()) {
            m3380xde719e10 = size;
        }
        return this.f412x437f99b2.m4083xc2116a06(m3380xde719e10);
    }

    /* renamed from: getCorrectedDisplaySize */
    private android.util.Size m3380xde719e10() {
        android.graphics.Point point = new android.graphics.Point();
        m3384xf8884673(false).getRealSize(point);
        android.util.Size size = new android.util.Size(point.x, point.y);
        if (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p049x6a710b1.C0871x3656bfc3.m6242xf506458e(size, f405x87f55ca1) && (size = this.f411xd0019337.m4073x400482ad()) == null) {
            size = f406xdcd213bb;
        }
        return size.getHeight() > size.getWidth() ? new android.util.Size(size.getHeight(), size.getWidth()) : size;
    }

    /* renamed from: getInstance */
    public static p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0226x5ccce11d m3381x9cf0d20b(android.content.Context context) {
        if (f409xbfaed628 == null) {
            synchronized (f407x69168695) {
                if (f409xbfaed628 == null) {
                    f409xbfaed628 = new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0226x5ccce11d(context);
                }
            }
        }
        return f409xbfaed628;
    }

    /* renamed from: getMaxSizeDisplayInternal */
    private android.view.Display m3382x677a4e50(android.view.Display[] displayArr, boolean z17) {
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

    /* renamed from: releaseInstance */
    public static void m3383x942929bc() {
        f409xbfaed628 = null;
    }

    /* renamed from: getMaxSizeDisplay */
    public android.view.Display m3384xf8884673(boolean z17) {
        android.view.Display[] displays = this.f410x99489a58.getDisplays();
        if (displays.length == 1) {
            return displays[0];
        }
        android.view.Display m3382x677a4e50 = m3382x677a4e50(displays, z17);
        if (m3382x677a4e50 == null && z17) {
            m3382x677a4e50 = m3382x677a4e50(displays, false);
        }
        if (m3382x677a4e50 != null) {
            return m3382x677a4e50;
        }
        throw new java.lang.IllegalArgumentException("No display can be found from the input display manager!");
    }

    /* renamed from: getPreviewSize */
    public android.util.Size m3385x8cdf5ab3() {
        if (this.f413x5d16253c != null) {
            return this.f413x5d16253c;
        }
        this.f413x5d16253c = m3379x688dbca3();
        return this.f413x5d16253c;
    }

    /* renamed from: refresh */
    public void m3386x40b292db() {
        this.f413x5d16253c = m3379x688dbca3();
    }
}
