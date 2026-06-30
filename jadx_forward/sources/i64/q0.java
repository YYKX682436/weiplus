package i64;

/* loaded from: classes4.dex */
public abstract class q0 {
    public static java.lang.String a(long j17, java.lang.Object... objArr) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("appendSourceAndSnsStat", "com.tencent.mm.plugin.sns.ad.model.SnsAdExtUtil");
        if (objArr == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("appendSourceAndSnsStat", "com.tencent.mm.plugin.sns.ad.model.SnsAdExtUtil");
            return "";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Gj().c(objArr));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("appendSourceAndSnsStat", "com.tencent.mm.plugin.sns.ad.model.SnsAdExtUtil");
        b(j17, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Vi().y0(j17), sb6);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("appendSourceAndSnsStat", "com.tencent.mm.plugin.sns.ad.model.SnsAdExtUtil");
        java.lang.String sb7 = sb6.toString();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("appendSourceAndSnsStat", "com.tencent.mm.plugin.sns.ad.model.SnsAdExtUtil");
        return sb7;
    }

    public static void b(long j17, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17932x22276883 c17932x22276883, java.lang.StringBuilder sb6) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("appendSourceAndSnsStat", "com.tencent.mm.plugin.sns.ad.model.SnsAdExtUtil");
        if (c17932x22276883 != null) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 m70311x485d7 = c17932x22276883.m70311x485d7();
            if (m70311x485d7 != null) {
                java.lang.String str = m70311x485d7.f39040xbd345fc4;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("appendSourceAndSnsStat", "com.tencent.mm.modelstat.SnsStatExtUtil");
                if (sb6 == null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("appendSourceAndSnsStat", "com.tencent.mm.modelstat.SnsStatExtUtil");
                } else {
                    r45.ud6 h17 = com.p314xaae8f345.mm.p959x883644fd.k0.h(str);
                    sb6.append(",");
                    sb6.append(h17 == null ? -1 : h17.f468803g);
                    sb6.append(",");
                    sb6.append(com.p314xaae8f345.mm.p959x883644fd.k0.g(h17));
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("appendSourceAndSnsStat", "com.tencent.mm.modelstat.SnsStatExtUtil");
                }
            } else {
                sb6.append(",,");
            }
        } else {
            sb6.append(",,");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("appendSourceAndSnsStat", "com.tencent.mm.plugin.sns.ad.model.SnsAdExtUtil");
    }

    public static void c(java.lang.String str, m21.x xVar) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 m70371x485d7;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("appendSourceAndSnsStat", "com.tencent.mm.plugin.sns.ad.model.SnsAdExtUtil");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 b17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().b1(str);
        if (b17 != null && (m70371x485d7 = b17.m70371x485d7()) != null) {
            com.p314xaae8f345.mm.p959x883644fd.k0.a(m70371x485d7.f39040xbd345fc4, xVar);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("appendSourceAndSnsStat", "com.tencent.mm.plugin.sns.ad.model.SnsAdExtUtil");
    }

    public static java.lang.String d(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 c19807x593d1720) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsStatExt", "com.tencent.mm.plugin.sns.ad.model.SnsAdExtUtil");
        if (c19807x593d1720 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsStatExt", "com.tencent.mm.plugin.sns.ad.model.SnsAdExtUtil");
            return null;
        }
        java.lang.String str = c19807x593d1720.f39040xbd345fc4;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsStatExt", "com.tencent.mm.plugin.sns.ad.model.SnsAdExtUtil");
        java.lang.String str2 = "";
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsStatExt", "com.tencent.mm.plugin.sns.ad.model.SnsAdExtUtil");
        } else {
            byte[] decode = android.util.Base64.decode(str, 0);
            r45.td6 td6Var = new r45.td6();
            try {
                td6Var.mo11468x92b714fd(decode);
                str2 = com.p314xaae8f345.mm.p959x883644fd.k0.g(td6Var.f467862d);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsStatExt", "com.tencent.mm.plugin.sns.ad.model.SnsAdExtUtil");
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdExtUtil", "", e17);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsStatExt", "com.tencent.mm.plugin.sns.ad.model.SnsAdExtUtil");
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsStatExt", "com.tencent.mm.plugin.sns.ad.model.SnsAdExtUtil");
        return str2;
    }
}
