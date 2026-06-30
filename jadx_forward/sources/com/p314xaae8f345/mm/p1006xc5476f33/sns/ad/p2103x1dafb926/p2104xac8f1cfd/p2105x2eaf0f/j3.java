package com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f;

/* loaded from: classes14.dex */
public final class j3 extends com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.a2 {
    public static final com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.p2 T = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.p2(null);
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2142x746ad0e3.C17790xf59c6992 A;
    public boolean B;
    public java.lang.String C;
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2133xbc1081a1.C17775xfdd9867c D;
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2133xbc1081a1.C17776xe08da3a0 E;
    public p3325xe03a0797.p3326xc267989b.y0 F;
    public final p012xc85e97e9.p093xedfae76a.o G;
    public final p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 H;
    public final java.util.List I;

    /* renamed from: J, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18007x6d5e9773 f244395J;
    public final c01.i K;
    public final c01.k L;
    public final o54.n M;
    public final android.content.BroadcastReceiver N;
    public int P;
    public int Q;
    public int R;
    public int S;

    /* renamed from: s, reason: collision with root package name */
    public final android.content.Context f244396s;

    /* renamed from: t, reason: collision with root package name */
    public final f54.b0 f244397t;

    /* renamed from: u, reason: collision with root package name */
    public final int f244398u;

    /* renamed from: v, reason: collision with root package name */
    public final android.view.View f244399v;

    /* renamed from: w, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d f244400w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.LinearLayout f244401x;

    /* renamed from: y, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2142x746ad0e3.C17790xf59c6992 f244402y;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.LinearLayout f244403z;

    /* JADX WARN: Multi-variable type inference failed */
    public j3(android.content.Context context, f54.b0 b0Var, android.view.ViewGroup viewGroup) {
        super(context, b0Var, viewGroup);
        this.f244396s = context;
        this.f244397t = b0Var;
        this.f244398u = b0Var != null ? b0Var.F : 0;
        this.f244399v = new android.view.View(context);
        this.f244400w = new com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d(context);
        this.C = "";
        this.D = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2133xbc1081a1.C17775xfdd9867c(context);
        this.E = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2133xbc1081a1.C17776xe08da3a0(context);
        p012xc85e97e9.p093xedfae76a.y yVar = context instanceof p012xc85e97e9.p093xedfae76a.y ? (p012xc85e97e9.p093xedfae76a.y) context : null;
        this.G = yVar != null ? yVar.mo273xed6858b4() : null;
        this.H = p3325xe03a0797.p3326xc267989b.p3328x30012e.r2.b(0, 1, u26.u.DROP_OLDEST, 1, null);
        this.I = new java.util.ArrayList();
        this.f244395J = context instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18007x6d5e9773 ? (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18007x6d5e9773) context : null;
        this.K = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.q2();
        this.L = new c01.k();
        this.M = new o54.n();
        this.N = new android.content.BroadcastReceiver() { // from class: com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$receiver$1
            @Override // android.content.BroadcastReceiver
            public void onReceive(android.content.Context context2, android.content.Intent intent) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onReceive", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$receiver$1");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context2, "context");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
                java.lang.String stringExtra = intent.getStringExtra("identity");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.j3 j3Var = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.j3.this;
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(stringExtra, com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.j3.R(j3Var))) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onReceive", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$receiver$1");
                    return;
                }
                try {
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("com.tencent.mm.adlanding.close_exposure_voice", intent.getAction())) {
                        ((p3325xe03a0797.p3326xc267989b.p3328x30012e.q2) j3Var.Z()).e(2);
                    }
                } catch (java.lang.Throwable unused) {
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onReceive", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$receiver$1");
            }
        };
    }

    public static final /* synthetic */ c01.k O(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.j3 j3Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getAudioHelperTool$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
        c01.k kVar = j3Var.L;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getAudioHelperTool$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
        return kVar;
    }

    public static final /* synthetic */ android.content.Context P(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.j3 j3Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getContext$p$s1258133964", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
        android.content.Context context = j3Var.f244396s;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getContext$p$s1258133964", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
        return context;
    }

    public static final /* synthetic */ java.lang.String R(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.j3 j3Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getPlayerId$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
        java.lang.String str = j3Var.C;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getPlayerId$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object S(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.j3 r11, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r12) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.j3.S(com.tencent.mm.plugin.sns.ad.landingpage.component.comp.j3, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final void T(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.j3 j3Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$sendPlayBroadcast", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
        j3Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("sendPlayBroadcast", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
        b4.d a17 = b4.d.a(j3Var.f244396s);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "getInstance(...)");
        android.content.Intent intent = new android.content.Intent("com.tencent.mm.adlanding.close_exposure_voice");
        intent.putExtra("identity", j3Var.C);
        a17.c(intent);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("sendPlayBroadcast", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$sendPlayBroadcast", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.a2
    public boolean D(org.json.JSONObject jSONObject) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setComponentKVReportData", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
        if (!super.D(jSONObject)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setComponentKVReportData", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
            return false;
        }
        if (jSONObject != null) {
            try {
                o54.n nVar = this.M;
                nVar.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("report", "com.tencent.mm.plugin.sns.ad.landingpage.helper.PlayedTimeReporter");
                nVar.a();
                long j17 = nVar.f424690a;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("report", "com.tencent.mm.plugin.sns.ad.landingpage.helper.PlayedTimeReporter");
                jSONObject.put("playedTime", j17);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Sns.AdLandingMusicComponent", "setComponentKVReportData, exp=" + e17);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setComponentKVReportData", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
                return false;
            }
        }
        if (jSONObject != null) {
            jSONObject.put("musicDuration", this.S);
        }
        if (jSONObject != null) {
            jSONObject.put("playCompletedCount", this.Q);
        }
        if (jSONObject != null) {
            jSONObject.put("playCount", this.P);
        }
        if (this.Q > 0) {
            this.R = this.S;
        }
        if (jSONObject != null) {
            jSONObject.put("maxPlayTime", this.R);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sns.AdLandingMusicComponent", "kv13387:" + jSONObject);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setComponentKVReportData", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.a2
    public void J() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("viewAppeared", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
        super.J();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("viewAppeared", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.a2
    public void K() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("viewWillAppear", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
        super.K();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("viewWillAppear", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.a2
    public void L() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("viewWillDestroy", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
        super.L();
        p3325xe03a0797.p3326xc267989b.y0 y0Var = this.F;
        if (y0Var != null) {
            p3325xe03a0797.p3326xc267989b.z0.c(y0Var, null);
        }
        java.util.List list = this.I;
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d) it.next()).mo48814x2efc64();
        }
        ((java.util.ArrayList) list).clear();
        b4.d a17 = b4.d.a(this.f244396s);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "getInstance(...)");
        a17.d(this.N);
        c01.k kVar = this.L;
        if (kVar != null) {
            kVar.a();
        }
        try {
            n01.c.b(this.C);
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("viewWillDestroy", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.a2
    public void M() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("viewWillDisappear", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
        super.M();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("viewWillDisappear", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
    }

    public final float U(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("convertXmlPx", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
        f54.b0 b0Var = this.f244397t;
        if (b0Var == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("convertXmlPx", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
            return 0.0f;
        }
        float o17 = za4.z0.o(i17, b0Var.N, b0Var.P, b0Var.Q);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("convertXmlPx", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
        return o17;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2133xbc1081a1.C17775xfdd9867c V() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getActionBtn", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getActionBtn", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
        return this.D;
    }

    public final o54.n W() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getPlayedTimeReporter", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPlayedTimeReporter", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
        return this.M;
    }

    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.C22645x24069159 X() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getRootView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
        android.view.View view = this.f246589n;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22645x24069159 c22645x24069159 = view != null ? (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22645x24069159) view.findViewById(com.p314xaae8f345.mm.R.id.f564192kh) : null;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22645x24069159 c22645x240691592 = c22645x24069159 instanceof com.p314xaae8f345.mm.ui.p2747xd1075a44.C22645x24069159 ? c22645x24069159 : null;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getRootView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
        return c22645x240691592;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2133xbc1081a1.C17776xe08da3a0 Y() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSeekBar", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSeekBar", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
        return this.E;
    }

    public final p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 Z() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getUserControlFlow", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
        p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 i2Var = this.H;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getUserControlFlow", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
        return i2Var;
    }

    public final void a0(int i17) {
        java.lang.String str;
        java.lang.String str2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initCommon", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2142x746ad0e3.C17790xf59c6992 c17790xf59c6992 = this.f244402y;
        if (c17790xf59c6992 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initCommon", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
            return;
        }
        c17790xf59c6992.setTextColor(i17);
        c17790xf59c6992.setGravity(16);
        java.lang.String str3 = "";
        f54.b0 b0Var = this.f244397t;
        if (b0Var == null || (str = b0Var.H) == null) {
            str = "";
        }
        c17790xf59c6992.setText(str);
        c17790xf59c6992.setMarqueeRepeatLimit(Integer.MAX_VALUE);
        c17790xf59c6992.setSelected(true);
        c17790xf59c6992.requestFocus();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2142x746ad0e3.C17790xf59c6992 c17790xf59c69922 = this.A;
        if (c17790xf59c69922 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initCommon", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
            return;
        }
        c17790xf59c69922.setGravity(16);
        c17790xf59c69922.setMarqueeRepeatLimit(Integer.MAX_VALUE);
        c17790xf59c69922.setTextColor(i17);
        if (b0Var != null && (str2 = b0Var.I) != null) {
            str3 = str2;
        }
        c17790xf59c69922.setText(str3);
        c17790xf59c69922.setSelected(true);
        c17790xf59c69922.setAlpha(0.5f);
        c17790xf59c69922.requestFocus();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.w2 w2Var = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.w2(this);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2133xbc1081a1.C17775xfdd9867c c17775xfdd9867c = this.D;
        c17775xfdd9867c.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initView", "com.tencent.mm.plugin.sns.ad.widget.admedia.PlayActionButton");
        c17775xfdd9867c.f244827f = i17;
        c17775xfdd9867c.setGravity(17);
        c17775xfdd9867c.f244826e = new i84.a(c17775xfdd9867c.getContext(), ((java.lang.Number) w2Var.mo146xb9724478(2)).floatValue(), i17);
        int floatValue = (int) ((java.lang.Number) w2Var.mo146xb9724478(64)).floatValue();
        int floatValue2 = (int) ((java.lang.Number) w2Var.mo146xb9724478(64)).floatValue();
        android.view.View view = c17775xfdd9867c.actionImg;
        c17775xfdd9867c.addView(view, floatValue, floatValue2);
        c17775xfdd9867c.addView(c17775xfdd9867c.f244826e, (int) ((java.lang.Number) w2Var.mo146xb9724478(88)).floatValue(), (int) ((java.lang.Number) w2Var.mo146xb9724478(88)).floatValue());
        c17775xfdd9867c.m69516x9b6f71bd(false);
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        android.widget.RelativeLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.addRule(13);
        }
        i84.a aVar = c17775xfdd9867c.f244826e;
        java.lang.Object layoutParams3 = aVar != null ? aVar.getLayoutParams() : null;
        android.widget.RelativeLayout.LayoutParams layoutParams4 = layoutParams3 instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams3 : null;
        if (layoutParams4 != null) {
            layoutParams4.addRule(13);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initView", "com.tencent.mm.plugin.sns.ad.widget.admedia.PlayActionButton");
        this.E.m69524x3ae760af(0.0f);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initCommon", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
    }

    public final boolean b0() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isPlayingInFront", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
        boolean z17 = false;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18007x6d5e9773 activityC18007x6d5e9773 = this.f244395J;
        if (activityC18007x6d5e9773 != null ? activityC18007x6d5e9773.I2 : false) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(activityC18007x6d5e9773 != null ? activityC18007x6d5e9773.J2 : null, this.C)) {
                z17 = true;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isPlayingInFront", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
        return z17;
    }

    public final void c0(final p012xc85e97e9.p093xedfae76a.y yVar, final java.lang.String playerId, final boolean z17, final yz5.l callback) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("listenAudioEvent", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(playerId, "playerId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        if (yVar == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("listenAudioEvent", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
            return;
        }
        final p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5175x3ee93aa3> abstractC20980x9b9ad01d = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5175x3ee93aa3>(yVar) { // from class: com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$listenAudioEvent$1
            {
                this.f39173x3fe91575 = 1218151603;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5175x3ee93aa3 c5175x3ee93aa3) {
                java.lang.String str;
                com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d abstractC20980x9b9ad01d2;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$listenAudioEvent$1");
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5175x3ee93aa3 event = c5175x3ee93aa3;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$listenAudioEvent$1");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                am.g0 g0Var = event.f135523g;
                if (g0Var == null || (str = g0Var.f88251c) == null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$listenAudioEvent$1");
                } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, playerId)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sns.AdLandingMusicComponent", "music comp event called with: action = [" + g0Var.f88249a + ']');
                    boolean booleanValue = ((java.lang.Boolean) callback.mo146xb9724478(g0Var)).booleanValue();
                    if (z17 && booleanValue && (abstractC20980x9b9ad01d2 = (com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d) h0Var.f391656d) != null) {
                        abstractC20980x9b9ad01d2.mo48814x2efc64();
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$listenAudioEvent$1");
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$listenAudioEvent$1");
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$listenAudioEvent$1");
                return false;
            }
        };
        h0Var.f391656d = abstractC20980x9b9ad01d;
        abstractC20980x9b9ad01d.mo48813x58998cd();
        ((java.util.ArrayList) this.I).add(h0Var.f391656d);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("listenAudioEvent", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.a2
    public void g() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("applyLayoutParams", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
        super.g();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("applyLayoutParams", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x059e  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x05d9  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0611  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0618  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0634  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x064e  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x061c  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0615  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x05dc  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010e  */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.a2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h() {
        /*
            Method dump skipped, instructions count: 1634
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.j3.h():void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.a2
    public int v() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLayout", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLayout", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.cps;
    }
}
