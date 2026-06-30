package qe5;

/* loaded from: classes12.dex */
public final class h0 implements i40.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qe5.m0 f443652a;

    public h0(qe5.m0 m0Var) {
        this.f443652a = m0Var;
    }

    @Override // i40.a
    public void a(long j17, long j18) {
        pm0.v.X(new qe5.g0(j18, j17, this.f443652a));
    }

    @Override // i40.a
    public void c() {
    }

    @Override // i40.a
    public void d(int i17, int i18, java.lang.String errMsg, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errMsg, "errMsg");
        pm0.v.X(new qe5.f0(this.f443652a, i17, i18, errMsg));
    }

    @Override // i40.a
    public void e() {
    }
}
