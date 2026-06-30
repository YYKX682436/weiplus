package mt1;

/* loaded from: classes12.dex */
public final class p0 implements java.util.concurrent.Callable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f412789d;

    public p0(long j17) {
        this.f412789d = j17;
    }

    @Override // java.util.concurrent.Callable
    public java.lang.Object call() {
        try {
            mt1.q0.f412792b.f430382d.H("WxFileIndexLinkify", "DELETE FROM WxFileIndexLinkify WHERE id = ?", new java.lang.Object[]{java.lang.Long.valueOf(this.f412789d)});
            return java.lang.Boolean.TRUE;
        } catch (java.lang.Throwable th6) {
            throw new java.lang.RuntimeException("deleteLinkifyById failed : " + th6.getMessage());
        }
    }
}
