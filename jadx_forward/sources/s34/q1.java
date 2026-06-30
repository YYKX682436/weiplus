package s34;

/* loaded from: classes4.dex */
public final class q1 {
    public q1(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final s34.r1 a(java.util.Map values, java.lang.String prefKey) {
        java.lang.Integer h17;
        java.lang.Integer h18;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parse", "com.tencent.mm.plugin.sns.ad.adxml.ScratchPagInfo$Companion");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(values, "values");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(prefKey, "prefKey");
        if (a84.b0.c(values) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(prefKey)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.adxml.ScratchPagInfo$Companion");
            return null;
        }
        if (!values.containsKey(prefKey)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.adxml.ScratchPagInfo$Companion");
            return null;
        }
        s34.r1 r1Var = new s34.r1();
        java.lang.String str = (java.lang.String) values.get(prefKey.concat(".pagThumbUrl"));
        if (str == null) {
            str = "";
        }
        r1Var.g(str);
        java.lang.String str2 = (java.lang.String) values.get(prefKey.concat(".pagUrl"));
        if (str2 == null) {
            str2 = "";
        }
        r1Var.h(str2);
        java.lang.String str3 = (java.lang.String) values.get(prefKey.concat(".pagMD5"));
        r1Var.f(str3 != null ? str3 : "");
        java.lang.String str4 = (java.lang.String) values.get(prefKey.concat(".width"));
        int i17 = 0;
        r1Var.i((str4 == null || (h18 = r26.h0.h(str4)) == null) ? 0 : h18.intValue());
        java.lang.String str5 = (java.lang.String) values.get(prefKey.concat(".height"));
        if (str5 != null && (h17 = r26.h0.h(str5)) != null) {
            i17 = h17.intValue();
        }
        r1Var.e(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.adxml.ScratchPagInfo$Companion");
        return r1Var;
    }
}
