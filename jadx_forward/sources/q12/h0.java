package q12;

/* loaded from: classes5.dex */
public final class h0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q12.k0 f441118d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f441119e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(q12.k0 k0Var, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        super(0);
        this.f441118d = k0Var;
        this.f441119e = f9Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        q12.k0 k0Var = this.f441118d;
        java.lang.Runnable runnable = k0Var.f441132e;
        pm0.v.C(runnable);
        k0Var.f441131d.add(this.f441119e);
        pm0.v.U(1000L, runnable);
        return jz5.f0.f384359a;
    }
}
