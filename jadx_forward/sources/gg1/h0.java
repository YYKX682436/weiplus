package gg1;

/* loaded from: classes7.dex */
public final class h0 extends gg1.y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gg1.c1 f353097a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f353098b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f353099c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(gg1.c1 c1Var, int i17, int i18) {
        super(c1Var);
        this.f353097a = c1Var;
        this.f353098b = i17;
        this.f353099c = i18;
    }

    @Override // z91.a
    public void a(aa1.e eVar) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("play new fail");
        sb6.append(eVar != null ? java.lang.Integer.valueOf(eVar.f84020c) : "");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VideoCast.VideoCastController", sb6.toString());
        gg1.x xVar = new gg1.x(gg1.a.f353059m);
        xVar.f353188b = java.lang.Integer.valueOf(this.f353099c);
        gg1.c1.a(this.f353097a, xVar);
    }

    @Override // z91.a
    public void b(aa1.e response) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(response, "response");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoCast.VideoCastController", "play new success");
        gg1.c1 c1Var = this.f353097a;
        c1Var.f353072e.b().f534187h = c1Var.f353080m;
        gg1.k1 k1Var = c1Var.f353072e;
        k1Var.b().f534184e.f534196a = x91.j.Playing;
        k1Var.b().f();
        k1Var.b().g();
        int i17 = this.f353098b;
        if (i17 <= 0) {
            return;
        }
        c1Var.f353079l = new gg1.k0(c1Var, i17);
    }
}
