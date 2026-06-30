package a5;

/* loaded from: classes13.dex */
public final class t extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a5.u f82965d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(a5.u uVar) {
        super(1);
        this.f82965d = uVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.Throwable th6 = (java.lang.Throwable) obj;
        a5.u uVar = this.f82965d;
        if (th6 == null) {
            if (!uVar.f82969d.isDone()) {
                throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
            }
        } else if (th6 instanceof java.util.concurrent.CancellationException) {
            uVar.f82969d.cancel(true);
        } else {
            l5.m mVar = uVar.f82969d;
            java.lang.Throwable cause = th6.getCause();
            if (cause != null) {
                th6 = cause;
            }
            mVar.j(th6);
        }
        return jz5.f0.f384359a;
    }
}
