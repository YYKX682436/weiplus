package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd;

/* loaded from: classes4.dex */
public class u4 extends com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.o2 implements java.io.Serializable {
    public int A;
    public int B;
    public int C;
    public volatile boolean D;
    public boolean E;
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.C18424x4214e2c1 F;
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.s4 G;
    public final android.os.HandlerThread H;
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.t4 I;

    /* renamed from: J */
    public final boolean f247064J;
    public boolean K;
    public final java.lang.String L;
    public final java.lang.String M;
    public final java.lang.String N;
    public final java.lang.String P;
    public volatile boolean Q;
    public final java.lang.String R;
    public final java.lang.String S;
    public final int T;
    public final java.lang.String U;
    public final java.lang.String V;
    public int W;
    public boolean X;
    public final boolean Y;
    public final android.view.View.OnClickListener Z;

    /* renamed from: p0 */
    public final android.view.View.OnClickListener f247065p0;

    /* renamed from: u */
    public android.view.View f247066u;

    /* renamed from: v */
    public android.widget.Button f247067v;

    /* renamed from: w */
    public android.view.View f247068w;

    /* renamed from: x */
    public android.widget.Button f247069x;

    /* renamed from: x0 */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.t f247070x0;

    /* renamed from: y */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f247071y;

    /* renamed from: z */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.n f247072z;

    public u4(android.content.Context context, ab4.c cVar, android.view.ViewGroup viewGroup) {
        super(context, cVar, viewGroup);
        this.E = true;
        this.K = true;
        java.lang.String str = "";
        this.L = "";
        this.M = "";
        this.N = "";
        this.P = "";
        this.Q = false;
        this.R = "";
        this.S = "";
        this.U = "";
        this.V = "";
        this.W = 2;
        this.X = false;
        this.Y = false;
        this.Z = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.c3(this);
        this.f247065p0 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.d3(this);
        this.f247070x0 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.f3(this);
        int i17 = pu5.i.f440006b;
        android.os.HandlerThread a17 = pu5.f.a("apkStateMachine", 5);
        this.H = a17;
        a17.start();
        this.G = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.s4(this, "apkStateMachine", a17.getLooper());
        if (context instanceof android.app.Activity) {
            boolean booleanExtra = ((android.app.Activity) context).getIntent().getBooleanExtra("sns_landing_pages_auto_download_for_action_btn", false);
            this.f247064J = booleanExtra;
            this.K = true;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdLandingPageDownloadApkBtnComp", "autoDownloadFromActionBtn=" + booleanExtra + ", activity=" + context + ", idx=" + s0().V1 + ", appId=" + s0().B1 + ", wxAppid=" + s0().C1 + ", useGameDownloader=" + s0().F1 + ", pkg=" + s0().H1);
        }
        this.f246919t.a("platform", cVar.J1);
        this.f246919t.b("appid", cVar.B1);
        this.f246919t.b(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56315xfd38653e, cVar.D1);
        this.f246919t.b("pkg", cVar.H1);
        this.f246919t.b("appPageUrlAndroid", cVar.U1);
        try {
            java.lang.String str2 = s0().B1;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            this.L = str2 == null ? "" : str2;
            java.lang.String o17 = u().o();
            this.M = o17 == null ? "" : o17;
            java.lang.String a18 = u().a();
            this.N = a18 == null ? "" : a18;
            this.P = u().k();
            java.lang.String c17 = u().c();
            this.R = c17 == null ? "" : c17;
            java.lang.String q17 = u().q();
            this.S = q17 == null ? "" : q17;
            this.T = u().l();
            java.lang.String m17 = u().m();
            this.U = m17 == null ? "" : m17;
            java.lang.String e17 = u().e();
            if (e17 != null) {
                str = e17;
            }
            this.V = str;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AdLandingPageDownloadApkBtnComp.DownloadToastReport", th6.toString());
        }
        if (s0().f84356m > 0.0f && s0().f84356m != 2.1474836E9f && s0().f84357n > 0.0f && s0().f84357n != 2.1474836E9f) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setAutoSize", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
            this.X = true;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setAutoSize", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        }
        this.Y = za4.k.l();
    }

    public static /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.s4 U(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.u4 u4Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.s4 s4Var = u4Var.G;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        return s4Var;
    }

    public static /* synthetic */ ab4.c V(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.u4 u4Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        ab4.c s07 = u4Var.s0();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        return s07;
    }

    public static /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.C18424x4214e2c1 W(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.u4 u4Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.C18424x4214e2c1 c18424x4214e2c1 = u4Var.F;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$1200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        return c18424x4214e2c1;
    }

    public static /* synthetic */ android.widget.Button X(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.u4 u4Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1300", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        android.widget.Button button = u4Var.f247067v;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$1300", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        return button;
    }

    public static /* synthetic */ boolean Y(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.u4 u4Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1400", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        boolean z17 = u4Var.Q;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$1400", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        return z17;
    }

    public static /* synthetic */ int Z(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.u4 u4Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$2200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        int i17 = u4Var.W;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$2200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        return i17;
    }

    public static /* synthetic */ int a0(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.u4 u4Var, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$2202", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        u4Var.W = i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$2202", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        return i17;
    }

    public static /* synthetic */ java.lang.String b0(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.u4 u4Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$2600", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        java.lang.String str = u4Var.P;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$2600", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        return str;
    }

    public static /* synthetic */ java.lang.String c0(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.u4 u4Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$2700", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        java.lang.String str = u4Var.L;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$2700", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        return str;
    }

    public static /* synthetic */ java.lang.String d0(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.u4 u4Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$2800", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        java.lang.String str = u4Var.M;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$2800", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        return str;
    }

    public static /* synthetic */ java.lang.String e0(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.u4 u4Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$2900", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        java.lang.String str = u4Var.N;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$2900", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        return str;
    }

    public static /* synthetic */ java.lang.String g0(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.u4 u4Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$3000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        java.lang.String str = u4Var.V;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$3000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        return str;
    }

    public static /* synthetic */ int h0(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.u4 u4Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$3100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        int i17 = u4Var.T;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$3100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        return i17;
    }

    public static /* synthetic */ java.lang.String i0(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.u4 u4Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$3200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        java.lang.String str = u4Var.R;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$3200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        return str;
    }

    public static /* synthetic */ java.lang.String j0(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.u4 u4Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$3300", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        java.lang.String str = u4Var.U;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$3300", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        return str;
    }

    public static /* synthetic */ java.lang.String l0(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.u4 u4Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$3400", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        java.lang.String str = u4Var.S;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$3400", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        return str;
    }

    public static boolean m0(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.u4 u4Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$3600", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        u4Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isNeedShowNetworkTip", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        boolean z17 = false;
        try {
            boolean m40093xb9aa8b5f = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(u4Var.f246582d);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isFreeSimCard", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
            boolean m69908x2290b4f1 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e.m69779x9cf0d20b().m69908x2290b4f1();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isFreeSimCard", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdLandingPageDownloadApkBtnComp", "isNeedShowNetworkTip, isWifi=" + m40093xb9aa8b5f + ", isFreeSimCard=" + m69908x2290b4f1);
            if (m40093xb9aa8b5f) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1612, 2);
            } else if (m69908x2290b4f1) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1612, 3);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1612, 4);
            }
            if (!m40093xb9aa8b5f && !m69908x2290b4f1) {
                z17 = true;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isNeedShowNetworkTip", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AdLandingPageDownloadApkBtnComp", "isNeedShowNetworkTip exp=" + th6.toString());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isNeedShowNetworkTip", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$3600", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        return z17;
    }

    public static /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 n0(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.u4 u4Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$4700", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = u4Var.f247071y;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$4700", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        return u3Var;
    }

    public static /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.n o0(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.u4 u4Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$4800", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.n nVar = u4Var.f247072z;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$4800", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        return nVar;
    }

    public static /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.n p0(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.u4 u4Var, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.n nVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$4802", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        u4Var.f247072z = nVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$4802", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        return nVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.a2
    public void K() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("viewWillAppear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        super.K();
        this.G.l(2);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e.m69779x9cf0d20b().m69783x744b3383(s0().B1, new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.j3(this.R, this.U, this.M, this.V, this.T, this.N, this.S, this.W, 4, 2));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("viewWillAppear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.a2
    public void L() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("viewWillDestroy", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        super.L();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdLandingPageDownloadApkBtnComp", "view destroy");
        this.H.quit();
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.t4 t4Var = this.I;
            if (t4Var != null) {
                this.f246582d.unregisterReceiver(t4Var);
                this.I = null;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdLandingPageDownloadApkBtnComp", "viewWillDestroy, unregisterReceiver");
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AdLandingPageDownloadApkBtnComp", "unregister package receiver failed, exp is " + th6);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1958L, 33L, r());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("viewWillDestroy", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.a2
    public void h() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        S(0);
        android.view.View view = this.f246589n;
        this.f247066u = view.findViewById(com.p314xaae8f345.mm.R.id.d48);
        this.f247067v = (android.widget.Button) view.findViewById(com.p314xaae8f345.mm.R.id.f565648d31);
        this.f247068w = view.findViewById(com.p314xaae8f345.mm.R.id.d0v);
        this.f247069x = (android.widget.Button) view.findViewById(com.p314xaae8f345.mm.R.id.b5i);
        android.widget.Button button = this.f247067v;
        android.view.View.OnClickListener onClickListener = this.Z;
        button.setOnClickListener(onClickListener);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.C18424x4214e2c1 c18424x4214e2c1 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.C18424x4214e2c1) view.findViewById(com.p314xaae8f345.mm.R.id.d3u);
        this.F = c18424x4214e2c1;
        c18424x4214e2c1.setProgress(0);
        this.F.setVisibility(8);
        this.F.setOnClickListener(onClickListener);
        this.f247069x.setOnClickListener(this.f247065p0);
        this.G.n();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("report19790", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        try {
            ab4.c s07 = s0();
            if (s07.Y1 > 0) {
                if (da4.a.f(s07.Z1)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.t1.o0(u(), 4, "0", "");
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.t1.o0(u(), 4, "1", "");
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.t1.o0(u(), 1, "1", "");
            }
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AdLandingPageDownloadApkBtnComp", "report19790 has something wrong");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("report19790", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.a2
    public void k() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        q0();
        if (s0().f84363t > 0.0f) {
            android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) this.f247066u.getLayoutParams();
            layoutParams.height = (int) s0().f84363t;
            this.f247066u.setLayoutParams(layoutParams);
        }
        this.f247067v.setText(s0().F);
        android.widget.Button button = this.f247069x;
        android.content.Context context = this.f246582d;
        button.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.j6i));
        this.f247067v.setPadding(0, 0, 0, 0);
        this.f247069x.setPadding(0, 0, 0, 0);
        l44.f4.e(context, s0(), this.f247067v);
        this.G.l(11);
        this.f246589n.getViewTreeObserver().addOnPreDrawListener(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.e3(this));
        if (this.X) {
            android.widget.Button button2 = this.f247067v;
            if (button2 != null) {
                button2.setMaxLines(1);
                p012xc85e97e9.p075x2eaf9f.p079xd1075a44.a0.b(this.f247067v, 1, (int) s0().f84426J, 1, 0);
            }
            android.widget.Button button3 = this.f247069x;
            if (button3 != null) {
                button3.setMaxLines(1);
                p012xc85e97e9.p075x2eaf9f.p079xd1075a44.a0.b(this.f247069x, 1, (int) s0().f84426J, 1, 0);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
    }

    public final void q0() {
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("configDownloadBtnStyles", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        java.util.HashMap hashMap = (java.util.HashMap) t0();
        int parseColor = android.graphics.Color.parseColor((java.lang.String) hashMap.get("fontNormalColor"));
        int parseColor2 = android.graphics.Color.parseColor((java.lang.String) hashMap.get("fontDisableColor"));
        int parseColor3 = android.graphics.Color.parseColor((java.lang.String) hashMap.get("fontPressedColor"));
        int parseColor4 = android.graphics.Color.parseColor((java.lang.String) hashMap.get("NormalColor"));
        int parseColor5 = android.graphics.Color.parseColor((java.lang.String) hashMap.get("PressedColor"));
        int parseColor6 = android.graphics.Color.parseColor((java.lang.String) hashMap.get("DisableColor"));
        int i18 = (int) s0().K;
        int parseColor7 = android.graphics.Color.parseColor((java.lang.String) hashMap.get("borderNormalColor"));
        int parseColor8 = android.graphics.Color.parseColor((java.lang.String) hashMap.get("borderPressedColor"));
        int parseColor9 = android.graphics.Color.parseColor((java.lang.String) hashMap.get("borderDisableColor"));
        int dimensionPixelSize = this.f246582d.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561115y);
        if (s0().Y > 0.0f) {
            dimensionPixelSize = (int) s0().Y;
        }
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        gradientDrawable.setShape(0);
        float f17 = dimensionPixelSize;
        gradientDrawable.setCornerRadius(f17);
        gradientDrawable.setColor(parseColor6);
        gradientDrawable.setStroke(i18, parseColor9);
        android.graphics.drawable.GradientDrawable gradientDrawable2 = new android.graphics.drawable.GradientDrawable();
        gradientDrawable2.setShape(0);
        gradientDrawable2.setCornerRadius(f17);
        gradientDrawable2.setColor(parseColor5);
        gradientDrawable2.setStroke(i18, parseColor8);
        android.graphics.drawable.GradientDrawable gradientDrawable3 = new android.graphics.drawable.GradientDrawable();
        gradientDrawable3.setShape(0);
        gradientDrawable3.setCornerRadius(f17);
        gradientDrawable3.setColor(parseColor4);
        gradientDrawable3.setStroke(i18, parseColor7);
        android.graphics.drawable.StateListDrawable stateListDrawable = new android.graphics.drawable.StateListDrawable();
        stateListDrawable.addState(new int[]{-16842910}, gradientDrawable);
        stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, gradientDrawable2);
        stateListDrawable.addState(new int[]{android.R.attr.state_enabled}, gradientDrawable3);
        this.f247067v.setBackground(stateListDrawable);
        this.f247067v.setTextColor(new android.content.res.ColorStateList(new int[][]{new int[]{-16842910}, new int[]{android.R.attr.state_pressed}, new int[]{android.R.attr.state_enabled}}, new int[]{parseColor2, parseColor3, parseColor}));
        if (s0().f84426J > 0.0f) {
            i17 = 0;
            this.f247067v.setTextSize(0, s0().f84426J);
        } else {
            i17 = 0;
        }
        android.graphics.drawable.GradientDrawable gradientDrawable4 = new android.graphics.drawable.GradientDrawable();
        gradientDrawable4.setShape(i17);
        gradientDrawable4.setCornerRadius(f17);
        gradientDrawable4.setColor(parseColor5);
        gradientDrawable4.setStroke(i18, parseColor8);
        android.graphics.drawable.GradientDrawable gradientDrawable5 = new android.graphics.drawable.GradientDrawable();
        gradientDrawable5.setShape(i17);
        gradientDrawable5.setCornerRadius(f17);
        gradientDrawable5.setColor(parseColor4);
        android.graphics.drawable.ClipDrawable clipDrawable = new android.graphics.drawable.ClipDrawable(gradientDrawable5, 3, 1);
        android.graphics.drawable.GradientDrawable gradientDrawable6 = new android.graphics.drawable.GradientDrawable();
        gradientDrawable6.setShape(i17);
        gradientDrawable6.setCornerRadius(f17);
        gradientDrawable6.setColor(parseColor4);
        android.graphics.drawable.ClipDrawable clipDrawable2 = new android.graphics.drawable.ClipDrawable(gradientDrawable6, 3, 1);
        android.graphics.drawable.Drawable[] drawableArr = new android.graphics.drawable.Drawable[3];
        drawableArr[i17] = gradientDrawable4;
        drawableArr[1] = clipDrawable;
        drawableArr[2] = clipDrawable2;
        android.graphics.drawable.LayerDrawable layerDrawable = new android.graphics.drawable.LayerDrawable(drawableArr);
        layerDrawable.setId(i17, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        this.F.setProgressDrawable(layerDrawable);
        this.F.m71292x4a93d7a7(s0().T1);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("configDownloadBtnStyles", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
    }

    public android.widget.Button r0() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getBtn", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        android.widget.Button button = this.f247067v;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getBtn", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        return button;
    }

    public final ab4.c s0() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        ab4.c cVar = (ab4.c) this.f246583e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        return cVar;
    }

    public final java.util.Map t0() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("presetDownloadBtnStyles", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("fontNormalColor", x0(s0().R1, "#FFFFFF"));
        hashMap.put("fontDisableColor", x0(s0().S1, "#4CFFFFFF"));
        hashMap.put("fontPressedColor", x0(s0().T1, "#99FFFFFF"));
        hashMap.put("NormalColor", x0(s0().L1, "#1AAD19"));
        hashMap.put("PressedColor", x0(s0().N1, "#179B16"));
        hashMap.put("DisableColor", x0(s0().M1, "#661AAD19"));
        hashMap.put("borderNormalColor", x0(s0().O1, "#179E16"));
        hashMap.put("borderPressedColor", x0(s0().Q1, "#158E14"));
        hashMap.put("borderDisableColor", x0(s0().P1, "#00179E16"));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("presetDownloadBtnStyles", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        return hashMap;
    }

    public void u0(boolean z17) {
        java.lang.String str;
        java.lang.String str2;
        android.widget.RelativeLayout.LayoutParams layoutParams;
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resizeDownloadContainerSize", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        this.D = z17;
        if (this.A <= 0 || this.B <= 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resizeDownloadContainerSize", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdLandingPageDownloadApkBtnComp", "resizeDownloadContainerSize, width is " + this.A + ", height is " + this.B + ", needShowCancelBtn is " + this.D);
        android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) this.f247066u.getLayoutParams();
        if (this.D) {
            layoutParams2.width = this.A / 2;
            layoutParams2.height = this.B;
            this.f247066u.setLayoutParams(layoutParams2);
            android.widget.RelativeLayout.LayoutParams layoutParams3 = (android.widget.RelativeLayout.LayoutParams) this.f247069x.getLayoutParams();
            layoutParams3.width = this.A / 2;
            layoutParams3.height = this.B;
            this.f247069x.setLayoutParams(layoutParams3);
            this.f247069x.setVisibility(0);
            this.F.m71293x3abfd950(i65.a.c(this.f246582d, this.C));
        } else {
            this.f247069x.setVisibility(8);
            layoutParams2.width = this.A;
            layoutParams2.height = this.B;
            this.f247066u.setLayoutParams(layoutParams2);
            this.F.m71293x3abfd950(i65.a.c(this.f246582d, 18));
        }
        if (this.E) {
            boolean z18 = this.D;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("configDownloadBtnStyles", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
            java.util.HashMap hashMap = (java.util.HashMap) t0();
            int parseColor = android.graphics.Color.parseColor((java.lang.String) hashMap.get("fontNormalColor"));
            int parseColor2 = android.graphics.Color.parseColor((java.lang.String) hashMap.get("fontDisableColor"));
            int parseColor3 = android.graphics.Color.parseColor((java.lang.String) hashMap.get("fontPressedColor"));
            int parseColor4 = android.graphics.Color.parseColor((java.lang.String) hashMap.get("NormalColor"));
            int parseColor5 = android.graphics.Color.parseColor((java.lang.String) hashMap.get("PressedColor"));
            int parseColor6 = android.graphics.Color.parseColor((java.lang.String) hashMap.get("DisableColor"));
            int i18 = (int) s0().K;
            int parseColor7 = android.graphics.Color.parseColor((java.lang.String) hashMap.get("borderNormalColor"));
            int parseColor8 = android.graphics.Color.parseColor((java.lang.String) hashMap.get("borderPressedColor"));
            str = "resizeDownloadContainerSize";
            int parseColor9 = android.graphics.Color.parseColor((java.lang.String) hashMap.get("borderDisableColor"));
            layoutParams = layoutParams2;
            int dimensionPixelSize = this.f246582d.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561115y);
            if (s0().Y > 0.0f) {
                dimensionPixelSize = (int) s0().Y;
            }
            float f17 = dimensionPixelSize;
            float[] fArr = {f17, f17, 0.0f, 0.0f, 0.0f, 0.0f, f17, f17};
            if (z18) {
                android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setColor(parseColor6);
                gradientDrawable.setCornerRadii(fArr);
                android.graphics.drawable.GradientDrawable gradientDrawable2 = new android.graphics.drawable.GradientDrawable();
                gradientDrawable2.setShape(0);
                gradientDrawable2.setColor(parseColor5);
                gradientDrawable2.setCornerRadii(fArr);
                android.graphics.drawable.GradientDrawable gradientDrawable3 = new android.graphics.drawable.GradientDrawable();
                gradientDrawable3.setShape(0);
                gradientDrawable3.setColor(parseColor4);
                gradientDrawable3.setCornerRadii(fArr);
                android.graphics.drawable.StateListDrawable stateListDrawable = new android.graphics.drawable.StateListDrawable();
                stateListDrawable.addState(new int[]{-16842910}, gradientDrawable);
                stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, gradientDrawable2);
                stateListDrawable.addState(new int[]{android.R.attr.state_enabled}, gradientDrawable3);
                this.f247067v.setBackground(stateListDrawable);
                android.graphics.drawable.GradientDrawable gradientDrawable4 = new android.graphics.drawable.GradientDrawable();
                gradientDrawable4.setShape(0);
                gradientDrawable4.setColor(parseColor6);
                gradientDrawable4.setCornerRadius(f17);
                gradientDrawable4.setStroke(i18, parseColor9);
                android.graphics.drawable.GradientDrawable gradientDrawable5 = new android.graphics.drawable.GradientDrawable();
                gradientDrawable5.setShape(0);
                gradientDrawable5.setColor(parseColor5);
                gradientDrawable5.setCornerRadius(f17);
                gradientDrawable5.setStroke(i18, parseColor8);
                android.graphics.drawable.GradientDrawable gradientDrawable6 = new android.graphics.drawable.GradientDrawable();
                gradientDrawable6.setShape(0);
                gradientDrawable6.setColor(parseColor4);
                gradientDrawable6.setCornerRadius(f17);
                gradientDrawable6.setStroke(i18, parseColor7);
                android.graphics.drawable.StateListDrawable stateListDrawable2 = new android.graphics.drawable.StateListDrawable();
                stateListDrawable2.addState(new int[]{-16842910}, gradientDrawable4);
                stateListDrawable2.addState(new int[]{android.R.attr.state_pressed}, gradientDrawable5);
                stateListDrawable2.addState(new int[]{android.R.attr.state_enabled}, gradientDrawable6);
                this.f246589n.setBackground(stateListDrawable2);
                int[] iArr = {parseColor2, parseColor3, parseColor};
                int[][] iArr2 = {new int[]{-16842910}, new int[]{android.R.attr.state_pressed}, new int[]{android.R.attr.state_enabled}};
                this.f247067v.setTextColor(new android.content.res.ColorStateList(iArr2, iArr));
                android.content.res.ColorStateList colorStateList = new android.content.res.ColorStateList(iArr2, iArr);
                str2 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp";
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setCancelBtnStyles", str2);
                float[] fArr2 = {0.0f, 0.0f, f17, f17, f17, f17, 0.0f, 0.0f};
                android.graphics.drawable.GradientDrawable gradientDrawable7 = new android.graphics.drawable.GradientDrawable();
                gradientDrawable7.setShape(0);
                gradientDrawable7.setColor(parseColor6);
                gradientDrawable7.setCornerRadii(fArr2);
                android.graphics.drawable.GradientDrawable gradientDrawable8 = new android.graphics.drawable.GradientDrawable();
                gradientDrawable8.setShape(0);
                gradientDrawable8.setColor(parseColor5);
                gradientDrawable8.setCornerRadii(fArr2);
                android.graphics.drawable.GradientDrawable gradientDrawable9 = new android.graphics.drawable.GradientDrawable();
                gradientDrawable9.setShape(0);
                gradientDrawable9.setColor(parseColor4);
                gradientDrawable9.setCornerRadii(fArr2);
                android.graphics.drawable.StateListDrawable stateListDrawable3 = new android.graphics.drawable.StateListDrawable();
                stateListDrawable3.addState(new int[]{-16842910}, gradientDrawable7);
                stateListDrawable3.addState(new int[]{android.R.attr.state_pressed}, gradientDrawable8);
                stateListDrawable3.addState(new int[]{android.R.attr.state_enabled}, gradientDrawable9);
                this.f247069x.setBackground(stateListDrawable3);
                this.f247069x.setTextColor(colorStateList);
                if (s0().f84426J > 0.0f) {
                    this.f247069x.setTextSize(0, s0().f84426J);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setCancelBtnStyles", str2);
                android.graphics.drawable.GradientDrawable gradientDrawable10 = new android.graphics.drawable.GradientDrawable();
                gradientDrawable10.setColor(parseColor);
                this.f247068w.setBackground(gradientDrawable10);
                android.view.View view = this.f247068w;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageDownloadApkBtnComp", "configDownloadBtnStyles", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageDownloadApkBtnComp", "configDownloadBtnStyles", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                if (s0().f84426J > 0.0f) {
                    i17 = 0;
                    this.f247067v.setTextSize(0, s0().f84426J);
                } else {
                    i17 = 0;
                }
                android.graphics.drawable.GradientDrawable gradientDrawable11 = new android.graphics.drawable.GradientDrawable();
                gradientDrawable11.setShape(i17);
                gradientDrawable11.setCornerRadii(fArr);
                gradientDrawable11.setColor(parseColor5);
                android.graphics.drawable.GradientDrawable gradientDrawable12 = new android.graphics.drawable.GradientDrawable();
                gradientDrawable12.setShape(i17);
                gradientDrawable12.setCornerRadii(fArr);
                gradientDrawable12.setColor(parseColor4);
                android.graphics.drawable.ClipDrawable clipDrawable = new android.graphics.drawable.ClipDrawable(gradientDrawable12, 3, 1);
                android.graphics.drawable.GradientDrawable gradientDrawable13 = new android.graphics.drawable.GradientDrawable();
                gradientDrawable13.setShape(i17);
                gradientDrawable13.setCornerRadii(fArr);
                gradientDrawable13.setColor(parseColor4);
                android.graphics.drawable.ClipDrawable clipDrawable2 = new android.graphics.drawable.ClipDrawable(gradientDrawable13, 3, 1);
                android.graphics.drawable.Drawable[] drawableArr = new android.graphics.drawable.Drawable[3];
                drawableArr[i17] = gradientDrawable11;
                drawableArr[1] = clipDrawable;
                drawableArr[2] = clipDrawable2;
                android.graphics.drawable.LayerDrawable layerDrawable = new android.graphics.drawable.LayerDrawable(drawableArr);
                layerDrawable.setId(i17, android.R.id.background);
                layerDrawable.setId(1, android.R.id.secondaryProgress);
                layerDrawable.setId(2, android.R.id.progress);
                this.F.setProgressDrawable(layerDrawable);
                this.F.m71292x4a93d7a7(s0().T1);
            } else {
                str2 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp";
                this.f246589n.setBackgroundColor(0);
                android.view.View view2 = this.f247068w;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageDownloadApkBtnComp", "configDownloadBtnStyles", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageDownloadApkBtnComp", "configDownloadBtnStyles", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                q0();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("configDownloadBtnStyles", str2);
        } else {
            str = "resizeDownloadContainerSize";
            str2 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp";
            layoutParams = layoutParams2;
        }
        android.content.Context context = this.f246582d;
        ab4.c s07 = s0();
        android.widget.Button button = this.f247067v;
        int i19 = layoutParams.width;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateBtnIcon", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper");
        if (l44.f4.b(context, s07, button)) {
            if (i19 > 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateBtnIconLogic", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper");
                java.lang.String l17 = za4.t0.l("adId", s07.Z);
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(l17) || !com.p314xaae8f345.mm.vfs.w6.j(l17)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("loadImage", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper");
                    java.lang.String str3 = s07.Z;
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("loadImage", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper");
                    } else {
                        button.hashCode();
                        button.setTag(com.p314xaae8f345.mm.R.id.n1z, str3);
                        za4.t0.b("adId", str3, false, 41, 0, new l44.c4(button, str3, context, s07, i19));
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("loadImage", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper");
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateBtnIconLogic", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper");
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BtnIconUpdateHelper", "icon exists, url = " + s07.Z);
                    l44.f4.d(context, s07, button, l17, i19);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateBtnIconLogic", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper");
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateBtnIcon", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateBtnIcon", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str, str2);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.a2
    public int v() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        if (this.X) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
            return com.p314xaae8f345.mm.R.C30864xbddafb2a.cor;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.coq;
    }

    public void w0() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showApkDownloadBottomSheet", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1958, 90);
        ca4.c0.f(this.P, this.L, 0, 11, this.M, this.N, 1, 1);
        ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.i3(this));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showApkDownloadBottomSheet", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
    }

    public final java.lang.String x0(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("validColorDefaultAs", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("validColorDefaultAs", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
            return str2;
        }
        if (!str.matches("#[0-9A-Fa-f]{6}([0-9A-Fa-f]{2})?")) {
            str = str2;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("validColorDefaultAs", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        return str;
    }
}
