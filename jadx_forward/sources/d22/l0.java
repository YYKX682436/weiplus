package d22;

/* loaded from: classes15.dex */
public final class l0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.r {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s f307390a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f307391b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f307392c;

    /* renamed from: d, reason: collision with root package name */
    public int f307393d;

    /* renamed from: e, reason: collision with root package name */
    public int f307394e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f307395f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f307396g;

    /* renamed from: h, reason: collision with root package name */
    public int f307397h;

    public l0(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s store, java.lang.String pid) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pid, "pid");
        this.f307390a = store;
        this.f307391b = "MicroMsg.emoji.MMEmotionStoreDetailLiteAppLogic";
        this.f307392c = "";
        this.f307395f = "";
        this.f307396g = "";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.r
    /* renamed from: onDispatch */
    public boolean mo9541xb6136779(long j17, java.lang.String str, java.lang.Object obj, int i17) {
        java.lang.String str2;
        if (str != null) {
            str2 = str.substring(12);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "substring(...)");
        } else {
            str2 = null;
        }
        java.lang.String str3 = this.f307391b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "store action: " + str2 + " with data: " + obj);
        if (str2 != null) {
            switch (str2.hashCode()) {
                case -2053980658:
                    if (str2.equals("installFinish")) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "installFinish: " + obj);
                        return true;
                    }
                    break;
                case -1914266481:
                    if (str2.equals("reportEmoticonStoreActionIfNeeded")) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "reportEmoticonStoreActionIfNeeded: " + obj);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type org.json.JSONObject");
                        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6419xd51df726 b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.C13262xa27596d8.b();
                        b17.u(this.f307392c);
                        b17.f137605f = ((org.json.JSONObject) obj).getInt("action");
                        b17.f137604e = this.f307397h;
                        b17.f137610k = this.f307393d;
                        b17.f137611l = this.f307394e;
                        b17.s(this.f307395f);
                        b17.v(this.f307396g);
                        b17.k();
                        return true;
                    }
                    break;
                case -1540952043:
                    if (str2.equals("uninstallFinish")) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "uninstallFinish: " + obj);
                        return true;
                    }
                    break;
                case -537567105:
                    if (str2.equals("isRewardClose")) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "isRewardClose: " + obj);
                        org.json.JSONObject jSONObject = new org.json.JSONObject();
                        jSONObject.put("isClose", ((((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("EmotionRewardOption", 0) & 1) != 1 ? 1 : 0) ^ 1);
                        this.f307390a.c(j17, i17, jSONObject.toString());
                        return true;
                    }
                    break;
                case 1906768663:
                    if (str2.equals("updateAlbumDetail")) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type org.json.JSONObject");
                        org.json.JSONObject jSONObject2 = (org.json.JSONObject) obj;
                        java.lang.String string = jSONObject2.getString("pid");
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                        this.f307392c = string;
                        this.f307393d = jSONObject2.getInt("thirdPartyLinkId");
                        this.f307394e = jSONObject2.getInt("thirdPartyLinkStatus");
                        java.lang.String string2 = jSONObject2.getString("thirdPartyLinkReportInfo");
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
                        this.f307395f = string2;
                        return true;
                    }
                    break;
            }
        }
        return false;
    }
}
