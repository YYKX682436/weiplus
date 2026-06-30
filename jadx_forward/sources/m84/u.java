package m84;

/* loaded from: classes4.dex */
public abstract class u extends com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.l {
    public final jz5.g A;
    public android.widget.FrameLayout B;
    public final jz5.g C;
    public final jz5.g D;
    public final jz5.g E;
    public final jz5.g F;
    public final jz5.g G;
    public final jz5.g H;
    public final jz5.g I;

    /* renamed from: J, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b f406322J;
    public final android.os.Handler K;
    public int L;
    public float M;
    public m84.a N;
    public final m84.o O;
    public final m84.m P;
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2138x467778a8.C17784xde43661d Q;

    /* renamed from: o, reason: collision with root package name */
    public final android.view.View f406323o;

    /* renamed from: p, reason: collision with root package name */
    public final int f406324p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f406325q;

    /* renamed from: r, reason: collision with root package name */
    public final w64.n f406326r;

    /* renamed from: s, reason: collision with root package name */
    public android.content.Context f406327s;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f406328t;

    /* renamed from: u, reason: collision with root package name */
    public m84.w f406329u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f406330v;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f406331w;

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f406332x;

    /* renamed from: y, reason: collision with root package name */
    public final jz5.g f406333y;

    /* renamed from: z, reason: collision with root package name */
    public final jz5.g f406334z;

    /* JADX WARN: Type inference failed for: r2v4, types: [com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent$mEventListener$1] */
    public u(java.lang.String str, p012xc85e97e9.p093xedfae76a.y yVar, android.view.View view, int i17, boolean z17, i64.b1 b1Var, w64.n nVar, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i iVar) {
        super(str, yVar, view);
        this.f406323o = view;
        this.f406324p = i17;
        this.f406325q = z17;
        this.f406326r = nVar;
        this.f406331w = jz5.h.b(new m84.r(this));
        this.f406332x = jz5.h.b(new m84.i(this));
        this.f406333y = jz5.h.b(new m84.q(this));
        this.f406334z = jz5.h.b(new m84.j(this));
        this.A = jz5.h.b(new m84.t(this));
        this.C = jz5.h.b(new m84.l(this));
        this.D = jz5.h.b(new m84.p(this));
        this.E = jz5.h.b(new m84.f(this));
        this.F = jz5.h.b(new m84.e(this));
        this.G = jz5.h.b(new m84.g(this));
        this.H = jz5.h.b(new m84.s(this));
        this.I = jz5.h.b(new m84.k(this));
        this.K = new android.os.Handler(android.os.Looper.getMainLooper());
        this.M = 1.0f;
        this.N = m84.a.f406282d;
        this.O = new m84.o(this);
        this.P = new m84.m(this);
        android.content.Context context = view != null ? view.getContext() : null;
        final p012xc85e97e9.p093xedfae76a.y yVar2 = context instanceof p012xc85e97e9.p093xedfae76a.y ? (p012xc85e97e9.p093xedfae76a.y) context : null;
        yVar2 = yVar2 == null ? com.p314xaae8f345.mm.app.a0.f134821d : yVar2;
        this.Q = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6047xd7a3f4f1>(yVar2) { // from class: com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent$mEventListener$1
            {
                this.f39173x3fe91575 = 205742849;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6047xd7a3f4f1 c6047xd7a3f4f1) {
                java.lang.String str2;
                java.lang.String str3;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent$mEventListener$1");
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6047xd7a3f4f1 event = c6047xd7a3f4f1;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent$mEventListener$1");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                m84.u uVar = m84.u.this;
                java.lang.String j17 = uVar.j();
                am.kv kvVar = event.f136335g;
                if (kvVar != null) {
                    try {
                        str2 = kvVar.f88716a;
                    } catch (java.lang.Throwable th6) {
                        ca4.q.c(j17, th6);
                    }
                } else {
                    str2 = null;
                }
                java.lang.String str4 = "";
                if (str2 == null) {
                    str2 = "";
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMInfo$p", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
                m84.w wVar = uVar.f406329u;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMInfo$p", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
                if (wVar == null || (str3 = wVar.f406351o) == null) {
                    str3 = "";
                }
                java.lang.String str5 = kvVar != null ? kvVar.f88717b : null;
                if (str5 != null) {
                    str4 = str5;
                }
                java.lang.String j18 = uVar.j();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onEvent aid=");
                sb6.append(str2);
                sb6.append(", ownAid=");
                sb6.append(str3);
                sb6.append(", avatarUrlEmpty=");
                boolean z18 = true;
                sb6.append(str4.length() == 0);
                sb6.append(", stage=");
                sb6.append(m84.u.z(uVar));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(j18, sb6.toString());
                if (str2.length() != 0) {
                    z18 = false;
                }
                if (!z18 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, str3)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMUIHandler$p", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
                    android.os.Handler handler = uVar.K;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMUIHandler$p", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
                    handler.post(new m84.h(uVar, str4));
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent$mEventListener$1");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent$mEventListener$1");
                return false;
            }
        };
    }

    public static final /* synthetic */ android.widget.FrameLayout A(m84.u uVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMRoot$p", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
        android.widget.FrameLayout frameLayout = uVar.B;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMRoot$p", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
        return frameLayout;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0028 A[Catch: all -> 0x001d, TryCatch #0 {all -> 0x001d, blocks: (B:16:0x0014, B:5:0x0022, B:6:0x002e, B:14:0x0028), top: B:15:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0022 A[Catch: all -> 0x001d, TryCatch #0 {all -> 0x001d, blocks: (B:16:0x0014, B:5:0x0022, B:6:0x002e, B:14:0x0028), top: B:15:0x0014 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String B(m84.u r6, java.lang.String r7, int r8) {
        /*
            java.lang.String r0 = "access$mergeClickIndexInExtInfo"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r0, r1)
            r6.getClass()
            java.lang.String r2 = "mergeClickIndexInExtInfo"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r2, r1)
            java.lang.String r3 = "click_index"
            if (r7 == 0) goto L1f
            int r4 = r7.length()     // Catch: java.lang.Throwable -> L1d
            if (r4 != 0) goto L1b
            goto L1f
        L1b:
            r4 = 0
            goto L20
        L1d:
            r7 = move-exception
            goto L3d
        L1f:
            r4 = 1
        L20:
            if (r4 == 0) goto L28
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L1d
            r7.<init>()     // Catch: java.lang.Throwable -> L1d
            goto L2e
        L28:
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L1d
            r4.<init>(r7)     // Catch: java.lang.Throwable -> L1d
            r7 = r4
        L2e:
            java.lang.String r4 = java.lang.String.valueOf(r8)     // Catch: java.lang.Throwable -> L1d
            r7.put(r3, r4)     // Catch: java.lang.Throwable -> L1d
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L1d
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r7)     // Catch: java.lang.Throwable -> L1d
            goto L6f
        L3d:
            java.lang.String r6 = r6.j()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "mergeClickIndexInExtInfo fail: "
            r4.<init>(r5)
            java.lang.String r7 = r7.getMessage()
            r4.append(r7)
            java.lang.String r7 = ", fallback"
            r4.append(r7)
            java.lang.String r7 = r4.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r6, r7)
            org.json.JSONObject r6 = new org.json.JSONObject
            r6.<init>()
            java.lang.String r7 = java.lang.String.valueOf(r8)
            r6.put(r3, r7)
            java.lang.String r7 = r6.toString()
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r7)
        L6f:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r2, r1)
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: m84.u.B(m84.u, java.lang.String, int):java.lang.String");
    }

    public static void J(m84.u uVar, android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doLayoutView$default", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
        if (obj != null) {
            java.lang.UnsupportedOperationException unsupportedOperationException = new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: doLayoutView");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doLayoutView$default", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
            throw unsupportedOperationException;
        }
        if ((i37 & 8) != 0) {
            i19 = 0;
        }
        if ((i37 & 16) != 0) {
            i27 = 0;
        }
        if ((i37 & 32) != 0) {
            i28 = 0;
        }
        if ((i37 & 64) != 0) {
            i29 = 0;
        }
        uVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doLayoutView", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
        if (view == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doLayoutView", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
        } else {
            android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
                layoutParams.width = i17;
                layoutParams.height = i18;
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.leftMargin = i19;
                marginLayoutParams.topMargin = i27;
                marginLayoutParams.rightMargin = i28;
                marginLayoutParams.bottomMargin = i29;
            } else if (layoutParams != null) {
                layoutParams.width = i17;
                layoutParams.height = i18;
            }
            view.requestLayout();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doLayoutView", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doLayoutView$default", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0053, code lost:
    
        if ((r6.length() > 0) == true) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final m84.a y(m84.u r6) {
        /*
            java.lang.String r0 = "access$decideStageAfterStageOne"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r0, r1)
            r6.getClass()
            java.lang.String r2 = "decideStageAfterStageOne"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r2, r1)
            m84.w r6 = r6.f406329u
            if (r6 != 0) goto L19
            m84.a r6 = m84.a.f406282d
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r2, r1)
            goto L61
        L19:
            java.lang.String r3 = r6.f406351o
            boolean r3 = m84.a0.d(r3)
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L40
            mb4.e r3 = r6.f406344h
            if (r3 == 0) goto L3a
            java.lang.String r3 = r3.c()
            if (r3 == 0) goto L3a
            int r3 = r3.length()
            if (r3 <= 0) goto L35
            r3 = r4
            goto L36
        L35:
            r3 = r5
        L36:
            if (r3 != r4) goto L3a
            r3 = r4
            goto L3b
        L3a:
            r3 = r5
        L3b:
            if (r3 == 0) goto L40
            m84.a r6 = m84.a.f406285g
            goto L5e
        L40:
            mb4.e r6 = r6.f406342f
            if (r6 == 0) goto L56
            java.lang.String r6 = r6.c()
            if (r6 == 0) goto L56
            int r6 = r6.length()
            if (r6 <= 0) goto L52
            r6 = r4
            goto L53
        L52:
            r6 = r5
        L53:
            if (r6 != r4) goto L56
            goto L57
        L56:
            r4 = r5
        L57:
            if (r4 == 0) goto L5c
            m84.a r6 = m84.a.f406284f
            goto L5e
        L5c:
            m84.a r6 = m84.a.f406282d
        L5e:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r2, r1)
        L61:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: m84.u.y(m84.u):m84.a");
    }

    public static final /* synthetic */ m84.a z(m84.u uVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMCurrentStage$p", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
        m84.a aVar = uVar.N;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMCurrentStage$p", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
        return aVar;
    }

    public final void C() {
        int i17 = this.f406324p;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("adjustContentContainerLayout", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
        java.lang.String j17 = j();
        try {
            int u17 = ca4.m0.u(j(), this.L);
            int v17 = ca4.m0.v(j(), i17, this.f406325q);
            java.lang.String j18 = j();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMNickNameTv", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.RunnableC17943x7a38efee runnableC17943x7a38efee = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.RunnableC17943x7a38efee) ((jz5.n) this.f406334z).mo141623x754a37bb();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMNickNameTv", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
            int w17 = ca4.m0.w(j18, i17, runnableC17943x7a38efee);
            H(u17, v17, w17);
            c(new m84.b(this, u17, v17, w17));
        } catch (java.lang.Throwable th6) {
            ca4.q.c(j17, th6);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("adjustContentContainerLayout", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
    }

    public final void D(android.view.View view, m84.c0 c0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("applyHotZone", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
        if (view == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("applyHotZone", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
            return;
        }
        if (c0Var != null && c0Var.a()) {
            float f17 = c0Var.f406298a;
            float f18 = this.M;
            J(this, view, (int) (f17 * f18), (int) (c0Var.f406299b * f18), (int) (c0Var.f406300c * f18), (int) (c0Var.f406301d * f18), 0, 0, 96, null);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("applyHotZone", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/widget/adworldcupavatar/AdWorldCupAvatarComponent", "applyHotZone", "(Landroid/view/View;Lcom/tencent/mm/plugin/sns/ad/widget/adworldcupavatar/HotZoneInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/sns/ad/widget/adworldcupavatar/AdWorldCupAvatarComponent", "applyHotZone", "(Landroid/view/View;Lcom/tencent/mm/plugin/sns/ad/widget/adworldcupavatar/HotZoneInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("applyHotZone", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
    }

    public final void E(m84.a aVar, m84.w wVar) {
        r45.jj4 b17;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 m70371x485d7;
        r45.jj4 b18;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("applyPagThumb", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
        if (aVar == m84.a.f406282d) {
            android.widget.ImageView R = R();
            if (R != null) {
                R.setVisibility(8);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("applyPagThumb", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
            return;
        }
        int ordinal = aVar.ordinal();
        mb4.e eVar = ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? null : com.p314xaae8f345.mm.ui.bk.C() ? wVar.f406345i : wVar.f406344h : com.p314xaae8f345.mm.ui.bk.C() ? wVar.f406343g : wVar.f406342f : com.p314xaae8f345.mm.ui.bk.C() ? wVar.f406341e : wVar.f406340d;
        int ordinal2 = aVar.ordinal();
        mb4.e eVar2 = ordinal2 != 1 ? ordinal2 != 2 ? ordinal2 != 3 ? null : wVar.f406344h : wVar.f406342f : wVar.f406340d;
        if (eVar == null || (b18 = eVar.b()) == null) {
            b17 = eVar2 != null ? eVar2.b() : null;
        } else {
            b17 = b18;
        }
        android.content.Context context = this.f406327s;
        int i17 = 0;
        if (b17 == null || context == null) {
            android.widget.ImageView R2 = R();
            if (R2 != null) {
                R2.setVisibility(0);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(j(), "applyPagThumb, no thumb media for stage=" + aVar);
        } else {
            android.widget.ImageView R3 = R();
            if (R3 != null) {
                R3.setVisibility(0);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i1 hj6 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.hj();
            android.widget.ImageView R4 = R();
            int hashCode = context.hashCode();
            com.p314xaae8f345.mm.p2621x8fb0427b.s7 s7Var = com.p314xaae8f345.mm.p2621x8fb0427b.s7.f276841l;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = this.f406328t;
            if (c17933xe8d1b226 != null && (m70371x485d7 = c17933xe8d1b226.m70371x485d7()) != null) {
                i17 = m70371x485d7.f39015xc86e6609;
            }
            s7Var.f276846b = i17;
            hj6.W(b17, R4, com.p314xaae8f345.mm.R.C30861xcebc809e.f563648d90, hashCode, s7Var);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("applyPagThumb", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
    }

    public final void F(android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 c17702x544f64e9, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("bindClickArea", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
        if (view == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("bindClickArea", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
        } else {
            view.setOnClickListener(new m84.c(this, c17702x544f64e9, i18, i17, c17933xe8d1b226));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("bindClickArea", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
        }
    }

    public final void G(android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 c17702x544f64e9, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("bindIntroClickArea", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
        if (view == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("bindIntroClickArea", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
            return;
        }
        if (c17702x544f64e9 != null && c17933xe8d1b226 != null) {
            view.setOnClickListener(new m84.d(this, c17702x544f64e9, c17933xe8d1b226));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("bindIntroClickArea", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(j(), "bindIntroClickArea, clickActionInfo or model is null, target will be unclickable");
            view.setOnClickListener(null);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("bindIntroClickArea", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
        }
    }

    public final void H(int i17, int i18, int i19) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("calcPartContainerSize", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
        java.lang.String j17 = j();
        try {
            m84.w wVar = this.f406329u;
            if (wVar != null) {
                int i27 = wVar.f406337a;
                int i28 = wVar.f406338b;
                int i29 = wVar.f406339c;
                if (i27 <= 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(j(), "calcPartContainerSize, containerWidth<=0");
                } else {
                    int i37 = this.L;
                    int i38 = (i28 * i37) / i27;
                    int i39 = (i37 * 8) / i27;
                    int i47 = (i29 * i37) / i27;
                    int i48 = (((i17 + i19) + i39) + i47) - i38;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(j(), "calcPartContainerSize, imagesKeeperLayoutHeight=" + i17 + ", leftMargin=" + i18 + ", topMargin=" + i19 + ", totalTopMargin=" + i48 + ", realContainerWidth=" + i37 + ", realContainerHeight=" + i38 + ", realBottomMarginOffset=" + i39 + ", realBottomBarOffset=" + i47);
                    android.widget.FrameLayout frameLayout = this.B;
                    android.view.ViewGroup.LayoutParams layoutParams = frameLayout != null ? frameLayout.getLayoutParams() : null;
                    android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
                    if (marginLayoutParams != null) {
                        marginLayoutParams.width = i37;
                        marginLayoutParams.height = i38;
                        marginLayoutParams.leftMargin = i18;
                        marginLayoutParams.topMargin = i48;
                    }
                    android.widget.FrameLayout frameLayout2 = this.B;
                    if (frameLayout2 != null) {
                        frameLayout2.requestLayout();
                    }
                    J(this, Q(), i37, i38, 0, 0, 0, 0, 120, null);
                    D(M(), wVar.f406346j);
                    D(O(), wVar.f406347k);
                    for (int i49 = 0; i49 < 4; i49++) {
                        android.view.View view = (android.view.View) kz5.n0.a0(P(), i49);
                        m84.c0 c0Var = (m84.c0) kz5.n0.a0(wVar.f406348l, i49);
                        if (view != null) {
                            if (c0Var != null && c0Var.a()) {
                                D(view, c0Var);
                            }
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                            arrayList.add(8);
                            java.util.Collections.reverse(arrayList);
                            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/widget/adworldcupavatar/AdWorldCupAvatarComponent", "calcPartContainerSize", "(III)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                            yj0.a.f(view, "com/tencent/mm/plugin/sns/ad/widget/adworldcupavatar/AdWorldCupAvatarComponent", "calcPartContainerSize", "(III)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                    }
                    D(N(), wVar.f406346j);
                    U(i47 + i39);
                }
            }
        } catch (java.lang.Throwable th6) {
            ca4.q.c(j17, th6);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("calcPartContainerSize", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x005d, code lost:
    
        if ((r7.length() > 0) == true) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final m84.a I(m84.w r7) {
        /*
            r6 = this;
            java.lang.String r0 = "decideInitialStage"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r0, r1)
            java.lang.String r2 = r7.f406351o
            boolean r2 = m84.a0.d(r2)
            java.lang.String r3 = "hasStageOne"
            java.lang.String r4 = "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarInfo"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r3, r4)
            mb4.e r5 = r7.f406340d
            boolean r5 = r7.b(r5)
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r3, r4)
            if (r5 == 0) goto L26
            m84.a r7 = m84.a.f406283e
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return r7
        L26:
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L4a
            mb4.e r2 = r7.f406344h
            if (r2 == 0) goto L41
            java.lang.String r2 = r2.c()
            if (r2 == 0) goto L41
            int r2 = r2.length()
            if (r2 <= 0) goto L3c
            r2 = r3
            goto L3d
        L3c:
            r2 = r4
        L3d:
            if (r2 != r3) goto L41
            r2 = r3
            goto L42
        L41:
            r2 = r4
        L42:
            if (r2 == 0) goto L4a
            m84.a r7 = m84.a.f406285g
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return r7
        L4a:
            mb4.e r7 = r7.f406342f
            if (r7 == 0) goto L60
            java.lang.String r7 = r7.c()
            if (r7 == 0) goto L60
            int r7 = r7.length()
            if (r7 <= 0) goto L5c
            r7 = r3
            goto L5d
        L5c:
            r7 = r4
        L5d:
            if (r7 != r3) goto L60
            goto L61
        L60:
            r3 = r4
        L61:
            if (r3 == 0) goto L69
            m84.a r7 = m84.a.f406284f
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return r7
        L69:
            m84.a r7 = m84.a.f406282d
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: m84.u.I(m84.w):m84.a");
    }

    public final w64.n K() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAdClickActionHandler", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdClickActionHandler", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
        return this.f406326r;
    }

    public final android.view.View L() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getItemRootView", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItemRootView", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
        return this.f406323o;
    }

    public final android.view.View M() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMAvatarHotArea", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
        android.view.View view = (android.view.View) ((jz5.n) this.F).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMAvatarHotArea", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
        return view;
    }

    public final android.widget.ImageView N() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMAvatarImage", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
        android.widget.ImageView imageView = (android.widget.ImageView) ((jz5.n) this.E).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMAvatarImage", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
        return imageView;
    }

    public final android.view.View O() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMDescHotArea", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
        android.view.View view = (android.view.View) ((jz5.n) this.G).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMDescHotArea", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
        return view;
    }

    public final java.util.List P() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMOptionHotAreas", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
        java.util.List list = (java.util.List) ((jz5.n) this.I).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMOptionHotAreas", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
        return list;
    }

    public final android.widget.FrameLayout Q() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMPagContainer", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ((jz5.n) this.C).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMPagContainer", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
        return frameLayout;
    }

    public final android.widget.ImageView R() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMPagThumb", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
        android.widget.ImageView imageView = (android.widget.ImageView) ((jz5.n) this.D).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMPagThumb", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
        return imageView;
    }

    public final android.widget.FrameLayout S() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMSnsAdBlankView", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ((jz5.n) this.f406333y).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMSnsAdBlankView", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
        return frameLayout;
    }

    public final android.view.View T() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMStageOneHotArea", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
        android.view.View view = (android.view.View) ((jz5.n) this.H).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMStageOneHotArea", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
        return view;
    }

    public final void U(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("refreshSpaceView", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
        android.widget.FrameLayout S = S();
        android.view.ViewGroup.LayoutParams layoutParams = S != null ? S.getLayoutParams() : null;
        if (layoutParams == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("refreshSpaceView", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
            return;
        }
        int i18 = this.L;
        if (i18 <= 0 || i17 <= 0) {
            android.widget.FrameLayout S2 = S();
            if (S2 != null) {
                S2.setVisibility(8);
            }
        } else {
            layoutParams.width = i18;
            layoutParams.height = i17;
            android.widget.FrameLayout S3 = S();
            if (S3 != null) {
                S3.setLayoutParams(layoutParams);
            }
            android.widget.FrameLayout S4 = S();
            if (S4 != null) {
                S4.setVisibility(0);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("refreshSpaceView", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
    }

    public final void V() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resetAllClickAreas", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
        android.widget.FrameLayout frameLayout = this.B;
        if (frameLayout != null) {
            frameLayout.setOnClickListener(null);
        }
        android.view.View T = T();
        if (T != null) {
            T.setOnClickListener(null);
        }
        android.view.View M = M();
        if (M != null) {
            M.setOnClickListener(null);
        }
        android.view.View O = O();
        if (O != null) {
            O.setOnClickListener(null);
        }
        for (android.view.View view : P()) {
            if (view != null) {
                view.setOnClickListener(null);
            }
        }
        android.view.View T2 = T();
        if (T2 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(T2, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/widget/adworldcupavatar/AdWorldCupAvatarComponent", "resetAllClickAreas", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            T2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(T2, "com/tencent/mm/plugin/sns/ad/widget/adworldcupavatar/AdWorldCupAvatarComponent", "resetAllClickAreas", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View M2 = M();
        if (M2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(M2, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ad/widget/adworldcupavatar/AdWorldCupAvatarComponent", "resetAllClickAreas", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            M2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(M2, "com/tencent/mm/plugin/sns/ad/widget/adworldcupavatar/AdWorldCupAvatarComponent", "resetAllClickAreas", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View O2 = O();
        if (O2 != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(O2, arrayList3.toArray(), "com/tencent/mm/plugin/sns/ad/widget/adworldcupavatar/AdWorldCupAvatarComponent", "resetAllClickAreas", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            O2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(O2, "com/tencent/mm/plugin/sns/ad/widget/adworldcupavatar/AdWorldCupAvatarComponent", "resetAllClickAreas", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        for (android.view.View view2 : P()) {
            if (view2 != null) {
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
                arrayList4.add(8);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(view2, arrayList4.toArray(), "com/tencent/mm/plugin/sns/ad/widget/adworldcupavatar/AdWorldCupAvatarComponent", "resetAllClickAreas", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/sns/ad/widget/adworldcupavatar/AdWorldCupAvatarComponent", "resetAllClickAreas", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resetAllClickAreas", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
    }

    public final void W() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resetDataAndView", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
        this.K.removeCallbacksAndMessages(null);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("removeListener", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
        java.lang.String j17 = j();
        try {
            mo48814x2efc64();
        } catch (java.lang.Throwable th6) {
            ca4.q.c(j17, th6);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("removeListener", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
        X();
        android.widget.ImageView N = N();
        if (N != null) {
            N.setVisibility(8);
        }
        android.widget.ImageView R = R();
        if (R != null) {
            R.clearAnimation();
        }
        android.widget.ImageView R2 = R();
        if (R2 != null) {
            R2.setVisibility(8);
        }
        android.widget.FrameLayout frameLayout = this.B;
        if (frameLayout != null) {
            frameLayout.setOnClickListener(null);
        }
        android.view.View T = T();
        if (T != null) {
            T.setOnClickListener(null);
        }
        android.view.View T2 = T();
        if (T2 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(T2, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/widget/adworldcupavatar/AdWorldCupAvatarComponent", "resetDataAndView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            T2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(T2, "com/tencent/mm/plugin/sns/ad/widget/adworldcupavatar/AdWorldCupAvatarComponent", "resetDataAndView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.FrameLayout frameLayout2 = this.B;
        if (frameLayout2 != null) {
            frameLayout2.setVisibility(8);
        }
        android.widget.FrameLayout S = S();
        if (S != null) {
            S.setVisibility(8);
        }
        this.N = m84.a.f406282d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resetDataAndView", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
    }

    public final void X() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resetPagView", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
        java.lang.String j17 = j();
        try {
            com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = this.f406322J;
            this.f406322J = null;
            if (c22789xd23e9a9b != null) {
                a84.y0.i(c22789xd23e9a9b);
                m84.o oVar = this.O;
                m84.m mVar = this.P;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resetPAGView", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGHelper");
                try {
                    c22789xd23e9a9b.i(oVar);
                    c22789xd23e9a9b.j(mVar);
                    c22789xd23e9a9b.post(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2134x5860d93.b0(c22789xd23e9a9b));
                } catch (java.lang.Throwable th6) {
                    ca4.q.c("AdPAGHelper", th6);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resetPAGView", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGHelper");
            }
        } catch (java.lang.Throwable th7) {
            ca4.q.c(j17, th7);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resetPagView", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
    }

    public final void Y(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setClickEvents", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
        m84.w wVar = this.f406329u;
        if (wVar == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setClickEvents", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 a17 = wVar.a();
        if (a17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(j(), "setClickEvents, clickActionInfo is null, hot areas will be unclickable");
            android.view.View M = M();
            if (M != null) {
                M.setOnClickListener(null);
            }
            android.view.View O = O();
            if (O != null) {
                O.setOnClickListener(null);
            }
            for (android.view.View view : P()) {
                if (view != null) {
                    view.setOnClickListener(null);
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setClickEvents", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
            return;
        }
        F(M(), a17, c17933xe8d1b226, 41, 0);
        F(O(), a17, c17933xe8d1b226, 41, 99);
        for (int i17 = 0; i17 < 4; i17++) {
            android.view.View view2 = (android.view.View) kz5.n0.a0(P(), i17);
            if (view2 != null) {
                m84.c0 c0Var = (m84.c0) kz5.n0.a0(wVar.f406348l, i17);
                if (c0Var == null || !c0Var.a()) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(8);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/widget/adworldcupavatar/AdWorldCupAvatarComponent", "setClickEvents", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/sns/ad/widget/adworldcupavatar/AdWorldCupAvatarComponent", "setClickEvents", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setOnClickListener(null);
                } else {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                    arrayList2.add(0);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ad/widget/adworldcupavatar/AdWorldCupAvatarComponent", "setClickEvents", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/sns/ad/widget/adworldcupavatar/AdWorldCupAvatarComponent", "setClickEvents", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    F(view2, a17, c17933xe8d1b226, 41, i17 + 1);
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setClickEvents", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f4, code lost:
    
        r2 = N();
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f8, code lost:
    
        if (r2 != null) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00fe, code lost:
    
        a84.m.b(r0, N());
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00fb, code lost:
    
        r2.setVisibility(0);
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x025a A[Catch: all -> 0x0579, TryCatch #1 {all -> 0x0579, blocks: (B:3:0x0016, B:5:0x001a, B:8:0x001e, B:10:0x0022, B:12:0x0026, B:14:0x0042, B:24:0x007f, B:27:0x0089, B:29:0x008f, B:30:0x0094, B:32:0x0098, B:37:0x00ad, B:41:0x00c0, B:43:0x00e2, B:45:0x00ea, B:50:0x00f4, B:53:0x00fe, B:54:0x011a, B:56:0x011e, B:57:0x0121, B:59:0x0127, B:60:0x012a, B:63:0x0176, B:66:0x01c3, B:69:0x0210, B:71:0x0214, B:75:0x01ca, B:76:0x017d, B:77:0x0131, B:78:0x00fb, B:79:0x0106, B:82:0x0117, B:85:0x00b9, B:88:0x00a4, B:90:0x0092, B:91:0x0086, B:92:0x0219, B:93:0x0221, B:94:0x0222, B:97:0x022c, B:100:0x0236, B:102:0x023c, B:103:0x0241, B:105:0x0245, B:110:0x025a, B:114:0x026d, B:116:0x028b, B:117:0x028e, B:119:0x0294, B:120:0x0297, B:123:0x02e3, B:126:0x0330, B:129:0x037d, B:131:0x0381, B:132:0x0337, B:133:0x02ea, B:134:0x029e, B:136:0x0266, B:139:0x0251, B:141:0x023f, B:142:0x0233, B:143:0x0229, B:144:0x0388, B:147:0x0392, B:150:0x039c, B:152:0x03a2, B:153:0x03a7, B:155:0x03ab, B:160:0x03c0, B:164:0x03d3, B:166:0x03f5, B:169:0x03fd, B:183:0x03cc, B:186:0x03b7, B:188:0x03a5, B:189:0x0399, B:190:0x038f), top: B:2:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x028b A[Catch: all -> 0x0579, TryCatch #1 {all -> 0x0579, blocks: (B:3:0x0016, B:5:0x001a, B:8:0x001e, B:10:0x0022, B:12:0x0026, B:14:0x0042, B:24:0x007f, B:27:0x0089, B:29:0x008f, B:30:0x0094, B:32:0x0098, B:37:0x00ad, B:41:0x00c0, B:43:0x00e2, B:45:0x00ea, B:50:0x00f4, B:53:0x00fe, B:54:0x011a, B:56:0x011e, B:57:0x0121, B:59:0x0127, B:60:0x012a, B:63:0x0176, B:66:0x01c3, B:69:0x0210, B:71:0x0214, B:75:0x01ca, B:76:0x017d, B:77:0x0131, B:78:0x00fb, B:79:0x0106, B:82:0x0117, B:85:0x00b9, B:88:0x00a4, B:90:0x0092, B:91:0x0086, B:92:0x0219, B:93:0x0221, B:94:0x0222, B:97:0x022c, B:100:0x0236, B:102:0x023c, B:103:0x0241, B:105:0x0245, B:110:0x025a, B:114:0x026d, B:116:0x028b, B:117:0x028e, B:119:0x0294, B:120:0x0297, B:123:0x02e3, B:126:0x0330, B:129:0x037d, B:131:0x0381, B:132:0x0337, B:133:0x02ea, B:134:0x029e, B:136:0x0266, B:139:0x0251, B:141:0x023f, B:142:0x0233, B:143:0x0229, B:144:0x0388, B:147:0x0392, B:150:0x039c, B:152:0x03a2, B:153:0x03a7, B:155:0x03ab, B:160:0x03c0, B:164:0x03d3, B:166:0x03f5, B:169:0x03fd, B:183:0x03cc, B:186:0x03b7, B:188:0x03a5, B:189:0x0399, B:190:0x038f), top: B:2:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0294 A[Catch: all -> 0x0579, TryCatch #1 {all -> 0x0579, blocks: (B:3:0x0016, B:5:0x001a, B:8:0x001e, B:10:0x0022, B:12:0x0026, B:14:0x0042, B:24:0x007f, B:27:0x0089, B:29:0x008f, B:30:0x0094, B:32:0x0098, B:37:0x00ad, B:41:0x00c0, B:43:0x00e2, B:45:0x00ea, B:50:0x00f4, B:53:0x00fe, B:54:0x011a, B:56:0x011e, B:57:0x0121, B:59:0x0127, B:60:0x012a, B:63:0x0176, B:66:0x01c3, B:69:0x0210, B:71:0x0214, B:75:0x01ca, B:76:0x017d, B:77:0x0131, B:78:0x00fb, B:79:0x0106, B:82:0x0117, B:85:0x00b9, B:88:0x00a4, B:90:0x0092, B:91:0x0086, B:92:0x0219, B:93:0x0221, B:94:0x0222, B:97:0x022c, B:100:0x0236, B:102:0x023c, B:103:0x0241, B:105:0x0245, B:110:0x025a, B:114:0x026d, B:116:0x028b, B:117:0x028e, B:119:0x0294, B:120:0x0297, B:123:0x02e3, B:126:0x0330, B:129:0x037d, B:131:0x0381, B:132:0x0337, B:133:0x02ea, B:134:0x029e, B:136:0x0266, B:139:0x0251, B:141:0x023f, B:142:0x0233, B:143:0x0229, B:144:0x0388, B:147:0x0392, B:150:0x039c, B:152:0x03a2, B:153:0x03a7, B:155:0x03ab, B:160:0x03c0, B:164:0x03d3, B:166:0x03f5, B:169:0x03fd, B:183:0x03cc, B:186:0x03b7, B:188:0x03a5, B:189:0x0399, B:190:0x038f), top: B:2:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0381 A[Catch: all -> 0x0579, TryCatch #1 {all -> 0x0579, blocks: (B:3:0x0016, B:5:0x001a, B:8:0x001e, B:10:0x0022, B:12:0x0026, B:14:0x0042, B:24:0x007f, B:27:0x0089, B:29:0x008f, B:30:0x0094, B:32:0x0098, B:37:0x00ad, B:41:0x00c0, B:43:0x00e2, B:45:0x00ea, B:50:0x00f4, B:53:0x00fe, B:54:0x011a, B:56:0x011e, B:57:0x0121, B:59:0x0127, B:60:0x012a, B:63:0x0176, B:66:0x01c3, B:69:0x0210, B:71:0x0214, B:75:0x01ca, B:76:0x017d, B:77:0x0131, B:78:0x00fb, B:79:0x0106, B:82:0x0117, B:85:0x00b9, B:88:0x00a4, B:90:0x0092, B:91:0x0086, B:92:0x0219, B:93:0x0221, B:94:0x0222, B:97:0x022c, B:100:0x0236, B:102:0x023c, B:103:0x0241, B:105:0x0245, B:110:0x025a, B:114:0x026d, B:116:0x028b, B:117:0x028e, B:119:0x0294, B:120:0x0297, B:123:0x02e3, B:126:0x0330, B:129:0x037d, B:131:0x0381, B:132:0x0337, B:133:0x02ea, B:134:0x029e, B:136:0x0266, B:139:0x0251, B:141:0x023f, B:142:0x0233, B:143:0x0229, B:144:0x0388, B:147:0x0392, B:150:0x039c, B:152:0x03a2, B:153:0x03a7, B:155:0x03ab, B:160:0x03c0, B:164:0x03d3, B:166:0x03f5, B:169:0x03fd, B:183:0x03cc, B:186:0x03b7, B:188:0x03a5, B:189:0x0399, B:190:0x038f), top: B:2:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0337 A[Catch: all -> 0x0579, TryCatch #1 {all -> 0x0579, blocks: (B:3:0x0016, B:5:0x001a, B:8:0x001e, B:10:0x0022, B:12:0x0026, B:14:0x0042, B:24:0x007f, B:27:0x0089, B:29:0x008f, B:30:0x0094, B:32:0x0098, B:37:0x00ad, B:41:0x00c0, B:43:0x00e2, B:45:0x00ea, B:50:0x00f4, B:53:0x00fe, B:54:0x011a, B:56:0x011e, B:57:0x0121, B:59:0x0127, B:60:0x012a, B:63:0x0176, B:66:0x01c3, B:69:0x0210, B:71:0x0214, B:75:0x01ca, B:76:0x017d, B:77:0x0131, B:78:0x00fb, B:79:0x0106, B:82:0x0117, B:85:0x00b9, B:88:0x00a4, B:90:0x0092, B:91:0x0086, B:92:0x0219, B:93:0x0221, B:94:0x0222, B:97:0x022c, B:100:0x0236, B:102:0x023c, B:103:0x0241, B:105:0x0245, B:110:0x025a, B:114:0x026d, B:116:0x028b, B:117:0x028e, B:119:0x0294, B:120:0x0297, B:123:0x02e3, B:126:0x0330, B:129:0x037d, B:131:0x0381, B:132:0x0337, B:133:0x02ea, B:134:0x029e, B:136:0x0266, B:139:0x0251, B:141:0x023f, B:142:0x0233, B:143:0x0229, B:144:0x0388, B:147:0x0392, B:150:0x039c, B:152:0x03a2, B:153:0x03a7, B:155:0x03ab, B:160:0x03c0, B:164:0x03d3, B:166:0x03f5, B:169:0x03fd, B:183:0x03cc, B:186:0x03b7, B:188:0x03a5, B:189:0x0399, B:190:0x038f), top: B:2:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02ea A[Catch: all -> 0x0579, TryCatch #1 {all -> 0x0579, blocks: (B:3:0x0016, B:5:0x001a, B:8:0x001e, B:10:0x0022, B:12:0x0026, B:14:0x0042, B:24:0x007f, B:27:0x0089, B:29:0x008f, B:30:0x0094, B:32:0x0098, B:37:0x00ad, B:41:0x00c0, B:43:0x00e2, B:45:0x00ea, B:50:0x00f4, B:53:0x00fe, B:54:0x011a, B:56:0x011e, B:57:0x0121, B:59:0x0127, B:60:0x012a, B:63:0x0176, B:66:0x01c3, B:69:0x0210, B:71:0x0214, B:75:0x01ca, B:76:0x017d, B:77:0x0131, B:78:0x00fb, B:79:0x0106, B:82:0x0117, B:85:0x00b9, B:88:0x00a4, B:90:0x0092, B:91:0x0086, B:92:0x0219, B:93:0x0221, B:94:0x0222, B:97:0x022c, B:100:0x0236, B:102:0x023c, B:103:0x0241, B:105:0x0245, B:110:0x025a, B:114:0x026d, B:116:0x028b, B:117:0x028e, B:119:0x0294, B:120:0x0297, B:123:0x02e3, B:126:0x0330, B:129:0x037d, B:131:0x0381, B:132:0x0337, B:133:0x02ea, B:134:0x029e, B:136:0x0266, B:139:0x0251, B:141:0x023f, B:142:0x0233, B:143:0x0229, B:144:0x0388, B:147:0x0392, B:150:0x039c, B:152:0x03a2, B:153:0x03a7, B:155:0x03ab, B:160:0x03c0, B:164:0x03d3, B:166:0x03f5, B:169:0x03fd, B:183:0x03cc, B:186:0x03b7, B:188:0x03a5, B:189:0x0399, B:190:0x038f), top: B:2:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x029e A[Catch: all -> 0x0579, TryCatch #1 {all -> 0x0579, blocks: (B:3:0x0016, B:5:0x001a, B:8:0x001e, B:10:0x0022, B:12:0x0026, B:14:0x0042, B:24:0x007f, B:27:0x0089, B:29:0x008f, B:30:0x0094, B:32:0x0098, B:37:0x00ad, B:41:0x00c0, B:43:0x00e2, B:45:0x00ea, B:50:0x00f4, B:53:0x00fe, B:54:0x011a, B:56:0x011e, B:57:0x0121, B:59:0x0127, B:60:0x012a, B:63:0x0176, B:66:0x01c3, B:69:0x0210, B:71:0x0214, B:75:0x01ca, B:76:0x017d, B:77:0x0131, B:78:0x00fb, B:79:0x0106, B:82:0x0117, B:85:0x00b9, B:88:0x00a4, B:90:0x0092, B:91:0x0086, B:92:0x0219, B:93:0x0221, B:94:0x0222, B:97:0x022c, B:100:0x0236, B:102:0x023c, B:103:0x0241, B:105:0x0245, B:110:0x025a, B:114:0x026d, B:116:0x028b, B:117:0x028e, B:119:0x0294, B:120:0x0297, B:123:0x02e3, B:126:0x0330, B:129:0x037d, B:131:0x0381, B:132:0x0337, B:133:0x02ea, B:134:0x029e, B:136:0x0266, B:139:0x0251, B:141:0x023f, B:142:0x0233, B:143:0x0229, B:144:0x0388, B:147:0x0392, B:150:0x039c, B:152:0x03a2, B:153:0x03a7, B:155:0x03ab, B:160:0x03c0, B:164:0x03d3, B:166:0x03f5, B:169:0x03fd, B:183:0x03cc, B:186:0x03b7, B:188:0x03a5, B:189:0x0399, B:190:0x038f), top: B:2:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0266 A[Catch: all -> 0x0579, TryCatch #1 {all -> 0x0579, blocks: (B:3:0x0016, B:5:0x001a, B:8:0x001e, B:10:0x0022, B:12:0x0026, B:14:0x0042, B:24:0x007f, B:27:0x0089, B:29:0x008f, B:30:0x0094, B:32:0x0098, B:37:0x00ad, B:41:0x00c0, B:43:0x00e2, B:45:0x00ea, B:50:0x00f4, B:53:0x00fe, B:54:0x011a, B:56:0x011e, B:57:0x0121, B:59:0x0127, B:60:0x012a, B:63:0x0176, B:66:0x01c3, B:69:0x0210, B:71:0x0214, B:75:0x01ca, B:76:0x017d, B:77:0x0131, B:78:0x00fb, B:79:0x0106, B:82:0x0117, B:85:0x00b9, B:88:0x00a4, B:90:0x0092, B:91:0x0086, B:92:0x0219, B:93:0x0221, B:94:0x0222, B:97:0x022c, B:100:0x0236, B:102:0x023c, B:103:0x0241, B:105:0x0245, B:110:0x025a, B:114:0x026d, B:116:0x028b, B:117:0x028e, B:119:0x0294, B:120:0x0297, B:123:0x02e3, B:126:0x0330, B:129:0x037d, B:131:0x0381, B:132:0x0337, B:133:0x02ea, B:134:0x029e, B:136:0x0266, B:139:0x0251, B:141:0x023f, B:142:0x0233, B:143:0x0229, B:144:0x0388, B:147:0x0392, B:150:0x039c, B:152:0x03a2, B:153:0x03a7, B:155:0x03ab, B:160:0x03c0, B:164:0x03d3, B:166:0x03f5, B:169:0x03fd, B:183:0x03cc, B:186:0x03b7, B:188:0x03a5, B:189:0x0399, B:190:0x038f), top: B:2:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03c0 A[Catch: all -> 0x0579, TryCatch #1 {all -> 0x0579, blocks: (B:3:0x0016, B:5:0x001a, B:8:0x001e, B:10:0x0022, B:12:0x0026, B:14:0x0042, B:24:0x007f, B:27:0x0089, B:29:0x008f, B:30:0x0094, B:32:0x0098, B:37:0x00ad, B:41:0x00c0, B:43:0x00e2, B:45:0x00ea, B:50:0x00f4, B:53:0x00fe, B:54:0x011a, B:56:0x011e, B:57:0x0121, B:59:0x0127, B:60:0x012a, B:63:0x0176, B:66:0x01c3, B:69:0x0210, B:71:0x0214, B:75:0x01ca, B:76:0x017d, B:77:0x0131, B:78:0x00fb, B:79:0x0106, B:82:0x0117, B:85:0x00b9, B:88:0x00a4, B:90:0x0092, B:91:0x0086, B:92:0x0219, B:93:0x0221, B:94:0x0222, B:97:0x022c, B:100:0x0236, B:102:0x023c, B:103:0x0241, B:105:0x0245, B:110:0x025a, B:114:0x026d, B:116:0x028b, B:117:0x028e, B:119:0x0294, B:120:0x0297, B:123:0x02e3, B:126:0x0330, B:129:0x037d, B:131:0x0381, B:132:0x0337, B:133:0x02ea, B:134:0x029e, B:136:0x0266, B:139:0x0251, B:141:0x023f, B:142:0x0233, B:143:0x0229, B:144:0x0388, B:147:0x0392, B:150:0x039c, B:152:0x03a2, B:153:0x03a7, B:155:0x03ab, B:160:0x03c0, B:164:0x03d3, B:166:0x03f5, B:169:0x03fd, B:183:0x03cc, B:186:0x03b7, B:188:0x03a5, B:189:0x0399, B:190:0x038f), top: B:2:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x03f5 A[Catch: all -> 0x0579, TryCatch #1 {all -> 0x0579, blocks: (B:3:0x0016, B:5:0x001a, B:8:0x001e, B:10:0x0022, B:12:0x0026, B:14:0x0042, B:24:0x007f, B:27:0x0089, B:29:0x008f, B:30:0x0094, B:32:0x0098, B:37:0x00ad, B:41:0x00c0, B:43:0x00e2, B:45:0x00ea, B:50:0x00f4, B:53:0x00fe, B:54:0x011a, B:56:0x011e, B:57:0x0121, B:59:0x0127, B:60:0x012a, B:63:0x0176, B:66:0x01c3, B:69:0x0210, B:71:0x0214, B:75:0x01ca, B:76:0x017d, B:77:0x0131, B:78:0x00fb, B:79:0x0106, B:82:0x0117, B:85:0x00b9, B:88:0x00a4, B:90:0x0092, B:91:0x0086, B:92:0x0219, B:93:0x0221, B:94:0x0222, B:97:0x022c, B:100:0x0236, B:102:0x023c, B:103:0x0241, B:105:0x0245, B:110:0x025a, B:114:0x026d, B:116:0x028b, B:117:0x028e, B:119:0x0294, B:120:0x0297, B:123:0x02e3, B:126:0x0330, B:129:0x037d, B:131:0x0381, B:132:0x0337, B:133:0x02ea, B:134:0x029e, B:136:0x0266, B:139:0x0251, B:141:0x023f, B:142:0x0233, B:143:0x0229, B:144:0x0388, B:147:0x0392, B:150:0x039c, B:152:0x03a2, B:153:0x03a7, B:155:0x03ab, B:160:0x03c0, B:164:0x03d3, B:166:0x03f5, B:169:0x03fd, B:183:0x03cc, B:186:0x03b7, B:188:0x03a5, B:189:0x0399, B:190:0x038f), top: B:2:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x04ee A[Catch: all -> 0x0577, TryCatch #0 {all -> 0x0577, blocks: (B:171:0x0432, B:173:0x0490, B:174:0x0495, B:177:0x04e8, B:179:0x04ee, B:180:0x04f2, B:181:0x04a0, B:191:0x04ff, B:194:0x050c, B:197:0x0517, B:199:0x051b, B:200:0x0521, B:202:0x0527, B:203:0x052a, B:206:0x0531, B:208:0x0513, B:209:0x0509), top: B:16:0x0072 }] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x04a0 A[Catch: all -> 0x0577, TryCatch #0 {all -> 0x0577, blocks: (B:171:0x0432, B:173:0x0490, B:174:0x0495, B:177:0x04e8, B:179:0x04ee, B:180:0x04f2, B:181:0x04a0, B:191:0x04ff, B:194:0x050c, B:197:0x0517, B:199:0x051b, B:200:0x0521, B:202:0x0527, B:203:0x052a, B:206:0x0531, B:208:0x0513, B:209:0x0509), top: B:16:0x0072 }] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x03cc A[Catch: all -> 0x0579, TryCatch #1 {all -> 0x0579, blocks: (B:3:0x0016, B:5:0x001a, B:8:0x001e, B:10:0x0022, B:12:0x0026, B:14:0x0042, B:24:0x007f, B:27:0x0089, B:29:0x008f, B:30:0x0094, B:32:0x0098, B:37:0x00ad, B:41:0x00c0, B:43:0x00e2, B:45:0x00ea, B:50:0x00f4, B:53:0x00fe, B:54:0x011a, B:56:0x011e, B:57:0x0121, B:59:0x0127, B:60:0x012a, B:63:0x0176, B:66:0x01c3, B:69:0x0210, B:71:0x0214, B:75:0x01ca, B:76:0x017d, B:77:0x0131, B:78:0x00fb, B:79:0x0106, B:82:0x0117, B:85:0x00b9, B:88:0x00a4, B:90:0x0092, B:91:0x0086, B:92:0x0219, B:93:0x0221, B:94:0x0222, B:97:0x022c, B:100:0x0236, B:102:0x023c, B:103:0x0241, B:105:0x0245, B:110:0x025a, B:114:0x026d, B:116:0x028b, B:117:0x028e, B:119:0x0294, B:120:0x0297, B:123:0x02e3, B:126:0x0330, B:129:0x037d, B:131:0x0381, B:132:0x0337, B:133:0x02ea, B:134:0x029e, B:136:0x0266, B:139:0x0251, B:141:0x023f, B:142:0x0233, B:143:0x0229, B:144:0x0388, B:147:0x0392, B:150:0x039c, B:152:0x03a2, B:153:0x03a7, B:155:0x03ab, B:160:0x03c0, B:164:0x03d3, B:166:0x03f5, B:169:0x03fd, B:183:0x03cc, B:186:0x03b7, B:188:0x03a5, B:189:0x0399, B:190:0x038f), top: B:2:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ad A[Catch: all -> 0x0579, TryCatch #1 {all -> 0x0579, blocks: (B:3:0x0016, B:5:0x001a, B:8:0x001e, B:10:0x0022, B:12:0x0026, B:14:0x0042, B:24:0x007f, B:27:0x0089, B:29:0x008f, B:30:0x0094, B:32:0x0098, B:37:0x00ad, B:41:0x00c0, B:43:0x00e2, B:45:0x00ea, B:50:0x00f4, B:53:0x00fe, B:54:0x011a, B:56:0x011e, B:57:0x0121, B:59:0x0127, B:60:0x012a, B:63:0x0176, B:66:0x01c3, B:69:0x0210, B:71:0x0214, B:75:0x01ca, B:76:0x017d, B:77:0x0131, B:78:0x00fb, B:79:0x0106, B:82:0x0117, B:85:0x00b9, B:88:0x00a4, B:90:0x0092, B:91:0x0086, B:92:0x0219, B:93:0x0221, B:94:0x0222, B:97:0x022c, B:100:0x0236, B:102:0x023c, B:103:0x0241, B:105:0x0245, B:110:0x025a, B:114:0x026d, B:116:0x028b, B:117:0x028e, B:119:0x0294, B:120:0x0297, B:123:0x02e3, B:126:0x0330, B:129:0x037d, B:131:0x0381, B:132:0x0337, B:133:0x02ea, B:134:0x029e, B:136:0x0266, B:139:0x0251, B:141:0x023f, B:142:0x0233, B:143:0x0229, B:144:0x0388, B:147:0x0392, B:150:0x039c, B:152:0x03a2, B:153:0x03a7, B:155:0x03ab, B:160:0x03c0, B:164:0x03d3, B:166:0x03f5, B:169:0x03fd, B:183:0x03cc, B:186:0x03b7, B:188:0x03a5, B:189:0x0399, B:190:0x038f), top: B:2:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e2 A[Catch: all -> 0x0579, TryCatch #1 {all -> 0x0579, blocks: (B:3:0x0016, B:5:0x001a, B:8:0x001e, B:10:0x0022, B:12:0x0026, B:14:0x0042, B:24:0x007f, B:27:0x0089, B:29:0x008f, B:30:0x0094, B:32:0x0098, B:37:0x00ad, B:41:0x00c0, B:43:0x00e2, B:45:0x00ea, B:50:0x00f4, B:53:0x00fe, B:54:0x011a, B:56:0x011e, B:57:0x0121, B:59:0x0127, B:60:0x012a, B:63:0x0176, B:66:0x01c3, B:69:0x0210, B:71:0x0214, B:75:0x01ca, B:76:0x017d, B:77:0x0131, B:78:0x00fb, B:79:0x0106, B:82:0x0117, B:85:0x00b9, B:88:0x00a4, B:90:0x0092, B:91:0x0086, B:92:0x0219, B:93:0x0221, B:94:0x0222, B:97:0x022c, B:100:0x0236, B:102:0x023c, B:103:0x0241, B:105:0x0245, B:110:0x025a, B:114:0x026d, B:116:0x028b, B:117:0x028e, B:119:0x0294, B:120:0x0297, B:123:0x02e3, B:126:0x0330, B:129:0x037d, B:131:0x0381, B:132:0x0337, B:133:0x02ea, B:134:0x029e, B:136:0x0266, B:139:0x0251, B:141:0x023f, B:142:0x0233, B:143:0x0229, B:144:0x0388, B:147:0x0392, B:150:0x039c, B:152:0x03a2, B:153:0x03a7, B:155:0x03ab, B:160:0x03c0, B:164:0x03d3, B:166:0x03f5, B:169:0x03fd, B:183:0x03cc, B:186:0x03b7, B:188:0x03a5, B:189:0x0399, B:190:0x038f), top: B:2:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ea A[Catch: all -> 0x0579, TryCatch #1 {all -> 0x0579, blocks: (B:3:0x0016, B:5:0x001a, B:8:0x001e, B:10:0x0022, B:12:0x0026, B:14:0x0042, B:24:0x007f, B:27:0x0089, B:29:0x008f, B:30:0x0094, B:32:0x0098, B:37:0x00ad, B:41:0x00c0, B:43:0x00e2, B:45:0x00ea, B:50:0x00f4, B:53:0x00fe, B:54:0x011a, B:56:0x011e, B:57:0x0121, B:59:0x0127, B:60:0x012a, B:63:0x0176, B:66:0x01c3, B:69:0x0210, B:71:0x0214, B:75:0x01ca, B:76:0x017d, B:77:0x0131, B:78:0x00fb, B:79:0x0106, B:82:0x0117, B:85:0x00b9, B:88:0x00a4, B:90:0x0092, B:91:0x0086, B:92:0x0219, B:93:0x0221, B:94:0x0222, B:97:0x022c, B:100:0x0236, B:102:0x023c, B:103:0x0241, B:105:0x0245, B:110:0x025a, B:114:0x026d, B:116:0x028b, B:117:0x028e, B:119:0x0294, B:120:0x0297, B:123:0x02e3, B:126:0x0330, B:129:0x037d, B:131:0x0381, B:132:0x0337, B:133:0x02ea, B:134:0x029e, B:136:0x0266, B:139:0x0251, B:141:0x023f, B:142:0x0233, B:143:0x0229, B:144:0x0388, B:147:0x0392, B:150:0x039c, B:152:0x03a2, B:153:0x03a7, B:155:0x03ab, B:160:0x03c0, B:164:0x03d3, B:166:0x03f5, B:169:0x03fd, B:183:0x03cc, B:186:0x03b7, B:188:0x03a5, B:189:0x0399, B:190:0x038f), top: B:2:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011e A[Catch: all -> 0x0579, TryCatch #1 {all -> 0x0579, blocks: (B:3:0x0016, B:5:0x001a, B:8:0x001e, B:10:0x0022, B:12:0x0026, B:14:0x0042, B:24:0x007f, B:27:0x0089, B:29:0x008f, B:30:0x0094, B:32:0x0098, B:37:0x00ad, B:41:0x00c0, B:43:0x00e2, B:45:0x00ea, B:50:0x00f4, B:53:0x00fe, B:54:0x011a, B:56:0x011e, B:57:0x0121, B:59:0x0127, B:60:0x012a, B:63:0x0176, B:66:0x01c3, B:69:0x0210, B:71:0x0214, B:75:0x01ca, B:76:0x017d, B:77:0x0131, B:78:0x00fb, B:79:0x0106, B:82:0x0117, B:85:0x00b9, B:88:0x00a4, B:90:0x0092, B:91:0x0086, B:92:0x0219, B:93:0x0221, B:94:0x0222, B:97:0x022c, B:100:0x0236, B:102:0x023c, B:103:0x0241, B:105:0x0245, B:110:0x025a, B:114:0x026d, B:116:0x028b, B:117:0x028e, B:119:0x0294, B:120:0x0297, B:123:0x02e3, B:126:0x0330, B:129:0x037d, B:131:0x0381, B:132:0x0337, B:133:0x02ea, B:134:0x029e, B:136:0x0266, B:139:0x0251, B:141:0x023f, B:142:0x0233, B:143:0x0229, B:144:0x0388, B:147:0x0392, B:150:0x039c, B:152:0x03a2, B:153:0x03a7, B:155:0x03ab, B:160:0x03c0, B:164:0x03d3, B:166:0x03f5, B:169:0x03fd, B:183:0x03cc, B:186:0x03b7, B:188:0x03a5, B:189:0x0399, B:190:0x038f), top: B:2:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0127 A[Catch: all -> 0x0579, TryCatch #1 {all -> 0x0579, blocks: (B:3:0x0016, B:5:0x001a, B:8:0x001e, B:10:0x0022, B:12:0x0026, B:14:0x0042, B:24:0x007f, B:27:0x0089, B:29:0x008f, B:30:0x0094, B:32:0x0098, B:37:0x00ad, B:41:0x00c0, B:43:0x00e2, B:45:0x00ea, B:50:0x00f4, B:53:0x00fe, B:54:0x011a, B:56:0x011e, B:57:0x0121, B:59:0x0127, B:60:0x012a, B:63:0x0176, B:66:0x01c3, B:69:0x0210, B:71:0x0214, B:75:0x01ca, B:76:0x017d, B:77:0x0131, B:78:0x00fb, B:79:0x0106, B:82:0x0117, B:85:0x00b9, B:88:0x00a4, B:90:0x0092, B:91:0x0086, B:92:0x0219, B:93:0x0221, B:94:0x0222, B:97:0x022c, B:100:0x0236, B:102:0x023c, B:103:0x0241, B:105:0x0245, B:110:0x025a, B:114:0x026d, B:116:0x028b, B:117:0x028e, B:119:0x0294, B:120:0x0297, B:123:0x02e3, B:126:0x0330, B:129:0x037d, B:131:0x0381, B:132:0x0337, B:133:0x02ea, B:134:0x029e, B:136:0x0266, B:139:0x0251, B:141:0x023f, B:142:0x0233, B:143:0x0229, B:144:0x0388, B:147:0x0392, B:150:0x039c, B:152:0x03a2, B:153:0x03a7, B:155:0x03ab, B:160:0x03c0, B:164:0x03d3, B:166:0x03f5, B:169:0x03fd, B:183:0x03cc, B:186:0x03b7, B:188:0x03a5, B:189:0x0399, B:190:0x038f), top: B:2:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0214 A[Catch: all -> 0x0579, TryCatch #1 {all -> 0x0579, blocks: (B:3:0x0016, B:5:0x001a, B:8:0x001e, B:10:0x0022, B:12:0x0026, B:14:0x0042, B:24:0x007f, B:27:0x0089, B:29:0x008f, B:30:0x0094, B:32:0x0098, B:37:0x00ad, B:41:0x00c0, B:43:0x00e2, B:45:0x00ea, B:50:0x00f4, B:53:0x00fe, B:54:0x011a, B:56:0x011e, B:57:0x0121, B:59:0x0127, B:60:0x012a, B:63:0x0176, B:66:0x01c3, B:69:0x0210, B:71:0x0214, B:75:0x01ca, B:76:0x017d, B:77:0x0131, B:78:0x00fb, B:79:0x0106, B:82:0x0117, B:85:0x00b9, B:88:0x00a4, B:90:0x0092, B:91:0x0086, B:92:0x0219, B:93:0x0221, B:94:0x0222, B:97:0x022c, B:100:0x0236, B:102:0x023c, B:103:0x0241, B:105:0x0245, B:110:0x025a, B:114:0x026d, B:116:0x028b, B:117:0x028e, B:119:0x0294, B:120:0x0297, B:123:0x02e3, B:126:0x0330, B:129:0x037d, B:131:0x0381, B:132:0x0337, B:133:0x02ea, B:134:0x029e, B:136:0x0266, B:139:0x0251, B:141:0x023f, B:142:0x0233, B:143:0x0229, B:144:0x0388, B:147:0x0392, B:150:0x039c, B:152:0x03a2, B:153:0x03a7, B:155:0x03ab, B:160:0x03c0, B:164:0x03d3, B:166:0x03f5, B:169:0x03fd, B:183:0x03cc, B:186:0x03b7, B:188:0x03a5, B:189:0x0399, B:190:0x038f), top: B:2:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01ca A[Catch: all -> 0x0579, TryCatch #1 {all -> 0x0579, blocks: (B:3:0x0016, B:5:0x001a, B:8:0x001e, B:10:0x0022, B:12:0x0026, B:14:0x0042, B:24:0x007f, B:27:0x0089, B:29:0x008f, B:30:0x0094, B:32:0x0098, B:37:0x00ad, B:41:0x00c0, B:43:0x00e2, B:45:0x00ea, B:50:0x00f4, B:53:0x00fe, B:54:0x011a, B:56:0x011e, B:57:0x0121, B:59:0x0127, B:60:0x012a, B:63:0x0176, B:66:0x01c3, B:69:0x0210, B:71:0x0214, B:75:0x01ca, B:76:0x017d, B:77:0x0131, B:78:0x00fb, B:79:0x0106, B:82:0x0117, B:85:0x00b9, B:88:0x00a4, B:90:0x0092, B:91:0x0086, B:92:0x0219, B:93:0x0221, B:94:0x0222, B:97:0x022c, B:100:0x0236, B:102:0x023c, B:103:0x0241, B:105:0x0245, B:110:0x025a, B:114:0x026d, B:116:0x028b, B:117:0x028e, B:119:0x0294, B:120:0x0297, B:123:0x02e3, B:126:0x0330, B:129:0x037d, B:131:0x0381, B:132:0x0337, B:133:0x02ea, B:134:0x029e, B:136:0x0266, B:139:0x0251, B:141:0x023f, B:142:0x0233, B:143:0x0229, B:144:0x0388, B:147:0x0392, B:150:0x039c, B:152:0x03a2, B:153:0x03a7, B:155:0x03ab, B:160:0x03c0, B:164:0x03d3, B:166:0x03f5, B:169:0x03fd, B:183:0x03cc, B:186:0x03b7, B:188:0x03a5, B:189:0x0399, B:190:0x038f), top: B:2:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x017d A[Catch: all -> 0x0579, TryCatch #1 {all -> 0x0579, blocks: (B:3:0x0016, B:5:0x001a, B:8:0x001e, B:10:0x0022, B:12:0x0026, B:14:0x0042, B:24:0x007f, B:27:0x0089, B:29:0x008f, B:30:0x0094, B:32:0x0098, B:37:0x00ad, B:41:0x00c0, B:43:0x00e2, B:45:0x00ea, B:50:0x00f4, B:53:0x00fe, B:54:0x011a, B:56:0x011e, B:57:0x0121, B:59:0x0127, B:60:0x012a, B:63:0x0176, B:66:0x01c3, B:69:0x0210, B:71:0x0214, B:75:0x01ca, B:76:0x017d, B:77:0x0131, B:78:0x00fb, B:79:0x0106, B:82:0x0117, B:85:0x00b9, B:88:0x00a4, B:90:0x0092, B:91:0x0086, B:92:0x0219, B:93:0x0221, B:94:0x0222, B:97:0x022c, B:100:0x0236, B:102:0x023c, B:103:0x0241, B:105:0x0245, B:110:0x025a, B:114:0x026d, B:116:0x028b, B:117:0x028e, B:119:0x0294, B:120:0x0297, B:123:0x02e3, B:126:0x0330, B:129:0x037d, B:131:0x0381, B:132:0x0337, B:133:0x02ea, B:134:0x029e, B:136:0x0266, B:139:0x0251, B:141:0x023f, B:142:0x0233, B:143:0x0229, B:144:0x0388, B:147:0x0392, B:150:0x039c, B:152:0x03a2, B:153:0x03a7, B:155:0x03ab, B:160:0x03c0, B:164:0x03d3, B:166:0x03f5, B:169:0x03fd, B:183:0x03cc, B:186:0x03b7, B:188:0x03a5, B:189:0x0399, B:190:0x038f), top: B:2:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0131 A[Catch: all -> 0x0579, TryCatch #1 {all -> 0x0579, blocks: (B:3:0x0016, B:5:0x001a, B:8:0x001e, B:10:0x0022, B:12:0x0026, B:14:0x0042, B:24:0x007f, B:27:0x0089, B:29:0x008f, B:30:0x0094, B:32:0x0098, B:37:0x00ad, B:41:0x00c0, B:43:0x00e2, B:45:0x00ea, B:50:0x00f4, B:53:0x00fe, B:54:0x011a, B:56:0x011e, B:57:0x0121, B:59:0x0127, B:60:0x012a, B:63:0x0176, B:66:0x01c3, B:69:0x0210, B:71:0x0214, B:75:0x01ca, B:76:0x017d, B:77:0x0131, B:78:0x00fb, B:79:0x0106, B:82:0x0117, B:85:0x00b9, B:88:0x00a4, B:90:0x0092, B:91:0x0086, B:92:0x0219, B:93:0x0221, B:94:0x0222, B:97:0x022c, B:100:0x0236, B:102:0x023c, B:103:0x0241, B:105:0x0245, B:110:0x025a, B:114:0x026d, B:116:0x028b, B:117:0x028e, B:119:0x0294, B:120:0x0297, B:123:0x02e3, B:126:0x0330, B:129:0x037d, B:131:0x0381, B:132:0x0337, B:133:0x02ea, B:134:0x029e, B:136:0x0266, B:139:0x0251, B:141:0x023f, B:142:0x0233, B:143:0x0229, B:144:0x0388, B:147:0x0392, B:150:0x039c, B:152:0x03a2, B:153:0x03a7, B:155:0x03ab, B:160:0x03c0, B:164:0x03d3, B:166:0x03f5, B:169:0x03fd, B:183:0x03cc, B:186:0x03b7, B:188:0x03a5, B:189:0x0399, B:190:0x038f), top: B:2:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0117 A[Catch: all -> 0x0579, TryCatch #1 {all -> 0x0579, blocks: (B:3:0x0016, B:5:0x001a, B:8:0x001e, B:10:0x0022, B:12:0x0026, B:14:0x0042, B:24:0x007f, B:27:0x0089, B:29:0x008f, B:30:0x0094, B:32:0x0098, B:37:0x00ad, B:41:0x00c0, B:43:0x00e2, B:45:0x00ea, B:50:0x00f4, B:53:0x00fe, B:54:0x011a, B:56:0x011e, B:57:0x0121, B:59:0x0127, B:60:0x012a, B:63:0x0176, B:66:0x01c3, B:69:0x0210, B:71:0x0214, B:75:0x01ca, B:76:0x017d, B:77:0x0131, B:78:0x00fb, B:79:0x0106, B:82:0x0117, B:85:0x00b9, B:88:0x00a4, B:90:0x0092, B:91:0x0086, B:92:0x0219, B:93:0x0221, B:94:0x0222, B:97:0x022c, B:100:0x0236, B:102:0x023c, B:103:0x0241, B:105:0x0245, B:110:0x025a, B:114:0x026d, B:116:0x028b, B:117:0x028e, B:119:0x0294, B:120:0x0297, B:123:0x02e3, B:126:0x0330, B:129:0x037d, B:131:0x0381, B:132:0x0337, B:133:0x02ea, B:134:0x029e, B:136:0x0266, B:139:0x0251, B:141:0x023f, B:142:0x0233, B:143:0x0229, B:144:0x0388, B:147:0x0392, B:150:0x039c, B:152:0x03a2, B:153:0x03a7, B:155:0x03ab, B:160:0x03c0, B:164:0x03d3, B:166:0x03f5, B:169:0x03fd, B:183:0x03cc, B:186:0x03b7, B:188:0x03a5, B:189:0x0399, B:190:0x038f), top: B:2:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00b9 A[Catch: all -> 0x0579, TryCatch #1 {all -> 0x0579, blocks: (B:3:0x0016, B:5:0x001a, B:8:0x001e, B:10:0x0022, B:12:0x0026, B:14:0x0042, B:24:0x007f, B:27:0x0089, B:29:0x008f, B:30:0x0094, B:32:0x0098, B:37:0x00ad, B:41:0x00c0, B:43:0x00e2, B:45:0x00ea, B:50:0x00f4, B:53:0x00fe, B:54:0x011a, B:56:0x011e, B:57:0x0121, B:59:0x0127, B:60:0x012a, B:63:0x0176, B:66:0x01c3, B:69:0x0210, B:71:0x0214, B:75:0x01ca, B:76:0x017d, B:77:0x0131, B:78:0x00fb, B:79:0x0106, B:82:0x0117, B:85:0x00b9, B:88:0x00a4, B:90:0x0092, B:91:0x0086, B:92:0x0219, B:93:0x0221, B:94:0x0222, B:97:0x022c, B:100:0x0236, B:102:0x023c, B:103:0x0241, B:105:0x0245, B:110:0x025a, B:114:0x026d, B:116:0x028b, B:117:0x028e, B:119:0x0294, B:120:0x0297, B:123:0x02e3, B:126:0x0330, B:129:0x037d, B:131:0x0381, B:132:0x0337, B:133:0x02ea, B:134:0x029e, B:136:0x0266, B:139:0x0251, B:141:0x023f, B:142:0x0233, B:143:0x0229, B:144:0x0388, B:147:0x0392, B:150:0x039c, B:152:0x03a2, B:153:0x03a7, B:155:0x03ab, B:160:0x03c0, B:164:0x03d3, B:166:0x03f5, B:169:0x03fd, B:183:0x03cc, B:186:0x03b7, B:188:0x03a5, B:189:0x0399, B:190:0x038f), top: B:2:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Z(m84.a r28) {
        /*
            Method dump skipped, instructions count: 1413
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m84.u.Z(m84.a):void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.l
    public void d(java.lang.Object obj, boolean z17) {
        android.content.Context context;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 m70354x74235b3e;
        m84.w wVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("bindComponentModel", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 model = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("bindComponentModel", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(model, "model");
        android.view.View view = this.f406323o;
        if (view == null || (context = view.getContext()) == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("bindComponentModel", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
        } else {
            this.f406327s = context;
            java.lang.String j17 = j();
            try {
                if (!this.f406330v) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMViewStub", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
                    android.view.ViewStub viewStub = (android.view.ViewStub) ((jz5.n) this.A).mo141623x754a37bb();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMViewStub", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
                    android.view.View h17 = a84.y0.h(viewStub);
                    this.B = h17 instanceof android.widget.FrameLayout ? (android.widget.FrameLayout) h17 : null;
                    this.f406330v = true;
                }
                this.f406328t = model;
                m70354x74235b3e = model.m70354x74235b3e();
            } catch (java.lang.Throwable th6) {
                ca4.q.c(j17, th6);
            }
            if (m70354x74235b3e != null && (wVar = m70354x74235b3e.f38221xeb928596) != null) {
                this.f406329u = wVar;
                java.lang.String m70355xb5882a06 = model.m70355xb5882a06();
                if (m70355xb5882a06 == null) {
                    m70355xb5882a06 = "";
                }
                wVar.f406351o = m70355xb5882a06;
                if (wVar.c()) {
                    int y17 = ca4.m0.y(j(), this.f406327s, this.f406324p, this.f406325q);
                    this.L = y17;
                    int i17 = wVar.f406337a;
                    int i18 = wVar.f406338b;
                    int i19 = wVar.f406339c;
                    this.M = i17 > 0 ? y17 / i17 : 1.0f;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(j(), "bindComponentModel snsId=" + ca4.z0.t0(model.f68891x29d1292e) + " isSame=" + z17 + " containerWidth=" + i17 + " containerHeight=" + i18 + " bottomOffset=" + i19 + " available=" + this.L + " scale=" + this.M);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMSnsAdBreakContainer", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17936xdec9f2b4 c17936xdec9f2b4 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17936xdec9f2b4) ((jz5.n) this.f406331w).mo141623x754a37bb();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMSnsAdBreakContainer", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
                    if (c17936xdec9f2b4 != null) {
                        c17936xdec9f2b4.setVisibility(0);
                    }
                    android.widget.FrameLayout frameLayout = this.B;
                    if (frameLayout != null) {
                        frameLayout.setVisibility(0);
                    }
                    android.widget.ImageView N = N();
                    if (N != null) {
                        N.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
                    }
                    android.widget.ImageView N2 = N();
                    if (N2 != null) {
                        N2.setVisibility(8);
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addListener", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
                    java.lang.String j18 = j();
                    try {
                        mo48813x58998cd();
                    } catch (java.lang.Throwable th7) {
                        ca4.q.c(j18, th7);
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addListener", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
                    Z(I(wVar));
                    C();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("bindComponentModel", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(j(), "bindComponentModel, info invalid, snsId=" + ca4.z0.t0(model.f68891x29d1292e));
                    android.widget.FrameLayout frameLayout2 = this.B;
                    if (frameLayout2 != null) {
                        frameLayout2.setVisibility(8);
                    }
                    android.widget.FrameLayout S = S();
                    if (S != null) {
                        S.setVisibility(8);
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("bindComponentModel", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("bindComponentModel", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("bindComponentModel", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.l
    public void v(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resetComponentState", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resetComponentState", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
        super.v((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226) obj);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(j(), "resetComponentState");
        W();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resetComponentState", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resetComponentState", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
    }
}
