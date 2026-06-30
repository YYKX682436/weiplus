package a5;

/* loaded from: classes13.dex */
public final class t extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a5.u f1432d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(a5.u uVar) {
        super(1);
        this.f1432d = uVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.Throwable th6 = (java.lang.Throwable) obj;
        a5.u uVar = this.f1432d;
        if (th6 == null) {
            if (!uVar.f1436d.isDone()) {
                throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
            }
        } else if (th6 instanceof java.util.concurrent.CancellationException) {
            uVar.f1436d.cancel(true);
        } else {
            l5.m mVar = uVar.f1436d;
            java.lang.Throwable cause = th6.getCause();
            if (cause != null) {
                th6 = cause;
            }
            mVar.j(th6);
        }
        return jz5.f0.f302826a;
    }
}
