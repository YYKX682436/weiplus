package p1;

/* loaded from: classes14.dex */
public final class p0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p1.o0 f432398d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(p1.o0 o0Var) {
        super(1);
        this.f432398d = o0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.Throwable th6 = (java.lang.Throwable) obj;
        p1.o0 o0Var = this.f432398d;
        p3325xe03a0797.p3326xc267989b.q qVar = o0Var.f432394f;
        if (qVar != null) {
            ((p3325xe03a0797.p3326xc267989b.r) qVar).d(th6);
        }
        o0Var.f432394f = null;
        return jz5.f0.f384359a;
    }
}
