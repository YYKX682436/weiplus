package la4;

/* loaded from: classes4.dex */
public class g extends la4.b {
    public int N;

    public g(la4.e eVar, la4.a aVar) {
        super(eVar, aVar);
        this.N = 0;
    }

    @Override // la4.f
    public java.lang.String h(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("appendUrlArg", "com.tencent.mm.plugin.sns.model.download.SnsDownloadAdSight");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("appendUrlArg", "com.tencent.mm.plugin.sns.model.download.SnsDownloadAdSight");
        return str;
    }

    @Override // la4.f
    public int l() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMediaType", "com.tencent.mm.plugin.sns.model.download.SnsDownloadAdSight");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMediaType", "com.tencent.mm.plugin.sns.model.download.SnsDownloadAdSight");
        return 4;
    }

    @Override // la4.b, la4.f
    public boolean o() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isDelFileBeforeDownload", "com.tencent.mm.plugin.sns.model.download.SnsDownloadAdSight");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isDelFileBeforeDownload", "com.tencent.mm.plugin.sns.model.download.SnsDownloadAdSight");
        return false;
    }

    @Override // la4.f
    public boolean q(dn.h hVar, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("processData", "com.tencent.mm.plugin.sns.model.download.SnsDownloadAdSight");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        la4.a aVar = this.f399098n;
        sb6.append(aVar.d());
        sb6.append(aVar.h());
        long k17 = com.p314xaae8f345.mm.vfs.w6.k(sb6.toString());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsDownloadAdSight", "preceeData  downloadLen " + k17 + " " + this.f399095J);
        if (k17 < this.f399095J + 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("processData", "com.tencent.mm.plugin.sns.model.download.SnsDownloadAdSight");
            return false;
        }
        com.p314xaae8f345.mm.vfs.w6.P(aVar.d(), aVar.h(), ca4.z0.I(this.f399099o));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("processData", "com.tencent.mm.plugin.sns.model.download.SnsDownloadAdSight");
        return true;
    }

    @Override // la4.b
    public com.p314xaae8f345.mm.p971x6de15a2e.h2 t(com.p314xaae8f345.mm.p971x6de15a2e.h2 h2Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("appendHttpArg", "com.tencent.mm.plugin.sns.model.download.SnsDownloadAdSight");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("appendHttpArg", "com.tencent.mm.plugin.sns.model.download.SnsDownloadAdSight");
        return h2Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00db, code lost:
    
        r12.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00de, code lost:
    
        if (r16 == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e0, code lost:
    
        v(r21.L, 0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e5, code lost:
    
        r2 = com.p314xaae8f345.mm.vfs.w6.k(r3.d() + r3.h());
        r0 = new java.lang.StringBuilder("getdataend2  ");
        r0.append(r2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsDownloadAdSight", r0.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getDataFromNet", "com.tencent.mm.plugin.sns.model.download.SnsDownloadAdSight");
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0115, code lost:
    
        return true;
     */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0159 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // la4.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean x(java.io.InputStream r22, java.util.Map r23) {
        /*
            Method dump skipped, instructions count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: la4.g.x(java.io.InputStream, java.util.Map):boolean");
    }
}
