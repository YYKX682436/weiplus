package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

@db5.a(m123858x6ac9171 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.v1.f33869x366c91de)
@gm0.a2
/* renamed from: com.tencent.mm.plugin.sns.ui.SnsUploadUI */
/* loaded from: classes4.dex */
public class ActivityC18133x39856dcd extends com.p314xaae8f345.mm.p1006xc5476f33.p2050x75681b7b.ui.AbstractActivityC17353x8d7a560a implements com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.f5 {

    /* renamed from: x1, reason: collision with root package name */
    public static final /* synthetic */ int f249050x1 = 0;
    public ta4.x0 Q;
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4 T;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18153xb2f8a3ba f249052d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f249053e;

    /* renamed from: f, reason: collision with root package name */
    public fl5.i f249054f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.LinearLayout f249055g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f249056h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17947x83d458f1 f249057i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17970xbe575679 f249059m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.AbstractC17949x28e47a30 f249060n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.AbstractC18397x5bc42bbf f249061o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18131x711b760 f249062p;

    /* renamed from: p0, reason: collision with root package name */
    public java.lang.String f249063p0;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2217x5e9bb8.C18379xb7ff44a f249065q;

    /* renamed from: r, reason: collision with root package name */
    public int f249066r = 0;

    /* renamed from: s, reason: collision with root package name */
    public boolean f249067s = false;

    /* renamed from: t, reason: collision with root package name */
    public long f249068t = 0;

    /* renamed from: u, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.z4 f249069u = null;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f249070v = "";

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f249071w = "";

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f249072x = "";

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f249074y = "";

    /* renamed from: z, reason: collision with root package name */
    public java.util.ArrayList f249076z = new java.util.ArrayList();
    public java.util.ArrayList A = new java.util.ArrayList();
    public int B = 0;
    public int C = 0;
    public boolean D = false;
    public boolean E = false;
    public boolean F = false;
    public boolean G = false;
    public java.lang.String H = null;
    public java.lang.String I = "";

    /* renamed from: J, reason: collision with root package name */
    public boolean f249051J = false;
    public boolean K = false;
    public boolean L = false;
    public final java.util.Map M = new java.util.HashMap();
    public final java.util.concurrent.ConcurrentHashMap N = new java.util.concurrent.ConcurrentHashMap();
    public final java.util.Map P = new java.util.HashMap();
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bi R = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bi();
    public boolean S = false;
    public java.lang.String U = "";
    public java.lang.String V = "";
    public long W = 3000;
    public final java.lang.Runnable X = new java.lang.Runnable() { // from class: com.tencent.mm.plugin.sns.ui.SnsUploadUI.1
        @Override // java.lang.Runnable
        public void run() {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.z4 z4Var;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$1");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18133x39856dcd activityC18133x39856dcd = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18133x39856dcd.this;
            if (activityC18133x39856dcd.f249054f != null && (z4Var = activityC18133x39856dcd.f249069u) != null && z4Var.j()) {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                activityC18133x39856dcd.getIntent().putExtra("Kdescription", activityC18133x39856dcd.f249054f.getText().toString());
                activityC18133x39856dcd.getIntent().putExtra("KparseLen", activityC18133x39856dcd.f249054f.mo70737xc8d30aa0());
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18133x39856dcd.U6(activityC18133x39856dcd);
                activityC18133x39856dcd.getIntent().writeToParcel(obtain, 0);
                byte[] marshall = obtain.marshall();
                java.lang.String b17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(marshall);
                activityC18133x39856dcd.f249069u.d(true);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$100", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$100", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$100", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                java.lang.String str = activityC18133x39856dcd.V;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$100", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(str, b17)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$102", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                    activityC18133x39856dcd.V = b17;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$102", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18133x39856dcd.X6(activityC18133x39856dcd, marshall, 1);
                }
                com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 Tj = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Tj();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$300", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                java.lang.Runnable runnable = activityC18133x39856dcd.X;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$300", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$400", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                long j17 = activityC18133x39856dcd.W;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$400", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                Tj.mo50297x7c4d7ca2(runnable, j17);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$1");
        }
    };
    public android.widget.FrameLayout Y = null;
    public long Z = 0;

    /* renamed from: x0, reason: collision with root package name */
    public long f249073x0 = 0;

    /* renamed from: y0, reason: collision with root package name */
    public int f249075y0 = 0;

    /* renamed from: l1, reason: collision with root package name */
    public int f249058l1 = 0;

    /* renamed from: p1, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f249064p1 = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5638xc01e8ce9>(com.p314xaae8f345.mm.app.a0.f134821d) { // from class: com.tencent.mm.plugin.sns.ui.SnsUploadUI.26
        {
            this.f39173x3fe91575 = 184294137;
        }

        @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
        /* renamed from: callback */
        public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5638xc01e8ce9 c5638xc01e8ce9) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$26");
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5638xc01e8ce9 c5638xc01e8ce92 = c5638xc01e8ce9;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$26");
            if (c5638xc01e8ce92 != null) {
                am.ih ihVar = c5638xc01e8ce92.f135966g;
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(ihVar.f88485a, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18133x39856dcd.this.hashCode() + "")) {
                    gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SNS_POST_BIZ_ID_STRING, ihVar.f88486b);
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$26");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$26");
            return false;
        }
    };

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsUploadUI$10, reason: invalid class name */
    /* loaded from: classes4.dex */
    public class AnonymousClass10 implements android.view.MenuItem.OnMenuItemClickListener {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean[] f249083d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.tencent.mm.plugin.sns.ui.SnsUploadUI$10$1, reason: invalid class name */
        /* loaded from: classes4.dex */
        public class AnonymousClass1 implements ck5.e {

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ int f249085d;

            public AnonymousClass1(int i17) {
                this.f249085d = i17;
            }

            @Override // ck5.e
            public void R5(java.lang.String str) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doWhenLess", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$10$1");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doWhenLess", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$10$1");
            }

            @Override // ck5.e
            public void c1(java.lang.String str) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4 f4Var;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doWhenOK", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$10$1");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsUploadUI", "commit after check");
                if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18133x39856dcd.this.getIntent().getBooleanExtra("sns_upload_is_show_dialog", false)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18133x39856dcd activityC18133x39856dcd = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18133x39856dcd.this;
                    int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(activityC18133x39856dcd);
                    e4Var.f293309c = activityC18133x39856dcd.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572093yi, "");
                    e4Var.b(com.p314xaae8f345.mm.R.raw.f81211xadecd6f4);
                    f4Var = e4Var.c();
                } else {
                    f4Var = null;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18133x39856dcd activityC18133x39856dcd2 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18133x39856dcd.this;
                int i18 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18133x39856dcd.f249050x1;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1802", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                activityC18133x39856dcd2.T = f4Var;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$1802", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                long j17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18133x39856dcd.W6(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18133x39856dcd.this) != null ? 1000L : 0L;
                ku5.u0 u0Var = ku5.t0.f394148d;
                java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.tencent.mm.plugin.sns.ui.SnsUploadUI$10$1$$a
                    /* JADX WARN: Removed duplicated region for block: B:60:0x031b  */
                    @Override // java.lang.Runnable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void run() {
                        /*
                            Method dump skipped, instructions count: 808
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.RunnableC18138xd24bb59e.run():void");
                    }
                };
                ku5.t0 t0Var = (ku5.t0) u0Var;
                t0Var.getClass();
                t0Var.z(runnable, j17, false);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doWhenOK", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$10$1");
            }

            @Override // ck5.e
            public void w0(java.lang.String str) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doWhenMore", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$10$1");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18133x39856dcd.AnonymousClass10 anonymousClass10 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18133x39856dcd.AnonymousClass10.this;
                java.lang.Integer valueOf = java.lang.Integer.valueOf(com.p314xaae8f345.mm.ui.p2740x696c9db.v4.f(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18133x39856dcd.this.f249054f.getText().toString()));
                int i17 = this.f249085d;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsUploadUI", "user click post failed, count over, currentCharacterCount:%d, maxCount:%d", valueOf, java.lang.Integer.valueOf(i17));
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18133x39856dcd activityC18133x39856dcd = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18133x39856dcd.this;
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC18133x39856dcd.mo55332x76847179();
                java.lang.String r17 = i65.a.r(activityC18133x39856dcd.mo55332x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.f574795jh4);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("characterCount2TextCount", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
                int ceil = (int) java.lang.Math.ceil(i17 / 2.0d);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("characterCount2TextCount", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
                db5.t7.m(mo55332x76847179, java.lang.String.format(r17, java.lang.Integer.valueOf(ceil)));
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1900", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                ta4.x0 d76 = activityC18133x39856dcd.d7();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$1900", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                d76.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hitWordLimitToast", "com.tencent.mm.plugin.sns.report.SnsInputAreaReporter");
                d76.f498393h++;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hitWordLimitToast", "com.tencent.mm.plugin.sns.report.SnsInputAreaReporter");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doWhenMore", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$10$1");
            }
        }

        public AnonymousClass10(boolean[] zArr) {
            this.f249083d = zArr;
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(android.view.MenuItem menuItem) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$10");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18133x39856dcd activityC18133x39856dcd = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18133x39856dcd.this;
            if (activityC18133x39856dcd.isFinishing()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsUploadUI", "skip commit, activity is finishing");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$10");
                return false;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.z4 z4Var = activityC18133x39856dcd.f249069u;
            if (z4Var != null && !z4Var.h()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsUploadUI", "skip commit, beforeCommit: false");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$10");
                return false;
            }
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1700", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
            long j17 = activityC18133x39856dcd.Z;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$1700", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
            if (currentTimeMillis - j17 < 500) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsUploadUI", "skip commit, click frequently");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$10");
                return false;
            }
            if (activityC18133x39856dcd.G) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsUploadUI", "skip commit, has commited");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$10");
                return false;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsUploadUI", "user click send.");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 Tj = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Tj();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$300", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
            java.lang.Runnable runnable = activityC18133x39856dcd.X;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$300", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
            Tj.mo50300x3fa464aa(runnable);
            android.os.Parcel obtain = android.os.Parcel.obtain();
            activityC18133x39856dcd.getIntent().putExtra("Kdescription", activityC18133x39856dcd.f249054f.getText().toString());
            activityC18133x39856dcd.getIntent().putExtra("KparseLen", activityC18133x39856dcd.f249054f.mo70737xc8d30aa0());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.z4 z4Var2 = activityC18133x39856dcd.f249069u;
            if (z4Var2 instanceof de4.a) {
                z4Var2.d(true);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18133x39856dcd.U6(activityC18133x39856dcd);
            activityC18133x39856dcd.getIntent().writeToParcel(obtain, 0);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18133x39856dcd.X6(activityC18133x39856dcd, obtain.marshall(), 2);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$800", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
            activityC18133x39856dcd.a7();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$800", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
            boolean[] zArr = this.f249083d;
            if (zArr[0]) {
                zArr[0] = false;
            } else {
                fo3.s sVar = fo3.s.INSTANCE;
                sVar.Z7("ce_sns_upload", "<SnsUpload>");
                sVar.H2("ce_sns_upload", android.view.MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 65535));
                sVar.Qa("ce_sns_upload");
            }
            long currentTimeMillis2 = java.lang.System.currentTimeMillis();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1702", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
            activityC18133x39856dcd.Z = currentTimeMillis2;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$1702", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.f0.a(22);
            int n17 = ip.c.n();
            xa4.b.f534354a.d("view_clk");
            fl5.j g17 = fl5.j.g(activityC18133x39856dcd.f249054f);
            int n18 = ip.c.n();
            g17.f124094f = 0;
            g17.f124093e = n18;
            g17.f124089a = true;
            g17.d(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18133x39856dcd.AnonymousClass10.AnonymousClass1(n17));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$10");
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsUploadUI$3, reason: invalid class name */
    /* loaded from: classes4.dex */
    public class AnonymousClass3 implements java.lang.Runnable {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ byte[] f249109d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f249110e;

        public AnonymousClass3(byte[] bArr, int i17) {
            this.f249109d = bArr;
            this.f249110e = i17;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$3");
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.c2 Dj = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Dj();
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18133x39856dcd.f249050x1;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$600", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18133x39856dcd activityC18133x39856dcd = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18133x39856dcd.this;
            java.lang.String str = activityC18133x39856dcd.U;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$600", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
            Dj.J0(str, this.f249109d, this.f249110e);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$600", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
            java.lang.String str2 = activityC18133x39856dcd.U;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$600", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsUploadUI", "saveDraft draftKey:%s, cost time:%s", str2, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$3");
        }
    }

    public static void U6(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18133x39856dcd activityC18133x39856dcd) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        activityC18133x39856dcd.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resetIntent", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        activityC18133x39856dcd.getIntent().putExtra("Kis_retry_edit", false);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resetIntent", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
    }

    public static void V6(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18133x39856dcd activityC18133x39856dcd) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1500", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        activityC18133x39856dcd.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("descTextViewOnClick", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        activityC18133x39856dcd.f249054f.k();
        if (activityC18133x39856dcd.f249061o.b()) {
            activityC18133x39856dcd.f249061o.g();
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.d2.j(activityC18133x39856dcd)) {
            activityC18133x39856dcd.f249061o.f();
        }
        activityC18133x39856dcd.m78513xc2a54588().postInvalidate();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("descTextViewOnClick", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$1500", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
    }

    public static /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4 W6(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18133x39856dcd activityC18133x39856dcd) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1800", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4 f4Var = activityC18133x39856dcd.T;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$1800", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        return f4Var;
    }

    public static void X6(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18133x39856dcd activityC18133x39856dcd, byte[] bArr, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$200", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        activityC18133x39856dcd.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("saveDraft", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Uj().mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18133x39856dcd.AnonymousClass3(bArr, i17));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("saveDraft", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$200", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
    }

    public static void i7(int i17, java.lang.String str, java.lang.String str2, long j17, java.lang.String str3) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportInputMenu", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        ((sg0.c2) ((tg0.n1) i95.n0.c(tg0.n1.class))).wi(null, 1, 1, c01.z1.r(), str2, 1, "", str3, i17, str, j17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportInputMenu", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0674  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x068d  */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Y6() {
        /*
            Method dump skipped, instructions count: 1714
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18133x39856dcd.Y6():void");
    }

    public void Z6(android.os.Bundle bundle) {
        android.view.View b17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("attachWidget", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsUploadUI", "attachWidget. share type %d, isManuSnsPost:%b", java.lang.Integer.valueOf(this.f249066r), java.lang.Boolean.valueOf(this.f249067s));
        int i17 = this.f249066r;
        if (i17 == 0 || i17 == 14 || i17 == 9) {
            android.os.Parcel obtain = android.os.Parcel.obtain();
            getIntent().writeToParcel(obtain, 0);
            obtain.marshall();
            if (this.f249066r == 9) {
                mo54450xbf7c1df6(mo55332x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574785jg3));
            } else {
                mo54450xbf7c1df6("");
            }
        } else {
            mo54450xbf7c1df6(mo55332x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.pie));
        }
        int i18 = this.f249066r;
        switch (i18) {
            case 0:
            case 28:
                this.U = "draft_normal";
                this.f249069u = e7(i18);
                this.f249054f.mo81552xeb238c3a(new android.text.TextWatcher() { // from class: com.tencent.mm.plugin.sns.ui.SnsUploadUI.22
                    @Override // android.text.TextWatcher
                    public void afterTextChanged(android.text.Editable editable) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("afterTextChanged", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$22");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("afterTextChanged", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$22");
                    }

                    @Override // android.text.TextWatcher
                    public void beforeTextChanged(java.lang.CharSequence charSequence, int i19, int i27, int i28) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("beforeTextChanged", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$22");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("beforeTextChanged", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$22");
                    }

                    @Override // android.text.TextWatcher
                    public void onTextChanged(java.lang.CharSequence charSequence, int i19, int i27, int i28) {
                        android.view.View findViewById;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onTextChanged", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$22");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18133x39856dcd activityC18133x39856dcd = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18133x39856dcd.this;
                        if (activityC18133x39856dcd.f249054f.getText().toString().trim().length() > 10 && (findViewById = activityC18133x39856dcd.findViewById(com.p314xaae8f345.mm.R.id.f568561n91)) != null) {
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                            arrayList.add(8);
                            java.util.Collections.reverse(arrayList);
                            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/SnsUploadUI$22", "onTextChanged", "(Ljava/lang/CharSequence;III)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                            yj0.a.f(findViewById, "com/tencent/mm/plugin/sns/ui/SnsUploadUI$22", "onTextChanged", "(Ljava/lang/CharSequence;III)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onTextChanged", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$22");
                    }
                });
                break;
            case 1:
                java.lang.String stringExtra = getIntent().getStringExtra("ksnsupload_bizstyle_cover_url");
                if (pc4.d.f434943a.a() && !android.text.TextUtils.isEmpty(stringExtra)) {
                    this.f249069u = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p1(this);
                    break;
                } else {
                    this.f249069u = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.b5(this);
                    break;
                }
                break;
            case 2:
                this.f249069u = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.f6(this);
                break;
            case 3:
                this.f249069u = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.a8(this, 9);
                break;
            case 4:
                this.f249069u = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.c2(this);
                break;
            case 5:
                this.f249069u = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.a8(this, 14);
                break;
            case 6:
                this.f249069u = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.a8(this, 12);
                break;
            case 7:
                this.f249069u = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.a8(this, 13);
                break;
            case 8:
                this.f249069u = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.fw(this);
                break;
            case 9:
                this.U = "draft_text";
                java.lang.String stringExtra2 = getIntent().getStringExtra("Kdescription");
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                java.lang.String str = stringExtra2 != null ? stringExtra2 : "";
                int j17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.j1(java.lang.Integer.valueOf(getIntent().getIntExtra("KparseLen", 0)), 0);
                this.f249069u = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.y6(this, str);
                this.f249054f.mo70738x2526cb14(j17);
                this.f249054f.mo81590x765074af(pg5.d.a(mo55332x76847179(), str));
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
                android.view.View j18 = this.f249054f.j();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("launch", "com.tencent.mm.plugin.sns.ui.listener.SnsAutoShowVKBOnUICreate");
                if (j18 != null) {
                    j18.requestFocus();
                }
                ku5.u0 u0Var = ku5.t0.f394148d;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.b bVar = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.b(mo55332x76847179, j18);
                ku5.t0 t0Var = (ku5.t0) u0Var;
                t0Var.getClass();
                t0Var.z(bVar, 200L, false);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("launch", "com.tencent.mm.plugin.sns.ui.listener.SnsAutoShowVKBOnUICreate");
                fl5.i iVar = this.f249054f;
                iVar.mo81549xf579a34a(iVar.getText().length());
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("watchInputTextEnablePost", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsUploadUI", "watchInputTextEnablePost: ");
                this.f249054f.mo81552xeb238c3a(new android.text.TextWatcher() { // from class: com.tencent.mm.plugin.sns.ui.SnsUploadUI.27
                    @Override // android.text.TextWatcher
                    public void afterTextChanged(android.text.Editable editable) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("afterTextChanged", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$27");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("afterTextChanged", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$27");
                    }

                    @Override // android.text.TextWatcher
                    public void beforeTextChanged(java.lang.CharSequence charSequence, int i19, int i27, int i28) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("beforeTextChanged", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$27");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("beforeTextChanged", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$27");
                    }

                    @Override // android.text.TextWatcher
                    public void onTextChanged(java.lang.CharSequence charSequence, int i19, int i27, int i28) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onTextChanged", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$27");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18133x39856dcd activityC18133x39856dcd = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18133x39856dcd.this;
                        activityC18133x39856dcd.m78501x43e00957(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.y6.o(activityC18133x39856dcd.f249054f.getText().toString()));
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onTextChanged", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$27");
                    }
                });
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("watchInputTextEnablePost", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                break;
            case 10:
                this.f249069u = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.a2(this);
                break;
            case 11:
            case 15:
            case 16:
            case 18:
            case 20:
            case 22:
            case 24:
            case 26:
            case 29:
            case 32:
            case 34:
            case 40:
            case 41:
            case 42:
            case com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.InterfaceC11224x4860a6b.f32774x503933e6 /* 43 */:
            case 46:
                this.f249069u = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.b5(this);
                break;
            case 12:
                this.f249069u = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.b2(this);
                break;
            case 13:
            case 33:
                this.f249069u = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.d2(this, i18);
                break;
            case 14:
                this.U = "draft_normal";
                this.f249069u = e7(i18);
                break;
            case 17:
            case 45:
                this.f249069u = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.q2(this);
                break;
            case 19:
                this.f249069u = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.r5(this);
                break;
            case 21:
                this.f249069u = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.o2(this);
                break;
            case 23:
                this.f249069u = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.x5(this);
                break;
            case 25:
            case 37:
                this.f249069u = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.fy(this);
                break;
            case 27:
                this.f249069u = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.n2(this);
                break;
            case 30:
                this.f249069u = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.v2(this);
                break;
            case 35:
                this.f249069u = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.b6(this);
                break;
            case 36:
                this.f249069u = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.h2(this);
                break;
            case 38:
                this.f249069u = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.q2(this);
                break;
            case 44:
                if (!pc4.d.f434943a.B()) {
                    this.f249069u = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.o7(this);
                    break;
                } else {
                    this.f249069u = new de4.a(this);
                    break;
                }
        }
        this.f249069u.i(bundle);
        if (this.R.c()) {
            this.U = this.R.b();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.z4 z4Var = this.f249069u;
        if ((z4Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p7) && !(z4Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.t2)) {
            android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.n7x);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.C18421xdf197e2d c18421xdf197e2d = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.C18421xdf197e2d) findViewById(com.p314xaae8f345.mm.R.id.f568561n91);
            c18421xdf197e2d.m71283x62a64bd2((i65.a.f(mo55332x76847179(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561247d7) + (ud4.k.g(mo55332x76847179()) / 2)) - i65.a.f(mo55332x76847179(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2217x5e9bb8.C18379xb7ff44a c18379xb7ff44a = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2217x5e9bb8.C18379xb7ff44a) findViewById(com.p314xaae8f345.mm.R.id.naf);
            this.f249065q = c18379xb7ff44a;
            c18379xb7ff44a.m71179x835328a8(this.L);
            this.f249065q.setOnTouchListener(new android.view.View.OnTouchListener() { // from class: com.tencent.mm.plugin.sns.ui.SnsUploadUI.23
                @Override // android.view.View.OnTouchListener
                public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onTouch", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$23");
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(view);
                    arrayList.add(motionEvent);
                    java.lang.Object[] array = arrayList.toArray();
                    arrayList.clear();
                    yj0.a.b("com/tencent/mm/plugin/sns/ui/SnsUploadUI$23", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
                    boolean l76 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18133x39856dcd.this.l7();
                    yj0.a.i(l76, this, "com/tencent/mm/plugin/sns/ui/SnsUploadUI$23", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onTouch", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$23");
                    return l76;
                }
            });
            b17 = ((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p7) this.f249069u).s(findViewById, findViewById(com.p314xaae8f345.mm.R.id.cry), this.f249065q, c18421xdf197e2d, findViewById(com.p314xaae8f345.mm.R.id.pmh));
            this.f249065q.setVisibility(0);
            this.R.a((android.widget.RelativeLayout) this.f249065q.getParent(), this.f249065q.getPaddingLeft());
        } else if (z4Var instanceof de4.a) {
            android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.n7x);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.C18421xdf197e2d c18421xdf197e2d2 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.C18421xdf197e2d) findViewById(com.p314xaae8f345.mm.R.id.f568561n91);
            c18421xdf197e2d2.m71283x62a64bd2((i65.a.f(mo55332x76847179(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561247d7) + (ud4.k.g(mo55332x76847179()) / 2)) - i65.a.f(mo55332x76847179(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2217x5e9bb8.C18379xb7ff44a c18379xb7ff44a2 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2217x5e9bb8.C18379xb7ff44a) findViewById(com.p314xaae8f345.mm.R.id.naf);
            this.f249065q = c18379xb7ff44a2;
            c18379xb7ff44a2.m71179x835328a8(this.L);
            this.f249065q.setOnTouchListener(new android.view.View.OnTouchListener() { // from class: com.tencent.mm.plugin.sns.ui.SnsUploadUI.24
                @Override // android.view.View.OnTouchListener
                public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onTouch", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$24");
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(view);
                    arrayList.add(motionEvent);
                    java.lang.Object[] array = arrayList.toArray();
                    arrayList.clear();
                    yj0.a.b("com/tencent/mm/plugin/sns/ui/SnsUploadUI$24", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
                    boolean l76 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18133x39856dcd.this.l7();
                    yj0.a.i(l76, this, "com/tencent/mm/plugin/sns/ui/SnsUploadUI$24", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onTouch", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$24");
                    return l76;
                }
            });
            android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.pmh);
            de4.a aVar = (de4.a) this.f249069u;
            android.view.View findViewById4 = findViewById(com.p314xaae8f345.mm.R.id.cry);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2217x5e9bb8.C18379xb7ff44a c18379xb7ff44a3 = this.f249065q;
            aVar.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initView", "com.tencent.mm.plugin.sns.ui.widget.multi_image.MultiPicWidget");
            ee4.e1 e1Var = (ee4.e1) aVar.k(ee4.e1.class);
            e1Var.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initView", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicPreviewViewPc");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("initView: previewImage null[");
            sb6.append(e1Var.f333233n == null);
            sb6.append(']');
            e1Var.f(sb6.toString());
            if (e1Var.f333233n == null) {
                e1Var.f333233n = new ud4.k(findViewById2, findViewById4, c18421xdf197e2d2, findViewById3, e1Var.c(), e1Var.m().v().e(), 9, c18379xb7ff44a3, e1Var.f333235p, e1Var.f333236q, !e1Var.f333234o);
            } else {
                e1Var.p();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.v4 v4Var = e1Var.f333233n;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(v4Var);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getView", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getView", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
            b17 = ((ud4.t) v4Var).f508267c;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "getView(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initView", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicPreviewViewPc");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initView", "com.tencent.mm.plugin.sns.ui.widget.multi_image.MultiPicWidget");
            this.f249065q.setVisibility(0);
            this.R.a((android.widget.RelativeLayout) this.f249065q.getParent(), this.f249065q.getPaddingLeft());
        } else {
            b17 = z4Var.b();
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.pm_);
            this.f249055g = linearLayout;
            linearLayout.setVisibility(0);
            this.f249055g.setClipChildren(false);
            if (b17 != null) {
                this.f249055g.addView(b17);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bi biVar = this.R;
                android.widget.LinearLayout parent = this.f249055g;
                biVar.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addEcsViewToWidgetContainer", "com.tencent.mm.plugin.sns.ui.SnsEcsUploadHelper");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
                if (biVar.c()) {
                    android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-2, -2);
                    layoutParams.setMargins(0, i65.a.b(parent.getContext(), 4), 0, 0);
                    android.content.Context context = parent.getContext();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                    android.view.View d17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bi.d(biVar, context, false, 2, null);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bi.f249447c.f(d17, 15, biVar.f249448a);
                    parent.addView(d17, layoutParams);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addEcsViewToWidgetContainer", "com.tencent.mm.plugin.sns.ui.SnsEcsUploadHelper");
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addEcsViewToWidgetContainer", "com.tencent.mm.plugin.sns.ui.SnsEcsUploadHelper");
                }
            } else {
                this.f249055g.setVisibility(8);
            }
            if (this.f249055g.getVisibility() == 0) {
                this.f249055g.getViewTreeObserver().addOnPreDrawListener(new android.view.ViewTreeObserver.OnPreDrawListener() { // from class: com.tencent.mm.plugin.sns.ui.SnsUploadUI.25
                    @Override // android.view.ViewTreeObserver.OnPreDrawListener
                    public boolean onPreDraw() {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPreDraw", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$25");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18133x39856dcd activityC18133x39856dcd = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18133x39856dcd.this;
                        int g17 = ud4.k.g(activityC18133x39856dcd.mo55332x76847179());
                        activityC18133x39856dcd.f249055g.getViewTreeObserver().removeOnPreDrawListener(this);
                        int height = (activityC18133x39856dcd.f249055g.getHeight() - activityC18133x39856dcd.f249055g.getPaddingTop()) - activityC18133x39856dcd.f249055g.getPaddingBottom();
                        boolean z18 = activityC18133x39856dcd.f249069u instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.h2;
                        int i19 = com.p314xaae8f345.mm.R.C30860x5b28f31.f561264dn;
                        if (!z18 && height <= g17) {
                            i19 = com.p314xaae8f345.mm.R.C30860x5b28f31.f561190bu;
                        }
                        int f17 = i65.a.f(activityC18133x39856dcd.mo55332x76847179(), i19);
                        android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) activityC18133x39856dcd.f249055g.getLayoutParams();
                        if (layoutParams2.bottomMargin != f17) {
                            layoutParams2.bottomMargin = f17;
                            activityC18133x39856dcd.f249055g.setLayoutParams(layoutParams2);
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPreDraw", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$25");
                        return true;
                    }
                });
            }
            int i19 = this.f249066r;
            if (i19 == 9 || i19 == 14) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsUploadUI", "attachWidget: show view: widget_line");
                android.view.View findViewById5 = findViewById(com.p314xaae8f345.mm.R.id.pmh);
                android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) findViewById5.getLayoutParams();
                layoutParams2.addRule(3, com.p314xaae8f345.mm.R.id.pm_);
                layoutParams2.topMargin = (int) (com.p314xaae8f345.mm.sdk.p2603x2137b148.x.l0().density * (this.f249066r == 9 ? 128 : 96));
                findViewById5.setLayoutParams(layoutParams2);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.z4 z4Var2 = this.f249069u;
        if ((z4Var2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.b5) || (z4Var2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.r5)) {
            android.widget.LinearLayout.LayoutParams layoutParams3 = (android.widget.LinearLayout.LayoutParams) b17.getLayoutParams();
            layoutParams3.width = -1;
            b17.setLayoutParams(layoutParams3);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.z4 z4Var3 = this.f249069u;
        if ((z4Var3 instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.c2) || (z4Var3 instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.a2) || (z4Var3 instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.b2) || (z4Var3 instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.d2)) {
            android.widget.LinearLayout.LayoutParams layoutParams4 = (android.widget.LinearLayout.LayoutParams) b17.getLayoutParams();
            layoutParams4.width = -1;
            b17.setLayoutParams(layoutParams4);
        }
        q7();
        if (this.f249066r == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initDragDropEvent", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.z4 z4Var4 = this.f249069u;
            if ((z4Var4 instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p7) || (z4Var4 instanceof de4.a)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Uj().mo50293x3498a0(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.sns.ui.SnsUploadUI.2
                    @Override // java.lang.Runnable
                    public void run() {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$2");
                        android.view.View.OnDragListener onDragListener = new android.view.View.OnDragListener() { // from class: com.tencent.mm.plugin.sns.ui.SnsUploadUI.2.1
                            /* JADX WARN: Removed duplicated region for block: B:35:0x01be A[ADDED_TO_REGION] */
                            @Override // android.view.View.OnDragListener
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public boolean onDrag(android.view.View r26, android.view.DragEvent r27) {
                                /*
                                    Method dump skipped, instructions count: 595
                                    To view this dump add '--comments-level debug' option
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18133x39856dcd.AnonymousClass2.AnonymousClass1.onDrag(android.view.View, android.view.DragEvent):boolean");
                            }
                        };
                        int i27 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18133x39856dcd.f249050x1;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$500", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18133x39856dcd activityC18133x39856dcd = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18133x39856dcd.this;
                        android.widget.FrameLayout frameLayout = activityC18133x39856dcd.Y;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$500", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                        if (frameLayout != null) {
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$500", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                            android.widget.FrameLayout frameLayout2 = activityC18133x39856dcd.Y;
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$500", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                            frameLayout2.setOnDragListener(onDragListener);
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$2");
                    }
                });
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initDragDropEvent", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsUploadUI", "widget is not instanceof PicWidget");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initDragDropEvent", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("attachWidget", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
    }

    public final void a7() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("cleanDraftSessionId", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        if (this.f249066r == 9) {
            gm0.j1.i();
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SNS_OPEN_UPLOAD_DRAFT_NEWTEXT_LAST_SESSIONID_STRING, this.I);
        } else {
            gm0.j1.i();
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SNS_OPEN_UPLOAD_DRAFT_LAST_SESSIONID_STRING, this.I);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("cleanDraftSessionId", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
    }

    public final void b7(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("exit", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.w0.f246522a.b(i17 == -1 ? 1 : 2);
        if (this.f249054f != null) {
            ta4.x0 d76 = d7();
            d76.d(this.f249054f.mo81565x22f21e20());
            d76.c(1, 2);
            d76.b();
        }
        if (this.f249051J) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0 s0Var = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0.f246470k0;
            long c17 = c01.id.c();
            s0Var.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportSnsFinderEntrance", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
            s0Var.J(10, "", 0, 0, c17, 0L, 0L, 0);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportSnsFinderEntrance", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("sns_upload_is_cancel_save_draft", i17 == -1);
        setResult(0, intent);
        finish();
        ca4.z0.m();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("exit", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x013a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c7() {
        /*
            Method dump skipped, instructions count: 528
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18133x39856dcd.c7():void");
    }

    public final ta4.x0 d7() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getInputAreaReporter", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        if (this.Q == null) {
            this.Q = new ta4.x0();
        }
        ta4.x0 x0Var = this.Q;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getInputAreaReporter", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        return x0Var;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.z4 e7(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getWidgetFromCache", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        java.util.Map map = this.M;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.z4 z4Var = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.z4) ((java.util.HashMap) map).get(java.lang.Integer.valueOf(i17));
        if (z4Var == null) {
            if (i17 == 0) {
                z4Var = pc4.d.f434943a.B() ? new de4.a(this) : new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.o7(this);
            } else if (i17 == 14) {
                z4Var = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.i6(this);
            } else if (i17 == 28) {
                z4Var = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.t2(this);
            }
            ((java.util.HashMap) map).put(java.lang.Integer.valueOf(i17), z4Var);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getWidgetFromCache", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        return z4Var;
    }

    public final void f7() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initData", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        this.f249067s = getIntent().getBooleanExtra("KSnsPostManu", false);
        this.f249068t = getIntent().getLongExtra("KTouchCameraTime", 0L);
        int intExtra = getIntent().getIntExtra("Ksnsupload_type", 0);
        this.f249066r = intExtra;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsUploadUI", "initData shareType:%s", java.lang.Integer.valueOf(intExtra));
        this.f249058l1 = getIntent().getBooleanExtra("Kis_take_photo", false) ? 2 : 1;
        this.E = getIntent().getBooleanExtra("need_result", false);
        this.F = getIntent().getBooleanExtra("K_go_to_SnsTimeLineUI", false);
        this.H = getIntent().getStringExtra("Ksnsupload_canvas_info");
        this.I = getIntent().getStringExtra("KSessionID");
        this.f249051J = getIntent().getBooleanExtra("ksnsupload_finder_need_report", false);
        this.K = getIntent().getBooleanExtra("need_ban_back_tips", false);
        this.L = getIntent().getBooleanExtra("need_ban_pic_touch", false);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.I)) {
            this.I = ca4.z0.l();
            getIntent().putExtra("KSessionID", this.I);
        } else {
            this.f249058l1 = 3;
        }
        ((s50.g0) ((u50.v) i95.n0.c(u50.v.class))).getClass();
        this.f249063p0 = o13.n.l(79);
        wa4.u uVar = (wa4.u) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ai(this, 2, wa4.u.class);
        if (uVar != null) {
            uVar.f525818d = this.f249063p0;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initData", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("finish", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        super.finish();
        overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559261p, com.p314xaae8f345.mm.R.C30854x2dc211.f559388dd);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("finish", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void g7(android.os.Bundle bundle) {
        java.lang.String string;
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initView", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        this.f249052d = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18153xb2f8a3ba) findViewById(com.p314xaae8f345.mm.R.id.mcm);
        this.f249053e = findViewById(com.p314xaae8f345.mm.R.id.n7x);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("customizeInputView", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("customizeInputView", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        fl5.i iVar = (fl5.i) findViewById(com.p314xaae8f345.mm.R.id.n7y);
        this.f249054f = iVar;
        iVar.mo81593x3abfd950(0, i65.a.f(mo55332x76847179(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561430ia) * i65.a.q(this));
        fl5.j g17 = fl5.j.g(this.f249054f);
        int n17 = ip.c.n();
        g17.f124094f = 0;
        g17.f124093e = n17;
        g17.f124089a = true;
        g17.d(null);
        this.f249054f.d(((com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.w1) ((su4.x0) i95.n0.c(su4.x0.class))).cj());
        this.f249054f.mo81563xafeef997(true).putInt("wechat_scene", 3);
        this.f249054f.mo81563xafeef997(true).putBoolean("if_support_wx_emoji", true);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initSelectHelper", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        final ul5.k m78511x9f88d943 = m78511x9f88d943();
        if (m78511x9f88d943 != 0) {
            ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2765x5e292867.C22717x128919c4) m78511x9f88d943).c(new ul5.j() { // from class: com.tencent.mm.plugin.sns.ui.SnsUploadUI.13
                @Override // ul5.j
                public void c(int i17) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onBounceOffsetChanged", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$13");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onBounceOffsetChanged", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$13");
                }

                @Override // ul5.j
                public void w(int i17) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onBounceStart", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$13");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18133x39856dcd.this.l7();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onBounceStart", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$13");
                }
            });
        }
        this.f249054f.b(((com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.w1) ((su4.x0) i95.n0.c(su4.x0.class))).bj(), com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.f(mo55332x76847179()), new nl5.a0() { // from class: com.tencent.mm.plugin.sns.ui.SnsUploadUI.14
            @Override // nl5.a0
            public void a(android.view.View view, nl5.z zVar, java.lang.String str) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onMenuItemClicked", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$14");
                long e17 = c01.id.e();
                if (zVar.f419931b == 2) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18133x39856dcd activityC18133x39856dcd = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18133x39856dcd.this;
                    activityC18133x39856dcd.f249054f.getText().insert(activityC18133x39856dcd.f249054f.mo81569x6f2c472c(), activityC18133x39856dcd.f249054f.p().getString(com.p314xaae8f345.mm.R.C30867xcad56011.jo7));
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$2100", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                    java.lang.String str2 = activityC18133x39856dcd.f249063p0;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$2100", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18133x39856dcd.i7(2, "", "", e17, str2);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onMenuItemClicked", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$14");
            }

            @Override // nl5.a0
            public void b(java.util.List list, int i17) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onMenuInit", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$14");
                long e17 = c01.id.e();
                ((su4.x0) i95.n0.c(su4.x0.class)).getClass();
                if (i17 != 8 && i17 != 1) {
                    ((sg0.y3) ((tg0.o1) i95.n0.c(tg0.o1.class))).getClass();
                    if (!su4.r2.l()) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18133x39856dcd activityC18133x39856dcd = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18133x39856dcd.this;
                        list.add(new nl5.z(activityC18133x39856dcd.f249054f.p().getString(com.p314xaae8f345.mm.R.C30867xcad56011.jo7), 2));
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$2100", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                        java.lang.String str = activityC18133x39856dcd.f249063p0;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$2100", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18133x39856dcd.i7(1, "", "", e17, str);
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onMenuInit", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$14");
            }
        }, new nl5.w(this) { // from class: com.tencent.mm.plugin.sns.ui.SnsUploadUI.15
            @Override // nl5.w
            public nl5.y a(nl5.y yVar) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAppend", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$15");
                yVar.f419926h = true;
                yVar.f419927i = m78511x9f88d943;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAppend", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$15");
                return yVar;
            }
        });
        this.f249054f.mo81552xeb238c3a(new android.text.TextWatcher() { // from class: com.tencent.mm.plugin.sns.ui.SnsUploadUI.16

            /* renamed from: d, reason: collision with root package name */
            public final java.util.List f249092d = new java.util.LinkedList();

            @Override // android.text.TextWatcher
            public void afterTextChanged(android.text.Editable editable) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("afterTextChanged", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$16");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18133x39856dcd activityC18133x39856dcd = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18133x39856dcd.this;
                android.text.Editable text = activityC18133x39856dcd.f249054f.getText();
                java.util.List list = this.f249092d;
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    text.removeSpan((android.text.style.ForegroundColorSpan) it.next());
                }
                ((java.util.LinkedList) list).clear();
                java.lang.String obj = activityC18133x39856dcd.f249054f.getText().toString();
                ((su4.x0) i95.n0.c(su4.x0.class)).getClass();
                java.util.regex.Matcher matcher = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.b0.f272719u.matcher(obj);
                while (matcher.find()) {
                    matcher.group();
                    int start = matcher.start();
                    int end = matcher.end();
                    activityC18133x39856dcd.getClass();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTopicSpanLinkColor", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                    int color = activityC18133x39856dcd.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77827x4b0c744c);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTopicSpanLinkColor", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                    android.text.style.ForegroundColorSpan foregroundColorSpan = new android.text.style.ForegroundColorSpan(color);
                    ((java.util.LinkedList) list).add(foregroundColorSpan);
                    text.setSpan(foregroundColorSpan, start, end, 33);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("afterTextChanged", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$16");
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("beforeTextChanged", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$16");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("beforeTextChanged", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$16");
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onTextChanged", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$16");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onTextChanged", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$16");
            }
        });
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initSelectHelper", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(getIntent().getStringExtra("Kdescription"))) {
            this.f249054f.mo81590x765074af(pg5.d.a(mo55332x76847179(), getIntent().getStringExtra("Kdescription")));
        } else if (this.f249054f != null && bundle != null && (string = bundle.getString("contentdesc")) != null) {
            this.f249054f.mo81590x765074af(string);
        }
        if (this.f249066r == 8) {
            this.f249054f.mo81590x765074af(pg5.d.a(mo55332x76847179(), getIntent().getStringExtra("Kdescription")));
        }
        this.f249054f.mo70738x2526cb14(getIntent().getIntExtra("KparseLen", 0));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.AbstractC18397x5bc42bbf abstractC18397x5bc42bbf = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.AbstractC18397x5bc42bbf) findViewById(com.p314xaae8f345.mm.R.id.m9x);
        this.f249061o = abstractC18397x5bc42bbf;
        abstractC18397x5bc42bbf.m71210x1b9709f9(this.f249054f);
        this.f249061o.setVisibility(4);
        this.Y = (android.widget.FrameLayout) findViewById(com.p314xaae8f345.mm.R.id.m7m);
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Hj().V2(displayMetrics.widthPixels, displayMetrics.heightPixels);
        this.f249054f.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.sns.ui.SnsUploadUI.6

            /* renamed from: d, reason: collision with root package name */
            public long f249118d;

            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$6");
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(view);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/plugin/sns/ui/SnsUploadUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                if (java.lang.System.currentTimeMillis() - this.f249118d > 500) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18133x39856dcd.V6(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18133x39856dcd.this);
                }
                this.f249118d = java.lang.System.currentTimeMillis();
                yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/SnsUploadUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$6");
            }
        });
        this.f249054f.setOnLongClickListener(new android.view.View.OnLongClickListener() { // from class: com.tencent.mm.plugin.sns.ui.SnsUploadUI.7
            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(android.view.View view) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onLongClick", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$7");
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(view);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/plugin/sns/ui/SnsUploadUI$7", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18133x39856dcd.V6(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18133x39856dcd.this);
                yj0.a.i(false, this, "com/tencent/mm/plugin/sns/ui/SnsUploadUI$7", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onLongClick", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$7");
                return false;
            }
        });
        final boolean[] zArr = {true};
        final boolean[] zArr2 = {false};
        this.f249054f.mo81552xeb238c3a(new android.text.TextWatcher() { // from class: com.tencent.mm.plugin.sns.ui.SnsUploadUI.8
            @Override // android.text.TextWatcher
            public void afterTextChanged(android.text.Editable editable) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("afterTextChanged", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$8");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18133x39856dcd activityC18133x39856dcd = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18133x39856dcd.this;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.AbstractC18397x5bc42bbf abstractC18397x5bc42bbf2 = activityC18133x39856dcd.f249061o;
                java.lang.String obj = activityC18133x39856dcd.f249054f.getText().toString();
                abstractC18397x5bc42bbf2.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkTipsVisibilityByText", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.AbstractC18420xe54becbe abstractC18420xe54becbe = abstractC18397x5bc42bbf2.f252293m;
                if (abstractC18420xe54becbe != null) {
                    abstractC18420xe54becbe.b(obj);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkTipsVisibilityByText", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("afterTextChanged", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$8");
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("beforeTextChanged", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$8");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("beforeTextChanged", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$8");
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onTextChanged", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$8");
                boolean[] zArr3 = zArr;
                boolean z18 = zArr3[0];
                fo3.s sVar = fo3.s.INSTANCE;
                if (z18) {
                    zArr3[0] = false;
                    sVar.Ab("ie_sns_upload");
                }
                sVar.a6("ie_sns_upload");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onTextChanged", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$8");
            }
        });
        this.f249052d.m70824x590ab8fc(this.f249054f.j());
        this.f249052d.m70825x7b40c7d1(false);
        java.lang.String stringExtra = getIntent().getStringExtra("reportSessionId");
        if (stringExtra == null) {
            stringExtra = "";
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18131x711b760 c18131x711b760 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18131x711b760) findViewById(com.p314xaae8f345.mm.R.id.c9w);
        this.f249062p = c18131x711b760;
        boolean z18 = this.f249066r == 14 && !stringExtra.contains("wx5dfbe0a95623607b");
        c18131x711b760.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initSettings", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
        c18131x711b760.f249047n = z18;
        if (z18) {
            gm0.j1.i();
            gm0.j1.n().f354821b.a(2842, c18131x711b760);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.h2 h2Var = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.h2(-1216949095);
            gm0.j1.i();
            gm0.j1.n().f354821b.g(h2Var);
        }
        r45.ed4 ed4Var = c18131x711b760.f249049p;
        ed4Var.f454845e = -1000.0f;
        ed4Var.f454844d = -1000.0f;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("restoreSyncFlagStatus", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
        if (c18131x711b760.f249044h) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("restoreSyncFlagStatus", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
        } else {
            gm0.j1.i();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.q1((java.lang.Integer) gm0.j1.u().c().l(68404, null));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("restoreSyncFlagStatus", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
        }
        c18131x711b760.a();
        c18131x711b760.b();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initSettings", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
        if (this.f249066r != 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18131x711b760 c18131x711b7602 = this.f249062p;
            c18131x711b7602.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setSyncGone", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
            c18131x711b7602.f249040d.setVisibility(8);
            c18131x711b7602.f249041e.setVisibility(8);
            c18131x711b7602.f249045i = false;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSyncGone", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
        }
        if (this.f249066r == 9) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18131x711b760 c18131x711b7603 = this.f249062p;
            c18131x711b7603.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showQzone", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
            if (c18131x711b7603.f249042f && c18131x711b7603.f249043g) {
                c18131x711b7603.f249040d.setVisibility(0);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showQzone", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
        }
        m78560xe21cbbf(false);
        mo78514x143f1b92().x0(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new java.lang.Runnable() { // from class: com.tencent.mm.plugin.sns.ui.SnsUploadUI.9
            @Override // java.lang.Runnable
            public void run() {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$9");
                int i17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18133x39856dcd.f249050x1;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1600", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18133x39856dcd.this.c7();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$1600", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$9");
            }
        });
        xa4.b.f534354a.d("view_exp");
        m78493xd9193382(0, getString(com.p314xaae8f345.mm.R.C30867xcad56011.je8), new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18133x39856dcd.AnonymousClass10(zArr2), null, new android.view.View.OnTouchListener(this) { // from class: com.tencent.mm.plugin.sns.ui.SnsUploadUI.11
            /* JADX WARN: Code restructure failed: missing block: B:7:0x0039, code lost:
            
                if (r13 != 6) goto L12;
             */
            @Override // android.view.View.OnTouchListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public boolean onTouch(android.view.View r13, android.view.MotionEvent r14) {
                /*
                    r12 = this;
                    java.lang.String r0 = "onTouch"
                    java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.SnsUploadUI$11"
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r0, r1)
                    java.lang.String r2 = "com/tencent/mm/plugin/sns/ui/SnsUploadUI$11"
                    java.lang.String r3 = "android/view/View$OnTouchListener"
                    java.lang.String r4 = "onTouch"
                    java.lang.String r5 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
                    java.util.ArrayList r6 = new java.util.ArrayList
                    r6.<init>()
                    r6.add(r13)
                    r6.add(r14)
                    java.lang.Object[] r7 = r6.toArray()
                    r6.clear()
                    r6 = r12
                    yj0.a.b(r2, r3, r4, r5, r6, r7)
                    int r13 = r14.getAction()
                    fo3.s r2 = fo3.s.INSTANCE
                    r3 = 0
                    r4 = 1
                    java.lang.String r5 = "ce_sns_upload"
                    if (r13 == 0) goto L43
                    if (r13 == r4) goto L3c
                    r6 = 5
                    if (r13 == r6) goto L43
                    r4 = 6
                    if (r13 == r4) goto L3c
                    goto L4c
                L3c:
                    r2.H2(r5, r14)
                    r2.Qa(r5)
                    goto L4c
                L43:
                    boolean[] r13 = r2
                    r13[r3] = r4
                    java.lang.String r13 = "<SnsUpload>"
                    r2.Z7(r5, r13)
                L4c:
                    java.lang.String r8 = "com/tencent/mm/plugin/sns/ui/SnsUploadUI$11"
                    java.lang.String r9 = "android/view/View$OnTouchListener"
                    java.lang.String r10 = "onTouch"
                    java.lang.String r11 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
                    r6 = 0
                    r7 = r12
                    yj0.a.i(r6, r7, r8, r9, r10, r11)
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
                    return r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18133x39856dcd.AnonymousClass11.onTouch(android.view.View, android.view.MotionEvent):boolean");
            }
        }, com.p314xaae8f345.mm.ui.fb.GREEN);
        findViewById(com.p314xaae8f345.mm.R.id.otq).setOnTouchListener(new android.view.View.OnTouchListener() { // from class: com.tencent.mm.plugin.sns.ui.SnsUploadUI.12
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onTouch", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$12");
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(view);
                arrayList.add(motionEvent);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/plugin/sns/ui/SnsUploadUI$12", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
                if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18133x39856dcd.this.l7()) {
                    yj0.a.i(true, this, "com/tencent/mm/plugin/sns/ui/SnsUploadUI$12", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onTouch", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$12");
                    return true;
                }
                yj0.a.i(false, this, "com/tencent/mm/plugin/sns/ui/SnsUploadUI$12", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onTouch", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$12");
                return false;
            }
        });
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.o7 Nj = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Nj();
        boolean z19 = !this.f249067s;
        Nj.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setIsReportShareFlag", "com.tencent.mm.plugin.sns.model.UploadManager");
        Nj.f246091c = z19;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setIsReportShareFlag", "com.tencent.mm.plugin.sns.model.UploadManager");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setupInputScrollWithV2Config", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.hu huVar = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.hu(mo55332x76847179());
        int h17 = i65.a.h(mo55332x76847179(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561190bu);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setExtraPadding", "com.tencent.mm.plugin.sns.ui.SnsUploadInputScrollHelper");
        huVar.f250070d = h17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setExtraPadding", "com.tencent.mm.plugin.sns.ui.SnsUploadInputScrollHelper");
        android.view.View containerView = findViewById(com.p314xaae8f345.mm.R.id.otq);
        fl5.i inputView = this.f249054f;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18153xb2f8a3ba scrollView = this.f249052d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.AbstractC18397x5bc42bbf footer = this.f249061o;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setUpView", "com.tencent.mm.plugin.sns.ui.SnsUploadInputScrollHelper");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(containerView, "containerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inputView, "inputView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scrollView, "scrollView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(footer, "footer");
        containerView.setOnTouchListener(null);
        huVar.f250073g = inputView;
        huVar.f250074h = scrollView;
        huVar.f250075i = footer;
        scrollView.m70823x788d9147(false);
        inputView.j().setOnTouchListener(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.eu(footer, scrollView, huVar));
        inputView.mo81363xda276ede(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.fu(huVar, footer, inputView));
        footer.m71211x538bde4a(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.gu(inputView, footer, huVar));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setUpView", "com.tencent.mm.plugin.sns.ui.SnsUploadInputScrollHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setupInputScrollWithV2Config", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17947x83d458f1 c17947x83d458f1 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17947x83d458f1) findViewById(com.p314xaae8f345.mm.R.id.a5o);
        this.f249057i = c17947x83d458f1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18131x711b760 c18131x711b7604 = this.f249062p;
        c17947x83d458f1.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initWidget", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
        c17947x83d458f1.f247778m = c18131x711b7604;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initWidget", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17970xbe575679 c17970xbe575679 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17970xbe575679) findViewById(com.p314xaae8f345.mm.R.id.f567225io1);
        this.f249059m = c17970xbe575679;
        c17970xbe575679.m70595x49da5d2f(this);
        switch (this.f249066r) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 27:
            case 28:
            case 29:
            case 30:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 40:
            case 41:
            case 42:
            case com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.InterfaceC11224x4860a6b.f32774x503933e6 /* 43 */:
            case 44:
            case 45:
            case 46:
                android.view.ViewStub viewStub = (android.view.ViewStub) findViewById(com.p314xaae8f345.mm.R.id.f568049li1);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("enableNewLabelRangeControl", "com.tencent.mm.plugin.sns.ui.config.SnsLabelRangeConfig");
                int r17 = gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SNS_GROUP_INT_SYNC, 0);
                if (r17 == 0) {
                    z17 = cc4.a.f122014a;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enableNewLabelRangeControl", "com.tencent.mm.plugin.sns.ui.config.SnsLabelRangeConfig");
                } else if (r17 != 2) {
                    if (cc4.a.f122014a) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsLabelRangeConfig", "enableNewLabelRangeControl false");
                        cc4.a.f122014a = false;
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enableNewLabelRangeControl", "com.tencent.mm.plugin.sns.ui.config.SnsLabelRangeConfig");
                    z17 = false;
                } else {
                    if (!cc4.a.f122014a) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsLabelRangeConfig", "enableNewLabelRangeControl true");
                        cc4.a.f122014a = true;
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enableNewLabelRangeControl", "com.tencent.mm.plugin.sns.ui.config.SnsLabelRangeConfig");
                    z17 = true;
                }
                viewStub.setLayoutResource(z17 ? com.p314xaae8f345.mm.R.C30864xbddafb2a.cun : com.p314xaae8f345.mm.R.C30864xbddafb2a.cuo);
                this.f249060n = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.AbstractC17949x28e47a30) viewStub.inflate();
                break;
        }
        this.f249060n.a(this.f249062p);
        this.f249060n.mo70561xb720519c(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.sns.ui.SnsUploadUI$$b
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                java.util.Iterator it;
                boolean z27;
                boolean z28;
                boolean z29;
                int i17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18133x39856dcd.f249050x1;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18133x39856dcd activityC18133x39856dcd = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18133x39856dcd.this;
                activityC18133x39856dcd.getClass();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(view);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/plugin/sns/ui/SnsUploadUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", activityC18133x39856dcd, array);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("lambda$initView$1", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(view);
                java.lang.Object[] array2 = arrayList2.toArray();
                arrayList2.clear();
                yj0.a.b("com/tencent/mm/plugin/sns/ui/SnsUploadUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", activityC18133x39856dcd, array2);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsUploadUI", "restoreLastRangeInfo");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("restoreLastRangeInfo", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                wa4.x g18 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Nj().g();
                java.util.Iterator it6 = g18.f525832d.iterator();
                boolean z37 = true;
                boolean z38 = true;
                while (it6.hasNext()) {
                    wa4.y yVar = (wa4.y) it6.next();
                    int i18 = yVar.f525839e;
                    if (i18 == 2) {
                        gm0.j1.i();
                        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n18 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(yVar.f525838d, z37);
                        if (n18 != null && ((int) n18.E2) != 0) {
                            arrayList3.add(yVar.f525838d);
                        }
                        it = it6;
                        z27 = z37;
                    } else if (i18 == z37) {
                        if (z38) {
                            activityC18133x39856dcd.f249076z.clear();
                            z38 = false;
                        }
                        activityC18133x39856dcd.f249076z.add(yVar.f525838d);
                        java.lang.String g19 = ((b93.b) c93.a.a()).g(yVar.f525838d);
                        if (g19 != null) {
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("enableNewLabelRangeControl", "com.tencent.mm.plugin.sns.ui.config.SnsLabelRangeConfig");
                            it = it6;
                            boolean z39 = z38;
                            int r18 = gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SNS_GROUP_INT_SYNC, 0);
                            if (r18 == 0) {
                                z27 = true;
                                boolean z47 = cc4.a.f122014a;
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enableNewLabelRangeControl", "com.tencent.mm.plugin.sns.ui.config.SnsLabelRangeConfig");
                                z28 = z47;
                            } else if (r18 != 2) {
                                if (cc4.a.f122014a) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsLabelRangeConfig", "enableNewLabelRangeControl false");
                                    z29 = false;
                                    cc4.a.f122014a = false;
                                } else {
                                    z29 = false;
                                }
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enableNewLabelRangeControl", "com.tencent.mm.plugin.sns.ui.config.SnsLabelRangeConfig");
                                z28 = z29;
                                z27 = true;
                            } else {
                                if (cc4.a.f122014a) {
                                    z27 = true;
                                } else {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsLabelRangeConfig", "enableNewLabelRangeControl true");
                                    z27 = true;
                                    cc4.a.f122014a = true;
                                }
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enableNewLabelRangeControl", "com.tencent.mm.plugin.sns.ui.config.SnsLabelRangeConfig");
                                z28 = z27;
                            }
                            if (z28) {
                                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(((b93.b) c93.a.a()).j(yVar.f525838d))) {
                                    arrayList4.add(g19);
                                }
                            } else {
                                arrayList4.add(g19);
                            }
                            z38 = z39;
                        } else {
                            z37 = true;
                        }
                    } else {
                        it = it6;
                        z27 = z37;
                        if (i18 == 0) {
                            arrayList5.add(yVar.f525838d);
                        }
                    }
                    z37 = z27;
                    it6 = it;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsUploadUI", "[restoreLastRangeInfo] mLabelIdList:%s", activityC18133x39856dcd.f249076z);
                activityC18133x39856dcd.f249074y = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(arrayList3, ",");
                activityC18133x39856dcd.f249070v = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(arrayList4, ",");
                activityC18133x39856dcd.f249072x = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(arrayList5, ",");
                java.util.LinkedList linkedList = g18.f525836h;
                java.util.LinkedList linkedList2 = g18.f525837i;
                java.util.LinkedList linkedList3 = g18.f525835g;
                activityC18133x39856dcd.getIntent().putStringArrayListExtra("label_id", activityC18133x39856dcd.f249076z);
                activityC18133x39856dcd.getIntent().putExtra("Kother_user_name_list", activityC18133x39856dcd.f249072x);
                activityC18133x39856dcd.getIntent().putExtra("Klabel_name_list", activityC18133x39856dcd.f249070v);
                activityC18133x39856dcd.getIntent().putExtra("Kchat_room_name_list", activityC18133x39856dcd.f249074y);
                activityC18133x39856dcd.getIntent().putStringArrayListExtra("KInteract_user_list", new java.util.ArrayList<>(linkedList3));
                activityC18133x39856dcd.getIntent().putStringArrayListExtra("KExclude_user_list", new java.util.ArrayList<>(linkedList));
                activityC18133x39856dcd.getIntent().putStringArrayListExtra("KExclude_label_list", new java.util.ArrayList<>(linkedList2));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsUploadUI", "[restoreLastRangeInfo] mLabelNameList size:%d", java.lang.Integer.valueOf(arrayList4.size()));
                if (g18.f525834f) {
                    activityC18133x39856dcd.getIntent().putExtra("Ktag_range_index", 3);
                } else {
                    activityC18133x39856dcd.getIntent().putExtra("Ktag_range_index", 2);
                }
                activityC18133x39856dcd.o7(activityC18133x39856dcd.getIntent());
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("restoreLastRangeInfo", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                yj0.a.h(activityC18133x39856dcd, "com/tencent/mm/plugin/sns/ui/SnsUploadUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("lambda$initView$1", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                yj0.a.h(activityC18133x39856dcd, "com/tencent/mm/plugin/sns/ui/SnsUploadUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setRangeWidgetRangeChangeCallback", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        this.f249060n.mo70562x8454105e(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18136xce452ef6(this));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setRangeWidgetRangeChangeCallback", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        this.f249059m.d(10, -1, getIntent());
        this.f249057i.e(6, -1, getIntent(), this.f249060n.mo70559x8b2fba9f() == 0);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0 s0Var = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0.f246470k0;
        s0Var.U(0);
        s0Var.B().f142773g = 2;
        o7(getIntent());
        mo48674x36654fab();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initView", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLayoutId", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        boolean v07 = com.p314xaae8f345.mm.ui.bk.v0();
        int i17 = com.p314xaae8f345.mm.R.C30864xbddafb2a.cur;
        if (v07 && com.p314xaae8f345.mm.ui.bk.y()) {
            if (fp.h.c(30) && com.p314xaae8f345.mm.ui.ee.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsUploadUI", "getLayoutId: use v2 layout large");
            } else if ((com.p314xaae8f345.mm.ui.bk.N(getTaskId()) || (com.p314xaae8f345.mm.ui.bk.O(getContentResolver()) && !isInMultiWindowMode())) && !com.p314xaae8f345.mm.ui.ee.b(getTaskId())) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsUploadUI", "getLayoutId: use v2 layout large");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsUploadUI", "getLayoutId: use v2 layout");
            }
            i17 = com.p314xaae8f345.mm.R.C30864xbddafb2a.cuq;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsUploadUI", "getLayoutId: use v2 layout, no magic window");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLayoutId", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        return i17;
    }

    public final void h7(java.lang.Boolean bool) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reflectSetBundleDefusable", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        if (fp.h.c(33) && ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_sns_reflect_set_bundle_defuse, true)) {
            try {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsUploadUI", "reflectBundleDefusable: defusable:%b, build version:%d", bool, java.lang.Integer.valueOf(android.os.Build.VERSION.SDK_INT));
                java.lang.reflect.Method declaredMethod = android.os.BaseBundle.class.getDeclaredMethod("setShouldDefuse", java.lang.Boolean.TYPE);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(null, bool);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SnsUploadUI", e17, "reflectSetBundleDefusable failed", new java.lang.Object[0]);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reflectSetBundleDefusable", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f
    /* renamed from: isCallSuperOnSaveInstanceState */
    public boolean mo52915xa8181dad() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isCallSuperOnSaveInstanceState", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_media_opt_saveinstance, true) && (com.p314xaae8f345.mm.ui.bk.Q() || com.p314xaae8f345.mm.ui.bk.A());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isCallSuperOnSaveInstanceState", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        return z17;
    }

    public final void j7(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportSnsPostGroup", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0 s0Var = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0.f246470k0;
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6969xa989d0b0 B = s0Var.B();
        B.f142770d = B.b("SessionID", this.I, true);
        s0Var.B().f142788v = i17;
        if (i17 == 3 || i17 == 2) {
            s0Var.K();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportSnsPostGroup", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
    }

    public final void k7() {
        java.lang.String str;
        java.util.Map map;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportSnsPostInfo", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        dx1.g.f326022a.j("SnsPublishProcess", "opresult_", java.lang.Integer.valueOf(this.f249075y0), bx1.u.f117842d);
        w52.g gVar = (w52.g) ((e42.f0) i95.n0.c(e42.f0.class));
        gVar.Di("startTime", this.f249073x0 + "");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        sb6.append(java.lang.System.currentTimeMillis());
        sb6.append("");
        gVar.Di("endTime", sb6.toString());
        gVar.Di("bussinessId", this.I);
        gVar.Di("shareType", this.f249066r + "");
        gVar.Di("hadLocation", this.f249059m.m70594x67a1c57f() + "");
        gVar.Di("desc", this.f249054f.getText().toString());
        gVar.Di("nextStep", this.f249075y0 + "");
        gVar.Di("beforeStep", this.f249058l1 + "");
        gVar.Di("ContactTagCount", this.B + "");
        gVar.Di("mIsBlackGroup", this.D + "");
        if (this.A != null) {
            str = this.A.size() + "";
        } else {
            str = "0";
        }
        gVar.Di("mContactNameList", str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.z4 z4Var = this.f249069u;
        if (z4Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p7) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p7 p7Var = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p7) z4Var;
            p7Var.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getPathsSourceMap", "com.tencent.mm.plugin.sns.ui.PicWidget");
            java.util.HashMap hashMap = new java.util.HashMap();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.x7 x7Var = p7Var.f251697g;
            if (x7Var != null && !com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.x7.a(x7Var).isEmpty()) {
                java.util.Iterator it = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.x7.a(x7Var).iterator();
                while (it.hasNext()) {
                    java.lang.String str2 = (java.lang.String) it.next();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$400", "com.tencent.mm.plugin.sns.ui.PicWidget$MediaObj");
                    java.util.Map map2 = x7Var.f253026b;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$400", "com.tencent.mm.plugin.sns.ui.PicWidget$MediaObj");
                    if (((java.lang.Boolean) ((java.util.HashMap) map2).get(str2)) != null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$400", "com.tencent.mm.plugin.sns.ui.PicWidget$MediaObj");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$400", "com.tencent.mm.plugin.sns.ui.PicWidget$MediaObj");
                        hashMap.put(str2, (java.lang.Boolean) ((java.util.HashMap) map2).get(str2));
                    }
                }
            }
            if (x7Var != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$400", "com.tencent.mm.plugin.sns.ui.PicWidget$MediaObj");
                map = x7Var.f253026b;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$400", "com.tencent.mm.plugin.sns.ui.PicWidget$MediaObj");
            } else {
                map = null;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPathsSourceMap", "com.tencent.mm.plugin.sns.ui.PicWidget");
            if (map != null && !map.isEmpty()) {
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                java.util.Iterator it6 = map.values().iterator();
                while (it6.hasNext()) {
                    sb7.append(((java.lang.Boolean) it6.next()).booleanValue() ? 1 : 2);
                    sb7.append("#");
                }
                gVar.Di("picSource", sb7.toString());
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.z4 z4Var2 = this.f249069u;
        if (z4Var2 instanceof de4.a) {
            de4.a aVar = (de4.a) z4Var2;
            aVar.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getPathsSourceMap", "com.tencent.mm.plugin.sns.ui.widget.multi_image.MultiPicWidget");
            fe4.b v17 = ((ee4.b1) aVar.k(ee4.b1.class)).v();
            v17.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getPathSourceMap", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublicMultiPicWrapperItem");
            java.util.HashMap hashMap2 = v17.f343097c;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPathSourceMap", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublicMultiPicWrapperItem");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPathsSourceMap", "com.tencent.mm.plugin.sns.ui.widget.multi_image.MultiPicWidget");
            if (!hashMap2.isEmpty()) {
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                java.util.Iterator it7 = hashMap2.values().iterator();
                while (it7.hasNext()) {
                    sb8.append(((java.lang.Boolean) it7.next()).booleanValue() ? 1 : 2);
                    sb8.append("#");
                }
                gVar.Di("picSource", sb8.toString());
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.z4 z4Var3 = this.f249069u;
        if (z4Var3 instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.i6) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.i6 i6Var = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.i6) z4Var3;
            i6Var.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isLocalCaptureVideo", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
            r45.vh4 vh4Var = i6Var.f250115p;
            boolean z18 = vh4Var != null ? vh4Var.f469768e : false;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isLocalCaptureVideo", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
            gVar.Di("sightSource", z18 ? "1" : "2");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportSnsPostInfo", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
    }

    public boolean l7() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resetFooter", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsUploadUI", "resetFooter: ");
        mo48674x36654fab();
        if (!this.f249061o.b()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resetFooter", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
            return false;
        }
        this.f249061o.g();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resetFooter", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        return true;
    }

    public void m7(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resetWidget", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsUploadUI", "resetWidget");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2217x5e9bb8.C18379xb7ff44a c18379xb7ff44a = this.f249065q;
        if (c18379xb7ff44a != null) {
            c18379xb7ff44a.setVisibility(8);
        }
        android.widget.LinearLayout linearLayout = this.f249055g;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
            this.f249055g.setVisibility(8);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.z4 z4Var = this.f249069u;
        if (z4Var != null) {
            z4Var.e();
        }
        f7();
        Z6(bundle);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resetWidget", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
    }

    public void n7(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setHasCommited", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        this.G = z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setHasCommited", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
    }

    public void o7(android.content.Intent intent) {
        java.util.List list;
        final java.util.List list2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setRange", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        this.f249060n.b(5, -1, intent, this.f249057i);
        this.f249057i.g(this.f249060n.mo70559x8b2fba9f() == 0);
        final int intExtra = intent.getIntExtra("Ktag_range_index", 0);
        if (intExtra >= 2) {
            this.f249070v = intent.getStringExtra("Klabel_name_list");
            this.f249071w = intent.getStringExtra("KNew_label_name_list");
            this.f249072x = intent.getStringExtra("Kother_user_name_list");
            this.f249074y = intent.getStringExtra("Kchat_room_name_list");
            this.f249076z = intent.getStringArrayListExtra("label_id");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f249070v)) {
                list = null;
            } else {
                list = java.util.Arrays.asList(this.f249070v.split(","));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsUploadUI", "[setRange] mLabelNameList size:%d", java.lang.Integer.valueOf(list.size()));
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f249072x)) {
                list2 = null;
            } else {
                list2 = java.util.Arrays.asList(this.f249072x.split(","));
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0.f246470k0.T(list2);
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f249071w)) {
                if (list2 == null) {
                    list2 = java.util.Arrays.asList(this.f249071w.split(","));
                } else {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.addAll(list2);
                    arrayList.addAll(java.util.Arrays.asList(this.f249071w.split(",")));
                    list2 = arrayList;
                }
            }
            final java.util.List asList = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f249074y) ? null : java.util.Arrays.asList(this.f249074y.split(","));
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(this.f249076z)) {
                this.f249076z = new java.util.ArrayList();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsUploadUI", "[setRange] mLabelIdList:%s", this.f249076z);
            final java.util.List list3 = list;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Uj().mo50293x3498a0(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.sns.ui.SnsUploadUI.19
                @Override // java.lang.Runnable
                public void run() {
                    boolean z17;
                    java.util.Iterator it;
                    com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6969xa989d0b0 c6969xa989d0b0;
                    com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6969xa989d0b0 c6969xa989d0b02;
                    com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6969xa989d0b0 c6969xa989d0b03;
                    java.util.Iterator it6;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$19");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("enableNewLabelRangeControl", "com.tencent.mm.plugin.sns.ui.config.SnsLabelRangeConfig");
                    int r17 = gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SNS_GROUP_INT_SYNC, 0);
                    if (r17 == 0) {
                        z17 = cc4.a.f122014a;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enableNewLabelRangeControl", "com.tencent.mm.plugin.sns.ui.config.SnsLabelRangeConfig");
                    } else if (r17 != 2) {
                        if (cc4.a.f122014a) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsLabelRangeConfig", "enableNewLabelRangeControl false");
                            cc4.a.f122014a = false;
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enableNewLabelRangeControl", "com.tencent.mm.plugin.sns.ui.config.SnsLabelRangeConfig");
                        z17 = false;
                    } else {
                        if (!cc4.a.f122014a) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsLabelRangeConfig", "enableNewLabelRangeControl true");
                            cc4.a.f122014a = true;
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enableNewLabelRangeControl", "com.tencent.mm.plugin.sns.ui.config.SnsLabelRangeConfig");
                        z17 = true;
                    }
                    java.util.List<java.lang.String> list4 = list2;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18133x39856dcd activityC18133x39856dcd = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18133x39856dcd.this;
                    if (z17) {
                        int i17 = 0;
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18133x39856dcd.f249050x1;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$2302", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                        activityC18133x39856dcd.A = arrayList2;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$2302", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(list4)) {
                            java.util.ArrayList arrayList3 = new java.util.ArrayList(list4);
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$2302", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                            activityC18133x39856dcd.A = arrayList3;
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$2302", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$2400", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                        java.util.ArrayList arrayList4 = activityC18133x39856dcd.f249076z;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$2400", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$2500", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateLabelReportStructByLabelIdList", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                        java.util.concurrent.ConcurrentHashMap concurrentHashMap = activityC18133x39856dcd.N;
                        concurrentHashMap.clear();
                        if (arrayList4 != null && arrayList4.size() > 0) {
                            java.util.Iterator it7 = arrayList4.iterator();
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0 s0Var = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0.f246470k0;
                            int i19 = intExtra;
                            java.util.Set w17 = s0Var.w(i19);
                            if (w17 == null) {
                                w17 = new java.util.HashSet();
                            }
                            while (it7.hasNext()) {
                                java.lang.String str = (java.lang.String) it7.next();
                                java.util.List<java.lang.String> j17 = ((b93.b) c93.a.a()).j(str);
                                if (j17 == null || j17.size() == 0) {
                                    it = it7;
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsUploadUI", "[updateLabelReportStructByLabelIdList] namList empty, labelId is %s", str);
                                } else {
                                    it = it7;
                                    java.lang.String g17 = ((b93.b) c93.a.a()).g(str);
                                    for (java.lang.String str2 : j17) {
                                    }
                                    if (g17 == null) {
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsUploadUI", "[updateLabelReportStructByLabelIdList] labelName empty, labelId is %s", str);
                                    } else {
                                        if (w17.contains(str)) {
                                            i17++;
                                        }
                                        concurrentHashMap.put(g17, j17);
                                    }
                                }
                                it7 = it;
                            }
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsUploadUI", "updateLabelReportStructByLabelIdList: selectVisibleState:%d, matchCountFromSearch:%d", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i17));
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0.f246470k0.B().M = i17;
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateLabelReportStructByLabelIdList", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$2500", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                    } else {
                        int i27 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18133x39856dcd.f249050x1;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$2200", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                        activityC18133x39856dcd.getClass();
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getContactNamesFromLabelsAndOtherUserName", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                        activityC18133x39856dcd.A = new java.util.ArrayList();
                        activityC18133x39856dcd.B = 0;
                        java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = activityC18133x39856dcd.N;
                        concurrentHashMap2.clear();
                        java.util.List list5 = list3;
                        if (list5 != null && list5.size() > 0) {
                            java.util.Iterator it8 = list5.iterator();
                            java.util.HashSet hashSet = new java.util.HashSet();
                            while (it8.hasNext()) {
                                java.lang.String str3 = (java.lang.String) it8.next();
                                java.util.Iterator it9 = it8;
                                java.util.List j18 = ((b93.b) c93.a.a()).j(((b93.b) c93.a.a()).e(str3));
                                if (j18 == null || j18.size() == 0) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsUploadUI", "dz: getContactNamesFromLabelsAndOtherUserName,namelist get bu label is null");
                                    break;
                                }
                                for (java.util.Iterator it10 = j18.iterator(); it10.hasNext(); it10 = it10) {
                                    hashSet.add((java.lang.String) it10.next());
                                    activityC18133x39856dcd.B++;
                                }
                                concurrentHashMap2.put(str3, j18);
                                it8 = it9;
                            }
                            activityC18133x39856dcd.A = new java.util.ArrayList(hashSet);
                        }
                        if (list5 != null) {
                            java.util.Iterator it11 = list5.iterator();
                            int i28 = 0;
                            while (it11.hasNext()) {
                                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0((java.lang.String) it11.next())) {
                                    i28++;
                                }
                            }
                            activityC18133x39856dcd.B = i28;
                        }
                        activityC18133x39856dcd.C = 0;
                        if (list4 != null && list4.size() > 0) {
                            for (java.lang.String str4 : list4) {
                                if (!activityC18133x39856dcd.A.contains(str4)) {
                                    activityC18133x39856dcd.A.add(str4);
                                    activityC18133x39856dcd.C++;
                                }
                            }
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getContactNamesFromLabelsAndOtherUserName", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$2200", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                    }
                    int i29 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18133x39856dcd.f249050x1;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$2600", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                    activityC18133x39856dcd.getClass();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getContactNamesFromChatroom", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                    java.util.Map map = activityC18133x39856dcd.P;
                    java.util.List list6 = asList;
                    if (list6 == null || list6.isEmpty()) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getContactNamesFromChatroom", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                    } else {
                        java.util.HashMap hashMap = (java.util.HashMap) map;
                        hashMap.clear();
                        java.util.Iterator it12 = list6.iterator();
                        while (it12.hasNext()) {
                            java.lang.String str5 = (java.lang.String) it12.next();
                            java.util.ArrayList arrayList5 = new java.util.ArrayList();
                            ((py.a) ((qy.i) i95.n0.c(qy.i.class))).getClass();
                            java.util.List<java.lang.String> n17 = c01.v1.n(str5);
                            if (n17 != null) {
                                ((java.util.LinkedList) n17).size();
                                for (java.lang.String str6 : n17) {
                                    if (activityC18133x39856dcd.A.contains(str6) || !c01.e2.J(str6)) {
                                        it6 = it12;
                                    } else {
                                        it6 = it12;
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsUploadUI", "getContactNamesFromChatroom memberName:%s", str6);
                                        activityC18133x39856dcd.A.add(str6);
                                        activityC18133x39856dcd.C++;
                                    }
                                    if (c01.e2.J(str6)) {
                                        arrayList5.add(str6);
                                    }
                                    it12 = it6;
                                }
                                arrayList5.size();
                                hashMap.put(str5, arrayList5);
                            }
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getContactNamesFromChatroom", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$2600", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$2700", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                    java.util.concurrent.ConcurrentHashMap concurrentHashMap3 = activityC18133x39856dcd.N;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$2700", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                    if (concurrentHashMap3 != null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$2700", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$2700", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                        if (!concurrentHashMap3.isEmpty()) {
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0 s0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0.f246470k0;
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$2700", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$2700", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$2400", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                            java.util.ArrayList arrayList6 = activityC18133x39856dcd.f249076z;
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$2400", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                            s0Var2.getClass();
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateSelectedLabelReport", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
                            if (concurrentHashMap3 != null && !concurrentHashMap3.isEmpty() && (c6969xa989d0b03 = s0Var2.f246492l) != null) {
                                c6969xa989d0b03.f142789w = concurrentHashMap3.keySet().size();
                                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                                for (java.util.Map.Entry entry : concurrentHashMap3.entrySet()) {
                                    java.util.List list7 = (java.util.List) entry.getValue();
                                    if (list7 != null) {
                                        sb6.append((java.lang.String) entry.getKey());
                                        sb6.append("|");
                                        sb6.append(list7.size());
                                        sb6.append(";");
                                    }
                                }
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsReportHelper", "[updateSelectedLabelReport] SelectedLabelList size:%d", java.lang.Integer.valueOf(concurrentHashMap3.size()));
                                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6969xa989d0b0 c6969xa989d0b04 = s0Var2.f246492l;
                                c6969xa989d0b04.f142790x = c6969xa989d0b04.b("SelectedLabelList", sb6.toString(), true);
                            }
                            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(arrayList6) && (c6969xa989d0b02 = s0Var2.f246492l) != null) {
                                c6969xa989d0b02.C = c6969xa989d0b02.b("SelectedLabelidList", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(arrayList6, ";"), true);
                            }
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateSelectedLabelReport", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
                        }
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$2800", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$2800", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                    if (map != null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$2800", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$2800", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                        if (!((java.util.HashMap) map).isEmpty()) {
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0 s0Var3 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0.f246470k0;
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$2800", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$2800", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                            s0Var3.getClass();
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateSelectedChatroomReport", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
                            if (map != null) {
                                java.util.HashMap hashMap2 = (java.util.HashMap) map;
                                if (!hashMap2.isEmpty() && (c6969xa989d0b0 = s0Var3.f246492l) != null) {
                                    c6969xa989d0b0.f142783q = hashMap2.keySet().size();
                                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                                    for (java.util.Map.Entry entry2 : hashMap2.entrySet()) {
                                        java.util.List list8 = (java.util.List) entry2.getValue();
                                        if (list8 != null) {
                                            sb7.append((java.lang.String) entry2.getKey());
                                            sb7.append("|");
                                            sb7.append(list8.size());
                                            sb7.append(";");
                                        }
                                    }
                                    com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6969xa989d0b0 c6969xa989d0b05 = s0Var3.f246492l;
                                    c6969xa989d0b05.f142784r = c6969xa989d0b05.b("SelectedChatroomList", sb7.toString(), true);
                                }
                            }
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateSelectedChatroomReport", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
                        }
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$19");
                }
            });
            if (intExtra == 2) {
                this.D = false;
            } else {
                this.D = true;
            }
        } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(this.A)) {
            this.A.clear();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0.f246470k0.U(intExtra);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setRange", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        int i19;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        super.onActivityResult(i17, i18, intent);
        dx1.f fVar = dx1.g.f326022a;
        fVar.j("SnsPublishProcess", "editPageTimes", 1, bx1.u.f117843e);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.i0 i0Var = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.j0.f246394a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addTraceFromRequestCode", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
        switch (i17) {
            case 5:
                i19 = 4;
                break;
            case 6:
                i19 = 3;
                break;
            case 7:
                i19 = 6;
                break;
            case 8:
            default:
                i19 = -1;
                break;
            case 9:
                i19 = 7;
                break;
            case 10:
                i19 = 2;
                break;
            case 11:
                i19 = 8;
                break;
            case 12:
                i19 = 9;
                break;
        }
        if (i19 != -1) {
            fVar.j("SnsPublishProcess", "actionTrace_", java.lang.Integer.valueOf(i19), bx1.u.f117844f);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addTraceFromRequestCode", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
        fl5.i iVar = this.f249054f;
        if (iVar != null) {
            iVar.clearFocus();
        }
        if (i18 != -1) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
            return;
        }
        if (i17 == 30764) {
            android.os.Bundle bundleExtra = intent.getBundleExtra("result_data");
            if (bundleExtra != null && bundleExtra.getString("go_next", "").equals("gdpr_auth_location")) {
                gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_GDPR_LOCATION_PERMISSION_DESCRIBE_CONFIRM_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
                tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
                ((sb0.f) jVar).getClass();
                j35.u.i(mo55332x76847179, "android.permission.ACCESS_FINE_LOCATION", 64);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
            return;
        }
        if (this.f249069u.mo70827x9d4787cb(i17, i18, intent)) {
            q7();
        }
        if (i17 != 5) {
            if (i17 != 6) {
                if (i17 == 10) {
                    if (intent == null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                        return;
                    }
                    java.lang.String stringExtra = intent.getStringExtra("get_poi_name");
                    boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    if (stringExtra == null) {
                        stringExtra = "";
                    }
                    java.lang.String stringExtra2 = intent.getStringExtra("get_city");
                    java.lang.String str = stringExtra2 != null ? stringExtra2 : "";
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
                        getIntent().removeExtra("get_poi_name");
                    }
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                        getIntent().removeExtra("get_city");
                    }
                    getIntent().putExtras(intent.getExtras());
                    this.f249059m.d(i17, i18, intent);
                }
            } else if (intent == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                return;
            } else {
                getIntent().putExtras(intent.getExtras());
                this.f249057i.e(i17, i18, intent, this.f249060n.mo70559x8b2fba9f() == 0);
                this.f249060n.f247782d = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(intent.getStringExtra("Select_Contact"));
            }
        } else if (intent == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
            return;
        } else {
            getIntent().putExtras(intent.getExtras());
            o7(intent);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x04ec  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x04fd  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x050e  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0528  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0539  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0585  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x05c9  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x05a5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x053c  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x052b  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0511  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0500  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x04ef  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0418  */
    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r37) {
        /*
            Method dump skipped, instructions count: 1518
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18133x39856dcd.onCreate(android.os.Bundle):void");
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDestroy", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        super.onDestroy();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18131x711b760 c18131x711b760 = this.f249062p;
        if (c18131x711b760 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onStop", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
            gm0.j1.i();
            gm0.j1.n().f354821b.q(2842, c18131x711b760);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onStop", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.z4 z4Var = this.f249069u;
        if (z4Var != null) {
            z4Var.e();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17970xbe575679 c17970xbe575679 = this.f249059m;
        if (c17970xbe575679 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("stop", "com.tencent.mm.plugin.sns.ui.LocationWidget");
            i11.e eVar = c17970xbe575679.E;
            if (eVar != null) {
                ((i11.h) eVar).m(c17970xbe575679.H);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("stop", "com.tencent.mm.plugin.sns.ui.LocationWidget");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.AbstractC18397x5bc42bbf abstractC18397x5bc42bbf = this.f249061o;
        if (abstractC18397x5bc42bbf != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("release", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
            com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 abstractC19636xc6b37291 = abstractC18397x5bc42bbf.f252290g;
            if (abstractC19636xc6b37291 != null) {
                abstractC19636xc6b37291.l();
                abstractC18397x5bc42bbf.f252290g.a();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("release", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4 f4Var = this.T;
        if (f4Var != null && f4Var.isShowing()) {
            this.T.cancel();
        }
        ((java.util.HashMap) this.M).clear();
        fo3.s.INSTANCE.E7("ie_sns_upload");
        ca4.z0.m();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("unregHellBizId", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        this.f249064p1.mo48814x2efc64();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("unregHellBizId", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        fl5.i iVar = this.f249054f;
        if (iVar != null) {
            iVar.mo81351x5cd39ffa();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.i0 i0Var = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.j0.f246394a;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(i0Var.h())) {
            i0Var.n("");
        }
        dx1.g.f326022a.j("SnsPublishProcess", "editPageStaytime_", java.lang.Long.valueOf(mo78509x4b0ac5a2()), bx1.u.f117843e);
        if (this.f249075y0 != 3) {
            i0Var.d(null);
        }
        ((b93.b) c93.a.a()).getClass();
        b93.r.wi().D0();
        dw3.k.f325752a.d(je4.c.f380850a.a());
        h7(java.lang.Boolean.FALSE);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDestroy", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onKeyDown", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        if (keyEvent.getKeyCode() != 4) {
            boolean onKeyDown = super.onKeyDown(i17, keyEvent);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onKeyDown", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
            return onKeyDown;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.AbstractC18397x5bc42bbf abstractC18397x5bc42bbf = this.f249061o;
        abstractC18397x5bc42bbf.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isSmileVisble", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
        boolean z17 = abstractC18397x5bc42bbf.b() && abstractC18397x5bc42bbf.getVisibility() == 0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isSmileVisble", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsUploadUI", "onKeyDown: back, panel & footer is visible");
            this.f249061o.g();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onKeyDown", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsUploadUI", "onKeyDown: back, start exit save");
        c7();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onKeyDown", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPause", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        super.mo48674x36654fab();
        super.onPause();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsUploadUI", "onPause: ");
        fl5.i iVar = this.f249054f;
        if (iVar != null) {
            iVar.mo81355xb01dfb57();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPause", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: onPreDestroyed */
    public void mo56581x6fa9d635() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPreDestroyed", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        super.mo56581x6fa9d635();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("savePostModel", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        wa4.u uVar = (wa4.u) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ai(this, 2, wa4.u.class);
        if (uVar == null || uVar.f525819e <= 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("savePostModel", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        } else {
            ((q04.r) ((xs.j1) i95.n0.c(xs.j1.class))).Vi(2, "SnsPostEnd_" + uVar.f525819e, uVar, new o04.q(this) { // from class: com.tencent.mm.plugin.sns.ui.SnsUploadUI.18
                @Override // o04.q
                public void a(int i17, boolean z17, dm.ba baVar, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onActionDone", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$18");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onActionDone", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$18");
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsUploadUI", "PluginSecData onActionDone %s %b", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17));
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onActionDone", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$18");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onActionDone", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$18");
                }
            });
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("savePostModel", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPreDestroyed", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onRequestPermissionsResult", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        if (iArr == null || iArr.length <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsUploadUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onRequestPermissionsResult", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsUploadUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(iArr[0]), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        if (i17 != 16) {
            if (i17 == 64) {
                if (iArr[0] == 0) {
                    this.f249059m.b();
                } else {
                    db5.e1.C(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.hhm), getString(com.p314xaae8f345.mm.R.C30867xcad56011.hht), getString(com.p314xaae8f345.mm.R.C30867xcad56011.g6z), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), false, new android.content.DialogInterface.OnClickListener() { // from class: com.tencent.mm.plugin.sns.ui.SnsUploadUI.20
                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(android.content.DialogInterface dialogInterface, int i18) {
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$20");
                            tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
                            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18133x39856dcd.this.mo55332x76847179();
                            ((sb0.f) jVar).getClass();
                            j35.u.g(mo55332x76847179);
                            dialogInterface.dismiss();
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$20");
                        }
                    }, new android.content.DialogInterface.OnClickListener(this) { // from class: com.tencent.mm.plugin.sns.ui.SnsUploadUI.21
                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(android.content.DialogInterface dialogInterface, int i18) {
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$21");
                            dialogInterface.dismiss();
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$21");
                        }
                    });
                }
            }
        } else if (iArr[0] == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.z4 z4Var = this.f249069u;
            if (z4Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p7) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p7) z4Var).q();
            } else if (z4Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.i6) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.i6) z4Var).t();
            } else if (z4Var instanceof de4.a) {
                de4.a aVar = (de4.a) z4Var;
                aVar.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doCaptureMMSight", "com.tencent.mm.plugin.sns.ui.widget.multi_image.MultiPicWidget");
                ((ee4.v) aVar.k(ee4.v.class)).p();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doCaptureMMSight", "com.tencent.mm.plugin.sns.ui.widget.multi_image.MultiPicWidget");
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onRequestPermissionsResult", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onResume", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        super.onResume();
        this.f249061o.post(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.sns.ui.SnsUploadUI.17
            @Override // java.lang.Runnable
            public void run() {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$17");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsUploadUI", "onResume run: refreshContentHeight");
                fp.w.l(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18133x39856dcd.this);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$17");
            }
        });
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.z4 z4Var = this.f249069u;
        if (z4Var != null && (z4Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.i6)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.i6 i6Var = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.i6) z4Var;
            i6Var.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resume", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
            if (i6Var.f250099h != null) {
                if (i6Var.A) {
                    i6Var.B();
                } else {
                    i6Var.A();
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resume", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
        }
        this.f249054f.d(((com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.w1) ((su4.x0) i95.n0.c(su4.x0.class))).cj());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onResume", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, android.app.Activity
    public void onSaveInstanceState(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onSaveInstanceState", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        if (bundle != null) {
            fl5.i iVar = this.f249054f;
            if (iVar != null) {
                bundle.putString("contentdesc", iVar.getText().toString());
            }
            this.f249069u.g(bundle);
        }
        super.onSaveInstanceState(bundle);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSaveInstanceState", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, android.app.Activity
    public void onStart() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onStart", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        super.onStart();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Tj().mo50297x7c4d7ca2(this.X, this.W);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onStart", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onStop() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onStop", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        super.onStop();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsUploadUI", "onStop: ");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Tj().mo50300x3fa464aa(this.X);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onStop", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
    }

    public void p7(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.C16527xe4fc886 c16527xe4fc886) {
        byte[] bArr;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("talkVideo", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        java.lang.String str = c16527xe4fc886.f230342g;
        java.lang.String str2 = c16527xe4fc886.f230343h;
        getIntent().putExtra("KSightThumbPath", c16527xe4fc886.f230343h);
        getIntent().putExtra("KSnsFrom", 17);
        java.lang.String str3 = c16527xe4fc886.f230345m;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
            str3 = com.p314xaae8f345.mm.vfs.w6.p(str);
        }
        java.lang.String str4 = str3;
        try {
            bArr = c16527xe4fc886.f230347o.mo14344x5f01b1f6();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsUploadUI", "put sight extinfo to snsuploadui error: %s", e17.getMessage());
            bArr = null;
        }
        s7(str, str2, str4, bArr, true, true);
        m7(null);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("talkVideo", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
    }

    public void q7() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateNavState", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.z4 z4Var = this.f249069u;
        boolean z17 = z4Var != null && z4Var.f();
        m78501x43e00957(z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsUploadUI", "updateNavState: enableOptionMenu=%b", java.lang.Boolean.valueOf(z17));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateNavState", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
    }

    public void r7(java.lang.String str, boolean z17, int i17, java.util.ArrayList arrayList, java.util.ArrayList arrayList2, int i18, java.util.ArrayList arrayList3) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updatePicConfig", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsUploadUI", "updatePicConfig");
        getIntent().getExtras().clear();
        getIntent().putExtra("KTouchCameraTime", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1());
        getIntent().putExtra("KSnsPostManu", true);
        getIntent().putExtra("Ksnsupload_type", 0);
        getIntent().putExtra("KFilterId", i17);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            getIntent().putExtra("sns_kemdia_path", str);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(arrayList)) {
            getIntent().putExtra("sns_kemdia_path_list", arrayList);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(arrayList3) && pc4.d.f434943a.B()) {
            getIntent().putParcelableArrayListExtra("KMulti_Pic_Item_List", arrayList3);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(arrayList2)) {
            getIntent().putStringArrayListExtra("sns_media_latlong_list", arrayList2);
        }
        if (z17) {
            getIntent().putExtra("Kis_take_photo", z17);
        }
        if (i18 != 0) {
            getIntent().putExtra("Ksnsupload_source", 11);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updatePicConfig", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
    }

    public void s7(java.lang.String str, java.lang.String str2, java.lang.String str3, byte[] bArr, boolean z17, boolean z18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateSightConfig", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsUploadUI", "updateSightConfig");
        getIntent().getExtras().clear();
        getIntent().putExtra("KSightPath", str);
        getIntent().putExtra("KSightThumbPath", str2);
        getIntent().putExtra("sight_md5", str3);
        getIntent().putExtra("KSnsPostManu", true);
        getIntent().putExtra("Ksnsupload_type", 14);
        getIntent().putExtra("Kis_take_photo", z18);
        getIntent().putExtra("KMMSightExtInfo", bArr);
        if (z17) {
            android.content.Intent intent = getIntent();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            sb6.append(java.lang.System.currentTimeMillis());
            sb6.append("_");
            sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.Y(5));
            intent.putExtra("KSessionID", sb6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateSightConfig", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
    }
}
