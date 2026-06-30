package ef3;

/* loaded from: classes9.dex */
public class c extends com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.h1 {
    public c(long j17, r45.wh5 wh5Var) {
        r45.vh5 vh5Var = new r45.vh5();
        vh5Var.f469778e = (int) j17;
        vh5Var.f469779f = com.p314xaae8f345.mm.p2495xc50a8b8b.g.c("all_type");
        r45.r1 c17 = at4.g0.c();
        if (c17 != null) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c17.f465940d)) {
                vh5Var.f469780g = com.p314xaae8f345.mm.p2495xc50a8b8b.g.c(c17.f465940d);
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c17.f465941e)) {
                vh5Var.f469781h = com.p314xaae8f345.mm.p2495xc50a8b8b.g.c(c17.f465941e);
            }
        }
        pz2.a aVar = (pz2.a) gm0.j1.s(pz2.a.class);
        if (aVar == null || !aVar.mo148657xb9a85d2c()) {
            vh5Var.f469783m = 0;
        } else {
            vh5Var.f469783m = 1;
        }
        if (aVar != null) {
            vh5Var.f469782i = 1;
        } else {
            vh5Var.f469782i = 0;
        }
        vh5Var.f469784n = 1;
        vh5Var.f469785o = java.lang.System.currentTimeMillis();
        if (wh5Var.f76492x92037252 == null) {
            r45.ie ieVar = new r45.ie();
            wh5Var.f76492x92037252 = ieVar;
            r45.du5 du5Var = new r45.du5();
            du5Var.f454289d = "";
            du5Var.f454290e = true;
            ieVar.f458493e = du5Var;
            wh5Var.f76492x92037252.f458492d = 0;
        }
        vh5Var.f469786p = wh5Var;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if (com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.j1.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "cn.gov.pbc.dcep")) {
            linkedList.add(1);
        }
        vh5Var.f469788r = linkedList;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CgiQueryWeChatWallet", "get cached location info");
        r45.u67 u67Var = new r45.u67();
        if (!com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.j1.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "cn.gov.pbc.dcep")) {
            if (!((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_android_dcep_address_logic_revert, false)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CgiQueryWeChatWallet", "dcep app is not install, ignore get address data");
                vh5Var.f469787q = u67Var;
                com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
                lVar.f152197a = vh5Var;
                lVar.f152198b = new r45.wh5();
                ss4.p0 p0Var = ss4.p0.f493657a;
                ss4.n0 n0Var = ss4.n0.f493638d;
                int a17 = p0Var.a(n0Var, 2672);
                java.lang.String b17 = p0Var.b(n0Var, "/cgi-bin/mmpay-bin/tenpay/querywechatwallet");
                lVar.f152200d = a17;
                lVar.f152199c = b17;
                lVar.f152201e = 0;
                lVar.f152202f = 0;
                p(lVar.a());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CgiQueryWeChatWallet", "balanceVersion: %s, isRoot: %s, openTouch: %s", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(vh5Var.f469783m), java.lang.Integer.valueOf(vh5Var.f469782i));
            }
        }
        r45.h67 h67Var = new r45.h67();
        gm0.j1.i();
        java.lang.String str = (java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WCPAY_LOCATION_CACHE_CONFIG_STRING_SYNC, "");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CgiQueryWeChatWallet", "no location cache data");
        } else {
            try {
                h67Var.mo11468x92b714fd(str.getBytes(com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3125x9fd75533.f11976x3730806a));
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.CgiQueryWeChatWallet", "parse cacheString exp, " + e17.getLocalizedMessage());
            }
            u67Var.f468625d = h67Var.f457418f;
            u67Var.f468626e = h67Var.f457419g;
            u67Var.f468627f = h67Var.f457420h;
        }
        ((h45.q) i95.n0.c(h45.q.class)).mo24854x32141af7(h67Var.f457416d, h67Var.f457417e, h67Var.f457423n, h67Var.f457421i, 2);
        vh5Var.f469787q = u67Var;
        com.p314xaae8f345.mm.p944x882e457a.l lVar2 = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar2.f152197a = vh5Var;
        lVar2.f152198b = new r45.wh5();
        ss4.p0 p0Var2 = ss4.p0.f493657a;
        ss4.n0 n0Var2 = ss4.n0.f493638d;
        int a172 = p0Var2.a(n0Var2, 2672);
        java.lang.String b172 = p0Var2.b(n0Var2, "/cgi-bin/mmpay-bin/tenpay/querywechatwallet");
        lVar2.f152200d = a172;
        lVar2.f152199c = b172;
        lVar2.f152201e = 0;
        lVar2.f152202f = 0;
        p(lVar2.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CgiQueryWeChatWallet", "balanceVersion: %s, isRoot: %s, openTouch: %s", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(vh5Var.f469783m), java.lang.Integer.valueOf(vh5Var.f469782i));
    }
}
