package com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2134x5860d93;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f244857a;

    /* renamed from: b, reason: collision with root package name */
    public int f244858b;

    /* renamed from: c, reason: collision with root package name */
    public int f244859c;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2134x5860d93.d0 f244860d;

    public static final com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2134x5860d93.a a(java.util.Map values, java.lang.String prefKey) {
        java.lang.Long j17;
        java.lang.Integer h17;
        java.lang.Integer h18;
        java.lang.Integer h19;
        java.lang.Integer h27;
        java.lang.Integer h28;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parse", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdBarPAGContainerInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parse", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdBarPAGContainerInfo$Companion");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(values, "values");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(prefKey, "prefKey");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2134x5860d93.a aVar = null;
        aVar = null;
        r5 = null;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2134x5860d93.d0 d0Var = null;
        if (a84.b0.c(values) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(prefKey)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdBarPAGContainerInfo$Companion");
        } else if (values.containsKey(prefKey)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2134x5860d93.a aVar2 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2134x5860d93.a();
            java.lang.String str = (java.lang.String) values.get(prefKey.concat(".containerWidth"));
            int i17 = 0;
            aVar2.f244857a = (str == null || (h28 = r26.h0.h(str)) == null) ? 0 : h28.intValue();
            java.lang.String str2 = (java.lang.String) values.get(prefKey.concat(".containerHeight"));
            aVar2.f244858b = (str2 == null || (h27 = r26.h0.h(str2)) == null) ? 0 : h27.intValue();
            java.lang.String str3 = (java.lang.String) values.get(prefKey.concat(".bottomOffset"));
            aVar2.f244859c = (str3 == null || (h19 = r26.h0.h(str3)) == null) ? 0 : h19.intValue();
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2134x5860d93.d0.f244868h;
            java.lang.String prefKey2 = prefKey.concat(".animationPag");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parse", "com.tencent.mm.plugin.sns.ad.widget.adpag.AnimationPagInfo$Companion");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(prefKey2, "prefKey");
            if (a84.b0.c(values) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(prefKey2)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.widget.adpag.AnimationPagInfo$Companion");
            } else if (values.containsKey(prefKey2)) {
                d0Var = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2134x5860d93.d0();
                java.lang.String str4 = (java.lang.String) values.get(prefKey2.concat(".pagThumbUrl"));
                if (str4 == null) {
                    str4 = "";
                }
                d0Var.g(str4);
                java.lang.String str5 = (java.lang.String) values.get(prefKey2.concat(".pagUrl"));
                if (str5 == null) {
                    str5 = "";
                }
                d0Var.h(str5);
                java.lang.String str6 = (java.lang.String) values.get(prefKey2.concat(".pagMD5"));
                d0Var.f(str6 != null ? str6 : "");
                java.lang.String str7 = (java.lang.String) values.get(prefKey2.concat(".width"));
                d0Var.i((str7 == null || (h18 = r26.h0.h(str7)) == null) ? 0 : h18.intValue());
                java.lang.String str8 = (java.lang.String) values.get(prefKey2.concat(".height"));
                if (str8 != null && (h17 = r26.h0.h(str8)) != null) {
                    i17 = h17.intValue();
                }
                d0Var.e(i17);
                java.lang.String str9 = (java.lang.String) values.get(prefKey2.concat(".startDelayTime"));
                long longValue = (str9 == null || (j17 = r26.h0.j(str9)) == null) ? 2000L : j17.longValue();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setStartDelayTime", "com.tencent.mm.plugin.sns.ad.widget.adpag.AnimationPagInfo");
                d0Var.f244869g = longValue;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setStartDelayTime", "com.tencent.mm.plugin.sns.ad.widget.adpag.AnimationPagInfo");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.widget.adpag.AnimationPagInfo$Companion");
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.widget.adpag.AnimationPagInfo$Companion");
            }
            aVar2.f244860d = d0Var;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdBarPAGContainerInfo$Companion");
            aVar = aVar2;
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdBarPAGContainerInfo$Companion");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdBarPAGContainerInfo");
        return aVar;
    }
}
