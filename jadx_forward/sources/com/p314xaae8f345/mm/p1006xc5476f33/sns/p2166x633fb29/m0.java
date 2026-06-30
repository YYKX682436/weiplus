package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29;

/* loaded from: classes4.dex */
public class m0 implements la4.e {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f245971a;

    /* renamed from: b, reason: collision with root package name */
    public long f245972b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f245973c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f245974d = 2;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f245975e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f245976f = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final byte[] f245977g = new byte[0];

    /* renamed from: h, reason: collision with root package name */
    public final java.util.HashMap f245978h = new java.util.HashMap();

    /* renamed from: i, reason: collision with root package name */
    public boolean f245979i = true;

    /* renamed from: j, reason: collision with root package name */
    public final java.util.Set f245980j;

    /* renamed from: k, reason: collision with root package name */
    public final java.util.Set f245981k;

    /* renamed from: l, reason: collision with root package name */
    public final java.util.LinkedList f245982l;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.HashMap f245983m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.Map f245984n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.Map f245985o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f245986p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f245987q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f245988r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f245989s;

    public m0() {
        this.f245971a = null;
        java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = new java.util.concurrent.CopyOnWriteArraySet();
        this.f245980j = copyOnWriteArraySet;
        copyOnWriteArraySet.add(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.a0(this));
        this.f245981k = new java.util.HashSet();
        this.f245982l = new java.util.LinkedList();
        this.f245983m = new java.util.HashMap();
        this.f245984n = new java.util.concurrent.ConcurrentHashMap();
        this.f245985o = new java.util.HashMap();
        this.f245986p = new java.util.concurrent.ConcurrentHashMap();
        this.f245987q = new java.util.concurrent.ConcurrentHashMap();
        this.f245988r = new java.util.concurrent.ConcurrentHashMap();
        this.f245989s = new java.util.concurrent.CopyOnWriteArrayList();
        this.f245971a = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Tj();
        o();
    }

    public static boolean a(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.m0 m0Var) {
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$100", "com.tencent.mm.plugin.sns.model.DownloadManager");
        m0Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("pullFile", "com.tencent.mm.plugin.sns.model.DownloadManager");
        synchronized (m0Var.f245977g) {
            try {
                java.util.LinkedList linkedList = m0Var.f245975e;
                z17 = false;
                if (linkedList == null || linkedList.size() <= 0) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("pullFile", "com.tencent.mm.plugin.sns.model.DownloadManager");
                } else {
                    p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(m0Var.f245975e.remove());
                    new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.j7().f(null);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("pullFile", "com.tencent.mm.plugin.sns.model.DownloadManager");
                    z17 = true;
                }
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("pullFile", "com.tencent.mm.plugin.sns.model.DownloadManager");
                throw th6;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$100", "com.tencent.mm.plugin.sns.model.DownloadManager");
        return z17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x031e, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.DownloadManager", "others http: urlType" + r14 + " -- url : " + r9 + " isThumb :" + r8);
     */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0273 A[Catch: all -> 0x0660, TryCatch #0 {all -> 0x0660, blocks: (B:21:0x0093, B:23:0x00a1, B:25:0x00b4, B:27:0x0109, B:30:0x0113, B:32:0x0161, B:33:0x0166, B:35:0x0170, B:38:0x017c, B:40:0x01d4, B:52:0x01e9, B:54:0x0268, B:56:0x0273, B:59:0x0285, B:61:0x028b, B:62:0x0295, B:65:0x029f, B:67:0x02bf, B:69:0x02c9, B:78:0x0311, B:80:0x031e, B:81:0x033f, B:85:0x034d, B:88:0x037a, B:90:0x03eb, B:92:0x03fc, B:166:0x0387, B:168:0x038f, B:170:0x03a7, B:172:0x03af, B:175:0x03d7, B:176:0x03e1, B:179:0x03d5, B:180:0x0359, B:181:0x027e, B:185:0x01f4, B:187:0x0207, B:189:0x0210, B:195:0x0224, B:198:0x022d, B:199:0x0232, B:200:0x023a, B:202:0x0241, B:204:0x0249, B:205:0x024b, B:207:0x0254, B:209:0x025b), top: B:20:0x0093 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x028b A[Catch: all -> 0x0660, TryCatch #0 {all -> 0x0660, blocks: (B:21:0x0093, B:23:0x00a1, B:25:0x00b4, B:27:0x0109, B:30:0x0113, B:32:0x0161, B:33:0x0166, B:35:0x0170, B:38:0x017c, B:40:0x01d4, B:52:0x01e9, B:54:0x0268, B:56:0x0273, B:59:0x0285, B:61:0x028b, B:62:0x0295, B:65:0x029f, B:67:0x02bf, B:69:0x02c9, B:78:0x0311, B:80:0x031e, B:81:0x033f, B:85:0x034d, B:88:0x037a, B:90:0x03eb, B:92:0x03fc, B:166:0x0387, B:168:0x038f, B:170:0x03a7, B:172:0x03af, B:175:0x03d7, B:176:0x03e1, B:179:0x03d5, B:180:0x0359, B:181:0x027e, B:185:0x01f4, B:187:0x0207, B:189:0x0210, B:195:0x0224, B:198:0x022d, B:199:0x0232, B:200:0x023a, B:202:0x0241, B:204:0x0249, B:205:0x024b, B:207:0x0254, B:209:0x025b), top: B:20:0x0093 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x029f A[Catch: all -> 0x0660, TRY_ENTER, TryCatch #0 {all -> 0x0660, blocks: (B:21:0x0093, B:23:0x00a1, B:25:0x00b4, B:27:0x0109, B:30:0x0113, B:32:0x0161, B:33:0x0166, B:35:0x0170, B:38:0x017c, B:40:0x01d4, B:52:0x01e9, B:54:0x0268, B:56:0x0273, B:59:0x0285, B:61:0x028b, B:62:0x0295, B:65:0x029f, B:67:0x02bf, B:69:0x02c9, B:78:0x0311, B:80:0x031e, B:81:0x033f, B:85:0x034d, B:88:0x037a, B:90:0x03eb, B:92:0x03fc, B:166:0x0387, B:168:0x038f, B:170:0x03a7, B:172:0x03af, B:175:0x03d7, B:176:0x03e1, B:179:0x03d5, B:180:0x0359, B:181:0x027e, B:185:0x01f4, B:187:0x0207, B:189:0x0210, B:195:0x0224, B:198:0x022d, B:199:0x0232, B:200:0x023a, B:202:0x0241, B:204:0x0249, B:205:0x024b, B:207:0x0254, B:209:0x025b), top: B:20:0x0093 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A() {
        /*
            Method dump skipped, instructions count: 1761
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.m0.A():void");
    }

    public void B(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("unFinishBySceneDown", "com.tencent.mm.plugin.sns.model.DownloadManager");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Tj().mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.f0(this, str));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("unFinishBySceneDown", "com.tencent.mm.plugin.sns.model.DownloadManager");
    }

    public void C(java.lang.String str, int i17, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("unLockDownLoad", "com.tencent.mm.plugin.sns.model.DownloadManager");
        synchronized (this.f245977g) {
            try {
                java.lang.Thread.currentThread().getId();
                ca4.m mVar = (ca4.m) ((java.util.HashMap) this.f245985o).get(str);
                if (mVar != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getRequestType", "com.tencent.mm.plugin.sns.data.DownloaderLockElment");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getRequestType", "com.tencent.mm.plugin.sns.data.DownloaderLockElment");
                    if (9 == mVar.f121531b) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getDecodeElements", "com.tencent.mm.plugin.sns.data.DownloaderLockElment");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getDecodeElements", "com.tencent.mm.plugin.sns.data.DownloaderLockElment");
                        ca4.s0 s0Var = (ca4.s0) mVar.f121532c.get(i17);
                        if (s0Var != null) {
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.hj().e(s0Var, str);
                        }
                    } else {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getDecodeInfo", "com.tencent.mm.plugin.sns.data.DownloaderLockElment");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getDecodeInfo", "com.tencent.mm.plugin.sns.data.DownloaderLockElment");
                        ca4.s0 s0Var2 = mVar.f121530a;
                        if (s0Var2 != null) {
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.hj().e(s0Var2, str);
                        }
                    }
                }
                if (z17) {
                    ((java.util.HashMap) this.f245985o).remove(str);
                    y(str);
                }
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("unLockDownLoad", "com.tencent.mm.plugin.sns.model.DownloadManager");
                throw th6;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("unLockDownLoad", "com.tencent.mm.plugin.sns.model.DownloadManager");
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x013c A[Catch: all -> 0x0178, TryCatch #0 {all -> 0x0178, blocks: (B:29:0x00b8, B:31:0x00c1, B:33:0x00cb, B:35:0x00e1, B:37:0x00ee, B:39:0x00f8, B:40:0x017c, B:57:0x013c, B:58:0x0142, B:60:0x0148, B:63:0x0163, B:65:0x016b, B:66:0x0170), top: B:28:0x00b8 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(java.lang.String r17, android.util.SparseArray r18, android.util.SparseArray r19, com.p314xaae8f345.mm.p2621x8fb0427b.s7 r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 519
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.m0.b(java.lang.String, android.util.SparseArray, android.util.SparseArray, com.tencent.mm.storage.s7, int, int):void");
    }

    public void c(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.h0 h0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addDownLoadEndListener", "com.tencent.mm.plugin.sns.model.DownloadManager");
        this.f245971a.mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.b0(this, h0Var));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addDownLoadEndListener", "com.tencent.mm.plugin.sns.model.DownloadManager");
    }

    public boolean d(r45.jj4 jj4Var, int i17, ca4.s0 s0Var, com.p314xaae8f345.mm.p2621x8fb0427b.s7 s7Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addDownLoadSns", "com.tencent.mm.plugin.sns.model.DownloadManager");
        boolean e17 = e(jj4Var, i17, s0Var, s7Var, null);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addDownLoadSns", "com.tencent.mm.plugin.sns.model.DownloadManager");
        return e17;
    }

    public boolean e(r45.jj4 jj4Var, int i17, ca4.s0 s0Var, com.p314xaae8f345.mm.p2621x8fb0427b.s7 s7Var, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addDownLoadSns", "com.tencent.mm.plugin.sns.model.DownloadManager");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addDownLoadSns", "com.tencent.mm.plugin.sns.model.DownloadManager");
        boolean f17 = f(jj4Var, i17, s0Var, s7Var, str, "", "", 0);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addDownLoadSns", "com.tencent.mm.plugin.sns.model.DownloadManager");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addDownLoadSns", "com.tencent.mm.plugin.sns.model.DownloadManager");
        return f17;
    }

    public boolean f(r45.jj4 jj4Var, int i17, ca4.s0 s0Var, com.p314xaae8f345.mm.p2621x8fb0427b.s7 s7Var, java.lang.String str, java.lang.String str2, java.lang.String str3, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addDownLoadSns", "com.tencent.mm.plugin.sns.model.DownloadManager");
        if (jj4Var == null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("unknow case media is null ");
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.b(true));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.DownloadManager", sb6.toString());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addDownLoadSns", "com.tencent.mm.plugin.sns.model.DownloadManager");
            return false;
        }
        synchronized (this.f245977g) {
            try {
                java.lang.String str4 = jj4Var.f459388d;
                java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.n7.f246048a;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("recordStartLoadSmallPic", "com.tencent.mm.plugin.sns.model.TimelineSmallPicStat");
                boolean z18 = x51.o1.f533575a;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.n7.a(str4);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("recordStartLoadSmallPic", "com.tencent.mm.plugin.sns.model.TimelineSmallPicStat");
                s7Var.m78111xb2c87fbf(com.p314xaae8f345.mm.p2621x8fb0427b.s7.f276832c);
                java.lang.String str5 = jj4Var.f459388d;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setScene", "com.tencent.mm.plugin.sns.model.TimelineSmallPicStat");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.n7.a(str5);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setScene", "com.tencent.mm.plugin.sns.model.TimelineSmallPicStat");
                h(jj4Var, i17, s0Var, s7Var, null, null, str, str2, str3);
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addDownLoadSns", "com.tencent.mm.plugin.sns.model.DownloadManager");
                throw th6;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addDownLoadSns", "com.tencent.mm.plugin.sns.model.DownloadManager");
        return true;
    }

    public boolean g(r45.jj4 jj4Var, int i17, ca4.s0 s0Var, com.p314xaae8f345.mm.p2621x8fb0427b.s7 s7Var, java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addDownLoadSnsAd", "com.tencent.mm.plugin.sns.model.DownloadManager");
        if (jj4Var == null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("unknow case media is null ");
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.b(true));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.DownloadManager", sb6.toString());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addDownLoadSnsAd", "com.tencent.mm.plugin.sns.model.DownloadManager");
            return false;
        }
        synchronized (this.f245977g) {
            try {
                java.lang.String str3 = jj4Var.f459388d;
                java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.n7.f246048a;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("recordStartLoadSmallPic", "com.tencent.mm.plugin.sns.model.TimelineSmallPicStat");
                boolean z18 = x51.o1.f533575a;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.n7.a(str3);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("recordStartLoadSmallPic", "com.tencent.mm.plugin.sns.model.TimelineSmallPicStat");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addDownLoadSnsImpl", "com.tencent.mm.plugin.sns.model.DownloadManager");
                h(jj4Var, i17, s0Var, s7Var, str, str2, null, "", "");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addDownLoadSnsImpl", "com.tencent.mm.plugin.sns.model.DownloadManager");
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addDownLoadSnsAd", "com.tencent.mm.plugin.sns.model.DownloadManager");
                throw th6;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addDownLoadSnsAd", "com.tencent.mm.plugin.sns.model.DownloadManager");
        return true;
    }

    public final boolean h(r45.jj4 jj4Var, int i17, ca4.s0 s0Var, com.p314xaae8f345.mm.p2621x8fb0427b.s7 s7Var, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        int i18;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addDownLoadSnsImpl", "com.tencent.mm.plugin.sns.model.DownloadManager");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DownloadManager", "[%s][media:%s] run addDownLoadSnsImpl type:%d start", "[image-flow]", jj4Var.f459388d, java.lang.Integer.valueOf(i17));
        if (!ca4.z0.j0(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Bi())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.DownloadManager", "[%s][media:%s] run addDownLoadSnsImpl isHasSdcard is false accpath %s sdcard: %s", "[image-flow]", jj4Var.f459388d, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Bi(), lp0.b.e0());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addDownLoadSnsImpl", "com.tencent.mm.plugin.sns.model.DownloadManager");
            return false;
        }
        if (jj4Var.f459388d.startsWith("Locall_path") || jj4Var.f459388d.startsWith("pre_temp_sns_pic")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.DownloadManager", "[%s][media:%s] is a local img not need download", "[image-flow]", jj4Var.f459388d);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addDownLoadSnsImpl", "com.tencent.mm.plugin.sns.model.DownloadManager");
            return false;
        }
        java.lang.String G = ca4.z0.G(i17, jj4Var.f459388d);
        synchronized (this.f245977g) {
            try {
                if (((java.util.HashMap) this.f245985o).containsKey(G)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.DownloadManager", "[%s][media:%s] run addDownLoadSnsImpl what are u doing?", "[image-flow]", jj4Var.f459388d);
                    java.util.Iterator it = this.f245982l.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        ca4.t0 t0Var = (ca4.t0) it.next();
                        if (t0Var.c() != null && t0Var.c().f459388d.equals(jj4Var.f459388d)) {
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getRequestType", "com.tencent.mm.plugin.sns.data.SnsDownLoadElment");
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getRequestType", "com.tencent.mm.plugin.sns.data.SnsDownLoadElment");
                            if (t0Var.f121551b == i17) {
                                if (this.f245982l.remove(t0Var)) {
                                    this.f245982l.addLast(t0Var);
                                }
                            }
                        }
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DownloadManager", "[%s][media:%s] run addDownLoadSnsImpl add to net lists:%s", "[image-flow]", jj4Var.f459388d, q());
                    java.util.HashMap hashMap = this.f245983m;
                    java.lang.String str6 = jj4Var.f459388d;
                    boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    hashMap.put(str6, java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime()));
                    ((java.util.HashMap) this.f245985o).put(G, new ca4.m(s0Var, i17));
                    ca4.t0 t0Var2 = new ca4.t0(jj4Var, i17, G, s7Var, str, str2, str4, str5);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setSnsId", "com.tencent.mm.plugin.sns.data.SnsDownLoadElment");
                    t0Var2.f121558i = str3;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSnsId", "com.tencent.mm.plugin.sns.data.SnsDownLoadElment");
                    this.f245982l.add(t0Var2);
                    java.lang.String mediaId = jj4Var.f459388d;
                    int size = this.f245982l.size();
                    int size2 = ((java.util.concurrent.ConcurrentHashMap) this.f245984n).size();
                    ta4.u0 u0Var = ta4.u0.f498371a;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("enqueueDownloadList", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
                    pm0.v.O("SnsImageLoadReporter", new ta4.d0(mediaId, size, size2));
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enqueueDownloadList", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
                        java.lang.String w17 = ca4.z0.w(9, str3);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DownloadManager", "snsId: %s, mediaId: %s, batchKey: %s.", str3, jj4Var.f459388d, w17);
                        if (this.f245986p.containsKey(w17)) {
                            java.util.concurrent.atomic.AtomicInteger atomicInteger = (java.util.concurrent.atomic.AtomicInteger) this.f245986p.get(w17);
                            if (atomicInteger == null) {
                                atomicInteger = new java.util.concurrent.atomic.AtomicInteger(0);
                            }
                            i18 = atomicInteger.incrementAndGet();
                        } else {
                            java.util.concurrent.atomic.AtomicInteger atomicInteger2 = new java.util.concurrent.atomic.AtomicInteger(0);
                            int incrementAndGet = atomicInteger2.incrementAndGet();
                            this.f245986p.put(w17, atomicInteger2);
                            i18 = incrementAndGet;
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DownloadManager", "res: %s.", java.lang.Integer.valueOf(i18));
                        this.f245987q.put(G, w17);
                    }
                }
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addDownLoadSnsImpl", "com.tencent.mm.plugin.sns.model.DownloadManager");
                throw th6;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DownloadManager", "tryStartNetscene size %s Tsize : %s, list:%s", java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.xj().m()), java.lang.Integer.valueOf(((java.util.concurrent.ConcurrentHashMap) this.f245984n).size()), q());
        ((java.util.HashMap) this.f245985o).size();
        this.f245975e.size();
        if (android.os.Looper.myLooper() != null) {
            android.os.Looper.myQueue().addIdleHandler(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l0(this));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.DownloadManager", "Looper.myLooper() == null");
        }
        n();
        m();
        if (this.f245982l.size() > 0) {
            A();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addDownLoadSnsImpl", "com.tencent.mm.plugin.sns.model.DownloadManager");
        return true;
    }

    public void i(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, boolean z17, int i18, boolean z18, dn.n nVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addDownloadStreamVideoTask", "com.tencent.mm.plugin.sns.model.DownloadManager");
        dn.o oVar = new dn.o();
        oVar.f323318d = "task_DownloadManager";
        oVar.f69601xaca5bdda = str;
        oVar.M1 = str2;
        oVar.H1 = 1;
        oVar.f69592xf1ebe47b = 100;
        oVar.Z = 5;
        oVar.A1 = i17;
        oVar.f323342y0 = 3;
        oVar.f69595x6d25b0d9 = str3;
        oVar.f323341y = z18;
        oVar.f323348c2 = nVar;
        if (i17 == 1) {
            oVar.f323342y0 = 10;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkAdDeviceSupportH265", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
            if ((oVar.Z == 5) && !android.text.TextUtils.isEmpty(oVar.M1)) {
                try {
                    if (oVar.M1.contains("svpuseh265flag=1")) {
                        boolean Di = d11.s.Di(6);
                        if (Di) {
                            oVar.f69610x4f5245a8 = 2;
                        } else {
                            oVar.f69610x4f5245a8 = 1;
                            try {
                                ca4.e0.a("dev_disable_hevc", wo.w0.m().toLowerCase(), 0, 0, "");
                            } catch (java.lang.Throwable th6) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdH265Helper", "checkAdDeviceSupportH265 report exp=" + th6.toString());
                            }
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdH265Helper", "checkAppendAdH265Flag, isDeviceSupportHevc=" + Di + ", requestVideoFormat=" + oVar.f69610x4f5245a8 + ", url=" + oVar.M1);
                        l44.c0.f(oVar.A1, true, Di);
                    } else {
                        oVar.f69610x4f5245a8 = 1;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdH265Helper", "checkAppendAdH265Flag, url has no h265 flag, url=" + oVar.M1);
                        l44.c0.f(oVar.A1, false, false);
                    }
                } catch (java.lang.Throwable th7) {
                    oVar.f69610x4f5245a8 = 1;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdH265Helper", "checkAppendAdH265Flag, exp=" + th7.toString());
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkAdDeviceSupportH265", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
            if (z17) {
                oVar.H1 = 2;
                oVar.f69608x6ac8fea7 = i18;
            }
        }
        t21.o2.Di().e(oVar, false);
        synchronized (this.f245978h) {
            try {
                this.f245978h.put(str, str3);
            } catch (java.lang.Throwable th8) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addDownloadStreamVideoTask", "com.tencent.mm.plugin.sns.model.DownloadManager");
                throw th8;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addDownloadStreamVideoTask", "com.tencent.mm.plugin.sns.model.DownloadManager");
    }

    public void j(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addMediaId", "com.tencent.mm.plugin.sns.model.DownloadManager");
        this.f245989s.add(str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addMediaId", "com.tencent.mm.plugin.sns.model.DownloadManager");
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0031, code lost:
    
        if (r3.f245871a.equals(r8.f245871a) == false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void k(java.lang.String r7, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.k0 r8) {
        /*
            r6 = this;
            java.lang.String r0 = "addReporter"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.model.DownloadManager"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r0, r1)
            boolean r2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r7)
            if (r2 != 0) goto L36
            if (r8 == 0) goto L36
            java.util.concurrent.ConcurrentHashMap r2 = r6.f245988r
            java.lang.Object r3 = r2.get(r7)
            com.tencent.mm.plugin.sns.model.k0 r3 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.k0) r3
            if (r3 == 0) goto L33
            java.lang.String r4 = "access$400"
            java.lang.String r5 = "com.tencent.mm.plugin.sns.model.DownloadManager$SingleImgDownloadByFeedReporter"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r4, r5)
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r4, r5)
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r4, r5)
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r4, r5)
            java.lang.String r3 = r3.f245871a
            java.lang.String r4 = r8.f245871a
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L36
        L33:
            r2.put(r7, r8)
        L36:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.m0.k(java.lang.String, com.tencent.mm.plugin.sns.model.k0):void");
    }

    public boolean l(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkBigMediaIdDownloading", "com.tencent.mm.plugin.sns.model.DownloadManager");
        synchronized (this.f245977g) {
            try {
                if (!((java.util.concurrent.ConcurrentHashMap) this.f245984n).containsKey(ca4.z0.G(2, str))) {
                    if (!((java.util.concurrent.ConcurrentHashMap) this.f245984n).containsKey(ca4.z0.G(10, str))) {
                        if (!((java.util.concurrent.ConcurrentHashMap) this.f245984n).containsKey(ca4.z0.G(11, str))) {
                            if (!((java.util.concurrent.ConcurrentHashMap) this.f245984n).containsKey(ca4.z0.G(8, str))) {
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkBigMediaIdDownloading", "com.tencent.mm.plugin.sns.model.DownloadManager");
                                return false;
                            }
                        }
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkBigMediaIdDownloading", "com.tencent.mm.plugin.sns.model.DownloadManager");
                return true;
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkBigMediaIdDownloading", "com.tencent.mm.plugin.sns.model.DownloadManager");
                throw th6;
            }
        }
    }

    public final void m() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkDownloadingItem", "com.tencent.mm.plugin.sns.model.DownloadManager");
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        synchronized (this.f245977g) {
            try {
                java.util.Iterator it = ((java.util.concurrent.ConcurrentHashMap) this.f245984n).entrySet().iterator();
                while (it.hasNext()) {
                    linkedList.add((java.lang.String) ((java.util.Map.Entry) it.next()).getKey());
                }
                for (java.lang.String str : linkedList) {
                    if (((java.util.concurrent.ConcurrentHashMap) this.f245984n).containsKey(str) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.H1(((java.lang.Long) ((java.util.concurrent.ConcurrentHashMap) this.f245984n).get(str)).longValue()) * 1000 > 300000) {
                        ((java.util.concurrent.ConcurrentHashMap) this.f245984n).remove(str);
                        ((java.util.HashMap) this.f245985o).remove(str);
                        y(str);
                    }
                }
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkDownloadingItem", "com.tencent.mm.plugin.sns.model.DownloadManager");
                throw th6;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkDownloadingItem", "com.tencent.mm.plugin.sns.model.DownloadManager");
    }

    public final void n() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkIdleFile", "com.tencent.mm.plugin.sns.model.DownloadManager");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("expired", "com.tencent.mm.plugin.sns.model.DownloadManager");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.H1(this.f245972b) * 1000 > 300000;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("expired", "com.tencent.mm.plugin.sns.model.DownloadManager");
        if (z17) {
            this.f245971a.mo50297x7c4d7ca2(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.e0(this), 500L);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkIdleFile", "com.tencent.mm.plugin.sns.model.DownloadManager");
    }

    public void o() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("cleanQueue", "com.tencent.mm.plugin.sns.model.DownloadManager");
        synchronized (this.f245977g) {
            try {
                this.f245982l.clear();
                this.f245985o.clear();
                this.f245984n.clear();
                this.f245975e.clear();
                this.f245976f.clear();
                this.f245986p.clear();
                this.f245987q.clear();
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("cleanQueue", "com.tencent.mm.plugin.sns.model.DownloadManager");
                throw th6;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("cleanQueue", "com.tencent.mm.plugin.sns.model.DownloadManager");
    }

    public void p() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("cleanTask", "com.tencent.mm.plugin.sns.model.DownloadManager");
        synchronized (this.f245977g) {
            try {
                java.util.LinkedList linkedList = new java.util.LinkedList();
                java.util.Iterator it = this.f245982l.iterator();
                while (it.hasNext()) {
                    ca4.t0 t0Var = (ca4.t0) it.next();
                    t0Var.getClass();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getRequestType", "com.tencent.mm.plugin.sns.data.SnsDownLoadElment");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getRequestType", "com.tencent.mm.plugin.sns.data.SnsDownLoadElment");
                    if (t0Var.f121551b != 6) {
                        java.util.Map map = this.f245985o;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getKey", "com.tencent.mm.plugin.sns.data.SnsDownLoadElment");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getKey", "com.tencent.mm.plugin.sns.data.SnsDownLoadElment");
                        ((java.util.HashMap) map).remove(t0Var.f121552c);
                        linkedList.add(t0Var);
                    }
                }
                java.util.Iterator it6 = linkedList.iterator();
                while (it6.hasNext()) {
                    this.f245982l.remove((ca4.t0) it6.next());
                }
                this.f245986p.clear();
                this.f245987q.clear();
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("cleanTask", "com.tencent.mm.plugin.sns.model.DownloadManager");
                throw th6;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("cleanTask", "com.tencent.mm.plugin.sns.model.DownloadManager");
    }

    public final java.lang.String q() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("dumpDownloadListsId", "com.tencent.mm.plugin.sns.model.DownloadManager");
        java.util.LinkedList linkedList = this.f245982l;
        if (linkedList.size() <= 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("dumpDownloadListsId", "com.tencent.mm.plugin.sns.model.DownloadManager");
            return "";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            ca4.t0 t0Var = (ca4.t0) it.next();
            if (t0Var != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMediaObjs", "com.tencent.mm.plugin.sns.data.SnsDownLoadElment");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMediaObjs", "com.tencent.mm.plugin.sns.data.SnsDownLoadElment");
                android.util.SparseArray sparseArray = t0Var.f121559j;
                if (sparseArray != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMediaObjs", "com.tencent.mm.plugin.sns.data.SnsDownLoadElment");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMediaObjs", "com.tencent.mm.plugin.sns.data.SnsDownLoadElment");
                    if (sparseArray.size() > 0) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsId", "com.tencent.mm.plugin.sns.data.SnsDownLoadElment");
                        java.lang.String str = t0Var.f121558i;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsId", "com.tencent.mm.plugin.sns.data.SnsDownLoadElment");
                        sb6.append(str);
                        sb6.append(",");
                    }
                }
                if (t0Var.c() != null) {
                    sb6.append(t0Var.c().f459388d);
                }
                sb6.append(",");
            }
        }
        java.lang.String sb7 = sb6.toString();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("dumpDownloadListsId", "com.tencent.mm.plugin.sns.model.DownloadManager");
        return sb7;
    }

    public final java.lang.String r() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("dumpDownloadingListId", "com.tencent.mm.plugin.sns.model.DownloadManager");
        java.util.Map map = this.f245984n;
        if (((java.util.concurrent.ConcurrentHashMap) map).size() <= 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("dumpDownloadingListId", "com.tencent.mm.plugin.sns.model.DownloadManager");
            return "";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        for (java.lang.String str : ((java.util.concurrent.ConcurrentHashMap) map).keySet()) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                sb6.append(str);
                sb6.append(",");
            }
        }
        java.lang.String sb7 = sb6.toString();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("dumpDownloadingListId", "com.tencent.mm.plugin.sns.model.DownloadManager");
        return sb7;
    }

    public final void s(java.lang.String str, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("logDownloadCostTime", "com.tencent.mm.plugin.sns.model.DownloadManager");
        java.lang.String[] split = str.split("-");
        java.lang.String substring = (split == null || split.length != 2 || str.contains("sns_table_")) ? str.substring(2) : split[1].trim();
        java.util.HashMap hashMap = this.f245983m;
        if (hashMap.containsKey(substring)) {
            long longValue = ((java.lang.Long) hashMap.get(substring)).longValue();
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - longValue;
            if (elapsedRealtime > 2000) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DownloadManager", "mediaId:%s download cost:%sms too long!", substring, java.lang.Long.valueOf(elapsedRealtime));
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DownloadManager", "mediaId:%s download cost:%sms", substring, java.lang.Long.valueOf(elapsedRealtime));
            }
            if (z17) {
                hashMap.remove(substring);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("logDownloadCostTime", "com.tencent.mm.plugin.sns.model.DownloadManager");
    }

    public void t(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onProgress", "com.tencent.mm.plugin.sns.model.DownloadManager");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Tj().mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.d0(this, str, str2));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onProgress", "com.tencent.mm.plugin.sns.model.DownloadManager");
    }

    public void u(int i17, r45.jj4 jj4Var, int i18, boolean z17, java.lang.String str, int i19, int i27, boolean z18) {
        boolean z19;
        int i28;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onTaskFinish", "com.tencent.mm.plugin.sns.model.DownloadManager");
        java.lang.String str2 = jj4Var == null ? "" : jj4Var.f459388d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DownloadManager", "[%s][media:%s]onTaskFinish state:%d, reqDownloadType:%d, isThumb:%b,requestKey:%s, totalSize:%d", "[image-flow]", str2, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Boolean.valueOf(z17), str, java.lang.Integer.valueOf(i19));
        if (!com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Xj()) {
            gm0.j1.i();
            if (gm0.j1.b().m()) {
                int i29 = 2;
                if (i17 != 2) {
                    this.f245973c += i19;
                }
                synchronized (this.f245977g) {
                    try {
                        z19 = false;
                        if (this.f245973c > 512000 && this.f245982l.size() == 0) {
                            c01.s8 s8Var = c01.n8.f118881a;
                            if (s8Var != null) {
                                ((com.p314xaae8f345.mm.p959x883644fd.s0) s8Var).a(this.f245973c, 0, 0);
                            }
                            this.f245973c = 0;
                        }
                        i28 = 3;
                        if (9 == i18) {
                            if ((i17 == 1 || i17 == 3) && z18) {
                                this.f245976f.put(str, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
                            }
                        } else if (i17 == 1 || i17 == 3) {
                            this.f245976f.put(str, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
                        }
                    } finally {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onTaskFinish", "com.tencent.mm.plugin.sns.model.DownloadManager");
                    }
                }
                if (i17 != 3 && ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_sns_try_fix_mismatch_image, false) && i17 == 1 && i18 != 3 && jj4Var != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i1 hj6 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.hj();
                    hj6.getClass();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateCache", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LazyerImageLoader2", "updateCache " + jj4Var.f459388d);
                    com.p314xaae8f345.mm.p872xbfc2bd01.r rVar = (com.p314xaae8f345.mm.p872xbfc2bd01.r) hj6.f245787c.get(ca4.z0.x(1, jj4Var.f459388d));
                    if (ca4.z0.g(rVar)) {
                        rVar.f150506g.decrementAndGet();
                        rVar.f();
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Sj().execute(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.j1(hj6, jj4Var));
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateCache", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                    } else {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateCache", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DownloadManager", "[%s][media:%s]SnsImageLoadReporter callbackToUI", "[image-flow]", str2);
                if (jj4Var != null) {
                    ta4.u0.h(jj4Var.f459388d, this.f245982l.size(), ((java.util.concurrent.ConcurrentHashMap) this.f245984n).size());
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDownLoadFinishByCdn", "com.tencent.mm.plugin.sns.model.DownloadManager");
                synchronized (this.f245977g) {
                    try {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DownloadManager", "onDownLoadFinish by cdn %s, taskDone %s.", str, java.lang.Boolean.valueOf(z18));
                        s(str, z18);
                        if (z18) {
                            ((java.util.concurrent.ConcurrentHashMap) this.f245984n).remove(str);
                        }
                    } catch (java.lang.Throwable th6) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDownLoadFinishByCdn", "com.tencent.mm.plugin.sns.model.DownloadManager");
                        throw th6;
                    }
                }
                A();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDownLoadFinishByCdn", "com.tencent.mm.plugin.sns.model.DownloadManager");
                C(str, i27, z18);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onReport", "com.tencent.mm.plugin.sns.model.DownloadManager");
                synchronized (this.f245977g) {
                    if (jj4Var != null) {
                        try {
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.k0 x17 = x(jj4Var.f459388d);
                            if (x17 != null) {
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isDownloadFinished", "com.tencent.mm.plugin.sns.model.DownloadManager$SingleImgDownloadByFeedReporter");
                                boolean z27 = x17.f245875e;
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isDownloadFinished", "com.tencent.mm.plugin.sns.model.DownloadManager$SingleImgDownloadByFeedReporter");
                                if (z27) {
                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("report", "com.tencent.mm.plugin.sns.model.DownloadManager$SingleImgDownloadByFeedReporter");
                                    if (x17.f245875e) {
                                        long j17 = x17.f245873c;
                                        boolean z28 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                                        long currentTimeMillis = java.lang.System.currentTimeMillis() - j17;
                                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                                        g0Var.C(1040L, 0L, currentTimeMillis);
                                        g0Var.A(1040, 1);
                                    }
                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("report", "com.tencent.mm.plugin.sns.model.DownloadManager$SingleImgDownloadByFeedReporter");
                                }
                            }
                        } catch (java.lang.Throwable th7) {
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onReport", "com.tencent.mm.plugin.sns.model.DownloadManager");
                            throw th7;
                        }
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onReport", "com.tencent.mm.plugin.sns.model.DownloadManager");
                java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArraySet) this.f245980j).iterator();
                while (it.hasNext()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.h0 h0Var = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.h0) it.next();
                    if (h0Var != null) {
                        if (i17 == i29 || jj4Var == null) {
                            if ((i18 == i29 || i18 == 10 || i18 == 11 || i18 == 8) && jj4Var != null) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DownloadManager", "[%s][media:%s]listener onImageFinish[false] listener:%s", "[image-flow]", str2, h0Var);
                                h0Var.mo852x876bfa6f(jj4Var.f459388d, i18, z19);
                            } else if ((i18 == 4 || i18 == 6) && jj4Var != null) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DownloadManager", "[%s][media:%s]listener onSightFinish[false] listener:%s", "[image-flow]", str2, h0Var);
                                h0Var.mo854x822e7131(jj4Var.f459388d, z19);
                            } else if ((h0Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i0) && i18 == 1) {
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onThumbFinishFail", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaLoadManager");
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsCommentMediaLoadManager", "onThumbFail id:" + str2);
                                java.util.HashSet hashSet = (java.util.HashSet) p3321xbce91901.jvm.p3324x21ffc6bd.m0.c(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.q2.f252785e).remove(str2);
                                if (hashSet == null) {
                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onThumbFinishFail", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaLoadManager");
                                } else {
                                    java.util.Iterator it6 = hashSet.iterator();
                                    while (it6.hasNext()) {
                                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.k2 k2Var = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.k2) it6.next();
                                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.r2 r2Var = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.r2.f252792a;
                                        k2Var.getClass();
                                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsId", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaLoadItem");
                                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsId", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaLoadItem");
                                        java.lang.String str3 = k2Var.f252715a;
                                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getComment", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaLoadItem");
                                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getComment", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaLoadItem");
                                        r45.e86 e86Var = k2Var.f252716b;
                                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportCommentShowFail$default", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaReportManager");
                                        r2Var.f(str3, e86Var, -1);
                                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportCommentShowFail$default", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaReportManager");
                                    }
                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onThumbFinishFail", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaLoadManager");
                                }
                            }
                        } else if (i18 == i28) {
                            h0Var.mo853xb04a0d88(jj4Var.f459388d);
                        } else if (i18 == 1 || i18 == 9 || i18 == 5 || i18 == 7) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DownloadManager", "[%s][media:%s]listener onThumbFinish listener:%s", "[image-flow]", str2, h0Var);
                            h0Var.mo855x8dbd7aaa(jj4Var.f459388d);
                        } else if (i18 == i29 || i18 == 10 || i18 == 11 || i18 == 8) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DownloadManager", "[%s][media:%s]listener onImageFinish[true] listener:%s", "[image-flow]", str2, h0Var);
                            h0Var.mo852x876bfa6f(jj4Var.f459388d, i18, true);
                        } else if (i18 == 4 || i18 == 6) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DownloadManager", "[%s][media:%s]listener onSightFinish[true] listener:%s", "[image-flow]", str2, h0Var);
                            h0Var.mo854x822e7131(jj4Var.f459388d, true);
                        }
                        i29 = 2;
                        i28 = 3;
                        z19 = false;
                    }
                }
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.DownloadManager", "[%s][media:%s]onTaskFinish account().hasInitialized", "[image-flow]", str2);
        o();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onTaskFinish", "com.tencent.mm.plugin.sns.model.DownloadManager");
    }

    public void v(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.h0 h0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("removeDownLoadEndListener", "com.tencent.mm.plugin.sns.model.DownloadManager");
        this.f245971a.mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.c0(this, h0Var));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("removeDownLoadEndListener", "com.tencent.mm.plugin.sns.model.DownloadManager");
    }

    public void w(java.lang.String str, java.lang.Object[] objArr) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("removeDownloadStreamVideoTask", "com.tencent.mm.plugin.sns.model.DownloadManager");
        t21.o2.Di().g(str, objArr);
        synchronized (this.f245978h) {
            try {
                this.f245978h.remove(str);
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("removeDownloadStreamVideoTask", "com.tencent.mm.plugin.sns.model.DownloadManager");
                throw th6;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("removeDownloadStreamVideoTask", "com.tencent.mm.plugin.sns.model.DownloadManager");
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.k0 x(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("removeReporter", "com.tencent.mm.plugin.sns.model.DownloadManager");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("removeReporter", "com.tencent.mm.plugin.sns.model.DownloadManager");
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.k0 k0Var = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.k0) this.f245988r.remove(str);
        if (k0Var != null) {
            k0Var.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("decPicNum", "com.tencent.mm.plugin.sns.model.DownloadManager$SingleImgDownloadByFeedReporter");
            synchronized (k0Var.f245876f) {
                try {
                    int i17 = k0Var.f245872b;
                    if (i17 > 0) {
                        k0Var.f245872b = i17 - 1;
                    }
                    if (k0Var.f245872b == 0) {
                        k0Var.f245875e = true;
                    }
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("decPicNum", "com.tencent.mm.plugin.sns.model.DownloadManager$SingleImgDownloadByFeedReporter");
                    throw th6;
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("decPicNum", "com.tencent.mm.plugin.sns.model.DownloadManager$SingleImgDownloadByFeedReporter");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("removeReporter", "com.tencent.mm.plugin.sns.model.DownloadManager");
        return k0Var;
    }

    public final boolean y(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("removeRequestMap", "com.tencent.mm.plugin.sns.model.DownloadManager");
        boolean z17 = false;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f245987q;
            if (concurrentHashMap.containsKey(str)) {
                java.lang.String str2 = (java.lang.String) concurrentHashMap.remove(str);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("decBatchRetryRecordMap", "com.tencent.mm.plugin.sns.model.DownloadManager");
                    java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = this.f245986p;
                    if (concurrentHashMap2.containsKey(str2)) {
                        java.util.concurrent.atomic.AtomicInteger atomicInteger = (java.util.concurrent.atomic.AtomicInteger) concurrentHashMap2.get(str2);
                        if (atomicInteger != null) {
                            int decrementAndGet = atomicInteger.decrementAndGet();
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DownloadManager", "unLockDownLoad, key: %s, v: %s.", str2, java.lang.Integer.valueOf(decrementAndGet));
                            if (decrementAndGet == 0) {
                                concurrentHashMap2.remove(str2);
                            }
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("decBatchRetryRecordMap", "com.tencent.mm.plugin.sns.model.DownloadManager");
                            z17 = true;
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("removeRequestMap", "com.tencent.mm.plugin.sns.model.DownloadManager");
                            return z17;
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.DownloadManager", "unLockDownLoad, key: %s, value is null.", str2);
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("decBatchRetryRecordMap", "com.tencent.mm.plugin.sns.model.DownloadManager");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("removeRequestMap", "com.tencent.mm.plugin.sns.model.DownloadManager");
                    return z17;
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("removeRequestMap", "com.tencent.mm.plugin.sns.model.DownloadManager");
        return false;
    }

    public void z(int i17, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setMaxThread", "com.tencent.mm.plugin.sns.model.DownloadManager");
        this.f245974d = i17;
        try {
            java.lang.String d17 = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) ? ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("SnsImgDownloadConcurrentCountForWifi") : ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("SnsImgDownloadConcurrentCountForNotWifi");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d17) && z65.c.a()) {
                d17 = "00:00-18:30-1-3;19:30-23:00-1-2;23:00-23:59-1-3;18:30-19:30-3-5;";
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d17)) {
                java.lang.String[] split = new java.text.SimpleDateFormat("HH:mm").format(new java.util.Date()).split(":");
                int D1 = (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(split[0], 0) * 60) + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(split[1], 0);
                android.os.Vibrator vibrator = ca4.z0.f121601a;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTimeZoneDis", "com.tencent.mm.plugin.sns.data.SnsUtil");
                long rawOffset = ((int) (java.util.TimeZone.getDefault().getRawOffset() / 60000)) / 60;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTimeZoneDis", "com.tencent.mm.plugin.sns.data.SnsUtil");
                int i18 = D1 - ((((int) rawOffset) - 8) * 60);
                if (i18 < 0) {
                    i18 += 1440;
                } else if (i18 >= 1440) {
                    i18 -= 1440;
                }
                java.lang.String[] split2 = d17.split(";");
                for (int i19 = 0; i19 < split2.length; i19++) {
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(split2[i19])) {
                        java.lang.String[] split3 = split2[i19].split("-");
                        if (split3 != null && split3.length >= 4) {
                            java.lang.String[] split4 = split3[0].split(":");
                            int D12 = (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(split4[0], 0) * 60) + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(split4[1], 0);
                            java.lang.String[] split5 = split3[1].split(":");
                            int D13 = (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(split5[0], 0) * 60) + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(split5[1], 0);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DownloadManager", "setMaxThread i:%d [%d,%d] now:%d threadcnt:[%s,%s]", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(D12), java.lang.Integer.valueOf(D13), java.lang.Integer.valueOf(i18), split3[2], split3[3]);
                            if (i18 <= D13 && i18 > D12) {
                                int D14 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(z17 ? split3[2] : split3[3], 0);
                                if (D14 > 0) {
                                    this.f245974d = D14;
                                }
                            }
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.DownloadManager", "setMaxThread Err i%d :%s", java.lang.Integer.valueOf(i19), d17);
                    }
                }
            }
        } catch (java.lang.Exception e17) {
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.DownloadManager", "setMaxThread :%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DownloadManager", "setMaxThread Res:%d ", java.lang.Integer.valueOf(this.f245974d));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setMaxThread", "com.tencent.mm.plugin.sns.model.DownloadManager");
    }
}
