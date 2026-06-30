package gg1;

/* loaded from: classes7.dex */
public final class j0 extends gg1.y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gg1.c1 f353110a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f353111b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f353112c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(gg1.c1 c1Var, int i17, int i18) {
        super(c1Var);
        this.f353110a = c1Var;
        this.f353111b = i17;
        this.f353112c = i18;
    }

    @Override // z91.a
    public void a(aa1.e eVar) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("stop fail before play new");
        sb6.append(eVar != null ? java.lang.Integer.valueOf(eVar.f84020c) : "");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VideoCast.VideoCastController", sb6.toString());
    }

    @Override // z91.a
    public void b(aa1.e response) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(response, "response");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoCast.VideoCastController", "playNew: stop success");
        gg1.c1 c1Var = this.f353110a;
        c1Var.f353072e.b().f534184e.f534196a = x91.j.Stopped;
        c1Var.f353072e.b().d(c1Var.f353070c.f343432e, new gg1.i0(c1Var, this.f353111b, this.f353112c));
    }
}
