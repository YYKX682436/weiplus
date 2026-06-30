package ji5;

/* loaded from: classes9.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final ji5.b f381494a = new ji5.b();

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(android.content.Context context, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, l15.c liteAppMsg) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liteAppMsg, "liteAppMsg");
        z05.d p17 = liteAppMsg.p();
        z05.b o17 = liteAppMsg.o();
        java.lang.String j17 = o17 != null ? o17.j() : null;
        if ((j17 == null || j17.length() == 0) != true) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ForwardChattingItemClickHelper", "app is from jsapi sendGameShareCard, not allow to click");
            return;
        }
        if (p17 == null || (str = p17.m75945x2fec8307(p17.f449898d + 0)) == null) {
            str = "";
        }
        q80.d0 d0Var = new q80.d0();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            ot0.q v17 = ot0.q.v(f9Var != null ? f9Var.j() : null);
            if (v17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ForwardChattingItemClickHelper", "unable to open, appMsg appId is null");
                return;
            }
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.h0 h0Var = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.h0) v17.y(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.h0.class);
            if (h0Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ForwardChattingItemClickHelper", "unable to open, content.piece is null");
                return;
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(h0Var.f273198b)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ForwardChattingItemClickHelper", "unable to open, msg appId is null");
                return;
            }
            d0Var.f442182a = h0Var.f273198b;
            d0Var.f442183b = h0Var.f273199c;
            d0Var.f442184c = h0Var.f273200d;
            d0Var.f442187f = h0Var.f273202f;
            d0Var.f442185d = java.lang.Boolean.valueOf(h0Var.f273203g);
            boolean z17 = h0Var.f273207k;
            com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3708xc1f46f80 c3708xc1f46f80 = new com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3708xc1f46f80();
            if (z17) {
                cl0.g gVar = new cl0.g();
                gVar.o("shareImageCardFlag", 1);
                c3708xc1f46f80.f14309xf0df6fda = gVar;
                d0Var.f442207z = c3708xc1f46f80;
            }
        } else {
            d0Var.f442182a = str;
            d0Var.f442183b = p17 != null ? p17.n() : null;
            d0Var.f442184c = p17 != null ? p17.o() : null;
            d0Var.f442187f = p17 != null ? p17.l() : null;
            d0Var.f442185d = p17 != null ? java.lang.Boolean.valueOf(p17.r()) : null;
        }
        ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).lk(context, d0Var, new ji5.a());
    }
}
