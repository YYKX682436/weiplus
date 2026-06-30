package rb2;

/* loaded from: classes3.dex */
public final class v0 implements com.p314xaae8f345.mm.ui.p2740x696c9db.s5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rb2.y0 f475327a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f475328b;

    public v0(rb2.y0 y0Var, in5.s0 s0Var) {
        this.f475327a = y0Var;
        this.f475328b = s0Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.s5
    public final void a() {
        gd2.n nVar = this.f475327a.f475364g;
        boolean z17 = true;
        if (!nVar.f352083f && ((gd2.x) ((jz5.n) nVar.f352087j).mo141623x754a37bb()).f352105i != 1) {
            z17 = false;
        }
        if (z17) {
            return;
        }
        android.content.Context context = this.f475328b.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 a17 = tm3.a.a(context);
        if (a17 == null) {
            return;
        }
        if (a17 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1463x2ff5de5c.ActivityC14126xa5cf9084) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1463x2ff5de5c.ActivityC14126xa5cf9084) a17).e7();
        } else {
            a17.finish();
        }
    }
}
