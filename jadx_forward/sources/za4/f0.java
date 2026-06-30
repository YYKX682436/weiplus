package za4;

/* loaded from: classes12.dex */
public class f0 extends za4.o {

    /* renamed from: f, reason: collision with root package name */
    public final za4.e0 f552611f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f552612g;

    public f0(java.lang.String str, java.lang.String str2, boolean z17, int i17, int i18, za4.e0 e0Var) {
        this.f552691a = str;
        this.f552692b = str2;
        this.f552612g = str2 + "_tmp";
        this.f552693c = z17;
        this.f552694d = i17;
        this.f552695e = i18;
        this.f552611f = e0Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdLandingPageDownloadSmallFileTask", "add downloadTask, url=" + str);
    }

    public final int a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMediaType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadSmallFileTask");
        int i17 = this.f552694d;
        if (i17 == 41) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMediaType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadSmallFileTask");
            return 1;
        }
        if (i17 == 133) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMediaType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadSmallFileTask");
            return 1;
        }
        if (i17 == 1000000001) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMediaType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadSmallFileTask");
            return 1;
        }
        if (i17 == 44) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMediaType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadSmallFileTask");
            return 1;
        }
        if (i17 == 45) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMediaType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadSmallFileTask");
            return 1;
        }
        if (i17 == 61) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMediaType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadSmallFileTask");
            return 2;
        }
        if (i17 != 62) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMediaType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadSmallFileTask");
            return 0;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMediaType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadSmallFileTask");
        return 3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x0256, code lost:
    
        r15.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0259, code lost:
    
        if (r7 == null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x025e, code lost:
    
        r15.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0261, code lost:
    
        r3.getInputStream().close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0271, code lost:
    
        r3.disconnect();
        r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(r39.f552691a);
        r2 = a();
        r3 = (int) (java.lang.System.currentTimeMillis() - r21);
        r4 = new m21.x();
        r4.a("20UrlMd5", r0 + ",");
        r4.a("21MediaType", r2 + ",");
        r4.a("22IsPreload", (r39.f552693c ? 1 : 0) + ",");
        r4.a("23CostTime", r3 + ",");
        r4.a("24RetCode", r5 + ",");
        r4.a(r8, r39.f552695e + ",");
        r4.a(r28, r30 + ",");
        r4.a(r23, (r21 / 1000) + ",");
        r0 = new java.lang.StringBuilder(r20);
        r0.append(r4.c());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdLandingPageDownloadSmallFileTask", r0.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13572, r4);
        r4 = r19;
        r2 = r27;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r4, r2);
        r7 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0269, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x026a, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AdLandingPageDownloadSmallFileTask", r0.getMessage());
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x025b, code lost:
    
        r7.close();
     */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0612 A[Catch: IOException -> 0x0615, TRY_LEAVE, TryCatch #13 {IOException -> 0x0615, blocks: (B:73:0x060d, B:61:0x0612), top: B:72:0x060d }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0627  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x060d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0725 A[Catch: IOException -> 0x0728, TRY_LEAVE, TryCatch #20 {IOException -> 0x0728, blocks: (B:92:0x0720, B:79:0x0725), top: B:91:0x0720 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x073a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0720 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.os.AsyncTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object doInBackground(java.lang.Object[] r40) {
        /*
            Method dump skipped, instructions count: 2077
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: za4.f0.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPostExecute", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadSmallFileTask");
        java.lang.String str = (java.lang.String) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPostExecute", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadSmallFileTask");
        za4.e0 e0Var = this.f552611f;
        if (str == null) {
            e0Var.c(this.f552692b);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AdLandingPageDownloadSmallFileTask", "onPostExecute, errMsg=" + str + ", url=" + this.f552691a);
            e0Var.a();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPostExecute", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadSmallFileTask");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPostExecute", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadSmallFileTask");
    }
}
