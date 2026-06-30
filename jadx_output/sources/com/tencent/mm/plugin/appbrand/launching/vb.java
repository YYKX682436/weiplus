package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class vb extends com.tencent.mm.plugin.appbrand.launching.hb implements com.tencent.mm.plugin.appbrand.launching.t8 {
    public static final com.tencent.mm.plugin.appbrand.launching.v8[] L = {com.tencent.mm.plugin.appbrand.launching.v8.CMD_UPDATE_VERSION};
    public final java.lang.String D;
    public boolean F;
    public final k91.g5 G;
    public final com.tencent.mm.plugin.appbrand.config.AppBrandLaunchFromNotifyReferrer H;
    public final java.lang.String I;

    /* renamed from: J, reason: collision with root package name */
    public final int f85281J;
    public final boolean K;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f85282h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f85283i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f85284m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f85285n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f85286o;

    /* renamed from: p, reason: collision with root package name */
    public k91.v5 f85287p;

    /* renamed from: q, reason: collision with root package name */
    public final int f85288q;

    /* renamed from: r, reason: collision with root package name */
    public final int f85289r;

    /* renamed from: s, reason: collision with root package name */
    public final int f85290s;

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f85291t;

    /* renamed from: u, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.report.AppBrandStatObject f85292u;

    /* renamed from: v, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer f85293v;

    /* renamed from: w, reason: collision with root package name */
    public final com.tencent.luggage.sdk.launching.p f85294w;

    /* renamed from: x, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.launching.report.AppBrandRuntimeReloadReportBundle f85295x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f85296y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.Boolean f85297z = null;
    public boolean A = false;
    public boolean B = false;
    public com.tencent.mm.plugin.appbrand.launching.v8 C = com.tencent.mm.plugin.appbrand.launching.v8.NONE;
    public int E = -1;

    public vb(java.lang.String str, java.lang.String str2, int i17, int i18, int i19, java.lang.String str3, com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject, com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer appBrandLaunchReferrer, java.lang.String str4, com.tencent.mm.plugin.appbrand.config.AppBrandLaunchFromNotifyReferrer appBrandLaunchFromNotifyReferrer, java.lang.String str5, int i27, k91.g5 g5Var, com.tencent.luggage.sdk.launching.p pVar, com.tencent.mm.plugin.appbrand.launching.report.AppBrandRuntimeReloadReportBundle appBrandRuntimeReloadReportBundle, boolean z17) {
        this.G = null;
        this.f85283i = str;
        this.f85284m = str2;
        this.f85288q = i17;
        this.f85289r = i18;
        this.f85290s = i19;
        this.f85291t = str3;
        this.f85292u = appBrandStatObject;
        this.f85293v = appBrandLaunchReferrer;
        this.D = str4;
        this.H = appBrandLaunchFromNotifyReferrer;
        this.I = str5;
        this.f85281J = i27;
        this.f85294w = pVar;
        this.f85295x = appBrandRuntimeReloadReportBundle;
        this.K = z17;
        java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            this.f85282h = "MicroMsg.AppBrand.PrepareStepGetWxaAttrs[" + str2 + "]";
        } else {
            this.f85282h = "MicroMsg.AppBrand.PrepareStepGetWxaAttrs[" + str + "]";
        }
        this.G = g5Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.launching.t8
    public long a() {
        return this.f84647d;
    }

    @Override // com.tencent.mm.plugin.appbrand.launching.t8
    public long b() {
        return this.f84648e;
    }

    @Override // com.tencent.mm.plugin.appbrand.launching.t8
    public long c() {
        return this.f84649f;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(38:1|(1:3)(42:226|(1:329)(1:230)|231|(1:328)(1:235)|236|(3:238|(1:240)|(2:242|(7:251|(1:253)|254|(1:256)(1:326)|(1:258)(2:259|(2:261|(6:266|(1:325)(1:272)|273|(2:276|(3:278|(1:280)|281)(4:282|(1:323)(1:286)|(2:288|(1:290)(2:291|292))(4:302|(1:322)(1:306)|307|(3:309|(1:317)(1:313)|(1:315)(2:316|292))(2:318|(2:320|292)(1:321)))|(2:294|(1:296))(2:297|(1:301))))|324|(0)(0))(1:265)))|5|(31:15|16|17|(6:19|(1:21)(1:52)|22|(3:38|(2:40|(2:44|45))(2:46|(2:48|(1:50)(2:51|45)))|(2:30|31))|25|(3:27|30|31))|53|(4:55|(1:57)|58|(1:60)(2:61|(1:63)(1:64)))|65|(2:202|(6:204|(1:222)(1:208)|209|(4:211|(1:213)(1:217)|214|(1:216))|218|(1:220)(1:221))(1:223))(1:69)|70|(3:72|(1:74)(1:198)|75)(2:199|(1:201))|76|(2:78|(1:83)(1:82))|84|(2:86|87)|180|(1:192)|193|(1:195)(1:197)|196|114|(1:116)|166|119|(7:122|(1:124)|136|127|(0)|(2:131|133)|(0))|137|(0)(0)|142|(1:144)|152|(0)(0)|(2:156|160)(1:161))(2:12|13))(1:250)))|327|5|(0)|15|16|17|(0)|53|(0)|65|(1:67)|202|(0)(0)|70|(0)(0)|76|(0)|84|(0)|180|(6:182|184|186|188|190|192)|193|(0)(0)|196|114|(0)|166|119|(0)|137|(0)(0)|142|(0)|152|(0)(0)|(0)(0))|4|5|(0)|15|16|17|(0)|53|(0)|65|(0)|202|(0)(0)|70|(0)(0)|76|(0)|84|(0)|180|(0)|193|(0)(0)|196|114|(0)|166|119|(0)|137|(0)(0)|142|(0)|152|(0)(0)|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x0370, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x0371, code lost:
    
        com.tencent.mars.xlog.Log.e(r25.f85282h, "getAttrs, check LaunchFallbackMinVersion for username:%s, appId:%s, get npe:%s", r25.f85283i, r25.f85284m, r0);
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:87:0x0565. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0589  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x06cd  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0704 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0737  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x074f  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0765  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x078c  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x07cc  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x07f2  */
    /* JADX WARN: Removed duplicated region for block: B:161:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x07df  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0777  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0620  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0639  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0656  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x06af  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x06b1  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x04e5  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x030e A[Catch: NullPointerException -> 0x0370, TryCatch #0 {NullPointerException -> 0x0370, blocks: (B:17:0x0306, B:19:0x030e, B:21:0x0312, B:22:0x0317, B:27:0x035d, B:30:0x036a, B:31:0x036f, B:33:0x031c, B:35:0x0328, B:38:0x0335, B:40:0x0339, B:46:0x0342, B:48:0x0346, B:50:0x034a, B:51:0x0352), top: B:16:0x0306 }] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0518  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x02ea A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0551  */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object call() {
        /*
            Method dump skipped, instructions count: 2096
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.launching.vb.call():java.lang.Object");
    }

    @Override // com.tencent.mm.plugin.appbrand.launching.hb, com.tencent.mm.plugin.appbrand.launching.b7
    public boolean d() {
        return this.f84650g && com.tencent.luggage.sdk.launching.p.PRE_RENDER != this.f85294w;
    }

    @Override // com.tencent.mm.plugin.appbrand.launching.hb
    public java.lang.String f() {
        return this.f85282h;
    }

    public final k91.v5 i() {
        return !com.tencent.mm.sdk.platformtools.t8.K0(this.f85283i) ? com.tencent.mm.plugin.appbrand.app.r9.ij().n1(this.f85283i, new java.lang.String[0]) : com.tencent.mm.plugin.appbrand.app.r9.ij().k1(this.f85284m, new java.lang.String[0]);
    }

    @Override // com.tencent.mm.plugin.appbrand.launching.t8
    public java.lang.String name() {
        return "PrepareStepGetWxaAttrs";
    }
}
