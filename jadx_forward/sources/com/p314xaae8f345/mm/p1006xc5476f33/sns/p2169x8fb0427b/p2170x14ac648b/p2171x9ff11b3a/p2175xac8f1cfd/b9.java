package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd;

/* loaded from: classes4.dex */
public class b9 extends com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.j8 implements com.p314xaae8f345.mm.p2470x93e71c27.ui.b1, m34.e, android.view.View.OnTouchListener, android.view.GestureDetector.OnGestureListener, android.view.GestureDetector.OnDoubleTapListener, android.view.View.OnClickListener, com.p314xaae8f345.mm.p2470x93e71c27.ui.d1 {
    public android.widget.ImageView A;
    public volatile boolean A1;
    public android.widget.ProgressBar B;
    public volatile int B1;
    public boolean C;
    public int C1;
    public android.view.View D;
    public int D1;
    public android.widget.ImageView E;
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.a9 E1;
    public final android.content.Context F;
    public long F1;
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 G;
    public long G1;
    public final java.lang.Runnable H;
    public int H1;
    public boolean I;
    public android.view.View I1;

    /* renamed from: J, reason: collision with root package name */
    public boolean f246626J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean P;
    public int Q;
    public long R;
    public int S;
    public int T;
    public int U;
    public int V;
    public int W;
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.da X;
    public final android.view.View.OnClickListener Y;
    public final android.view.View.OnClickListener Z;

    /* renamed from: l1, reason: collision with root package name */
    public android.view.View f246627l1;

    /* renamed from: p0, reason: collision with root package name */
    public final android.view.View.OnClickListener f246628p0;

    /* renamed from: p1, reason: collision with root package name */
    public int f246629p1;

    /* renamed from: x, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.p2177xd1075a44.C17921x3d04160c f246630x;

    /* renamed from: x0, reason: collision with root package name */
    public final android.view.View.OnClickListener f246631x0;

    /* renamed from: x1, reason: collision with root package name */
    public final android.view.GestureDetector f246632x1;

    /* renamed from: y, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19744xe1ab67bf f246633y;

    /* renamed from: y0, reason: collision with root package name */
    public android.widget.ImageView f246634y0;

    /* renamed from: y1, reason: collision with root package name */
    public final java.lang.Runnable f246635y1;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.ImageView f246636z;

    /* renamed from: z1, reason: collision with root package name */
    public volatile boolean f246637z1;

    public b9(android.content.Context context, ab4.u0 u0Var, android.view.ViewGroup viewGroup) {
        super(context, u0Var, viewGroup);
        this.I = false;
        this.f246626J = true;
        this.K = true;
        this.L = false;
        this.M = true;
        this.N = false;
        this.P = false;
        this.Q = 0;
        this.R = 0L;
        this.S = 0;
        this.T = 0;
        this.U = 0;
        this.V = 0;
        this.W = 0;
        this.X = null;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createProgressClickListener", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.u8 u8Var = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.u8(this);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createProgressClickListener", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        this.Y = u8Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createVoiceTypeClickListener", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.v8 v8Var = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.v8(this);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createVoiceTypeClickListener", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        this.Z = v8Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createVideoStatusClickListener", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.x8 x8Var = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.x8(this);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createVideoStatusClickListener", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        this.f246628p0 = x8Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createVideoViewClickListener", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.y8 y8Var = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.y8(this);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createVideoViewClickListener", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        this.f246631x0 = y8Var;
        this.f246637z1 = false;
        this.A1 = false;
        this.B1 = 0;
        this.C1 = 0;
        this.D1 = 0;
        this.F1 = 0L;
        this.F = context;
        this.G = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());
        try {
            this.f246632x1 = new android.view.GestureDetector(this);
            this.f246635y1 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.o8(this);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1720, 5);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Sns.AdLandingPageStreamVideoPlayerComponent.VideoOptimize", th6.toString());
        }
        this.H = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.p8(this);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.q8 q8Var = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.q8(this, context);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setAdLandingPageStreamVideoComponentEvent", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        this.X = q8Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setAdLandingPageStreamVideoComponentEvent", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
    }

    public static /* synthetic */ void X(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.b9 b9Var, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        b9Var.h0(z17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
    }

    public static /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.p2177xd1075a44.C17921x3d04160c Y(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.b9 b9Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$2100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.p2177xd1075a44.C17921x3d04160c c17921x3d04160c = b9Var.f246630x;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$2100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        return c17921x3d04160c;
    }

    public static /* synthetic */ android.view.View Z(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.b9 b9Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$2500", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        android.view.View view = b9Var.I1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$2500", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        return view;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.a2
    public void B() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("restoreToOriginState", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        super.B();
        e0(false);
        java.lang.String l17 = za4.t0.l("adId", c0().f7x1fdb0dbb);
        if (com.p314xaae8f345.mm.vfs.w6.j(l17)) {
            this.A.setImageBitmap(com.p314xaae8f345.mm.sdk.p2603x2137b148.x.J(l17, null));
            this.A.setVisibility(0);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("restoreToOriginState", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.a2
    public boolean D(org.json.JSONObject jSONObject) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setComponentKVReportData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        if (!super.D(jSONObject)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setComponentKVReportData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
            return false;
        }
        try {
            jSONObject.put("streamVideoDuraion", this.f246630x.mo61527x6d590e18() * 1000);
            jSONObject.put("playTimeInterval", this.S);
            jSONObject.put("playCount", this.T);
            jSONObject.put("playCompletedCount", this.U);
            jSONObject.put("clickFullscreenBtnCount", this.D1);
            jSONObject.put("doubleClickCount", this.C1);
            jSONObject.put("clickPlayControlCount", this.V);
            jSONObject.put("clickVoiceControlCount", this.W);
            jSONObject.put("isAutoPlay", this.N ? "1" : "0");
            java.lang.String a17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(c0().f7x1fdb0dbb);
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("urlMd5", a17);
            jSONObject2.put("needDownload", 1);
            jSONObject.put("thumbUrlInfo", jSONObject2);
            java.lang.String a18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(c0().F);
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            jSONObject3.put("urlMd5", a18);
            jSONObject3.put("needDownload", 1);
            jSONObject.put("streamVideoUrlInfo", jSONObject3);
            if (this.E1 != null) {
                org.json.JSONObject jSONObject4 = new org.json.JSONObject();
                jSONObject4.put("cid", this.E1.f246604d);
                jSONObject4.put(dm.n.f67499xab3e7a9, this.E1.f246605e);
                jSONObject4.put("stayTime", this.E1.f246606f);
                jSONObject4.put("clickCount", this.E1.f246607g);
                org.json.JSONObject jSONObject5 = new org.json.JSONObject();
                jSONObject5.put(dm.n.f67499xab3e7a9, this.E1.f246601a);
                jSONObject5.put("stayTime", this.E1.f246602b);
                jSONObject5.put("clickCount", this.E1.f246603c);
                jSONObject5.put("btnInfo", jSONObject4);
                jSONObject.put("fullVideoFloatBarInfo", jSONObject5);
            }
            l44.r3.a(62, u(), w(), this.S, "MicroMsg.Sns.AdLandingPageStreamVideoPlayerComponent");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setComponentKVReportData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
            return true;
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Sns.AdLandingPageStreamVideoPlayerComponent", e17, "", new java.lang.Object[0]);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setComponentKVReportData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
            return false;
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void E(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onVideoEnded", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sns.AdLandingPageStreamVideoPlayerComponent", "onVideoEnded");
        this.U++;
        h0(true);
        this.f246630x.m();
        if (this.R != 0) {
            this.S = (int) (this.S + (java.lang.System.currentTimeMillis() - this.R));
            this.R = 0L;
        }
        this.Q = 5;
        this.f246630x.e();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onVideoEnded", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void I(java.lang.String str, java.lang.String str2, int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onGetVideoSize", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onGetVideoSize", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
    }

    @Override // ab4.b, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.a2
    public void J() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("viewAppeared", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        super.J();
        int t17 = t();
        int height = x().getHeight();
        if (t17 == 0 || height == 0) {
            this.f246630x.m70217x9b0eccbe(true);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("viewAppeared", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
            return;
        }
        if (t17 < 0) {
            this.f246630x.m70217x9b0eccbe(true);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("viewAppeared", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
            return;
        }
        if (t17 < height * 0.5f) {
            this.M = false;
            this.L = false;
            this.f246630x.m70217x9b0eccbe(true);
            e0(false);
            if (this.Q == 1) {
                this.Q = 2;
            }
        } else {
            if (this.L && !this.M) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("viewAppeared", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
                return;
            }
            this.f246630x.m70217x9b0eccbe(false);
            this.M = false;
            this.L = true;
            if (this.Q == 6) {
                if (this.f246637z1) {
                    this.Q = 1;
                    if (this.E.getVisibility() == 0) {
                        this.E.setVisibility(8);
                    }
                } else {
                    this.Q = 4;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("viewAppeared", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
                return;
            }
            this.A.setVisibility(0);
            boolean z17 = this.K;
            if (!z17 || (z17 && d0())) {
                h0(true);
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.m8(this), 3000L);
            }
            if (this.K) {
                if (!d0()) {
                    this.E.setVisibility(0);
                    this.N = false;
                    this.K = false;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("viewAppeared", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
                    return;
                }
                this.N = true;
                this.K = false;
            }
            int i17 = this.Q;
            if (i17 == 0) {
                if (d0()) {
                    if (this.f246626J) {
                        P();
                    } else {
                        U();
                    }
                    this.Q = 1;
                    j0();
                }
            } else if (i17 == 2) {
                if (this.f246626J) {
                    P();
                } else {
                    U();
                }
                j0();
                this.Q = 1;
            } else if (i17 == 3) {
                if (this.f246626J) {
                    P();
                } else {
                    U();
                }
                j0();
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("viewAppeared", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
    }

    @Override // ab4.b, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.a2
    public void K() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("viewWillAppear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        super.K();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("viewWillAppear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
    }

    @Override // ab4.b, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.a2
    public void L() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("viewWillDestroy", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        super.L();
        try {
            this.f246630x.m();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.G;
            n3Var.mo50300x3fa464aa(this.H);
            n3Var.mo50300x3fa464aa(this.f246635y1);
            b0();
            ca4.e0.a("landing_page_video_comp_loading_time", java.lang.String.valueOf(this.H1), 1, 0, "");
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Sns.AdLandingPageStreamVideoPlayerComponent.VideoOptimize", th6.toString());
        }
        this.f246630x.d();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("viewWillDestroy", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
    }

    @Override // ab4.b, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.a2
    public void M() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("viewWillDisappear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        super.M();
        this.f246630x.m70217x9b0eccbe(true);
        e0(false);
        if (!this.L && !this.M) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("viewWillDisappear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
            return;
        }
        this.M = false;
        this.L = false;
        if (this.Q == 1) {
            this.Q = 2;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("viewWillDisappear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void N(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onError", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Sns.AdLandingPageStreamVideoPlayerComponent", "online play error, %s", str3);
        this.P = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(fe1.t.f69748x366c91de, 17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onError", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void N5(java.lang.String str, java.lang.String str2, java.lang.Boolean bool) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onVideoWaiting", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        this.A1 = true;
        this.G1 = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sns.AdLandingPageStreamVideoPlayerComponent", "mediaId = " + str2 + ", start loading");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onVideoWaiting", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
    }

    @Override // ab4.b
    public void P() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("closeVoice", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("closeVoice", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AbsVideoPlayComp");
        this.f84342s = false;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("closeVoice", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AbsVideoPlayComp");
        android.widget.ImageView imageView = this.f246636z;
        if (imageView != null) {
            imageView.setImageDrawable(i65.a.i(this.F, com.p314xaae8f345.mm.R.raw.f79602xd1416a50));
        }
        this.f246630x.mo61536x764d819b(true);
        this.f246626J = true;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("closeVoice", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
    }

    @Override // ab4.b
    public void U() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("openVoice", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        if (T()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("openVoice", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("openVoice", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AbsVideoPlayComp");
        this.f84342s = true;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("openVoice", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AbsVideoPlayComp");
        android.widget.ImageView imageView = this.f246636z;
        if (imageView != null) {
            imageView.setImageDrawable(i65.a.i(this.F, com.p314xaae8f345.mm.R.raw.f79603x5954b0de));
        }
        this.f246630x.mo61536x764d819b(false);
        this.f246626J = false;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("openVoice", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
    }

    @Override // ab4.b
    public void V() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("pauseVideo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        e0(false);
        this.Q = 4;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("pauseVideo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
    }

    @Override // ab4.b
    public void W() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resumeVideo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        this.Q = 3;
        j0();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resumeVideo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
    }

    @Override // m34.e
    public void a(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onSeekTo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sns.AdLandingPageStreamVideoPlayerComponent", "onSeek time " + i17);
        this.B1 = i17;
        if (this.f246626J) {
            P();
        } else {
            O();
            U();
        }
        this.G.mo50300x3fa464aa(this.f246635y1);
        android.view.View view = this.f246627l1;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageStreamVideoPlayerComponent", "onSeekTo", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageStreamVideoPlayerComponent", "onSeekTo", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        g0(i17, true);
        this.Q = 3;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSeekTo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
    }

    public final void a0(java.lang.Runnable runnable) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("after4sInvisibleComp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.G;
        try {
            n3Var.mo50300x3fa464aa(runnable);
            n3Var.mo50297x7c4d7ca2(runnable, 4000L);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Sns.AdLandingPageStreamVideoPlayerComponent.VideoOptimize", th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("after4sInvisibleComp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
    }

    @Override // m34.e
    public void b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onSeekPre", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        this.I = true;
        a0(this.H);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSeekPre", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
    }

    public final void b0() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("calcVideoLoadingTime", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        if (this.G1 != 0) {
            this.H1 = (int) (this.H1 + (java.lang.System.currentTimeMillis() - this.G1));
            this.G1 = 0L;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("calcVideoLoadingTime", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.d1
    public void c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onLoopCompletion", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sns.AdLandingPageStreamVideoPlayerComponent", "onLoopCompletion");
        this.U++;
        u54.a aVar = this.f84344u;
        if (aVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("recordVideoCompletion", "com.tencent.mm.plugin.sns.ad.landingpage.helper.video.VideoCompletionMessageHelper");
            aVar.f506347a = true;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("recordVideoCompletion", "com.tencent.mm.plugin.sns.ad.landingpage.helper.video.VideoCompletionMessageHelper");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onLoopCompletion", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
    }

    public final ab4.u0 c0() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        ab4.u0 u0Var = (ab4.u0) this.f246583e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        return u0Var;
    }

    @Override // m34.e
    public void d(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onSeeking", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSeeking", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
    }

    public final boolean d0() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("needAutoPlay", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isWifi", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        boolean m40093xb9aa8b5f = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isWifi", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        boolean z17 = m40093xb9aa8b5f || c0().K;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("needAutoPlay", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        return z17;
    }

    public final void e0(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("pausePlay", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        this.G.mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.l8(this, z17));
        if (this.R != 0) {
            this.S = (int) (this.S + (java.lang.System.currentTimeMillis() - this.R));
            this.R = 0L;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("pausePlay", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
    }

    public final void g0(int i17, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("seekTo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        if (this.f246630x != null) {
            this.E.setVisibility(8);
            if (this.A.getVisibility() == 0) {
                this.B.setVisibility(0);
            }
            this.f246630x.a(i17, z17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("seekTo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(29:1|(2:3|(27:5|6|(1:8)(5:76|(1:93)(1:84)|85|(1:92)(1:90)|91)|9|(3:11|(1:13)(1:15)|14)|16|(1:20)|21|(5:23|24|25|(1:27)|28)(2:73|(1:75))|29|30|31|(3:33|(1:35)|36)|38|39|40|(1:42)|43|(1:47)|48|(3:50|(1:52)(1:54)|53)|55|56|57|58|59|60))(1:95)|94|6|(0)(0)|9|(0)|16|(2:18|20)|21|(0)(0)|29|30|31|(0)|38|39|40|(0)|43|(2:45|47)|48|(0)|55|56|57|58|59|60) */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x04a5, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x04a6, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Sns.AdLandingPageStreamVideoPlayerComponent.VideoOptimize", r0.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0440, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0441, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Sns.AdLandingPageStreamVideoPlayerComponent.VideoOptimize", r0.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x03b3, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x03b4, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Sns.AdLandingPageStreamVideoPlayerComponent.VideoOptimize", r0.toString());
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x036d A[Catch: all -> 0x03b3, TryCatch #2 {all -> 0x03b3, blocks: (B:31:0x035c, B:33:0x036d, B:35:0x0380, B:36:0x0387), top: B:30:0x035c }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x03d9 A[Catch: all -> 0x0440, TryCatch #0 {all -> 0x0440, blocks: (B:40:0x03c4, B:42:0x03d9, B:43:0x03e0, B:45:0x03ea, B:48:0x03f1, B:50:0x042b, B:53:0x0436, B:55:0x0439), top: B:39:0x03c4 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x042b A[Catch: all -> 0x0440, TryCatch #0 {all -> 0x0440, blocks: (B:40:0x03c4, B:42:0x03d9, B:43:0x03e0, B:45:0x03ea, B:48:0x03f1, B:50:0x042b, B:53:0x0436, B:55:0x0439), top: B:39:0x03c4 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00f6  */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.a2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h() {
        /*
            Method dump skipped, instructions count: 1204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.b9.h():void");
    }

    public final void h0(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setFocus", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        java.lang.Runnable runnable = this.H;
        if (z17) {
            this.f246633y.setVisibility(0);
            android.widget.ImageView imageView = this.f246636z;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            android.view.View view = this.D;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageStreamVideoPlayerComponent", "setFocus", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageStreamVideoPlayerComponent", "setFocus", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.ImageView imageView2 = this.f246634y0;
            if (imageView2 != null) {
                imageView2.setVisibility(0);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.da daVar = this.X;
            if (daVar != null) {
                daVar.a(true);
            }
            a0(runnable);
        } else {
            this.I = false;
            this.f246633y.setVisibility(4);
            android.widget.ImageView imageView3 = this.f246636z;
            if (imageView3 != null) {
                imageView3.setVisibility(8);
            }
            android.view.View view2 = this.D;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(4);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageStreamVideoPlayerComponent", "setFocus", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageStreamVideoPlayerComponent", "setFocus", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.ImageView imageView4 = this.f246634y0;
            if (imageView4 != null) {
                imageView4.setVisibility(8);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.da daVar2 = this.X;
            if (daVar2 != null) {
                daVar2.a(false);
            }
            this.G.mo50300x3fa464aa(runnable);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setFocus", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void i(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onVideoPause", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onVideoPause", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
    }

    public void i0(int i17, boolean z17, boolean z18, int i18, int i19, int i27, int i28, int i29, long j17, boolean z19, int i37, java.lang.String str, long j18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setNonFullScreenVideoPlay", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        try {
            this.f246630x.m70217x9b0eccbe(false);
            this.Q = 6;
            this.F1 += j18;
            this.f246637z1 = z18;
            this.D1++;
            this.V += i18;
            this.C1 += i19;
            this.W += i27;
            this.U += i28;
            this.T += i29;
            this.S = (int) (this.S + j17);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                l0(str);
            }
            if (z18) {
                this.R = java.lang.System.currentTimeMillis();
            }
            this.G.mo50300x3fa464aa(this.f246635y1);
            android.view.View view = this.f246627l1;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageStreamVideoPlayerComponent", "setNonFullScreenVideoPlay", "(IZZIIIIIJZILjava/lang/String;J)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageStreamVideoPlayerComponent", "setNonFullScreenVideoPlay", "(IZZIIIIIJZILjava/lang/String;J)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("VideoFullScreenActivity", "currPosSec = " + i17 + ", isPlaying = " + z18 + ", bNoVoice = " + z17);
            if (z19) {
                if (i37 != this.f246630x.mo61527x6d590e18() && i37 >= 0) {
                    this.f246633y.a(this.f246630x.mo48226x8a3f46d8());
                    this.f246630x.a(r0.mo48226x8a3f46d8(), true);
                    this.R = java.lang.System.currentTimeMillis();
                    m0(true);
                }
                this.f246633y.a(0);
                this.f246630x.a(0.0d, true);
                this.R = java.lang.System.currentTimeMillis();
                m0(true);
            } else {
                if (i17 != this.f246630x.mo61527x6d590e18() && i17 >= 0) {
                    this.f246633y.a(i17);
                    this.f246630x.a(i17, z18);
                    m0(z18);
                }
                this.f246633y.a(0);
                this.f246630x.a(0.0d, z18);
                m0(z18);
            }
            if (z17) {
                P();
            } else {
                U();
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("VideoFullScreenActivity", th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setNonFullScreenVideoPlay", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
    }

    @Override // ab4.b
    /* renamed from: isPlaying */
    public boolean mo1022xc00617a4() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isPlaying", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        boolean mo61531xc00617a4 = this.f246630x.mo61531xc00617a4();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isPlaying", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        return mo61531xc00617a4;
    }

    public final void j0() {
        android.content.Context context = this.F;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startPlay", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sns.AdLandingPageStreamVideoPlayerComponent", "starting play, downFailed=" + this.P);
        if (!this.P) {
            this.G.mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.k8(this));
            this.R = java.lang.System.currentTimeMillis();
            this.T++;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startPlay", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Sns.AdLandingPageStreamVideoPlayerComponent", "last download fail ,try again");
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19744xe1ab67bf c19744xe1ab67bf = this.f246633y;
        if (c19744xe1ab67bf != null && c19744xe1ab67bf.getParent() != null) {
            ((android.view.ViewGroup) this.f246633y.getParent()).removeView(this.f246633y);
        }
        this.f246630x.m70215xec596ddd(false);
        this.f246630x.h(false, c0().F, 0);
        try {
            int i17 = this.f246591p;
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19744xe1ab67bf c19744xe1ab67bf2 = this.f246633y;
            if (c19744xe1ab67bf2 != null && c19744xe1ab67bf2.getParent() != null) {
                ((android.view.ViewGroup) this.f246633y.getParent()).removeView(this.f246633y);
            }
            int b17 = i65.a.b(context, 75);
            if (S() && T()) {
                b17 = 0;
            }
            android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(i17 - b17, -2);
            layoutParams.addRule(12);
            layoutParams.bottomMargin = i65.a.b(context, 3);
            this.f246633y.setLayoutParams(layoutParams);
            ((android.view.ViewGroup) this.f246589n.findViewById(com.p314xaae8f345.mm.R.id.chq)).addView(this.f246633y, layoutParams);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Sns.AdLandingPageStreamVideoPlayerComponent", "startPlay exp=" + com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
        }
        g0(0, true);
        this.f246630x.k();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startPlay", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.a2
    public void k() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void l(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onVideoPlay", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Sns.AdLandingPageStreamVideoPlayerComponent", "the onVideoPlay is called!");
        u54.a aVar = this.f84344u;
        if (aVar != null) {
            aVar.a();
        }
        this.A.setVisibility(8);
        this.B.setVisibility(8);
        try {
            this.G.mo50300x3fa464aa(this.f246635y1);
            android.view.View view = this.f246627l1;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageStreamVideoPlayerComponent", "onVideoPlay", "(Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageStreamVideoPlayerComponent", "onVideoPlay", "(Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            m0(true);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Sns.AdLandingPageStreamVideoPlayerComponent.VideoOptimize", th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onVideoPlay", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
    }

    public final void l0(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateFullScreenFloatBarInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            if (this.E1 == null) {
                this.E1 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.a9();
            }
            this.E1.f246601a += jSONObject.optInt(dm.n.f67499xab3e7a9);
            this.E1.f246602b += jSONObject.optLong("stayTime");
            this.E1.f246603c += jSONObject.optInt("clickCount");
            org.json.JSONObject optJSONObject = jSONObject.optJSONObject("btnInfo");
            this.E1.f246604d = optJSONObject.optString("cid");
            this.E1.f246605e += optJSONObject.optInt(dm.n.f67499xab3e7a9);
            this.E1.f246606f += optJSONObject.optLong("stayTime");
            this.E1.f246607g += optJSONObject.optInt("clickCount");
        } catch (java.lang.Throwable th6) {
            this.E1 = null;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Sns.AdLandingPageStreamVideoPlayerComponent", th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateFullScreenFloatBarInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
    }

    public final void m0(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("useNewUIToProgressBar", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        try {
            this.f246633y.mo61296x11f3be80(z17);
            this.f246633y.m75824x20617a52().getLayoutParams().width = this.f246629p1;
            this.f246633y.m75824x20617a52().getLayoutParams().height = this.f246629p1;
            android.content.Context context = this.F;
            if (z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sns.AdLandingPageStreamVideoPlayerComponent.VideoOptimize", "startPlay");
                this.f246633y.m75824x20617a52().setImageDrawable(i65.a.i(context, com.p314xaae8f345.mm.R.raw.f80595xfe9eb87));
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sns.AdLandingPageStreamVideoPlayerComponent.VideoOptimize", "pausePlay");
                this.f246633y.m75824x20617a52().setImageDrawable(i65.a.i(context, com.p314xaae8f345.mm.R.raw.f80594xed5384c7));
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Sns.AdLandingPageStreamVideoPlayerComponent.VideoOptimize", th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("useNewUIToProgressBar", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void m2(java.lang.String str, java.lang.String str2, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onVideoWaitingEnd", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        this.A1 = false;
        this.B1 = 0;
        b0();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sns.AdLandingPageStreamVideoPlayerComponent", "mediaId = " + str2 + ", end loading");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onVideoWaitingEnd", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void o(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPrepared", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        this.P = false;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPrepared", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageStreamVideoPlayerComponent", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getId() == com.p314xaae8f345.mm.R.id.f568535n55) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sns.AdLandingPageStreamVideoPlayerComponent.VideoOptimize", "click full screen btn");
            try {
                if (this.F instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18007x6d5e9773) {
                    this.D1++;
                    this.G.mo50300x3fa464aa(this.f246635y1);
                    android.view.View view2 = this.f246627l1;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList2.add(8);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageStreamVideoPlayerComponent", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageStreamVideoPlayerComponent", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18007x6d5e9773 activityC18007x6d5e9773 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18007x6d5e9773) this.F;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.z8.f247404a = c0();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.a4.f245608a = u();
                    android.content.Intent intent = new android.content.Intent(activityC18007x6d5e9773, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18152x9f0f53c5.class);
                    intent.putExtra("KComponentVideoType", 1);
                    intent.putExtra("KComponentCid", z());
                    intent.putExtra("KComponentCurrentTime", this.f246630x.mo61523x898ffe25());
                    intent.putExtra("KComponentTotalTime", this.f246630x.mo61527x6d590e18());
                    intent.putExtra("KComponentVoiceType", this.f246626J);
                    intent.putExtra("KComponentProgressType", mo1022xc00617a4());
                    intent.putExtra("KComponentStreamVideoUrlPath", c0().F);
                    intent.putExtra("KComponentIsWaiting", this.A1);
                    intent.putExtra("KComponentSeekTimeDueWaiting", this.B1);
                    intent.putExtra("KComponentKComponentCacheTime", this.f246630x.mo48226x8a3f46d8());
                    intent.putExtra("KComponentForceLandMode", c0().L);
                    this.f246630x.m70217x9b0eccbe(true);
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    arrayList3.add(2000);
                    arrayList3.add(intent);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.k(activityC18007x6d5e9773, arrayList3.toArray(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageStreamVideoPlayerComponent", "onClick", "(Landroid/view/View;)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1720, 2);
                } else {
                    android.widget.ImageView imageView = this.f246634y0;
                    if (imageView != null) {
                        imageView.setVisibility(8);
                    }
                }
            } catch (java.lang.Throwable th6) {
                android.widget.ImageView imageView2 = this.f246634y0;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("VideoFullScreenActivity", th6.toString());
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageStreamVideoPlayerComponent", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(android.view.MotionEvent motionEvent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDoubleTap", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageStreamVideoPlayerComponent", "android/view/GestureDetector$OnDoubleTapListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", this, array);
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sns.AdLandingPageStreamVideoPlayerComponent.VideoOptimize", "onDoubleTap");
            a0(this.H);
            if (!this.P) {
                this.C1++;
            }
            if (mo1022xc00617a4()) {
                e0(true);
                this.Q = 4;
            } else {
                if (this.f246626J) {
                    P();
                } else {
                    O();
                    U();
                }
                j0();
                this.Q = 3;
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Sns.AdLandingPageStreamVideoPlayerComponent.VideoOptimize", th6.toString());
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageStreamVideoPlayerComponent", "android/view/GestureDetector$OnDoubleTapListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDoubleTap", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        return false;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTapEvent(android.view.MotionEvent motionEvent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDoubleTapEvent", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDoubleTapEvent", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onDown(android.view.MotionEvent motionEvent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDown", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDown", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onFling(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f17, float f18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onFling", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onFling", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onLongPress(android.view.MotionEvent motionEvent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(if1.m.f69928x24728b, "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageStreamVideoPlayerComponent", "android/view/GestureDetector$OnGestureListener", if1.m.f69928x24728b, "(Landroid/view/MotionEvent;)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageStreamVideoPlayerComponent", "android/view/GestureDetector$OnGestureListener", if1.m.f69928x24728b, "(Landroid/view/MotionEvent;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(if1.m.f69928x24728b, "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onScroll(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f17, float f18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onScroll", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onScroll", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        return false;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    /* renamed from: onSeekComplete */
    public void mo55683xe1fdf750(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onSeekComplete", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSeekComplete", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onShowPress(android.view.MotionEvent motionEvent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onShowPress", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onShowPress", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(android.view.MotionEvent motionEvent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onSingleTapConfirmed", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sns.AdLandingPageStreamVideoPlayerComponent.VideoOptimize", "onSingleTapConfirmed");
            if (this.I) {
                this.I = false;
                h0(false);
            } else {
                this.I = true;
                h0(true);
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Sns.AdLandingPageStreamVideoPlayerComponent.VideoOptimize", th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSingleTapConfirmed", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(android.view.MotionEvent motionEvent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onSingleTapUp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageStreamVideoPlayerComponent", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
        yj0.a.i(false, this, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageStreamVideoPlayerComponent", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSingleTapUp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        return false;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onTouch", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageStreamVideoPlayerComponent", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        android.view.GestureDetector gestureDetector = this.f246632x1;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(motionEvent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(gestureDetector, arrayList2.toArray(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageStreamVideoPlayerComponent", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        boolean onTouchEvent = gestureDetector.onTouchEvent((android.view.MotionEvent) arrayList2.get(0));
        yj0.a.g(gestureDetector, onTouchEvent, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageStreamVideoPlayerComponent", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        yj0.a.i(onTouchEvent, this, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageStreamVideoPlayerComponent", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onTouch", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        return onTouchEvent;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void p2(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onVideoFirstFrameDraw", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onVideoFirstFrameDraw", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.a2
    public int v() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.cpt;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void v3(java.lang.String str, java.lang.String str2, int i17, int i18, int i19) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onGetVideoPlayFps", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onGetVideoPlayFps", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.a2
    public long w() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getStayTime", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        long w17 = super.w() + this.F1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getStayTime", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        return w17;
    }
}
