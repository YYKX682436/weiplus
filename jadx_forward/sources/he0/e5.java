package he0;

/* loaded from: classes4.dex */
public class e5 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public e5() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        am.wq wqVar;
        com.p314xaae8f345.mm.p958xdb1a85af.C11137xb05b06ad c11137xb05b06ad;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17932x22276883 y07;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.feature.sns.listener.ReportAdH5LoadListener");
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5910xafee75f0 c5910xafee75f0 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5910xafee75f0) abstractC20979x809547d1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.feature.sns.listener.ReportAdH5LoadListener");
        boolean z17 = false;
        if (gm0.j1.a()) {
            try {
                wqVar = c5910xafee75f0.f136214g;
                c11137xb05b06ad = wqVar.f89845a;
                y07 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Vi().y0(c11137xb05b06ad.f153001f);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ReportAdH5LoadListener", "ad h5 report, snsId=" + ca4.z0.t0(c11137xb05b06ad.f153001f) + ", reportType=" + wqVar.f89848d + ", errCode=" + wqVar.f89847c);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ReportAdH5LoadListener", e17, "report load ad h5 error", new java.lang.Object[0]);
            }
            if (y07 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 m70298xd15b2ed8 = y07.m70298xd15b2ed8();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 m70356x450e1efa = c11137xb05b06ad.f152999d == 2 ? m70298xd15b2ed8.m70356x450e1efa() : m70298xd15b2ed8.m70346x10413e67();
                if (m70356x450e1efa != null) {
                    if (c11137xb05b06ad.f152999d == 2) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ReportAdH5LoadListener", "at_friend_detail report ad h5 load");
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ReportAdH5LoadListener", "report ad h5 load");
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(16972, java.lang.Long.valueOf(c11137xb05b06ad.f153001f), java.lang.Integer.valueOf(c11137xb05b06ad.f153000e), m70356x450e1efa.f38104xce64ddf1, java.lang.Integer.valueOf(m70298xd15b2ed8.m70350x13c652ad()), m70298xd15b2ed8.m70371x485d7().f39040xbd345fc4, wqVar.f89846b, java.lang.Integer.valueOf(wqVar.f89848d), java.lang.Integer.valueOf(wqVar.f89847c), java.lang.Long.valueOf(wqVar.f89849e));
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.feature.sns.listener.ReportAdH5LoadListener");
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.feature.sns.listener.ReportAdH5LoadListener");
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 W0 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().W0(c11137xb05b06ad.f153001f);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("report ad h5, AdSnsInfo==null, uxInfo=");
                sb6.append(wqVar.f89850f);
                sb6.append(", snsInfo==null?");
                sb6.append(W0 == null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ReportAdH5LoadListener", sb6.toString());
                java.lang.String str = "";
                if (W0 != null) {
                    java.lang.String str2 = wqVar.f89850f;
                    int m70350x13c652ad = W0.m70350x13c652ad();
                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 m70371x485d7 = W0.m70371x485d7();
                    java.lang.String str3 = m70371x485d7 == null ? "" : m70371x485d7.f39040xbd345fc4;
                    if (str3 != null) {
                        str = str3;
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(16972, java.lang.Long.valueOf(c11137xb05b06ad.f153001f), java.lang.Integer.valueOf(c11137xb05b06ad.f153000e), str2, java.lang.Integer.valueOf(m70350x13c652ad), str, wqVar.f89846b, java.lang.Integer.valueOf(wqVar.f89848d), java.lang.Integer.valueOf(wqVar.f89847c), java.lang.Long.valueOf(wqVar.f89849e));
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.feature.sns.listener.ReportAdH5LoadListener");
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(16972, java.lang.Long.valueOf(c11137xb05b06ad.f153001f), java.lang.Integer.valueOf(c11137xb05b06ad.f153000e), wqVar.f89850f, 0, "", wqVar.f89846b, java.lang.Integer.valueOf(wqVar.f89848d), java.lang.Integer.valueOf(wqVar.f89847c), java.lang.Long.valueOf(wqVar.f89849e));
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.feature.sns.listener.ReportAdH5LoadListener");
                }
            }
            z17 = true;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ReportAdH5LoadListener", "ReportAdH5LoadEvent arrived before account was ready, ignore it.");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.feature.sns.listener.ReportAdH5LoadListener");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.feature.sns.listener.ReportAdH5LoadListener");
        return z17;
    }
}
