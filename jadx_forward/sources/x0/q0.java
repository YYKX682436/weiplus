package x0;

/* loaded from: classes14.dex */
public final class q0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x0.r0 f532458d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(x0.r0 r0Var) {
        super(1);
        this.f532458d = r0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        x0.r0 r0Var = this.f532458d;
        if (!r0Var.f532470f) {
            synchronized (r0Var.f532468d) {
                x0.n0 n0Var = r0Var.f532471g;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(n0Var);
                java.lang.Object obj = n0Var.f532449d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj);
                n0Var.f532447b.a(state, obj);
            }
        }
        return jz5.f0.f384359a;
    }
}
