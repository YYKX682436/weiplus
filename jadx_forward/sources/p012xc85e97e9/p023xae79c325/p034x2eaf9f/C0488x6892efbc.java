package p012xc85e97e9.p023xae79c325.p034x2eaf9f;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0016R\"\u0010\u0013\u001a\u0010\u0012\f\u0012\n \u0012*\u0004\u0018\u00010\u00010\u00010\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Landroidx/camera/core/DelegatingImageCapturedCallback;", "Landroidx/camera/core/ImageCapture$OnImageCapturedCallback;", "Ljz5/f0;", "dispose", "onCaptureStarted", "", "progress", "onCaptureProcessProgressed", "Landroid/graphics/Bitmap;", "bitmap", "onPostviewBitmapAvailable", "Landroidx/camera/core/ImageProxy;", "imageProxy", "onCaptureSuccess", "Landroidx/camera/core/ImageCaptureException;", "exception", "onError", "Ljava/util/concurrent/atomic/AtomicReference;", "kotlin.jvm.PlatformType", "_delegate", "Ljava/util/concurrent/atomic/AtomicReference;", "getDelegate", "()Landroidx/camera/core/ImageCapture$OnImageCapturedCallback;", "delegate", "<init>", "(Landroidx/camera/core/ImageCapture$OnImageCapturedCallback;)V", "camera-core_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: androidx.camera.core.DelegatingImageCapturedCallback */
/* loaded from: classes14.dex */
final class C0488x6892efbc extends p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.OnImageCapturedCallback {
    private final java.util.concurrent.atomic.AtomicReference<p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.OnImageCapturedCallback> _delegate;

    public C0488x6892efbc(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.OnImageCapturedCallback delegate) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(delegate, "delegate");
        this._delegate = new java.util.concurrent.atomic.AtomicReference<>(delegate);
    }

    /* renamed from: getDelegate */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.OnImageCapturedCallback m4366xacb01afb() {
        return this._delegate.get();
    }

    /* renamed from: dispose */
    public final void m4367x63a5261f() {
        this._delegate.set(null);
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.OnImageCapturedCallback
    /* renamed from: onCaptureProcessProgressed */
    public void mo4368x1c9165b4(int i17) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.OnImageCapturedCallback m4366xacb01afb = m4366xacb01afb();
        if (m4366xacb01afb != null) {
            m4366xacb01afb.mo4368x1c9165b4(i17);
        }
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.OnImageCapturedCallback
    /* renamed from: onCaptureStarted */
    public void mo4369x56961e1a() {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.OnImageCapturedCallback m4366xacb01afb = m4366xacb01afb();
        if (m4366xacb01afb != null) {
            m4366xacb01afb.mo4369x56961e1a();
        }
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.OnImageCapturedCallback
    /* renamed from: onCaptureSuccess */
    public void mo4370x58601d9c(p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3 imageProxy) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageProxy, "imageProxy");
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.OnImageCapturedCallback m4366xacb01afb = m4366xacb01afb();
        if (m4366xacb01afb != null) {
            m4366xacb01afb.mo4370x58601d9c(imageProxy);
        }
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.OnImageCapturedCallback
    /* renamed from: onError */
    public void mo4371xaf8aa769(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0524xb471f04 exception) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(exception, "exception");
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.OnImageCapturedCallback m4366xacb01afb = m4366xacb01afb();
        if (m4366xacb01afb != null) {
            m4366xacb01afb.mo4371xaf8aa769(exception);
        }
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.OnImageCapturedCallback
    /* renamed from: onPostviewBitmapAvailable */
    public void mo4372x945ddf76(android.graphics.Bitmap bitmap) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bitmap, "bitmap");
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.OnImageCapturedCallback m4366xacb01afb = m4366xacb01afb();
        if (m4366xacb01afb != null) {
            m4366xacb01afb.mo4372x945ddf76(bitmap);
        }
    }
}
