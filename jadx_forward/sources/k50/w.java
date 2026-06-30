package k50;

/* loaded from: classes.dex */
public final class w extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k50.z f385798d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(k50.z zVar) {
        super(1);
        this.f385798d = zVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        wi5.n0 state = (wi5.n0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        xi5.b bVar = (xi5.b) state.a(xi5.b.class);
        k50.z zVar = this.f385798d;
        if (bVar != null) {
            long c17 = c01.id.c() - zVar.T6();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ForwardReportUIC", "AfterForwardAction:costTime:" + c17 + ' ');
            com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.e.l(java.lang.Long.valueOf(zVar.f385811f), java.lang.Long.valueOf(c17), bVar.f536268b, bVar.f536269c, bVar.f536270d, bVar.f536271e);
        }
        if (((wi5.q0) state.a(wi5.q0.class)) != null) {
            com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.e eVar = com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.e.f290827a;
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("top_collapse_expand_btn", "view_clk", kz5.b1.e(new jz5.l("forward_sid", com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.e.f290828b)), 32337);
        }
        if (((xi5.b) state.a(xi5.b.class)) != null) {
            zVar.f385812g = 1;
        }
        return jz5.f0.f384359a;
    }
}
