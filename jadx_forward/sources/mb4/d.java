package mb4;

/* loaded from: classes4.dex */
public final class d {
    public d(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final mb4.e a(java.util.Map values, java.lang.String prefKey) {
        java.lang.Long j17;
        java.lang.Integer h17;
        java.lang.Integer h18;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parse", "com.tencent.mm.plugin.sns.storage.adsocial.AnimationMediaPagInfo$Companion");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(values, "values");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(prefKey, "prefKey");
        if (a84.b0.c(values) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(prefKey)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.storage.adsocial.AnimationMediaPagInfo$Companion");
            return null;
        }
        if (!values.containsKey(prefKey)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.storage.adsocial.AnimationMediaPagInfo$Companion");
            return null;
        }
        mb4.e eVar = new mb4.e();
        java.lang.String str = (java.lang.String) values.get(prefKey.concat(".pagThumbUrl"));
        if (str == null) {
            str = "";
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setPagThumbUrl", "com.tencent.mm.plugin.sns.storage.adsocial.MediaPagInfo");
        eVar.f406930a = str;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setPagThumbUrl", "com.tencent.mm.plugin.sns.storage.adsocial.MediaPagInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getPagThumbUrl", "com.tencent.mm.plugin.sns.storage.adsocial.MediaPagInfo");
        java.lang.String str2 = eVar.f406930a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPagThumbUrl", "com.tencent.mm.plugin.sns.storage.adsocial.MediaPagInfo");
        java.lang.String a17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(str2);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getPagThumbUrl", "com.tencent.mm.plugin.sns.storage.adsocial.MediaPagInfo");
        java.lang.String str3 = eVar.f406930a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPagThumbUrl", "com.tencent.mm.plugin.sns.storage.adsocial.MediaPagInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getPagThumbUrl", "com.tencent.mm.plugin.sns.storage.adsocial.MediaPagInfo");
        java.lang.String str4 = eVar.f406930a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPagThumbUrl", "com.tencent.mm.plugin.sns.storage.adsocial.MediaPagInfo");
        r45.jj4 h19 = m21.y.h(a17, 2, str3, str4, 1, 1, "");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setPagThumbMedia", "com.tencent.mm.plugin.sns.storage.adsocial.MediaPagInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.h1 h1Var = eVar.f406931b;
        f06.v[] vVarArr = mb4.e0.f406929e;
        ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.z) h1Var).b(eVar, vVarArr[0], h19);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setPagThumbMedia", "com.tencent.mm.plugin.sns.storage.adsocial.MediaPagInfo");
        r45.jj4 b17 = eVar.b();
        if (b17 != null) {
            b17.N = true;
        }
        java.lang.String str5 = (java.lang.String) values.get(prefKey.concat(".pagUrl"));
        if (str5 == null) {
            str5 = "";
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setPagUrl", "com.tencent.mm.plugin.sns.storage.adsocial.MediaPagInfo");
        ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.t0) eVar.f406932c).b(eVar, vVarArr[1], str5);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setPagUrl", "com.tencent.mm.plugin.sns.storage.adsocial.MediaPagInfo");
        java.lang.String str6 = (java.lang.String) values.get(prefKey.concat(".pagMD5"));
        java.lang.String str7 = str6 != null ? str6 : "";
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setPagMD5", "com.tencent.mm.plugin.sns.storage.adsocial.MediaPagInfo");
        eVar.f406933d = str7;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setPagMD5", "com.tencent.mm.plugin.sns.storage.adsocial.MediaPagInfo");
        java.lang.String str8 = (java.lang.String) values.get(prefKey.concat(".width"));
        if (str8 != null && (h18 = r26.h0.h(str8)) != null) {
            h18.intValue();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setWidth", "com.tencent.mm.plugin.sns.storage.adsocial.MediaPagInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setWidth", "com.tencent.mm.plugin.sns.storage.adsocial.MediaPagInfo");
        java.lang.String str9 = (java.lang.String) values.get(prefKey.concat(".height"));
        if (str9 != null && (h17 = r26.h0.h(str9)) != null) {
            h17.intValue();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setHeight", "com.tencent.mm.plugin.sns.storage.adsocial.MediaPagInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setHeight", "com.tencent.mm.plugin.sns.storage.adsocial.MediaPagInfo");
        java.lang.String str10 = (java.lang.String) values.get(prefKey.concat(".startDelayTime"));
        if (str10 != null && (j17 = r26.h0.j(str10)) != null) {
            j17.longValue();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setStartDelayTime", "com.tencent.mm.plugin.sns.storage.adsocial.AnimationMediaPagInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setStartDelayTime", "com.tencent.mm.plugin.sns.storage.adsocial.AnimationMediaPagInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.storage.adsocial.AnimationMediaPagInfo$Companion");
        return eVar;
    }
}
