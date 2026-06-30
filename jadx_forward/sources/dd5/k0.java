package dd5;

/* loaded from: classes9.dex */
public final class k0 extends dd5.u1 {

    /* renamed from: p, reason: collision with root package name */
    public static final dd5.k0 f310721p = new dd5.k0();

    public k0() {
        super(dd5.m0.f310749b.f508072a);
    }

    @Override // uc5.n
    public void u(android.content.Context context, java.lang.Object obj, uc5.r0 r0Var) {
        em.a2 binding = (em.a2) obj;
        dd5.v1 v1Var = (dd5.v1) r0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        if (v1Var == null) {
            return;
        }
        java.lang.String U1 = v1Var.f310848f.U1();
        if (!(!(U1 == null || r26.n0.N(U1)))) {
            U1 = null;
        }
        if (U1 == null) {
            return;
        }
        v05.b bVar = new v05.b();
        bVar.m126728xdc93280d(U1);
        r05.e eVar = (r05.e) bVar.m75936x14adae67(bVar.f513848e + 19);
        java.lang.String j17 = eVar != null ? eVar.j() : null;
        boolean z17 = j17 == null || r26.n0.N(j17);
        int i17 = bVar.f449898d;
        if (z17) {
            j17 = ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).P(bVar.m75945x2fec8307(i17 + 9));
        }
        if (android.text.TextUtils.isEmpty(j17)) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("geta8key_username", c01.z1.r());
            intent.putExtra("rawUrl", bVar.m75945x2fec8307(i17 + 9));
            j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
            return;
        }
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (j17 == null) {
            j17 = "";
        }
        qk.c0 c0Var = new qk.c0(j17);
        c0Var.f445688a = 23;
        c0Var.f445731g = 123;
        com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.p6 p6Var = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.p6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.p6.class);
        if (p6Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgHistoryGalleryTypeEmotionShared", "emoticon liteapp service not found");
        } else {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.f4) p6Var).wi(context, c0Var);
        }
    }
}
