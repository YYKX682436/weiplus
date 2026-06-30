package androidx.camera.extensions.internal.compat.workaround;

/* loaded from: classes14.dex */
public class CaptureOutputSurfaceForCaptureProcessor {
    private static final int MAX_IMAGES = 2;
    private static final java.lang.String TAG = "CaptureOutputSurface";
    private static final long UNSPECIFIED_TIMESTAMP = -1;
    private final android.media.ImageWriter mImageWriter;
    private final androidx.camera.core.impl.ImageReaderProxy mIntermediateImageReader;
    private final boolean mNeedIntermediaSurface;
    private final boolean mNeedOverrideTimestamp;
    private final android.view.Surface mOutputSurface;
    private final java.lang.Object mLock = new java.lang.Object();
    private boolean mIsClosed = false;
    long mOutputImageTimeStamp = -1;

    /* loaded from: classes14.dex */
    public static final class Api23Impl {
        private Api23Impl() {
        }

        public static void setImageTimestamp(android.media.Image image, long j17) {
            image.setTimestamp(j17);
        }
    }

    /* loaded from: classes14.dex */
    public static final class ImageWriterCompat {
        private ImageWriterCompat() {
        }

        public static void close(android.media.ImageWriter imageWriter) {
            imageWriter.close();
        }

        public static android.media.ImageWriter newInstance(android.view.Surface surface, int i17, int i18) {
            return android.media.ImageWriter.newInstance(surface, i17, i18);
        }

        public static void queueInputImage(android.media.ImageWriter imageWriter, android.media.Image image) {
            imageWriter.queueInputImage(image);
        }
    }

    public CaptureOutputSurfaceForCaptureProcessor(android.view.Surface surface, android.util.Size size, boolean z17) {
        this.mNeedOverrideTimestamp = z17;
        boolean z18 = androidx.camera.extensions.internal.compat.quirk.DeviceQuirks.get(androidx.camera.extensions.internal.compat.quirk.CaptureOutputSurfaceOccupiedQuirk.class) != null || z17;
        this.mNeedIntermediaSurface = z18;
        if (android.os.Build.VERSION.SDK_INT < 29 || !z18) {
            this.mOutputSurface = surface;
            this.mIntermediateImageReader = null;
            this.mImageWriter = null;
        } else {
            androidx.camera.core.Logger.d(TAG, "Enabling intermediate surface");
            androidx.camera.core.impl.ImageReaderProxy createIsolatedReader = androidx.camera.core.ImageReaderProxys.createIsolatedReader(size.getWidth(), size.getHeight(), 35, 2);
            this.mIntermediateImageReader = createIsolatedReader;
            this.mOutputSurface = createIsolatedReader.getSurface();
            this.mImageWriter = androidx.camera.extensions.internal.compat.workaround.CaptureOutputSurfaceForCaptureProcessor.ImageWriterCompat.newInstance(surface, 2, 35);
            createIsolatedReader.setOnImageAvailableListener(new androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener() { // from class: androidx.camera.extensions.internal.compat.workaround.CaptureOutputSurfaceForCaptureProcessor$$a
                @Override // androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener
                public final void onImageAvailable(androidx.camera.core.impl.ImageReaderProxy imageReaderProxy) {
                    androidx.camera.extensions.internal.compat.workaround.CaptureOutputSurfaceForCaptureProcessor.this.lambda$new$0(imageReaderProxy);
                }
            }, androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(androidx.camera.core.impl.ImageReaderProxy imageReaderProxy) {
        android.media.Image image;
        synchronized (this.mLock) {
            if (this.mIsClosed) {
                return;
            }
            androidx.camera.core.ImageProxy acquireNextImage = imageReaderProxy.acquireNextImage();
            if (acquireNextImage != null && (image = acquireNextImage.getImage()) != null) {
                if (this.mNeedOverrideTimestamp) {
                    long j17 = this.mOutputImageTimeStamp;
                    if (j17 != -1) {
                        androidx.camera.extensions.internal.compat.workaround.CaptureOutputSurfaceForCaptureProcessor.Api23Impl.setImageTimestamp(image, j17);
                    }
                }
                androidx.camera.extensions.internal.compat.workaround.CaptureOutputSurfaceForCaptureProcessor.ImageWriterCompat.queueInputImage(this.mImageWriter, image);
            }
        }
    }

    public void close() {
        synchronized (this.mLock) {
            this.mIsClosed = true;
            if (android.os.Build.VERSION.SDK_INT >= 29 && this.mNeedIntermediaSurface) {
                this.mIntermediateImageReader.clearOnImageAvailableListener();
                this.mIntermediateImageReader.close();
                androidx.camera.extensions.internal.compat.workaround.CaptureOutputSurfaceForCaptureProcessor.ImageWriterCompat.close(this.mImageWriter);
            }
        }
    }

    public android.view.Surface getSurface() {
        return this.mOutputSurface;
    }

    public void setOutputImageTimestamp(long j17) {
        if (this.mNeedOverrideTimestamp) {
            this.mOutputImageTimeStamp = j17;
        }
    }
}
