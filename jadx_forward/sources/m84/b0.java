package m84;

/* loaded from: classes4.dex */
public final class b0 {
    public b0(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final m84.c0 a(java.util.Map values, java.lang.String prefKey) {
        java.lang.Integer h17;
        java.lang.Integer h18;
        java.lang.Integer h19;
        java.lang.Integer h27;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parse", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.HotZoneInfo$Companion");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(values, "values");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(prefKey, "prefKey");
        if (a84.b0.c(values) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(prefKey)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.HotZoneInfo$Companion");
            return null;
        }
        if (!values.containsKey(prefKey)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.HotZoneInfo$Companion");
            return null;
        }
        m84.c0 c0Var = new m84.c0();
        java.lang.String str = (java.lang.String) values.get(prefKey.concat(".width"));
        int i17 = 0;
        c0Var.f406298a = (str == null || (h27 = r26.h0.h(str)) == null) ? 0 : h27.intValue();
        java.lang.String str2 = (java.lang.String) values.get(prefKey.concat(".height"));
        c0Var.f406299b = (str2 == null || (h19 = r26.h0.h(str2)) == null) ? 0 : h19.intValue();
        java.lang.String str3 = (java.lang.String) values.get(prefKey.concat(".marginLeft"));
        c0Var.f406300c = (str3 == null || (h18 = r26.h0.h(str3)) == null) ? 0 : h18.intValue();
        java.lang.String str4 = (java.lang.String) values.get(prefKey.concat(".marginTop"));
        if (str4 != null && (h17 = r26.h0.h(str4)) != null) {
            i17 = h17.intValue();
        }
        c0Var.f406301d = i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.HotZoneInfo$Companion");
        return c0Var;
    }
}
