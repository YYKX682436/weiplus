package p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p057xaf3f3382.p059xe2513c1e;

/* renamed from: androidx.camera.extensions.internal.compat.workaround.CaptureOutputSurfaceForCaptureProcessor */
/* loaded from: classes14.dex */
public class C1010x6cc09e0f {

    /* renamed from: MAX_IMAGES */
    private static final int f2447xf73c15d3 = 2;
    private static final java.lang.String TAG = "CaptureOutputSurface";

    /* renamed from: UNSPECIFIED_TIMESTAMP */
    private static final long f2448xfab9a1ce = -1;

    /* renamed from: mImageWriter */
    private final android.media.ImageWriter f2449x32699b01;

    /* renamed from: mIntermediateImageReader */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0719xa3f4ef30 f2450x169ac18;

    /* renamed from: mNeedIntermediaSurface */
    private final boolean f2453xf7b122a2;

    /* renamed from: mNeedOverrideTimestamp */
    private final boolean f2454xb6d6ae47;

    /* renamed from: mOutputSurface */
    private final android.view.Surface f2456x6be280ff;

    /* renamed from: mLock */
    private final java.lang.Object f2452x6243b38 = new java.lang.Object();

    /* renamed from: mIsClosed */
    private boolean f2451xfc407ac3 = false;

    /* renamed from: mOutputImageTimeStamp */
    long f2455xa4c05149 = -1;

    /* renamed from: androidx.camera.extensions.internal.compat.workaround.CaptureOutputSurfaceForCaptureProcessor$Api23Impl */
    /* loaded from: classes14.dex */
    public static final class Api23Impl {
        private Api23Impl() {
        }

        /* renamed from: setImageTimestamp */
        public static void m6745x96582afd(android.media.Image image, long j17) {
            image.setTimestamp(j17);
        }
    }

    /* renamed from: androidx.camera.extensions.internal.compat.workaround.CaptureOutputSurfaceForCaptureProcessor$ImageWriterCompat */
    /* loaded from: classes14.dex */
    public static final class ImageWriterCompat {
        private ImageWriterCompat() {
        }

        /* renamed from: close */
        public static void m6746x5a5ddf8(android.media.ImageWriter imageWriter) {
            imageWriter.close();
        }

        /* renamed from: newInstance */
        public static android.media.ImageWriter m6747x6bff0255(android.view.Surface surface, int i17, int i18) {
            return android.media.ImageWriter.newInstance(surface, i17, i18);
        }

        /* renamed from: queueInputImage */
        public static void m6748x89343a2(android.media.ImageWriter imageWriter, android.media.Image image) {
            imageWriter.queueInputImage(image);
        }
    }

    public C1010x6cc09e0f(android.view.Surface surface, android.util.Size size, boolean z17) {
        this.f2454xb6d6ae47 = z17;
        boolean z18 = p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p057xaf3f3382.p058x66f27be.C1004xcf1a968b.get(p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p057xaf3f3382.p058x66f27be.C1002x7b93467a.class) != null || z17;
        this.f2453xf7b122a2 = z18;
        if (android.os.Build.VERSION.SDK_INT < 29 || !z18) {
            this.f2456x6be280ff = surface;
            this.f2450x169ac18 = null;
            this.f2449x32699b01 = null;
        } else {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(TAG, "Enabling intermediate surface");
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0719xa3f4ef30 m4657x9aed0758 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0540xdaa8f743.m4657x9aed0758(size.getWidth(), size.getHeight(), 35, 2);
            this.f2450x169ac18 = m4657x9aed0758;
            this.f2456x6be280ff = m4657x9aed0758.mo4190xcf572877();
            this.f2449x32699b01 = p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p057xaf3f3382.p059xe2513c1e.C1010x6cc09e0f.ImageWriterCompat.m6747x6bff0255(surface, 2, 35);
            m4657x9aed0758.mo4192x6034c5c3(new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0719xa3f4ef30.OnImageAvailableListener() { // from class: androidx.camera.extensions.internal.compat.workaround.CaptureOutputSurfaceForCaptureProcessor$$a
                @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0719xa3f4ef30.OnImageAvailableListener
                /* renamed from: onImageAvailable */
                public final void mo3686xdf8fff6d(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0719xa3f4ef30 interfaceC0719xa3f4ef30) {
                    p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p057xaf3f3382.p059xe2513c1e.C1010x6cc09e0f.this.m6741x51ef5f0f(interfaceC0719xa3f4ef30);
                }
            }, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.C0804x61de418d.m5978x5ebfffdc());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$new$0 */
    public /* synthetic */ void m6741x51ef5f0f(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0719xa3f4ef30 interfaceC0719xa3f4ef30) {
        android.media.Image mo4172x74984fa5;
        synchronized (this.f2452x6243b38) {
            if (this.f2451xfc407ac3) {
                return;
            }
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3 mo4184x825b5df2 = interfaceC0719xa3f4ef30.mo4184x825b5df2();
            if (mo4184x825b5df2 != null && (mo4172x74984fa5 = mo4184x825b5df2.mo4172x74984fa5()) != null) {
                if (this.f2454xb6d6ae47) {
                    long j17 = this.f2455xa4c05149;
                    if (j17 != -1) {
                        p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p057xaf3f3382.p059xe2513c1e.C1010x6cc09e0f.Api23Impl.m6745x96582afd(mo4172x74984fa5, j17);
                    }
                }
                p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p057xaf3f3382.p059xe2513c1e.C1010x6cc09e0f.ImageWriterCompat.m6748x89343a2(this.f2449x32699b01, mo4172x74984fa5);
            }
        }
    }

    /* renamed from: close */
    public void m6742x5a5ddf8() {
        synchronized (this.f2452x6243b38) {
            this.f2451xfc407ac3 = true;
            if (android.os.Build.VERSION.SDK_INT >= 29 && this.f2453xf7b122a2) {
                this.f2450x169ac18.mo4185xc0146eae();
                this.f2450x169ac18.mo4186x5a5ddf8();
                p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p057xaf3f3382.p059xe2513c1e.C1010x6cc09e0f.ImageWriterCompat.m6746x5a5ddf8(this.f2449x32699b01);
            }
        }
    }

    /* renamed from: getSurface */
    public android.view.Surface m6743xcf572877() {
        return this.f2456x6be280ff;
    }

    /* renamed from: setOutputImageTimestamp */
    public void m6744x65bc70de(long j17) {
        if (this.f2454xb6d6ae47) {
            this.f2455xa4c05149 = j17;
        }
    }
}
