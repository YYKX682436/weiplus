package p012xc85e97e9.p023xae79c325.p034x2eaf9f;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0016R\"\u0010\u0013\u001a\u0010\u0012\f\u0012\n \u0012*\u0004\u0018\u00010\u00010\u00010\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Landroidx/camera/core/DelegatingImageSavedCallback;", "Landroidx/camera/core/ImageCapture$OnImageSavedCallback;", "Ljz5/f0;", "dispose", "onCaptureStarted", "", "progress", "onCaptureProcessProgressed", "Landroid/graphics/Bitmap;", "bitmap", "onPostviewBitmapAvailable", "Landroidx/camera/core/ImageCapture$OutputFileResults;", "outputFileResults", "onImageSaved", "Landroidx/camera/core/ImageCaptureException;", "exception", "onError", "Ljava/util/concurrent/atomic/AtomicReference;", "kotlin.jvm.PlatformType", "_delegate", "Ljava/util/concurrent/atomic/AtomicReference;", "getDelegate", "()Landroidx/camera/core/ImageCapture$OnImageSavedCallback;", "delegate", "<init>", "(Landroidx/camera/core/ImageCapture$OnImageSavedCallback;)V", "camera-core_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: androidx.camera.core.DelegatingImageSavedCallback */
/* loaded from: classes14.dex */
final class C0489xb2924f13 implements p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.OnImageSavedCallback {
    private final java.util.concurrent.atomic.AtomicReference<p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.OnImageSavedCallback> _delegate;

    public C0489xb2924f13(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.OnImageSavedCallback delegate) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(delegate, "delegate");
        this._delegate = new java.util.concurrent.atomic.AtomicReference<>(delegate);
    }

    /* renamed from: getDelegate */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.OnImageSavedCallback m4373xacb01afb() {
        return this._delegate.get();
    }

    /* renamed from: dispose */
    public final void m4374x63a5261f() {
        this._delegate.set(null);
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.OnImageSavedCallback
    /* renamed from: onCaptureProcessProgressed */
    public void mo4375x1c9165b4(int i17) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.OnImageSavedCallback m4373xacb01afb = m4373xacb01afb();
        if (m4373xacb01afb != null) {
            m4373xacb01afb.mo4375x1c9165b4(i17);
        }
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.OnImageSavedCallback
    /* renamed from: onCaptureStarted */
    public void mo4376x56961e1a() {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.OnImageSavedCallback m4373xacb01afb = m4373xacb01afb();
        if (m4373xacb01afb != null) {
            m4373xacb01afb.mo4376x56961e1a();
        }
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.OnImageSavedCallback
    /* renamed from: onError */
    public void mo4377xaf8aa769(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0524xb471f04 exception) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(exception, "exception");
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.OnImageSavedCallback m4373xacb01afb = m4373xacb01afb();
        if (m4373xacb01afb != null) {
            m4373xacb01afb.mo4377xaf8aa769(exception);
        }
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.OnImageSavedCallback
    /* renamed from: onImageSaved */
    public void mo4378x706cd52b(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.OutputFileResults outputFileResults) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outputFileResults, "outputFileResults");
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.OnImageSavedCallback m4373xacb01afb = m4373xacb01afb();
        if (m4373xacb01afb != null) {
            m4373xacb01afb.mo4378x706cd52b(outputFileResults);
        }
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.OnImageSavedCallback
    /* renamed from: onPostviewBitmapAvailable */
    public void mo4379x945ddf76(android.graphics.Bitmap bitmap) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bitmap, "bitmap");
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.OnImageSavedCallback m4373xacb01afb = m4373xacb01afb();
        if (m4373xacb01afb != null) {
            m4373xacb01afb.mo4379x945ddf76(bitmap);
        }
    }
}
