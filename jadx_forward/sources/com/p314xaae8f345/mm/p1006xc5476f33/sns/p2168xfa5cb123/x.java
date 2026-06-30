package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123;

/* loaded from: classes4.dex */
public class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6085x679e6f54 f246529d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.C17900x8eb2455f f246530e;

    public x(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.C17900x8eb2455f c17900x8eb2455f, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6085x679e6f54 c6085x679e6f54) {
        this.f246530e = c17900x8eb2455f;
        this.f246529d = c6085x679e6f54;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.statistics.SnsPostReportLogic$1$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.z zVar = this.f246530e.f246357d;
        am.mw mwVar = this.f246529d.f136363g;
        long j17 = mwVar.f88906a;
        java.util.HashMap hashMap = mwVar.f88908c;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.statistics.SnsPostReportLogic");
        zVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportSnsImageExif", "com.tencent.mm.plugin.sns.statistics.SnsPostReportLogic");
        if (hashMap != null && !hashMap.isEmpty()) {
            java.util.Iterator it = hashMap.keySet().iterator();
            while (it.hasNext()) {
                int intValue = ((java.lang.Integer) it.next()).intValue();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.y yVar = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.y) zVar.f246536a.remove(java.lang.Integer.valueOf(intValue));
                if (yVar != null) {
                    java.lang.String str = yVar.f246533b;
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                        try {
                            i17 = ((java.lang.Integer) hashMap.get(java.lang.Integer.valueOf(intValue))).intValue() == 1 ? 1 : 2;
                        } catch (java.lang.Exception unused) {
                            i17 = 0;
                        }
                        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6698x24e37ce c6698x24e37ce = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6698x24e37ce(str);
                        c6698x24e37ce.B = c6698x24e37ce.b("publishId", ca4.z0.t0(j17), true);
                        c6698x24e37ce.f140367r = i17;
                        c6698x24e37ce.C = yVar.f246532a;
                        c6698x24e37ce.k();
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsPostReportLogic", "report sns image exif [%s]", c6698x24e37ce.n());
                    }
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportSnsImageExif", "com.tencent.mm.plugin.sns.statistics.SnsPostReportLogic");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.statistics.SnsPostReportLogic");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.statistics.SnsPostReportLogic$1$1");
    }
}
