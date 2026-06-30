package bt4;

/* loaded from: classes9.dex */
public class f {

    /* renamed from: b, reason: collision with root package name */
    public static bt4.f f24469b;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f24470a;

    public f() {
        java.util.HashMap hashMap = new java.util.HashMap();
        this.f24470a = hashMap;
        hashMap.clear();
        gm0.j1.i();
        java.util.Iterator it = com.tencent.mm.sdk.platformtools.t8.P1(((java.lang.String) gm0.j1.u().c().l(270339, "")).split(";")).iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.wallet_core.model.mall.MallNews e17 = e((java.lang.String) it.next());
            if (e17 != null) {
                hashMap.put(e17.f179833f, e17);
            }
        }
    }

    public static void a() {
        ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
        bk0.a.g().h(262156, 266248);
    }

    public static bt4.f b() {
        if (f24469b == null) {
            f24469b = new bt4.f();
        }
        return f24469b;
    }

    public static com.tencent.mm.plugin.wallet_core.model.mall.MallNews e(java.lang.String str) {
        java.util.Map d17;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || (d17 = com.tencent.mm.sdk.platformtools.aa.d(str, "sysmsg", null)) == null) {
            return null;
        }
        try {
            java.lang.String str2 = (java.lang.String) d17.get(".sysmsg.mallactivity.functionid");
            com.tencent.mm.plugin.wallet_core.model.mall.MallNews mallNews = new com.tencent.mm.plugin.wallet_core.model.mall.MallNews(str2);
            mallNews.f179834g = (java.lang.String) d17.get(".sysmsg.mallactivity.activityid");
            mallNews.f179835h = (java.lang.String) d17.get(".sysmsg.mallactivity.ticket");
            mallNews.f179845u = (java.lang.String) d17.get(".sysmsg.mallactivity.type");
            mallNews.f179846v = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".sysmsg.mallactivity.showtype"), 0);
            mallNews.f179847w = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".sysmsg.mallactivity.walletregion"), 0);
            if (d17.containsKey(".sysmsg.mallactivity.showflag")) {
                mallNews.f179831d = (java.lang.String) d17.get(".sysmsg.mallactivity.showflag");
            } else {
                mallNews.f179831d = "0";
            }
            if (d17.containsKey(".sysmsg.mallactivity.newsTipFlag")) {
                mallNews.f179832e = (java.lang.String) d17.get(".sysmsg.mallactivity.newsTipFlag");
            } else {
                mallNews.f179832e = "0";
            }
            mallNews.f179842r = str;
            if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                return null;
            }
            return mallNews;
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MallNewsManager", "cmdid error");
            return null;
        }
    }

    public java.lang.String c(java.lang.String str) {
        com.tencent.mm.plugin.wallet_core.model.mall.MallNews mallNews = (com.tencent.mm.plugin.wallet_core.model.mall.MallNews) ((java.util.HashMap) this.f24470a).get(str);
        if (mallNews == null || com.tencent.mm.sdk.platformtools.t8.K0(mallNews.f179835h)) {
            return null;
        }
        return mallNews.f179835h;
    }

    public void d(com.tencent.mm.plugin.wallet_core.model.mall.MallFunction mallFunction) {
        try {
            if (com.tencent.mm.sdk.platformtools.t8.K0(mallFunction.f179827o.f179834g)) {
                return;
            }
            gm0.j1.i();
            java.util.ArrayList P1 = com.tencent.mm.sdk.platformtools.t8.P1(((java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_MALL_NEWS_MARKED_STRING_SYNC, "")).split(","));
            while (P1.size() > 20) {
                P1.remove(0);
            }
            if (P1.contains(mallFunction.f179827o.f179834g)) {
                return;
            }
            P1.add(mallFunction.f179827o.f179834g);
            java.lang.String c17 = com.tencent.mm.sdk.platformtools.t8.c1(P1, ",");
            com.tencent.mars.xlog.Log.i("MicroMsg.MallNewsManager", "doSelectFunction %s, markedString %s", mallFunction.f179827o.f179834g, c17);
            gm0.j1.i();
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_MALL_NEWS_MARKED_STRING_SYNC, c17);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MallNewsManager", e17, "error in markedFunction", new java.lang.Object[0]);
        }
    }

    public com.tencent.mm.plugin.wallet_core.model.mall.MallNews f(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return null;
        }
        java.util.Map map = this.f24470a;
        if (!((java.util.HashMap) map).containsKey(str)) {
            return null;
        }
        com.tencent.mm.plugin.wallet_core.model.mall.MallNews mallNews = (com.tencent.mm.plugin.wallet_core.model.mall.MallNews) ((java.util.HashMap) map).get(str);
        if ("0".equals(mallNews.f179831d)) {
            mallNews.f179831d = "1";
            g();
        }
        return mallNews;
    }

    public boolean g() {
        java.util.Map map = this.f24470a;
        ((java.util.HashMap) map).size();
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        for (java.lang.String str : ((java.util.HashMap) map).keySet()) {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                com.tencent.mm.plugin.wallet_core.model.mall.MallNews mallNews = (com.tencent.mm.plugin.wallet_core.model.mall.MallNews) ((java.util.HashMap) map).get(str);
                stringBuffer.append(mallNews.f179842r.replace("</mallactivity></sysmsg>", "").replaceAll("<showflag>([^<]*)</showflag>", "").replaceAll("<newsTipFlag>([^<]*)</newsTipFlag>", "") + "<showflag>" + mallNews.f179831d + "</showflag><newsTipFlag>" + mallNews.f179832e + "</newsTipFlag></mallactivity></sysmsg>;");
            }
        }
        gm0.j1.i();
        gm0.j1.u().c().w(270339, stringBuffer.toString());
        return true;
    }
}
