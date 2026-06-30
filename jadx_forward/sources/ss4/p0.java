package ss4;

/* loaded from: classes8.dex */
public final class p0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ss4.p0 f493657a = new ss4.p0();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f493658b = kz5.c1.k(new jz5.l(ss4.n0.f493638d, new ss4.o0("/cgi-bin/mmpay-bin/tenpay/querywechatwallet", 2672, "/cgi-bin/mmpay-bin/pa/wx_querywechatwallet", 27364)), new jz5.l(ss4.n0.f493639e, new ss4.o0("/cgi-bin/mmpay-bin/tenpay/setuserwallet", 1663, "/cgi-bin/mmpay-bin/pa/wx_setuserwallet", 28505)), new jz5.l(ss4.n0.f493640f, new ss4.o0("/cgi-bin/mmpay-bin/tenpay/queryuserwallet", 1631, "/cgi-bin/mmpay-bin/pa/wx_queryuserwallet", 28177)), new jz5.l(ss4.n0.f493641g, new ss4.o0("/cgi-bin/mmpay-bin/payibgquickgetoverseawallet", 2540, "/cgi-bin/mmpay-bin/pa/wx_payibgquickgetoverseawallet", 25851)), new jz5.l(ss4.n0.f493642h, new ss4.o0("/cgi-bin/mmpay-bin/payibggetoverseawallet", fe1.i.f69740x366c91de, "/cgi-bin/mmpay-bin/pa/wx_payibggetoverseawallet", 27939)), new jz5.l(ss4.n0.f493643i, new ss4.o0("/cgi-bin/mmpay-bin/tenpay/bindquerynew", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ecs.p1085x60b7c31.t.f34133x366c91de, "/cgi-bin/mmpay-bin/pa/wx_bindquerynew", 29650)));

    public final int a(ss4.n0 n0Var, int i17) {
        ss4.o0 o0Var = (ss4.o0) f493658b.get(n0Var);
        if (o0Var == null) {
            return i17;
        }
        boolean l17 = j62.e.g().l("clicfg_android_wallet_cgi_route_change", false, false, true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletCgiRouteConfig", "[isNewRouteEnabled] enable: " + l17);
        int i18 = l17 ? o0Var.f493652d : o0Var.f493650b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletCgiRouteConfig", "[getFuncId] key: " + n0Var + ", funcId: " + i18);
        return i18;
    }

    public final java.lang.String b(ss4.n0 n0Var, java.lang.String fallbackUri) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fallbackUri, "fallbackUri");
        ss4.o0 o0Var = (ss4.o0) f493658b.get(n0Var);
        if (o0Var == null) {
            return fallbackUri;
        }
        boolean l17 = j62.e.g().l("clicfg_android_wallet_cgi_route_change", false, false, true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletCgiRouteConfig", "[isNewRouteEnabled] enable: " + l17);
        java.lang.String str = l17 ? o0Var.f493651c : o0Var.f493649a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletCgiRouteConfig", "[getUri] key: " + n0Var + ", uri: " + str);
        return str;
    }
}
