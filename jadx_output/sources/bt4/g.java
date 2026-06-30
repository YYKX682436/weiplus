package bt4;

/* loaded from: classes9.dex */
public class g {

    /* renamed from: b, reason: collision with root package name */
    public static bt4.g f24471b;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f24472a;

    public g() {
        java.util.Map d17;
        java.util.HashMap hashMap = new java.util.HashMap();
        this.f24472a = hashMap;
        hashMap.clear();
        gm0.j1.i();
        java.util.Iterator it = com.tencent.mm.sdk.platformtools.t8.P1(((java.lang.String) gm0.j1.u().c().l(270341, "")).split(";")).iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            com.tencent.mm.plugin.wallet_core.model.mall.MallNews mallNews = null;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && (d17 = com.tencent.mm.sdk.platformtools.aa.d(str, "sysmsg", null)) != null) {
                try {
                    java.lang.String str2 = (java.lang.String) d17.get(".sysmsg.mallactivitynew.functionid");
                    com.tencent.mm.plugin.wallet_core.model.mall.MallNews mallNews2 = new com.tencent.mm.plugin.wallet_core.model.mall.MallNews(str2);
                    mallNews2.f179834g = (java.lang.String) d17.get(".sysmsg.mallactivitynew.activityid");
                    mallNews2.f179845u = (java.lang.String) d17.get(".sysmsg.mallactivitynew.type");
                    mallNews2.f179846v = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".sysmsg.mallactivitynew.showtype"), 0);
                    if (d17.containsKey(".sysmsg.mallactivitynew.showflag")) {
                        mallNews2.f179831d = (java.lang.String) d17.get(".sysmsg.mallactivitynew.showflag");
                    } else {
                        mallNews2.f179831d = "0";
                    }
                    if (d17.containsKey(".sysmsg.mallactivitynew.newsTipFlag")) {
                        mallNews2.f179832e = (java.lang.String) d17.get(".sysmsg.mallactivitynew.newsTipFlag");
                    } else {
                        mallNews2.f179832e = "0";
                    }
                    mallNews2.f179842r = str;
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                        mallNews = mallNews2;
                    }
                } catch (java.lang.Exception unused) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.MallNewsManagerNewVersion", "cmdid error");
                }
            }
            if (mallNews != null) {
                hashMap.put(mallNews.f179833f, mallNews);
            }
        }
    }

    public static bt4.g b() {
        if (f24471b == null) {
            f24471b = new bt4.g();
        }
        return f24471b;
    }

    public void a(com.tencent.mm.plugin.wallet_core.model.mall.MallNews mallNews) {
        if (mallNews == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MallNewsManagerNewVersion", "null obj");
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("<sysmsg><mallactivitynew><functionid>");
        java.lang.String str = mallNews.f179833f;
        sb6.append(str);
        sb6.append("</functionid><activityid>");
        sb6.append(mallNews.f179834g);
        sb6.append("</activityid><type>");
        sb6.append(mallNews.f179845u);
        sb6.append("</type><showflag>");
        sb6.append(mallNews.f179831d);
        sb6.append("</showflag><newsTipFlag>");
        sb6.append(mallNews.f179832e);
        sb6.append("</newsTipFlag></mallactivitynew></sysmsg>;");
        mallNews.f179842r = sb6.toString();
        ((java.util.HashMap) this.f24472a).put(str, mallNews);
        e();
    }

    public com.tencent.mm.plugin.wallet_core.model.mall.MallNews c(java.lang.String str) {
        return (com.tencent.mm.plugin.wallet_core.model.mall.MallNews) ((java.util.HashMap) this.f24472a).get(str);
    }

    public com.tencent.mm.plugin.wallet_core.model.mall.MallNews d(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return null;
        }
        java.util.Map map = this.f24472a;
        if (!((java.util.HashMap) map).containsKey(str)) {
            return null;
        }
        com.tencent.mm.plugin.wallet_core.model.mall.MallNews mallNews = (com.tencent.mm.plugin.wallet_core.model.mall.MallNews) ((java.util.HashMap) map).get(str);
        if ("0".equals(mallNews.f179831d)) {
            mallNews.f179831d = "1";
            e();
        }
        return mallNews;
    }

    public boolean e() {
        java.util.Map map = this.f24472a;
        ((java.util.HashMap) map).size();
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        for (java.lang.String str : ((java.util.HashMap) map).keySet()) {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                com.tencent.mm.plugin.wallet_core.model.mall.MallNews mallNews = (com.tencent.mm.plugin.wallet_core.model.mall.MallNews) ((java.util.HashMap) map).get(str);
                stringBuffer.append(mallNews.f179842r.replace("</mallactivitynew></sysmsg>;", "").replaceAll("<activityid>([^<]*)</activityid>", "").replaceAll("<type>([^<]*)</type>", "").replaceAll("<showflag>([^<]*)</showflag>", "").replaceAll("<newsTipFlag>([^<]*)</newsTipFlag>", "") + "<activityid>" + mallNews.f179834g + "</activityid><type>" + mallNews.f179845u + "</type><showflag>" + mallNews.f179831d + "</showflag><newsTipFlag>" + mallNews.f179832e + "</newsTipFlag></mallactivitynew></sysmsg>;");
            }
        }
        gm0.j1.i();
        gm0.j1.u().c().w(270341, stringBuffer.toString());
        return true;
    }
}
