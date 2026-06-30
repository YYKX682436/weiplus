package he0;

/* loaded from: classes4.dex */
public class g5 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public g5() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        java.lang.String str;
        boolean z17;
        java.lang.String str2;
        boolean z18;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.feature.sns.listener.ReportSnsListener");
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5921x88848176 c5921x88848176 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5921x88848176) abstractC20979x809547d1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.feature.sns.listener.ReportSnsListener");
        if (gm0.j1.a()) {
            am.fr frVar = c5921x88848176.f136223g;
            com.p314xaae8f345.mm.p958xdb1a85af.C11137xb05b06ad c11137xb05b06ad = frVar.f88234a;
            try {
            } catch (java.lang.Exception e17) {
                e = e17;
                str = "MicroMsg.ReportSnsListener";
            }
            if (frVar.f88235b == 1) {
                if (c11137xb05b06ad.f153005m == 1) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17932x22276883 y07 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Vi().y0(c11137xb05b06ad.f153001f);
                    if (y07 == null || !y07.m70317x9ec757ba()) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Gj().h(13155, java.lang.Long.valueOf(c11137xb05b06ad.f153001f), y07.m70299x10413e67().f38104xce64ddf1, java.lang.Integer.valueOf(c11137xb05b06ad.f153000e), java.lang.Long.valueOf(c11137xb05b06ad.f153004i), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), java.lang.Integer.valueOf(y07.m70306x2d5d262a()), "");
                    } else {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Gj().h(14647, java.lang.Long.valueOf(c11137xb05b06ad.f153001f), y07.m70299x10413e67().f38104xce64ddf1, java.lang.Integer.valueOf(c11137xb05b06ad.f153000e), java.lang.Long.valueOf(c11137xb05b06ad.f153004i), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), java.lang.Integer.valueOf(y07.m70306x2d5d262a()), "");
                    }
                    m21.w.c(750);
                    java.lang.String str3 = y07.m70299x10413e67().f38104xce64ddf1;
                    java.lang.System.currentTimeMillis();
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17932x22276883 y08 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Vi().y0(c11137xb05b06ad.f153001f);
                    if (y08 != null) {
                        str2 = y08.m70299x10413e67().f38104xce64ddf1;
                        z18 = y08.m70317x9ec757ba();
                    } else {
                        str2 = c5921x88848176.f136223g.f88236c;
                        if (str2 == null) {
                            str2 = "";
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ReportSnsListener", "ReportSnsEvent, AdSnsInfo==null, uxInfo=".concat(str2));
                        z18 = false;
                    }
                    long j17 = c11137xb05b06ad.f153001f;
                    java.lang.Object[] objArr = new java.lang.Object[5];
                    objArr[0] = c11137xb05b06ad;
                    objArr[1] = str2;
                    objArr[2] = java.lang.Integer.valueOf(c11137xb05b06ad.f153000e);
                    str = "MicroMsg.ReportSnsListener";
                    try {
                        objArr[3] = java.lang.Long.valueOf(c11137xb05b06ad.f153004i);
                        objArr[4] = java.lang.Long.valueOf(java.lang.System.currentTimeMillis());
                        java.lang.String a17 = i64.q0.a(j17, objArr);
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                        sb6.append(a17);
                        sb6.append(java.lang.String.format(",%s", c11137xb05b06ad.f153006n + ""));
                        java.lang.String sb7 = sb6.toString();
                        java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                        sb8.append(sb7);
                        sb8.append(java.lang.String.format(",%s", ((java.lang.System.currentTimeMillis() - c11137xb05b06ad.f153004i) - c11137xb05b06ad.f153008p) + ""));
                        java.lang.String sb9 = sb8.toString();
                        if (z18) {
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Gj().h(14643, sb9);
                        } else {
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Gj().h(12013, sb9);
                        }
                        m21.w.c(733);
                        java.lang.System.currentTimeMillis();
                        z17 = false;
                    } catch (java.lang.Exception e18) {
                        e = e18;
                        z17 = false;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(str, e, "report ad click error", new java.lang.Object[0]);
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.feature.sns.listener.ReportSnsListener");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.feature.sns.listener.ReportSnsListener");
                        return z17;
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.feature.sns.listener.ReportSnsListener");
                }
            }
            z17 = false;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.feature.sns.listener.ReportSnsListener");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ReportSnsListener", "ReportSnsEvent arrived before account was ready, ignore it.");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.feature.sns.listener.ReportSnsListener");
            z17 = false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.feature.sns.listener.ReportSnsListener");
        return z17;
    }
}
