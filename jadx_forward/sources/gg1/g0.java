package gg1;

/* loaded from: classes7.dex */
public final class g0 extends gg1.y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gg1.c1 f353093a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f353094b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f353095c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(gg1.c1 c1Var, int i17, int i18) {
        super(c1Var);
        this.f353093a = c1Var;
        this.f353094b = i17;
        this.f353095c = i18;
    }

    @Override // z91.a
    public void a(aa1.e eVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VideoCast.VideoCastController", "play fail");
        gg1.x xVar = new gg1.x(gg1.a.f353059m);
        xVar.f353188b = java.lang.Integer.valueOf(this.f353095c);
        gg1.c1.a(this.f353093a, xVar);
    }

    @Override // z91.a
    public void b(aa1.e response) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(response, "response");
        gg1.c1 c1Var = this.f353093a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoCast.VideoCastController", "play success, url = [%s]", c1Var.f353070c.f343432e);
        int i17 = this.f353094b;
        if (i17 <= 0) {
            return;
        }
        c1Var.f353079l = new gg1.k0(c1Var, i17);
    }
}
