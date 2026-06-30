package com.tencent.mm.plugin.appbrand.config;

/* loaded from: classes7.dex */
public final class AppBrandGlobalSystemConfig implements android.os.Parcelable {
    public static volatile com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig A1;
    public static final com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig B1;
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig> CREATOR;
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public java.lang.String[] F;
    public double G;
    public int H;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public int f77205J;
    public long K;
    public long L;
    public com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig.WeAppSyncVersionSetting M;
    public com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig.PackageManager N;
    public long P;
    public java.lang.String[] Q;
    public int R;
    public int S;
    public int T;
    public java.lang.String[] U;
    public long V;
    public int W;
    public int X;
    public java.lang.String Y;
    public com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig.RelievedBuySetting Z;

    /* renamed from: d, reason: collision with root package name */
    public final int f77206d;

    /* renamed from: e, reason: collision with root package name */
    public int f77207e;

    /* renamed from: f, reason: collision with root package name */
    public int f77208f;

    /* renamed from: g, reason: collision with root package name */
    public int f77209g;

    /* renamed from: h, reason: collision with root package name */
    public int f77210h;

    /* renamed from: i, reason: collision with root package name */
    public int f77211i;

    /* renamed from: l1, reason: collision with root package name */
    public double f77212l1;

    /* renamed from: m, reason: collision with root package name */
    public int f77213m;

    /* renamed from: n, reason: collision with root package name */
    public int f77214n;

    /* renamed from: o, reason: collision with root package name */
    public int f77215o;

    /* renamed from: p, reason: collision with root package name */
    public int f77216p;

    /* renamed from: p0, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig.FlagshipSetting f77217p0;

    /* renamed from: p1, reason: collision with root package name */
    public java.lang.String f77218p1;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f77219q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f77220r;

    /* renamed from: s, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig.HttpSetting f77221s;

    /* renamed from: t, reason: collision with root package name */
    public int[] f77222t;

    /* renamed from: u, reason: collision with root package name */
    public int f77223u;

    /* renamed from: v, reason: collision with root package name */
    public int f77224v;

    /* renamed from: w, reason: collision with root package name */
    public int f77225w;

    /* renamed from: x, reason: collision with root package name */
    public int f77226x;

    /* renamed from: x0, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig.FinancialLicenseSetting f77227x0;

    /* renamed from: x1, reason: collision with root package name */
    public java.lang.String[] f77228x1;

    /* renamed from: y, reason: collision with root package name */
    public int f77229y;

    /* renamed from: y0, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig.CapsuleBannerConfig f77230y0;

    /* renamed from: y1, reason: collision with root package name */
    public java.lang.String f77231y1;

    /* renamed from: z, reason: collision with root package name */
    public int f77232z;

    /* renamed from: z1, reason: collision with root package name */
    public int f77233z1;

    static {
        com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig appBrandGlobalSystemConfig = new com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig();
        B1 = appBrandGlobalSystemConfig;
        appBrandGlobalSystemConfig.f77207e = 5;
        appBrandGlobalSystemConfig.f77208f = 1;
        appBrandGlobalSystemConfig.f77209g = 300;
        appBrandGlobalSystemConfig.f77210h = 50;
        appBrandGlobalSystemConfig.f77211i = 1048576;
        appBrandGlobalSystemConfig.f77213m = 1048576;
        appBrandGlobalSystemConfig.f77214n = 20971520;
        appBrandGlobalSystemConfig.f77215o = 200;
        appBrandGlobalSystemConfig.f77216p = 5120;
        appBrandGlobalSystemConfig.f77222t = k91.a0.f305530b;
        appBrandGlobalSystemConfig.f77223u = 50;
        appBrandGlobalSystemConfig.f77224v = 11;
        appBrandGlobalSystemConfig.f77225w = 12;
        appBrandGlobalSystemConfig.f77229y = 1800;
        appBrandGlobalSystemConfig.f77232z = 307200;
        appBrandGlobalSystemConfig.A = 25;
        appBrandGlobalSystemConfig.B = 104857600;
        appBrandGlobalSystemConfig.C = 314572800;
        appBrandGlobalSystemConfig.D = 1;
        appBrandGlobalSystemConfig.E = 50;
        appBrandGlobalSystemConfig.F = k91.a0.f305531c;
        appBrandGlobalSystemConfig.G = 0.0d;
        appBrandGlobalSystemConfig.H = 60;
        appBrandGlobalSystemConfig.I = 60;
        appBrandGlobalSystemConfig.f77205J = 6;
        appBrandGlobalSystemConfig.M = new com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig.WeAppSyncVersionSetting();
        appBrandGlobalSystemConfig.N = new com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig.PackageManager();
        appBrandGlobalSystemConfig.P = 30L;
        appBrandGlobalSystemConfig.Q = k91.a0.f305532d;
        appBrandGlobalSystemConfig.R = 10;
        appBrandGlobalSystemConfig.T = 86400;
        appBrandGlobalSystemConfig.U = k91.a0.f305533e;
        appBrandGlobalSystemConfig.V = 60L;
        appBrandGlobalSystemConfig.W = 1;
        appBrandGlobalSystemConfig.X = 1;
        appBrandGlobalSystemConfig.f77218p1 = null;
        appBrandGlobalSystemConfig.f77233z1 = com.google.android.gms.gcm.Task.EXTRAS_LIMIT_BYTES;
        CREATOR = new k91.y();
    }

    public AppBrandGlobalSystemConfig() {
        this.f77206d = Integer.MAX_VALUE;
        this.f77221s = new com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig.HttpSetting();
        this.Z = new com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig.RelievedBuySetting();
        this.f77217p0 = new com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig.FlagshipSetting();
        this.f77227x0 = new com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig.FinancialLicenseSetting();
        this.f77230y0 = new com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig.CapsuleBannerConfig();
    }

    public static java.lang.String a() {
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(lp0.b.h(), "wxaapp/res/");
        if (!r6Var.m()) {
            r6Var.J();
        }
        return new com.tencent.mm.vfs.r6(r6Var, "AppService.conf").o();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x005d A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005f A[Catch: all -> 0x006d, TRY_ENTER, TryCatch #2 {, blocks: (B:4:0x0003, B:8:0x0008, B:9:0x0057, B:17:0x005f, B:25:0x0012, B:19:0x001e, B:21:0x0031, B:23:0x004f, B:26:0x0065), top: B:3:0x0003, inners: #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig b() {
        /*
            java.lang.Class<com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig> r0 = com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig.class
            monitor-enter(r0)
            com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig r1 = com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig.A1     // Catch: java.lang.Throwable -> L6d
            if (r1 != 0) goto L65
            r1 = 0
            java.lang.String r2 = a()     // Catch: java.io.IOException -> L11 java.io.FileNotFoundException -> L1e java.lang.Throwable -> L6d
            java.lang.String r2 = com.tencent.mm.vfs.w6.M(r2)     // Catch: java.io.IOException -> L11 java.io.FileNotFoundException -> L1e java.lang.Throwable -> L6d
            goto L57
        L11:
            r2 = move-exception
            java.lang.String r3 = "MicroMsg.AppBrandGlobalSystemConfig"
            java.lang.String r4 = "read config file, exp = %s"
            java.lang.Object[] r2 = new java.lang.Object[]{r2}     // Catch: java.lang.Throwable -> L6d
            com.tencent.mars.xlog.Log.e(r3, r4, r2)     // Catch: java.lang.Throwable -> L6d
            goto L56
        L1e:
            java.lang.Class<oe.a> r2 = oe.a.class
            nd.b r2 = nd.f.a(r2)     // Catch: java.lang.Throwable -> L6d
            oe.a r2 = (oe.a) r2     // Catch: java.lang.Throwable -> L6d
            com.tencent.mm.plugin.appbrand.luggage.customize.b r2 = (com.tencent.mm.plugin.appbrand.luggage.customize.b) r2     // Catch: java.lang.Throwable -> L6d
            r2.getClass()     // Catch: java.lang.Throwable -> L6d
            boolean r2 = com.tencent.mm.sdk.platformtools.x2.n()     // Catch: java.lang.Throwable -> L6d
            if (r2 == 0) goto L4f
            java.lang.Class<zy.r> r2 = zy.r.class
            i95.m r3 = i95.n0.c(r2)     // Catch: java.lang.Throwable -> L6d
            zy.r r3 = (zy.r) r3     // Catch: java.lang.Throwable -> L6d
            i95.m r2 = i95.n0.c(r2)     // Catch: java.lang.Throwable -> L6d
            zy.r r2 = (zy.r) r2     // Catch: java.lang.Throwable -> L6d
            yy.a r2 = (yy.a) r2     // Catch: java.lang.Throwable -> L6d
            r4 = 38
            r5 = 1
            int r2 = r2.Di(r4, r5)     // Catch: java.lang.Throwable -> L6d
            yy.a r3 = (yy.a) r3     // Catch: java.lang.Throwable -> L6d
            r6 = 0
            r3.Ui(r4, r5, r2, r6)     // Catch: java.lang.Throwable -> L6d
            goto L56
        L4f:
            java.lang.String r2 = "MicroMsg.AppBrandGlobalSystemConfigResUpdateListener"
            java.lang.String r3 = "onConfigFileDeleted: not in main proc, ignore"
            com.tencent.mars.xlog.Log.i(r2, r3)     // Catch: java.lang.Throwable -> L6d
        L56:
            r2 = r1
        L57:
            boolean r3 = com.tencent.mm.sdk.platformtools.t8.K0(r2)     // Catch: java.lang.Throwable -> L6d
            if (r3 == 0) goto L5f
            monitor-exit(r0)
            goto L68
        L5f:
            com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig r1 = c(r2)     // Catch: java.lang.Throwable -> L6d
            com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig.A1 = r1     // Catch: java.lang.Throwable -> L6d
        L65:
            com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig r1 = com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig.A1     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r0)
        L68:
            if (r1 != 0) goto L6c
            com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig r1 = com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig.B1
        L6c:
            return r1
        L6d:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig.b():com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0408 A[Catch: Exception -> 0x052c, TryCatch #0 {Exception -> 0x052c, blocks: (B:3:0x0004, B:6:0x001c, B:8:0x002a, B:9:0x0038, B:11:0x0040, B:12:0x0048, B:14:0x004e, B:16:0x005a, B:18:0x0062, B:19:0x006a, B:21:0x0070, B:23:0x007c, B:24:0x002d, B:26:0x0035, B:27:0x00a5, B:29:0x00b5, B:30:0x00b7, B:32:0x00c3, B:33:0x00c5, B:35:0x00d6, B:37:0x010d, B:38:0x0122, B:40:0x0134, B:41:0x0138, B:43:0x0147, B:44:0x0177, B:46:0x0210, B:47:0x0219, B:49:0x021f, B:51:0x022b, B:53:0x022f, B:54:0x0233, B:56:0x0291, B:59:0x0298, B:60:0x02a1, B:62:0x02a7, B:64:0x02b7, B:66:0x02ec, B:69:0x02f3, B:70:0x02fc, B:72:0x0302, B:74:0x0312, B:76:0x032e, B:79:0x0335, B:80:0x033e, B:82:0x0344, B:84:0x0354, B:86:0x0375, B:87:0x037f, B:90:0x0398, B:92:0x03a0, B:93:0x03b9, B:95:0x03c1, B:96:0x03da, B:98:0x03e0, B:99:0x03f9, B:101:0x0408, B:103:0x0410, B:104:0x0429, B:106:0x0431, B:107:0x044a, B:109:0x0459, B:111:0x0461, B:112:0x047a, B:114:0x0482, B:115:0x049b, B:117:0x04a1, B:118:0x04bc, B:120:0x04cb, B:121:0x04dd, B:123:0x0506, B:126:0x050d, B:127:0x0515, B:129:0x051b, B:133:0x0527, B:135:0x0350, B:136:0x030e, B:137:0x02b3), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0459 A[Catch: Exception -> 0x052c, TryCatch #0 {Exception -> 0x052c, blocks: (B:3:0x0004, B:6:0x001c, B:8:0x002a, B:9:0x0038, B:11:0x0040, B:12:0x0048, B:14:0x004e, B:16:0x005a, B:18:0x0062, B:19:0x006a, B:21:0x0070, B:23:0x007c, B:24:0x002d, B:26:0x0035, B:27:0x00a5, B:29:0x00b5, B:30:0x00b7, B:32:0x00c3, B:33:0x00c5, B:35:0x00d6, B:37:0x010d, B:38:0x0122, B:40:0x0134, B:41:0x0138, B:43:0x0147, B:44:0x0177, B:46:0x0210, B:47:0x0219, B:49:0x021f, B:51:0x022b, B:53:0x022f, B:54:0x0233, B:56:0x0291, B:59:0x0298, B:60:0x02a1, B:62:0x02a7, B:64:0x02b7, B:66:0x02ec, B:69:0x02f3, B:70:0x02fc, B:72:0x0302, B:74:0x0312, B:76:0x032e, B:79:0x0335, B:80:0x033e, B:82:0x0344, B:84:0x0354, B:86:0x0375, B:87:0x037f, B:90:0x0398, B:92:0x03a0, B:93:0x03b9, B:95:0x03c1, B:96:0x03da, B:98:0x03e0, B:99:0x03f9, B:101:0x0408, B:103:0x0410, B:104:0x0429, B:106:0x0431, B:107:0x044a, B:109:0x0459, B:111:0x0461, B:112:0x047a, B:114:0x0482, B:115:0x049b, B:117:0x04a1, B:118:0x04bc, B:120:0x04cb, B:121:0x04dd, B:123:0x0506, B:126:0x050d, B:127:0x0515, B:129:0x051b, B:133:0x0527, B:135:0x0350, B:136:0x030e, B:137:0x02b3), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x04cb A[Catch: Exception -> 0x052c, TryCatch #0 {Exception -> 0x052c, blocks: (B:3:0x0004, B:6:0x001c, B:8:0x002a, B:9:0x0038, B:11:0x0040, B:12:0x0048, B:14:0x004e, B:16:0x005a, B:18:0x0062, B:19:0x006a, B:21:0x0070, B:23:0x007c, B:24:0x002d, B:26:0x0035, B:27:0x00a5, B:29:0x00b5, B:30:0x00b7, B:32:0x00c3, B:33:0x00c5, B:35:0x00d6, B:37:0x010d, B:38:0x0122, B:40:0x0134, B:41:0x0138, B:43:0x0147, B:44:0x0177, B:46:0x0210, B:47:0x0219, B:49:0x021f, B:51:0x022b, B:53:0x022f, B:54:0x0233, B:56:0x0291, B:59:0x0298, B:60:0x02a1, B:62:0x02a7, B:64:0x02b7, B:66:0x02ec, B:69:0x02f3, B:70:0x02fc, B:72:0x0302, B:74:0x0312, B:76:0x032e, B:79:0x0335, B:80:0x033e, B:82:0x0344, B:84:0x0354, B:86:0x0375, B:87:0x037f, B:90:0x0398, B:92:0x03a0, B:93:0x03b9, B:95:0x03c1, B:96:0x03da, B:98:0x03e0, B:99:0x03f9, B:101:0x0408, B:103:0x0410, B:104:0x0429, B:106:0x0431, B:107:0x044a, B:109:0x0459, B:111:0x0461, B:112:0x047a, B:114:0x0482, B:115:0x049b, B:117:0x04a1, B:118:0x04bc, B:120:0x04cb, B:121:0x04dd, B:123:0x0506, B:126:0x050d, B:127:0x0515, B:129:0x051b, B:133:0x0527, B:135:0x0350, B:136:0x030e, B:137:0x02b3), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0506 A[Catch: Exception -> 0x052c, TryCatch #0 {Exception -> 0x052c, blocks: (B:3:0x0004, B:6:0x001c, B:8:0x002a, B:9:0x0038, B:11:0x0040, B:12:0x0048, B:14:0x004e, B:16:0x005a, B:18:0x0062, B:19:0x006a, B:21:0x0070, B:23:0x007c, B:24:0x002d, B:26:0x0035, B:27:0x00a5, B:29:0x00b5, B:30:0x00b7, B:32:0x00c3, B:33:0x00c5, B:35:0x00d6, B:37:0x010d, B:38:0x0122, B:40:0x0134, B:41:0x0138, B:43:0x0147, B:44:0x0177, B:46:0x0210, B:47:0x0219, B:49:0x021f, B:51:0x022b, B:53:0x022f, B:54:0x0233, B:56:0x0291, B:59:0x0298, B:60:0x02a1, B:62:0x02a7, B:64:0x02b7, B:66:0x02ec, B:69:0x02f3, B:70:0x02fc, B:72:0x0302, B:74:0x0312, B:76:0x032e, B:79:0x0335, B:80:0x033e, B:82:0x0344, B:84:0x0354, B:86:0x0375, B:87:0x037f, B:90:0x0398, B:92:0x03a0, B:93:0x03b9, B:95:0x03c1, B:96:0x03da, B:98:0x03e0, B:99:0x03f9, B:101:0x0408, B:103:0x0410, B:104:0x0429, B:106:0x0431, B:107:0x044a, B:109:0x0459, B:111:0x0461, B:112:0x047a, B:114:0x0482, B:115:0x049b, B:117:0x04a1, B:118:0x04bc, B:120:0x04cb, B:121:0x04dd, B:123:0x0506, B:126:0x050d, B:127:0x0515, B:129:0x051b, B:133:0x0527, B:135:0x0350, B:136:0x030e, B:137:0x02b3), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x051b A[Catch: Exception -> 0x052c, LOOP:6: B:127:0x0515->B:129:0x051b, LOOP_END, TryCatch #0 {Exception -> 0x052c, blocks: (B:3:0x0004, B:6:0x001c, B:8:0x002a, B:9:0x0038, B:11:0x0040, B:12:0x0048, B:14:0x004e, B:16:0x005a, B:18:0x0062, B:19:0x006a, B:21:0x0070, B:23:0x007c, B:24:0x002d, B:26:0x0035, B:27:0x00a5, B:29:0x00b5, B:30:0x00b7, B:32:0x00c3, B:33:0x00c5, B:35:0x00d6, B:37:0x010d, B:38:0x0122, B:40:0x0134, B:41:0x0138, B:43:0x0147, B:44:0x0177, B:46:0x0210, B:47:0x0219, B:49:0x021f, B:51:0x022b, B:53:0x022f, B:54:0x0233, B:56:0x0291, B:59:0x0298, B:60:0x02a1, B:62:0x02a7, B:64:0x02b7, B:66:0x02ec, B:69:0x02f3, B:70:0x02fc, B:72:0x0302, B:74:0x0312, B:76:0x032e, B:79:0x0335, B:80:0x033e, B:82:0x0344, B:84:0x0354, B:86:0x0375, B:87:0x037f, B:90:0x0398, B:92:0x03a0, B:93:0x03b9, B:95:0x03c1, B:96:0x03da, B:98:0x03e0, B:99:0x03f9, B:101:0x0408, B:103:0x0410, B:104:0x0429, B:106:0x0431, B:107:0x044a, B:109:0x0459, B:111:0x0461, B:112:0x047a, B:114:0x0482, B:115:0x049b, B:117:0x04a1, B:118:0x04bc, B:120:0x04cb, B:121:0x04dd, B:123:0x0506, B:126:0x050d, B:127:0x0515, B:129:0x051b, B:133:0x0527, B:135:0x0350, B:136:0x030e, B:137:0x02b3), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0302 A[Catch: Exception -> 0x052c, LOOP:4: B:70:0x02fc->B:72:0x0302, LOOP_END, TryCatch #0 {Exception -> 0x052c, blocks: (B:3:0x0004, B:6:0x001c, B:8:0x002a, B:9:0x0038, B:11:0x0040, B:12:0x0048, B:14:0x004e, B:16:0x005a, B:18:0x0062, B:19:0x006a, B:21:0x0070, B:23:0x007c, B:24:0x002d, B:26:0x0035, B:27:0x00a5, B:29:0x00b5, B:30:0x00b7, B:32:0x00c3, B:33:0x00c5, B:35:0x00d6, B:37:0x010d, B:38:0x0122, B:40:0x0134, B:41:0x0138, B:43:0x0147, B:44:0x0177, B:46:0x0210, B:47:0x0219, B:49:0x021f, B:51:0x022b, B:53:0x022f, B:54:0x0233, B:56:0x0291, B:59:0x0298, B:60:0x02a1, B:62:0x02a7, B:64:0x02b7, B:66:0x02ec, B:69:0x02f3, B:70:0x02fc, B:72:0x0302, B:74:0x0312, B:76:0x032e, B:79:0x0335, B:80:0x033e, B:82:0x0344, B:84:0x0354, B:86:0x0375, B:87:0x037f, B:90:0x0398, B:92:0x03a0, B:93:0x03b9, B:95:0x03c1, B:96:0x03da, B:98:0x03e0, B:99:0x03f9, B:101:0x0408, B:103:0x0410, B:104:0x0429, B:106:0x0431, B:107:0x044a, B:109:0x0459, B:111:0x0461, B:112:0x047a, B:114:0x0482, B:115:0x049b, B:117:0x04a1, B:118:0x04bc, B:120:0x04cb, B:121:0x04dd, B:123:0x0506, B:126:0x050d, B:127:0x0515, B:129:0x051b, B:133:0x0527, B:135:0x0350, B:136:0x030e, B:137:0x02b3), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x032e A[Catch: Exception -> 0x052c, TryCatch #0 {Exception -> 0x052c, blocks: (B:3:0x0004, B:6:0x001c, B:8:0x002a, B:9:0x0038, B:11:0x0040, B:12:0x0048, B:14:0x004e, B:16:0x005a, B:18:0x0062, B:19:0x006a, B:21:0x0070, B:23:0x007c, B:24:0x002d, B:26:0x0035, B:27:0x00a5, B:29:0x00b5, B:30:0x00b7, B:32:0x00c3, B:33:0x00c5, B:35:0x00d6, B:37:0x010d, B:38:0x0122, B:40:0x0134, B:41:0x0138, B:43:0x0147, B:44:0x0177, B:46:0x0210, B:47:0x0219, B:49:0x021f, B:51:0x022b, B:53:0x022f, B:54:0x0233, B:56:0x0291, B:59:0x0298, B:60:0x02a1, B:62:0x02a7, B:64:0x02b7, B:66:0x02ec, B:69:0x02f3, B:70:0x02fc, B:72:0x0302, B:74:0x0312, B:76:0x032e, B:79:0x0335, B:80:0x033e, B:82:0x0344, B:84:0x0354, B:86:0x0375, B:87:0x037f, B:90:0x0398, B:92:0x03a0, B:93:0x03b9, B:95:0x03c1, B:96:0x03da, B:98:0x03e0, B:99:0x03f9, B:101:0x0408, B:103:0x0410, B:104:0x0429, B:106:0x0431, B:107:0x044a, B:109:0x0459, B:111:0x0461, B:112:0x047a, B:114:0x0482, B:115:0x049b, B:117:0x04a1, B:118:0x04bc, B:120:0x04cb, B:121:0x04dd, B:123:0x0506, B:126:0x050d, B:127:0x0515, B:129:0x051b, B:133:0x0527, B:135:0x0350, B:136:0x030e, B:137:0x02b3), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0344 A[Catch: Exception -> 0x052c, LOOP:5: B:80:0x033e->B:82:0x0344, LOOP_END, TryCatch #0 {Exception -> 0x052c, blocks: (B:3:0x0004, B:6:0x001c, B:8:0x002a, B:9:0x0038, B:11:0x0040, B:12:0x0048, B:14:0x004e, B:16:0x005a, B:18:0x0062, B:19:0x006a, B:21:0x0070, B:23:0x007c, B:24:0x002d, B:26:0x0035, B:27:0x00a5, B:29:0x00b5, B:30:0x00b7, B:32:0x00c3, B:33:0x00c5, B:35:0x00d6, B:37:0x010d, B:38:0x0122, B:40:0x0134, B:41:0x0138, B:43:0x0147, B:44:0x0177, B:46:0x0210, B:47:0x0219, B:49:0x021f, B:51:0x022b, B:53:0x022f, B:54:0x0233, B:56:0x0291, B:59:0x0298, B:60:0x02a1, B:62:0x02a7, B:64:0x02b7, B:66:0x02ec, B:69:0x02f3, B:70:0x02fc, B:72:0x0302, B:74:0x0312, B:76:0x032e, B:79:0x0335, B:80:0x033e, B:82:0x0344, B:84:0x0354, B:86:0x0375, B:87:0x037f, B:90:0x0398, B:92:0x03a0, B:93:0x03b9, B:95:0x03c1, B:96:0x03da, B:98:0x03e0, B:99:0x03f9, B:101:0x0408, B:103:0x0410, B:104:0x0429, B:106:0x0431, B:107:0x044a, B:109:0x0459, B:111:0x0461, B:112:0x047a, B:114:0x0482, B:115:0x049b, B:117:0x04a1, B:118:0x04bc, B:120:0x04cb, B:121:0x04dd, B:123:0x0506, B:126:0x050d, B:127:0x0515, B:129:0x051b, B:133:0x0527, B:135:0x0350, B:136:0x030e, B:137:0x02b3), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0375 A[Catch: Exception -> 0x052c, TryCatch #0 {Exception -> 0x052c, blocks: (B:3:0x0004, B:6:0x001c, B:8:0x002a, B:9:0x0038, B:11:0x0040, B:12:0x0048, B:14:0x004e, B:16:0x005a, B:18:0x0062, B:19:0x006a, B:21:0x0070, B:23:0x007c, B:24:0x002d, B:26:0x0035, B:27:0x00a5, B:29:0x00b5, B:30:0x00b7, B:32:0x00c3, B:33:0x00c5, B:35:0x00d6, B:37:0x010d, B:38:0x0122, B:40:0x0134, B:41:0x0138, B:43:0x0147, B:44:0x0177, B:46:0x0210, B:47:0x0219, B:49:0x021f, B:51:0x022b, B:53:0x022f, B:54:0x0233, B:56:0x0291, B:59:0x0298, B:60:0x02a1, B:62:0x02a7, B:64:0x02b7, B:66:0x02ec, B:69:0x02f3, B:70:0x02fc, B:72:0x0302, B:74:0x0312, B:76:0x032e, B:79:0x0335, B:80:0x033e, B:82:0x0344, B:84:0x0354, B:86:0x0375, B:87:0x037f, B:90:0x0398, B:92:0x03a0, B:93:0x03b9, B:95:0x03c1, B:96:0x03da, B:98:0x03e0, B:99:0x03f9, B:101:0x0408, B:103:0x0410, B:104:0x0429, B:106:0x0431, B:107:0x044a, B:109:0x0459, B:111:0x0461, B:112:0x047a, B:114:0x0482, B:115:0x049b, B:117:0x04a1, B:118:0x04bc, B:120:0x04cb, B:121:0x04dd, B:123:0x0506, B:126:0x050d, B:127:0x0515, B:129:0x051b, B:133:0x0527, B:135:0x0350, B:136:0x030e, B:137:0x02b3), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0398 A[Catch: Exception -> 0x052c, TRY_ENTER, TryCatch #0 {Exception -> 0x052c, blocks: (B:3:0x0004, B:6:0x001c, B:8:0x002a, B:9:0x0038, B:11:0x0040, B:12:0x0048, B:14:0x004e, B:16:0x005a, B:18:0x0062, B:19:0x006a, B:21:0x0070, B:23:0x007c, B:24:0x002d, B:26:0x0035, B:27:0x00a5, B:29:0x00b5, B:30:0x00b7, B:32:0x00c3, B:33:0x00c5, B:35:0x00d6, B:37:0x010d, B:38:0x0122, B:40:0x0134, B:41:0x0138, B:43:0x0147, B:44:0x0177, B:46:0x0210, B:47:0x0219, B:49:0x021f, B:51:0x022b, B:53:0x022f, B:54:0x0233, B:56:0x0291, B:59:0x0298, B:60:0x02a1, B:62:0x02a7, B:64:0x02b7, B:66:0x02ec, B:69:0x02f3, B:70:0x02fc, B:72:0x0302, B:74:0x0312, B:76:0x032e, B:79:0x0335, B:80:0x033e, B:82:0x0344, B:84:0x0354, B:86:0x0375, B:87:0x037f, B:90:0x0398, B:92:0x03a0, B:93:0x03b9, B:95:0x03c1, B:96:0x03da, B:98:0x03e0, B:99:0x03f9, B:101:0x0408, B:103:0x0410, B:104:0x0429, B:106:0x0431, B:107:0x044a, B:109:0x0459, B:111:0x0461, B:112:0x047a, B:114:0x0482, B:115:0x049b, B:117:0x04a1, B:118:0x04bc, B:120:0x04cb, B:121:0x04dd, B:123:0x0506, B:126:0x050d, B:127:0x0515, B:129:0x051b, B:133:0x0527, B:135:0x0350, B:136:0x030e, B:137:0x02b3), top: B:2:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig c(java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 1342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig.c(java.lang.String):com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f77206d);
        parcel.writeInt(this.f77207e);
        parcel.writeInt(this.f77208f);
        parcel.writeInt(this.f77209g);
        parcel.writeInt(this.f77210h);
        parcel.writeInt(this.f77211i);
        parcel.writeInt(this.f77213m);
        parcel.writeInt(this.f77214n);
        parcel.writeInt(this.f77215o);
        parcel.writeInt(this.f77216p);
        parcel.writeString(this.f77219q);
        parcel.writeString(this.f77220r);
        parcel.writeParcelable(this.f77221s, i17);
        parcel.writeIntArray(this.f77222t);
        parcel.writeInt(this.f77223u);
        parcel.writeInt(this.f77224v);
        parcel.writeInt(this.f77229y);
        parcel.writeInt(this.f77232z);
        parcel.writeInt(this.A);
        parcel.writeInt(this.B);
        parcel.writeInt(this.C);
        parcel.writeInt(this.D);
        parcel.writeInt(this.E);
        parcel.writeStringArray(this.F);
        parcel.writeDouble(this.G);
        parcel.writeInt(this.H);
        parcel.writeLong(this.K);
        parcel.writeLong(this.L);
        parcel.writeParcelable(this.M, i17);
        parcel.writeParcelable(this.N, i17);
        parcel.writeLong(this.P);
        parcel.writeStringArray(this.Q);
        parcel.writeInt(this.R);
        parcel.writeInt(this.T);
        parcel.writeInt(this.S);
        parcel.writeInt(this.I);
        parcel.writeStringArray(this.U);
        parcel.writeLong(this.V);
        parcel.writeInt(this.W);
        parcel.writeInt(this.X);
        parcel.writeString(this.Y);
        parcel.writeParcelable(this.Z, i17);
        parcel.writeParcelable(this.f77217p0, i17);
        parcel.writeParcelable(this.f77227x0, i17);
        parcel.writeDouble(this.f77212l1);
        parcel.writeString(this.f77218p1);
        parcel.writeString(this.f77231y1);
        parcel.writeInt(this.f77233z1);
    }

    /* loaded from: classes7.dex */
    public static final class HttpSetting implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig.HttpSetting> CREATOR = new com.tencent.mm.plugin.appbrand.config.f();

        /* renamed from: d, reason: collision with root package name */
        public int f77251d;

        /* renamed from: e, reason: collision with root package name */
        public java.util.ArrayList f77252e;

        /* renamed from: f, reason: collision with root package name */
        public java.util.ArrayList f77253f;

        /* renamed from: g, reason: collision with root package name */
        public int f77254g;

        /* renamed from: h, reason: collision with root package name */
        public int f77255h;

        /* renamed from: i, reason: collision with root package name */
        public int f77256i;

        /* renamed from: m, reason: collision with root package name */
        public int f77257m;

        /* renamed from: n, reason: collision with root package name */
        public java.lang.String f77258n;

        public HttpSetting() {
            this.f77251d = 0;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            parcel.writeInt(this.f77251d);
            parcel.writeStringList(this.f77252e);
            parcel.writeStringList(this.f77253f);
            parcel.writeInt(this.f77254g);
            parcel.writeInt(this.f77255h);
            parcel.writeInt(this.f77256i);
            parcel.writeInt(this.f77257m);
            parcel.writeString(this.f77258n);
        }

        public HttpSetting(android.os.Parcel parcel) {
            this.f77251d = 0;
            this.f77251d = parcel.readInt();
            this.f77252e = parcel.createStringArrayList();
            this.f77253f = parcel.createStringArrayList();
            this.f77254g = parcel.readInt();
            this.f77255h = parcel.readInt();
            this.f77256i = parcel.readInt();
            this.f77257m = parcel.readInt();
            this.f77258n = parcel.readString();
        }
    }

    /* loaded from: classes7.dex */
    public static final class CapsuleBannerConfig implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig.CapsuleBannerConfig> CREATOR = new com.tencent.mm.plugin.appbrand.config.c();

        /* renamed from: d, reason: collision with root package name */
        public java.lang.String f77234d;

        /* renamed from: e, reason: collision with root package name */
        public java.lang.String f77235e;

        public CapsuleBannerConfig() {
            this.f77234d = "";
            this.f77235e = "";
        }

        public final k91.z a(java.lang.String str, java.lang.String str2) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                k91.z zVar = new k91.z();
                org.json.JSONObject optJSONObject = jSONObject.optJSONObject(str2);
                if (optJSONObject == null) {
                    return null;
                }
                zVar.f305839a = optJSONObject.optString("icon");
                zVar.f305840b = optJSONObject.optString(com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT);
                return zVar;
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandGlobalSystemConfig", "parseItem error", e17);
                return null;
            }
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            java.lang.String str = this.f77234d;
            if (str == null) {
                str = "";
            }
            parcel.writeString(str);
            java.lang.String str2 = this.f77235e;
            parcel.writeString(str2 != null ? str2 : "");
        }

        public CapsuleBannerConfig(android.os.Parcel parcel) {
            this.f77234d = "";
            this.f77235e = "";
            this.f77234d = parcel.readString();
            this.f77235e = parcel.readString();
        }
    }

    /* loaded from: classes7.dex */
    public static final class PackageManager implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig.PackageManager> CREATOR = new com.tencent.mm.plugin.appbrand.config.g();

        /* renamed from: d, reason: collision with root package name */
        public long f77259d;

        /* renamed from: e, reason: collision with root package name */
        public long f77260e;

        /* renamed from: f, reason: collision with root package name */
        public long f77261f;

        /* renamed from: g, reason: collision with root package name */
        public int f77262g;

        public PackageManager() {
            this.f77259d = 86400L;
            this.f77260e = 864000L;
            this.f77261f = 256L;
            this.f77262g = 5;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            parcel.writeLong(this.f77259d);
            parcel.writeLong(this.f77260e);
            parcel.writeLong(this.f77261f);
            parcel.writeInt(this.f77262g);
        }

        public PackageManager(android.os.Parcel parcel) {
            this.f77259d = 86400L;
            this.f77260e = 864000L;
            this.f77261f = 256L;
            this.f77262g = 5;
            this.f77259d = parcel.readLong();
            this.f77260e = parcel.readLong();
            this.f77261f = parcel.readLong();
            this.f77262g = parcel.readInt();
        }
    }

    /* loaded from: classes4.dex */
    public static final class WeAppSyncVersionSetting implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig.WeAppSyncVersionSetting> CREATOR = new com.tencent.mm.plugin.appbrand.config.i();

        /* renamed from: d, reason: collision with root package name */
        public long f77272d;

        /* renamed from: e, reason: collision with root package name */
        public long f77273e;

        /* renamed from: f, reason: collision with root package name */
        public int f77274f;

        /* renamed from: g, reason: collision with root package name */
        public int f77275g;

        /* renamed from: h, reason: collision with root package name */
        public android.util.LongSparseArray f77276h;

        /* renamed from: i, reason: collision with root package name */
        public long f77277i;

        public WeAppSyncVersionSetting() {
            this.f77272d = 21600L;
            this.f77273e = 604800L;
            this.f77274f = 1000;
            this.f77275g = 100;
            this.f77277i = 30L;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            parcel.writeLong(this.f77272d);
            parcel.writeLong(this.f77273e);
            parcel.writeInt(this.f77274f);
            parcel.writeInt(this.f77275g);
            android.util.LongSparseArray longSparseArray = this.f77276h;
            if (longSparseArray == null || longSparseArray.size() == 0) {
                parcel.writeInt(-1);
            } else {
                parcel.writeInt(this.f77276h.size());
                for (int i18 = 0; i18 < this.f77276h.size(); i18++) {
                    parcel.writeLong(this.f77276h.keyAt(i18));
                    parcel.writeStringList((java.util.List) this.f77276h.valueAt(i18));
                }
            }
            parcel.writeLong(this.f77277i);
        }

        public WeAppSyncVersionSetting(android.os.Parcel parcel) {
            this.f77272d = 21600L;
            this.f77273e = 604800L;
            this.f77274f = 1000;
            this.f77275g = 100;
            this.f77277i = 30L;
            this.f77272d = parcel.readLong();
            this.f77273e = parcel.readLong();
            this.f77274f = parcel.readInt();
            this.f77275g = parcel.readInt();
            int readInt = parcel.readInt();
            if (readInt > 0) {
                this.f77276h = new android.util.LongSparseArray(readInt);
                for (int i17 = 0; i17 < readInt; i17++) {
                    long readLong = parcel.readLong();
                    java.util.LinkedList linkedList = new java.util.LinkedList();
                    parcel.readStringList(linkedList);
                    this.f77276h.put(readLong, linkedList);
                }
            }
            this.f77277i = parcel.readLong();
        }
    }

    /* loaded from: classes7.dex */
    public static final class FlagshipSetting implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig.FlagshipSetting> CREATOR = new com.tencent.mm.plugin.appbrand.config.e();

        /* renamed from: d, reason: collision with root package name */
        public java.lang.String f77245d;

        /* renamed from: e, reason: collision with root package name */
        public int f77246e;

        /* renamed from: f, reason: collision with root package name */
        public int f77247f;

        /* renamed from: g, reason: collision with root package name */
        public java.lang.String f77248g;

        /* renamed from: h, reason: collision with root package name */
        public int f77249h;

        /* renamed from: i, reason: collision with root package name */
        public int f77250i;

        public FlagshipSetting() {
            this.f77245d = "";
            this.f77246e = 0;
            this.f77247f = 0;
            this.f77248g = "";
            this.f77249h = 0;
            this.f77250i = 0;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            java.lang.String str = this.f77245d;
            if (str == null) {
                str = "";
            }
            parcel.writeString(str);
            parcel.writeInt(this.f77246e);
            parcel.writeInt(this.f77247f);
            java.lang.String str2 = this.f77248g;
            parcel.writeString(str2 != null ? str2 : "");
            parcel.writeInt(this.f77249h);
            parcel.writeInt(this.f77250i);
        }

        public FlagshipSetting(android.os.Parcel parcel) {
            this.f77245d = "";
            this.f77246e = 0;
            this.f77247f = 0;
            this.f77248g = "";
            this.f77249h = 0;
            this.f77250i = 0;
            this.f77245d = parcel.readString();
            this.f77246e = parcel.readInt();
            this.f77247f = parcel.readInt();
            this.f77248g = parcel.readString();
            this.f77249h = parcel.readInt();
            this.f77250i = parcel.readInt();
        }
    }

    public AppBrandGlobalSystemConfig(android.os.Parcel parcel) {
        this.f77206d = Integer.MAX_VALUE;
        this.f77221s = new com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig.HttpSetting();
        this.Z = new com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig.RelievedBuySetting();
        this.f77217p0 = new com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig.FlagshipSetting();
        this.f77227x0 = new com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig.FinancialLicenseSetting();
        this.f77230y0 = new com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig.CapsuleBannerConfig();
        this.f77206d = parcel.readInt();
        this.f77207e = parcel.readInt();
        this.f77208f = parcel.readInt();
        this.f77209g = parcel.readInt();
        this.f77210h = parcel.readInt();
        this.f77211i = parcel.readInt();
        this.f77213m = parcel.readInt();
        this.f77214n = parcel.readInt();
        this.f77215o = parcel.readInt();
        this.f77216p = parcel.readInt();
        this.f77219q = parcel.readString();
        this.f77220r = parcel.readString();
        this.f77221s = (com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig.HttpSetting) parcel.readParcelable(com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig.HttpSetting.class.getClassLoader());
        this.f77222t = parcel.createIntArray();
        this.f77223u = parcel.readInt();
        this.f77224v = parcel.readInt();
        this.f77229y = parcel.readInt();
        this.f77232z = parcel.readInt();
        this.A = parcel.readInt();
        this.B = parcel.readInt();
        this.C = parcel.readInt();
        this.D = parcel.readInt();
        this.E = parcel.readInt();
        this.F = parcel.createStringArray();
        this.G = parcel.readDouble();
        this.H = parcel.readInt();
        this.K = parcel.readLong();
        this.L = parcel.readLong();
        this.M = (com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig.WeAppSyncVersionSetting) parcel.readParcelable(com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig.WeAppSyncVersionSetting.class.getClassLoader());
        this.N = (com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig.PackageManager) parcel.readParcelable(com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig.PackageManager.class.getClassLoader());
        this.P = parcel.readLong();
        this.Q = parcel.createStringArray();
        this.R = parcel.readInt();
        this.T = parcel.readInt();
        this.S = parcel.readInt();
        this.I = parcel.readInt();
        this.U = parcel.createStringArray();
        this.V = parcel.readLong();
        this.W = parcel.readInt();
        this.X = parcel.readInt();
        this.Y = parcel.readString();
        this.Z = (com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig.RelievedBuySetting) parcel.readParcelable(com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig.RelievedBuySetting.class.getClassLoader());
        this.f77217p0 = (com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig.FlagshipSetting) parcel.readParcelable(com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig.FlagshipSetting.class.getClassLoader());
        this.f77227x0 = (com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig.FinancialLicenseSetting) parcel.readParcelable(com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig.FinancialLicenseSetting.class.getClassLoader());
        this.f77212l1 = parcel.readDouble();
        this.f77218p1 = parcel.readString();
        this.f77231y1 = parcel.readString();
        this.f77233z1 = parcel.readInt();
    }

    /* loaded from: classes7.dex */
    public static final class FinancialLicenseSetting implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig.FinancialLicenseSetting> CREATOR = new com.tencent.mm.plugin.appbrand.config.d();

        /* renamed from: d, reason: collision with root package name */
        public java.lang.String f77236d;

        /* renamed from: e, reason: collision with root package name */
        public int f77237e;

        /* renamed from: f, reason: collision with root package name */
        public int f77238f;

        /* renamed from: g, reason: collision with root package name */
        public java.lang.String f77239g;

        /* renamed from: h, reason: collision with root package name */
        public int f77240h;

        /* renamed from: i, reason: collision with root package name */
        public int f77241i;

        /* renamed from: m, reason: collision with root package name */
        public java.lang.String f77242m;

        /* renamed from: n, reason: collision with root package name */
        public int f77243n;

        /* renamed from: o, reason: collision with root package name */
        public int f77244o;

        public FinancialLicenseSetting() {
            this.f77236d = "";
            this.f77237e = 0;
            this.f77238f = 0;
            this.f77239g = "";
            this.f77240h = 0;
            this.f77241i = 0;
            this.f77242m = "";
            this.f77243n = 0;
            this.f77244o = 0;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            java.lang.String str = this.f77236d;
            if (str == null) {
                str = "";
            }
            parcel.writeString(str);
            parcel.writeInt(this.f77237e);
            parcel.writeInt(this.f77238f);
            java.lang.String str2 = this.f77239g;
            if (str2 == null) {
                str2 = "";
            }
            parcel.writeString(str2);
            parcel.writeInt(this.f77240h);
            parcel.writeInt(this.f77241i);
            java.lang.String str3 = this.f77242m;
            parcel.writeString(str3 != null ? str3 : "");
            parcel.writeInt(this.f77243n);
            parcel.writeInt(this.f77244o);
        }

        public FinancialLicenseSetting(android.os.Parcel parcel) {
            this.f77236d = "";
            this.f77237e = 0;
            this.f77238f = 0;
            this.f77239g = "";
            this.f77240h = 0;
            this.f77241i = 0;
            this.f77242m = "";
            this.f77243n = 0;
            this.f77244o = 0;
            this.f77236d = parcel.readString();
            this.f77237e = parcel.readInt();
            this.f77238f = parcel.readInt();
            this.f77239g = parcel.readString();
            this.f77240h = parcel.readInt();
            this.f77241i = parcel.readInt();
            this.f77242m = parcel.readString();
            this.f77243n = parcel.readInt();
            this.f77244o = parcel.readInt();
        }
    }

    /* loaded from: classes7.dex */
    public static final class RelievedBuySetting implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig.RelievedBuySetting> CREATOR = new com.tencent.mm.plugin.appbrand.config.h();

        /* renamed from: d, reason: collision with root package name */
        public java.lang.String f77263d;

        /* renamed from: e, reason: collision with root package name */
        public int f77264e;

        /* renamed from: f, reason: collision with root package name */
        public int f77265f;

        /* renamed from: g, reason: collision with root package name */
        public java.lang.String f77266g;

        /* renamed from: h, reason: collision with root package name */
        public int f77267h;

        /* renamed from: i, reason: collision with root package name */
        public int f77268i;

        /* renamed from: m, reason: collision with root package name */
        public java.lang.String f77269m;

        /* renamed from: n, reason: collision with root package name */
        public int f77270n;

        /* renamed from: o, reason: collision with root package name */
        public int f77271o;

        public RelievedBuySetting() {
            this.f77263d = "";
            this.f77264e = 0;
            this.f77265f = 0;
            this.f77266g = "";
            this.f77267h = 0;
            this.f77268i = 0;
            this.f77269m = "";
            this.f77270n = 0;
            this.f77271o = 0;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            java.lang.String str = this.f77263d;
            if (str == null) {
                str = "";
            }
            parcel.writeString(str);
            parcel.writeInt(this.f77264e);
            parcel.writeInt(this.f77265f);
            java.lang.String str2 = this.f77266g;
            if (str2 == null) {
                str2 = "";
            }
            parcel.writeString(str2);
            parcel.writeInt(this.f77267h);
            parcel.writeInt(this.f77268i);
            java.lang.String str3 = this.f77269m;
            parcel.writeString(str3 != null ? str3 : "");
            parcel.writeInt(this.f77270n);
            parcel.writeInt(this.f77271o);
        }

        public RelievedBuySetting(android.os.Parcel parcel) {
            this.f77263d = "";
            this.f77264e = 0;
            this.f77265f = 0;
            this.f77266g = "";
            this.f77267h = 0;
            this.f77268i = 0;
            this.f77269m = "";
            this.f77270n = 0;
            this.f77271o = 0;
            this.f77263d = parcel.readString();
            this.f77264e = parcel.readInt();
            this.f77265f = parcel.readInt();
            this.f77266g = parcel.readString();
            this.f77267h = parcel.readInt();
            this.f77268i = parcel.readInt();
            this.f77269m = parcel.readString();
            this.f77270n = parcel.readInt();
            this.f77271o = parcel.readInt();
        }
    }
}
