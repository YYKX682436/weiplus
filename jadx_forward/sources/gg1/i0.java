package gg1;

/* loaded from: classes7.dex */
public final class i0 extends gg1.y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gg1.c1 f353105a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f353106b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f353107c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(gg1.c1 c1Var, int i17, int i18) {
        super(c1Var);
        this.f353105a = c1Var;
        this.f353106b = i17;
        this.f353107c = i18;
    }

    @Override // z91.a
    public void a(aa1.e eVar) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("set AVTransportURI fail");
        sb6.append(eVar != null ? java.lang.Integer.valueOf(eVar.f84020c) : "");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VideoCast.VideoCastController", sb6.toString());
        gg1.x xVar = new gg1.x(gg1.a.f353059m);
        xVar.f353188b = java.lang.Integer.valueOf(this.f353107c);
        gg1.c1.a(this.f353105a, xVar);
    }

    @Override // z91.a
    public void b(aa1.e response) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(response, "response");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoCast.VideoCastController", "playNew: setAvTransUrl success");
        gg1.c1 c1Var = this.f353105a;
        c1Var.f353072e.b().f534184e.f534196a = x91.j.Transitioning;
        c1Var.f353072e.b().c(new gg1.h0(c1Var, this.f353106b, this.f353107c));
    }
}
