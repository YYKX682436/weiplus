package nu0;

/* loaded from: classes5.dex */
public final class g1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nu0.b4 f421474d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f421475e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(nu0.b4 b4Var, int i17) {
        super(0);
        this.f421474d = b4Var;
        this.f421475e = i17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int i17 = this.f421475e;
        nu0.b4 b4Var = this.f421474d;
        nu0.b4.d7(b4Var, i17);
        java.lang.Runnable task = b4Var.f421422x0;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(task, 3000L);
        return jz5.f0.f384359a;
    }
}
