package i64;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final i64.c f370644a = new i64.c();

    public final a44.a a(java.lang.String str) {
        i64.b bVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("get", "com.tencent.mm.plugin.sns.ad.model.AdComplianceModelManager$DownloadInfoMap");
        a44.a aVar = null;
        if (str == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("get", "com.tencent.mm.plugin.sns.ad.model.AdComplianceModelManager$DownloadInfoMap");
            return null;
        }
        p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 j2Var = (p3325xe03a0797.p3326xc267989b.p3328x30012e.j2) ((java.util.LinkedHashMap) i64.i.f370716d.c()).get(str);
        if (j2Var != null && (bVar = (i64.b) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) j2Var).mo144003x754a37bb()) != null) {
            aVar = bVar.a();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("get", "com.tencent.mm.plugin.sns.ad.model.AdComplianceModelManager$DownloadInfoMap");
        return aVar;
    }

    public final void b(java.lang.String str, a44.a aVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("set", "com.tencent.mm.plugin.sns.ad.model.AdComplianceModelManager$DownloadInfoMap");
        if (str == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("set", "com.tencent.mm.plugin.sns.ad.model.AdComplianceModelManager$DownloadInfoMap");
        } else {
            if (aVar == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("set", "com.tencent.mm.plugin.sns.ad.model.AdComplianceModelManager$DownloadInfoMap");
                return;
            }
            if (!r26.n0.N(str)) {
                i64.i.f370716d.a(str, new i64.b(str, a44.k.f82818g.c(aVar), aVar));
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("set", "com.tencent.mm.plugin.sns.ad.model.AdComplianceModelManager$DownloadInfoMap");
        }
    }
}
