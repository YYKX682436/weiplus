package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* renamed from: com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper */
/* loaded from: classes4.dex */
public class C17987x1533a9b {
    public boolean A;
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17987x1533a9b.VideoConfigs B;
    public final java.lang.Object C;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f248056a;

    /* renamed from: b, reason: collision with root package name */
    public int f248057b;

    /* renamed from: c, reason: collision with root package name */
    public int f248058c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f248059d;

    /* renamed from: e, reason: collision with root package name */
    public d61.k f248060e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17987x1533a9b.IVideoUICallback f248061f;

    /* renamed from: g, reason: collision with root package name */
    public r45.jj4 f248062g;

    /* renamed from: h, reason: collision with root package name */
    public int f248063h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f248064i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f248065j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f248066k;

    /* renamed from: l, reason: collision with root package name */
    public int f248067l;

    /* renamed from: m, reason: collision with root package name */
    public int f248068m;

    /* renamed from: n, reason: collision with root package name */
    public int f248069n;

    /* renamed from: o, reason: collision with root package name */
    public int f248070o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f248071p;

    /* renamed from: q, reason: collision with root package name */
    public int f248072q;

    /* renamed from: r, reason: collision with root package name */
    public int f248073r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f248074s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f248075t;

    /* renamed from: u, reason: collision with root package name */
    public int f248076u;

    /* renamed from: v, reason: collision with root package name */
    public long f248077v;

    /* renamed from: w, reason: collision with root package name */
    public long f248078w;

    /* renamed from: x, reason: collision with root package name */
    public long f248079x;

    /* renamed from: y, reason: collision with root package name */
    public long f248080y;

    /* renamed from: z, reason: collision with root package name */
    public int f248081z;

    /* renamed from: com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper$IVideoUICallback */
    /* loaded from: classes4.dex */
    public interface IVideoUICallback {
        /* renamed from: getPlayErrorCode */
        int mo70624xc2115b8b();

        /* renamed from: getPlayVideoDuration */
        int mo70625x3e021ba5();

        /* renamed from: getPlayVideoDurationByResume */
        int mo70626x3e64ee29();

        /* renamed from: getRptStruct */
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17987x1533a9b.VideoRptStruct mo70628x4f7d2b5();

        /* renamed from: getUiStayTime */
        int mo70636xb68e4f70();
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper$VideoConfigs */
    /* loaded from: classes4.dex */
    public static class VideoConfigs {

        /* renamed from: a, reason: collision with root package name */
        public int f248084a;

        /* renamed from: b, reason: collision with root package name */
        public int f248085b;

        /* renamed from: c, reason: collision with root package name */
        public int f248086c;

        private VideoConfigs() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper$VideoRptStruct */
    /* loaded from: classes4.dex */
    public static class VideoRptStruct {

        /* renamed from: a, reason: collision with root package name */
        public long f248087a = 0;

        /* renamed from: b, reason: collision with root package name */
        public java.lang.String f248088b = "";

        /* renamed from: c, reason: collision with root package name */
        public int f248089c = 0;

        /* renamed from: d, reason: collision with root package name */
        public java.lang.String f248090d = "";

        /* renamed from: e, reason: collision with root package name */
        public final java.lang.String f248091e = "";

        /* renamed from: f, reason: collision with root package name */
        public java.lang.String f248092f = "";

        /* renamed from: g, reason: collision with root package name */
        public java.lang.String f248093g = "";

        /* renamed from: h, reason: collision with root package name */
        public java.lang.String f248094h = "";

        /* renamed from: i, reason: collision with root package name */
        public java.lang.String f248095i = "";

        /* renamed from: j, reason: collision with root package name */
        public java.lang.String f248096j = "";

        /* renamed from: k, reason: collision with root package name */
        public int f248097k = 0;

        /* renamed from: l, reason: collision with root package name */
        public java.lang.String f248098l = "";
    }

    public C17987x1533a9b(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17987x1533a9b.IVideoUICallback iVideoUICallback) {
        java.lang.String str = "MicroMsg.OnlineVideoViewHelper[" + hashCode() + ']';
        this.f248056a = str;
        this.f248057b = 0;
        this.f248058c = 0;
        this.f248059d = null;
        this.f248072q = 0;
        this.f248074s = false;
        this.f248075t = false;
        this.f248076u = 0;
        this.A = false;
        this.C = new java.lang.Object();
        this.f248061f = iVideoUICallback;
        this.f248060e = new d61.k();
        this.f248059d = new java.util.HashMap();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17987x1533a9b.VideoConfigs videoConfigs = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17987x1533a9b.VideoConfigs();
        this.B = videoConfigs;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parseConfig", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
        videoConfigs.f248084a = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("SnsVideoPreloadSec", 5);
        videoConfigs.f248085b = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("SnsVideoDownloadSec", 1);
        videoConfigs.f248086c = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("SnsVideoFullDownloadPercent", 101);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "parseConfig preload[%d] downloadSec[%d], needFinish[%d]", java.lang.Integer.valueOf(videoConfigs.f248084a), java.lang.Integer.valueOf(videoConfigs.f248085b), java.lang.Integer.valueOf(videoConfigs.f248086c));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseConfig", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
        o();
        this.A = false;
    }

    public final boolean a(int i17, com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f, com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("calcDownloadRange", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
        c19767x257d7f.f38864x6ac9171 = java.lang.Math.max(i17, this.f248072q);
        int i18 = this.f248058c;
        if (i18 == 1) {
            c19767x257d7f.f38864x6ac9171 = i17;
            c19767x257d7f2.f38864x6ac9171 = this.f248073r + i17;
        }
        if (i18 == 2) {
            int i19 = i17 - 8;
            c19767x257d7f.f38864x6ac9171 = i19;
            if (i19 < 0) {
                c19767x257d7f.f38864x6ac9171 = 0;
            }
            c19767x257d7f2.f38864x6ac9171 = c19767x257d7f.f38864x6ac9171 + this.f248073r + 8;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17987x1533a9b.VideoConfigs videoConfigs = this.B;
        if (i18 == 3 || i18 == 4) {
            c19767x257d7f.f38864x6ac9171 = this.f248072q;
            c19767x257d7f2.f38864x6ac9171 = this.f248073r + i17 + 1 + videoConfigs.f248085b;
        }
        int i27 = c19767x257d7f2.f38864x6ac9171;
        int i28 = this.f248067l;
        if (i27 >= i28 + 1) {
            c19767x257d7f2.f38864x6ac9171 = i28 + 1;
        }
        int i29 = c19767x257d7f2.f38864x6ac9171;
        int i37 = c19767x257d7f.f38864x6ac9171;
        if (i29 < i37) {
            c19767x257d7f2.f38864x6ac9171 = i37 + videoConfigs.f248085b;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("calcDownloadRange", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f248056a, "calcDownloadRange range[%d, %d] playTime[%d] playStatus[%d] cache[%d, %d]", java.lang.Integer.valueOf(i37), java.lang.Integer.valueOf(c19767x257d7f2.f38864x6ac9171), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f248058c), java.lang.Integer.valueOf(this.f248072q), java.lang.Integer.valueOf(this.f248073r));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("calcDownloadRange", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
        return true;
    }

    public boolean b(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkCallbackMediaId", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
        boolean D0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(this.f248066k, str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkCallbackMediaId", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
        return D0;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0185  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean c(int r18) {
        /*
            Method dump skipped, instructions count: 616
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17987x1533a9b.c(int):boolean");
    }

    public void d() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("clear", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f248056a, "clear");
        this.A = true;
        o();
        synchronized (this.C) {
            try {
                this.f248061f = null;
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("clear", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
                throw th6;
            }
        }
        this.f248060e = null;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("clear", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
    }

    public final java.lang.Object[] e() {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        int i17;
        int i18;
        int i19;
        int i27;
        int i28;
        long j17;
        java.lang.String str5;
        int i29;
        int i37;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createPlayVideoRpt", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
        java.lang.Object[] objArr = new java.lang.Object[15];
        synchronized (this.C) {
            try {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17987x1533a9b.IVideoUICallback iVideoUICallback = this.f248061f;
                if (iVideoUICallback != null) {
                    i29 = iVideoUICallback.mo70625x3e021ba5();
                    i17 = this.f248061f.mo70636xb68e4f70();
                    i18 = this.f248061f.mo70624xc2115b8b();
                    i19 = this.f248061f.mo70628x4f7d2b5().f248089c;
                    str5 = this.f248061f.mo70628x4f7d2b5().f248088b;
                    j17 = this.f248061f.mo70628x4f7d2b5().f248087a;
                    str = this.f248061f.mo70628x4f7d2b5().f248090d;
                    str2 = this.f248061f.mo70628x4f7d2b5().f248091e;
                    str3 = this.f248061f.mo70628x4f7d2b5().f248092f;
                    i27 = this.f248061f.mo70626x3e64ee29();
                    i28 = this.f248061f.mo70628x4f7d2b5().f248097k;
                    str4 = this.f248061f.mo70628x4f7d2b5().f248098l;
                } else {
                    str = "";
                    str2 = "";
                    str3 = "";
                    str4 = "";
                    i17 = 0;
                    i18 = 0;
                    i19 = 0;
                    i27 = 0;
                    i28 = 0;
                    j17 = 0;
                    str5 = "";
                    i29 = 0;
                }
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createPlayVideoRpt", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
                throw th6;
            }
        }
        objArr[0] = java.lang.Integer.valueOf(i29);
        java.lang.String str6 = str4;
        int i38 = i27;
        if (this.f248079x <= 0) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            this.f248079x = java.lang.System.currentTimeMillis();
        }
        long j18 = this.f248077v;
        java.lang.String str7 = str;
        if (j18 <= 0 || (i37 = (int) (this.f248079x - j18)) <= 0) {
            i37 = 0;
        }
        objArr[1] = java.lang.Integer.valueOf(i37);
        if (this.f248078w <= 0) {
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            this.f248078w = java.lang.System.currentTimeMillis();
        }
        int i39 = (int) (this.f248078w - this.f248077v);
        if (i39 <= 0) {
            i39 = 0;
        }
        objArr[2] = java.lang.Integer.valueOf(i39);
        objArr[3] = java.lang.Integer.valueOf(this.f248076u);
        if (this.f248076u > 0) {
            int i47 = this.f248081z;
            if (i47 == 0) {
                long j19 = this.f248080y;
                boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                this.f248081z = (int) (i47 + (java.lang.System.currentTimeMillis() - j19));
            }
            objArr[4] = java.lang.Integer.valueOf(this.f248081z / this.f248076u);
        } else {
            objArr[4] = 0;
        }
        objArr[5] = java.lang.Integer.valueOf(i17);
        objArr[6] = java.lang.Integer.valueOf(i18);
        objArr[7] = java.lang.Integer.valueOf(i19);
        objArr[8] = str5;
        objArr[9] = java.lang.Long.valueOf(j17);
        objArr[10] = str7;
        objArr[11] = str2;
        objArr[12] = str3;
        objArr[13] = java.lang.Integer.valueOf(i38);
        objArr[14] = java.lang.Integer.valueOf(i28);
        objArr[15] = str6;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createPlayVideoRpt", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
        return objArr;
    }

    public void f(java.lang.String str, int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("dealDataAvailable", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
        this.f248075t = false;
        java.lang.String str2 = this.f248056a;
        if (i17 <= -1 || i18 <= -1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str2, "deal data available error offset[%d], length[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("dealDataAvailable", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
            return;
        }
        if (b(str)) {
            java.lang.Integer num = (java.lang.Integer) this.f248059d.get(this.f248066k + i17 + "_" + i18);
            if (num == null || num.intValue() <= 0) {
                try {
                    this.f248072q = this.f248060e.d(i17, i18);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str2, "deal data available file pos to video time error: " + e17.toString());
                }
            } else {
                this.f248072q = num.intValue();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "deal data available. offset[%d] length[%d] cachePlayTime[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(this.f248072q));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("dealDataAvailable", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
    }

    public void g(long j17, long j18, boolean z17) {
        d61.k kVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("dealMoovReady", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
        java.lang.Object[] objArr = {java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(this.f248067l), this.f248066k, java.lang.Long.valueOf(j18), java.lang.Long.valueOf(this.f248077v)};
        java.lang.String str = this.f248056a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "deal moov ready moovPos %d, timeDuration %d, cdnMediaId %s startDownload[%d %d]", objArr);
        if (this.f248067l != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "moov had callback, do nothing.");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("dealMoovReady", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
            return;
        }
        long j19 = this.f248077v;
        if (j18 > j19) {
            j19 = j18;
        }
        this.f248077v = j19;
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        this.f248078w = java.lang.System.currentTimeMillis();
        try {
            kVar = this.f248060e;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "deal moov ready error: " + e17.toString());
        }
        if (kVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "parser is null, thread is error.");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("dealMoovReady", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
            return;
        }
        if (kVar.a(this.f248065j, j17)) {
            int i17 = this.f248060e.f308280f;
            this.f248067l = i17;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "mp4 parse moov success. duration %d cdnMediaId %s isFastStart %b", java.lang.Integer.valueOf(i17), this.f248066k, java.lang.Boolean.valueOf(z17));
            if (!z17) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("prepareVideo", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper.1
                    @Override // java.lang.Runnable
                    public void run() {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper$1");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$100", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17987x1533a9b c17987x1533a9b = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17987x1533a9b.this;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17987x1533a9b.IVideoUICallback iVideoUICallback = c17987x1533a9b.f248061f;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$100", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
                        if (iVideoUICallback != null && c17987x1533a9b.c(0)) {
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$100", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17987x1533a9b.IVideoUICallback iVideoUICallback2 = c17987x1533a9b.f248061f;
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$100", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
                            if (iVideoUICallback2 != null) {
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$200", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
                                boolean j27 = c17987x1533a9b.j();
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$200", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
                                if (j27) {
                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$300", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
                                    c17987x1533a9b.k();
                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$300", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$400", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
                                    c17987x1533a9b.q(true);
                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$400", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$502", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
                                    c17987x1533a9b.f248074s = true;
                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$502", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
                                }
                            }
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper$1");
                    }
                });
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("prepareVideo", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
            }
            if (this.f248070o == -1) {
                this.f248058c = 1;
            } else {
                this.f248058c = 2;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("rptMoovSuc", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(354L, 204L, 1L, false);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("rptMoovSuc", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "mp4 parse moov error. cdnMediaId %s", this.f248066k);
            t21.o2.Di().p(this.f248066k, 0, -1, 0);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("rptMoovFail", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            g0Var.mo68477x336bdfd8(354L, 205L, 1L, false);
            g0Var.d(13836, 402, java.lang.Long.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1()), "");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("rptMoovFail", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("dealMoovReady", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
    }

    public void h(java.lang.String str, int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("dealProgressCallback", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
        if (b(str)) {
            this.f248068m = i18;
            this.f248069n = (i17 * 100) / i18;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f248056a, "deal video[%s] progress callback[%d, %d]. downloadedPercent[%d]", this.f248066k, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f248068m), java.lang.Integer.valueOf(this.f248069n));
        }
        if (this.f248069n >= 100) {
            this.f248057b = 3;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("dealProgressCallback", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
    }

    public void i() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("dealStreamFinish", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
        java.lang.Object[] objArr = {java.lang.Integer.valueOf(this.f248058c), this.f248066k};
        java.lang.String str = this.f248056a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "deal stream finish. playStatus %d cdnMediaId %s", objArr);
        this.f248075t = false;
        this.f248057b = 3;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("rptDownloadFinish", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(354L, 206L, 1L, false);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("rptDownloadFinish", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
        int i17 = this.f248058c;
        if (i17 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "it had not moov callback and download finish start to play video.");
            l();
        } else if (i17 == 5) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "it had play error, it request all video data finish, start to play." + this.f248066k);
            l();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("dealStreamFinish", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
    }

    public final boolean j() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isPlayAllowed", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
        synchronized (this.C) {
            try {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17987x1533a9b.IVideoUICallback iVideoUICallback = this.f248061f;
                if (iVideoUICallback == null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isPlayAllowed", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
                    return false;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isPlayAllowed", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                boolean z17 = ((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d) iVideoUICallback).f247993x1;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isPlayAllowed", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f248056a, "isPlayAllowed: %s", java.lang.Boolean.toString(z17));
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d c17983xb14a9c8d = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d) this.f248061f;
                c17983xb14a9c8d.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isPlayAllowed", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                boolean z18 = c17983xb14a9c8d.f247993x1;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isPlayAllowed", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isPlayAllowed", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
                return z18;
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isPlayAllowed", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
                throw th6;
            }
        }
    }

    public final void k() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("noteStartTimeStamp", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
        if (this.f248079x == 0) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            this.f248079x = java.lang.System.currentTimeMillis();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("noteStartTimeStamp", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
    }

    public final void l() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("playOfflineVideo", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f248056a, "play offline video %s ", this.f248066k);
        k();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper.2
            @Override // java.lang.Runnable
            public void run() {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper$2");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$200", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17987x1533a9b c17987x1533a9b = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17987x1533a9b.this;
                boolean j17 = c17987x1533a9b.j();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$200", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
                if (j17) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$100", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17987x1533a9b.IVideoUICallback iVideoUICallback = c17987x1533a9b.f248061f;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$100", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
                    if (iVideoUICallback != null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$400", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
                        c17987x1533a9b.q(false);
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$400", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper$2");
            }
        });
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("playOfflineVideo", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
    }

    public void m() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("requestAllData", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
        java.lang.String str = this.f248066k + "0_-1";
        java.util.HashMap hashMap = this.f248059d;
        if (!hashMap.containsKey(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f248056a, "request all data. [%s]", this.f248066k);
            t21.o2.Di().p(this.f248066k, 0, -1, 0);
            hashMap.put(str, 0);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("rptRequestAllData", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            g0Var.mo68477x336bdfd8(354L, 207L, 1L, false);
            g0Var.d(13836, 403, java.lang.Long.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1()), "");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("rptRequestAllData", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
        }
        this.f248058c = 5;
        this.f248071p = true;
        this.f248074s = false;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("requestAllData", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean n(int r13, int r14, boolean r15) {
        /*
            r12 = this;
            java.lang.String r0 = r12.f248056a
            java.lang.String r1 = "requestVideoData"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r1, r2)
            com.tencent.mm.pointers.PInt r3 = new com.tencent.mm.pointers.PInt
            r3.<init>()
            com.tencent.mm.pointers.PInt r4 = new com.tencent.mm.pointers.PInt
            r4.<init>()
            r5 = 0
            d61.k r6 = r12.f248060e     // Catch: java.lang.Exception -> L34
            boolean r13 = r6.b(r13, r14, r3, r4)     // Catch: java.lang.Exception -> L34
            if (r13 == 0) goto L4a
            int r13 = r4.f38864x6ac9171     // Catch: java.lang.Exception -> L34
            r6 = 81920(0x14000, float:1.14794E-40)
            int r13 = r13 + r6
            r4.f38864x6ac9171 = r13     // Catch: java.lang.Exception -> L34
            com.tencent.mm.modelcdntran.l3 r13 = t21.o2.Di()     // Catch: java.lang.Exception -> L34
            java.lang.String r6 = r12.f248066k     // Catch: java.lang.Exception -> L34
            int r7 = r3.f38864x6ac9171     // Catch: java.lang.Exception -> L34
            int r8 = r4.f38864x6ac9171     // Catch: java.lang.Exception -> L34
            boolean r13 = r13.o(r6, r7, r8)     // Catch: java.lang.Exception -> L34
            goto L4b
        L34:
            r13 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "check video data error: "
            r6.<init>(r7)
            java.lang.String r13 = r13.toString()
            r6.append(r13)
            java.lang.String r13 = r6.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r0, r13)
        L4a:
            r13 = r5
        L4b:
            if (r13 != 0) goto Lf1
            java.util.HashMap r6 = r12.f248059d
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = r12.f248066k
            r7.append(r8)
            java.lang.String r8 = "0_-1"
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            boolean r7 = r6.containsKey(r7)
            if (r7 != 0) goto Lf6
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = r12.f248066k
            r7.append(r8)
            int r8 = r3.f38864x6ac9171
            r7.append(r8)
            java.lang.String r8 = "_"
            r7.append(r8)
            int r8 = r4.f38864x6ac9171
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            int r8 = r3.f38864x6ac9171
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            int r9 = r4.f38864x6ac9171
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            boolean r10 = r12.f248075t
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r15)
            java.lang.Object[] r8 = new java.lang.Object[]{r8, r9, r10, r11}
            java.lang.String r9 = "request video data [%d, %d] isRequestNow[%b] isSeek[%b]"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r9, r8)
            boolean r8 = r6.containsKey(r7)
            if (r8 != 0) goto Ldf
            boolean r8 = r12.f248075t
            if (r8 == 0) goto Lb1
            if (r15 == 0) goto Ldf
        Lb1:
            r15 = 1
            r12.f248075t = r15
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r6.put(r7, r14)
            com.tencent.mm.modelcdntran.l3 r14 = t21.o2.Di()
            java.lang.String r15 = r12.f248066k
            int r3 = r3.f38864x6ac9171
            int r4 = r4.f38864x6ac9171
            int r14 = r14.p(r15, r3, r4, r5)
            if (r14 == 0) goto Lf6
            r12.f248075t = r5
            r6.remove(r7)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            java.lang.Object[] r14 = new java.lang.Object[]{r14}
            java.lang.String r15 = "requestVideoData not success %s"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r15, r14)
            goto Lf6
        Ldf:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r15 = "already request video : "
            r14.<init>(r15)
            r14.append(r7)
            java.lang.String r14 = r14.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r14)
            goto Lf6
        Lf1:
            java.lang.String r14 = "already had video data."
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r14)
        Lf6:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r1, r2)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17987x1533a9b.n(int, int, boolean):boolean");
    }

    public void o() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reset", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
        this.f248066k = "";
        this.f248070o = -1;
        this.f248072q = 0;
        this.f248067l = 0;
        this.f248076u = 0;
        this.f248058c = 0;
        this.f248057b = 0;
        this.f248071p = false;
        this.f248074s = false;
        this.f248075t = false;
        this.f248059d.clear();
        this.f248062g = null;
        this.f248063h = 0;
        this.f248064i = null;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17987x1533a9b.VideoConfigs videoConfigs = this.B;
        if (videoConfigs != null) {
            this.f248073r = videoConfigs.f248084a;
        }
        this.f248078w = 0L;
        this.f248077v = 0L;
        this.f248081z = 0;
        long j17 = 0;
        this.f248080y = j17;
        this.f248079x = j17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reset", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
    }

    public boolean p() {
        boolean z17;
        java.lang.String str;
        java.lang.String str2 = "stopStreamDownload";
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("stopStreamDownload", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f248066k)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("rptVideoPause", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
            java.lang.Object[] e17 = e();
            long j17 = 0;
            com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f = new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f();
            new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f().f38864x6ac9171 = 0;
            c19767x257d7f.f38864x6ac9171 = 0;
            int m40062x608a19a0 = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40062x608a19a0(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            int max = java.lang.Math.max(((java.lang.Integer) e17[1]).intValue(), 0);
            int intValue = ((java.lang.Integer) e17[2]).intValue();
            int intValue2 = ((java.lang.Integer) e17[3]).intValue();
            int max2 = java.lang.Math.max(((java.lang.Integer) e17[4]).intValue(), 0);
            int intValue3 = ((java.lang.Integer) e17[5]).intValue();
            int intValue4 = ((java.lang.Integer) e17[6]).intValue();
            int intValue5 = ((java.lang.Integer) e17[7]).intValue();
            java.lang.String str3 = (java.lang.String) e17[8];
            int intValue6 = ((java.lang.Long) e17[9]).intValue();
            java.lang.String str4 = (java.lang.String) e17[10];
            java.lang.String str5 = (java.lang.String) e17[11];
            java.lang.String str6 = (java.lang.String) e17[12];
            long intValue7 = ((java.lang.Integer) e17[13]).intValue() * 1000;
            int intValue8 = ((java.lang.Integer) e17[14]).intValue();
            long k17 = com.p314xaae8f345.mm.vfs.w6.k(str6);
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6900xf90847b9 c6900xf90847b9 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6900xf90847b9();
            c6900xf90847b9.f142192n = m40062x608a19a0;
            c6900xf90847b9.f142178g = j17;
            c6900xf90847b9.K = j17;
            c6900xf90847b9.f142176f = k17;
            c6900xf90847b9.N = c6900xf90847b9.b("SnsPublishid", str4, true);
            c6900xf90847b9.f142172d = c6900xf90847b9.b("SnsVideoUrl", str5, true);
            c6900xf90847b9.f142182i = intValue7;
            c6900xf90847b9.f142184j = max;
            c6900xf90847b9.f142186k = intValue;
            c6900xf90847b9.f142188l = intValue2;
            c6900xf90847b9.f142190m = max2;
            c6900xf90847b9.I = intValue3;
            c6900xf90847b9.f142168J = intValue4;
            c6900xf90847b9.V = intValue5;
            z17 = true;
            c6900xf90847b9.W = c6900xf90847b9.b("AutoPlaySessionID", str3, true);
            c6900xf90847b9.X = intValue6;
            c6900xf90847b9.f142209v0 = intValue8;
            c6900xf90847b9.k();
            str = "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper";
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("rptVideoPause", str);
            str2 = "stopStreamDownload";
        } else {
            boolean z18 = this.f248057b == 3;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f248056a, "stop online download video %s isFinish %b percent %d", this.f248066k, java.lang.Boolean.valueOf(z18), java.lang.Integer.valueOf(this.f248069n));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Pj().u(this.f248066k, e());
            if (this.f248069n >= this.B.f248086c && !z18) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Pj().m(this.f248062g, this.f248063h, this.f248064i, false, false, 36, this.f248066k);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("rptStopDownload", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(354L, 203L, 1L, false);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("rptStopDownload", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
            str = "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper";
            z17 = true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str2, str);
        return z17;
    }

    public final void q(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("uiPrepareVideo", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
        synchronized (this.C) {
            try {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17987x1533a9b.IVideoUICallback iVideoUICallback = this.f248061f;
                if (iVideoUICallback != null) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d) iVideoUICallback).G(this.f248065j, z17);
                }
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("uiPrepareVideo", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
                throw th6;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("uiPrepareVideo", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
    }

    public final boolean r() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("uiResumeByDataGain", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
        synchronized (this.C) {
            try {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17987x1533a9b.IVideoUICallback iVideoUICallback = this.f248061f;
                if (iVideoUICallback == null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("uiResumeByDataGain", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
                    return true;
                }
                boolean J2 = ((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d) iVideoUICallback).J();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("uiResumeByDataGain", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
                return J2;
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("uiResumeByDataGain", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
                throw th6;
            }
        }
    }

    public final void s(int i17, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("uiSeek", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
        synchronized (this.C) {
            try {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17987x1533a9b.IVideoUICallback iVideoUICallback = this.f248061f;
                if (iVideoUICallback != null) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d) iVideoUICallback).M(i17, z17);
                }
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("uiSeek", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
                throw th6;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("uiSeek", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
    }

    public final void t(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("uiUpdateVideoUI", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
        synchronized (this.C) {
            try {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17987x1533a9b.IVideoUICallback iVideoUICallback = this.f248061f;
                if (iVideoUICallback != null) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d) iVideoUICallback).a0(i17 * 1000);
                }
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("uiUpdateVideoUI", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
                throw th6;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("uiUpdateVideoUI", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
    }
}
