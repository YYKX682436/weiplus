package p34;

@j95.b
/* loaded from: classes3.dex */
public class p extends i95.w implements p94.f0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f433221d = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f433222e = false;

    public void Ai(int i17, java.lang.Object... objArr) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("kvStat", "com.tencent.mm.plugin.sns.ad.SnsAdReportService");
        wi();
        z44.a aVar = (z44.a) ((java.util.HashMap) this.f433221d).get(java.lang.Integer.valueOf(i17));
        if (aVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SnsAdReportService", "can not find %s implementation for kv %d", z44.a.class, java.lang.Integer.valueOf(i17));
        } else {
            aVar.a(objArr);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("kvStat", "com.tencent.mm.plugin.sns.ad.SnsAdReportService");
    }

    public void Bi(int i17, int i18, java.lang.Object... objArr) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("kvStatWithRecSrc", "com.tencent.mm.plugin.sns.ad.SnsAdReportService");
        wi();
        z44.a aVar = (z44.a) ((java.util.HashMap) this.f433221d).get(java.lang.Integer.valueOf(i17));
        if (aVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SnsAdReportService", "can not find %s implementation for kv %d", z44.a.class, java.lang.Integer.valueOf(i17));
        } else {
            aVar.d(i18, objArr);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("kvStatWithRecSrc", "com.tencent.mm.plugin.sns.ad.SnsAdReportService");
    }

    public void Di(z44.a aVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("registeKvReporter", "com.tencent.mm.plugin.sns.ad.SnsAdReportService");
        if (aVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SnsAdReportService", "registing null %s", z44.a.class);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("registeKvReporter", "com.tencent.mm.plugin.sns.ad.SnsAdReportService");
        } else {
            ((java.util.HashMap) this.f433221d).put(java.lang.Integer.valueOf(aVar.mo178397xb5884f29()), aVar);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("registeKvReporter", "com.tencent.mm.plugin.sns.ad.SnsAdReportService");
        }
    }

    public final void Ni() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("registerAllKvReporter", "com.tencent.mm.plugin.sns.ad.SnsAdReportService");
        Di(new z44.e());
        Di(new z44.d());
        Di(new z44.b());
        Di(new z44.c());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("registerAllKvReporter", "com.tencent.mm.plugin.sns.ad.SnsAdReportService");
    }

    public final void wi() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initOnDemand", "com.tencent.mm.plugin.sns.ad.SnsAdReportService");
        if (this.f433222e) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initOnDemand", "com.tencent.mm.plugin.sns.ad.SnsAdReportService");
            return;
        }
        synchronized (this) {
            try {
                if (!this.f433222e) {
                    Ni();
                }
                this.f433222e = true;
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initOnDemand", "com.tencent.mm.plugin.sns.ad.SnsAdReportService");
                throw th6;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initOnDemand", "com.tencent.mm.plugin.sns.ad.SnsAdReportService");
    }
}
