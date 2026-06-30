package u84;

/* loaded from: classes4.dex */
public abstract class m1 extends com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.l {
    public static final p3325xe03a0797.p3326xc267989b.r0 N;
    public final jz5.g A;
    public final jz5.g B;
    public final jz5.g C;
    public android.animation.ObjectAnimator D;
    public android.animation.ObjectAnimator E;
    public final android.view.animation.PathInterpolator F;
    public final android.view.animation.PathInterpolator G;
    public u84.o1 H;
    public float I;

    /* renamed from: J, reason: collision with root package name */
    public s34.d f507126J;
    public p3325xe03a0797.p3326xc267989b.r2 K;
    public boolean L;
    public final android.os.Handler M;

    /* renamed from: o, reason: collision with root package name */
    public final android.view.View f507127o;

    /* renamed from: p, reason: collision with root package name */
    public final int f507128p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f507129q;

    /* renamed from: r, reason: collision with root package name */
    public final w64.n f507130r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f507131s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f507132t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f507133u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.FrameLayout f507134v;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f507135w;

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f507136x;

    /* renamed from: y, reason: collision with root package name */
    public final jz5.g f507137y;

    /* renamed from: z, reason: collision with root package name */
    public final jz5.g f507138z;

    static {
        int i17 = p3325xe03a0797.p3326xc267989b.r0.N0;
        N = new u84.l1(p3325xe03a0797.p3326xc267989b.q0.f392100d);
    }

    public m1(java.lang.String str, p012xc85e97e9.p093xedfae76a.y yVar, android.view.View view, int i17, boolean z17, i64.b1 b1Var, w64.n nVar) {
        super(str, yVar, view);
        this.f507127o = view;
        this.f507128p = i17;
        this.f507129q = z17;
        this.f507130r = nVar;
        this.f507131s = jz5.h.b(new u84.x0(this));
        this.f507132t = jz5.h.b(new u84.z0(this));
        this.f507135w = jz5.h.b(new u84.f1(this));
        this.f507136x = jz5.h.b(new u84.b1(this));
        this.f507137y = jz5.h.b(new u84.a1(this));
        this.f507138z = jz5.h.b(new u84.c1(this));
        this.A = jz5.h.b(new u84.e1(this));
        this.B = jz5.h.b(new u84.d1(this));
        this.C = jz5.h.b(new u84.y0(this));
        this.F = new android.view.animation.PathInterpolator(0.0f, 0.0f, 0.5f, 1.0f);
        this.G = new android.view.animation.PathInterpolator(0.5f, 0.0f, 1.0f, 1.0f);
        this.M = new android.os.Handler(android.os.Looper.getMainLooper());
    }

    public static final /* synthetic */ android.view.ViewGroup A(u84.m1 m1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMStateSettingAfterContainer", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent");
        android.view.ViewGroup E = m1Var.E();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMStateSettingAfterContainer", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent");
        return E;
    }

    public static final /* synthetic */ android.view.ViewGroup B(u84.m1 m1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMStateSettingBeforeContainer", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent");
        android.view.ViewGroup F = m1Var.F();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMStateSettingBeforeContainer", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent");
        return F;
    }

    public static final /* synthetic */ u84.o1 y(u84.m1 m1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMAdStateSettingBarInfo$p", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent");
        u84.o1 o1Var = m1Var.H;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMAdStateSettingBarInfo$p", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent");
        return o1Var;
    }

    public static final /* synthetic */ android.widget.FrameLayout z(u84.m1 m1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMBottomStateSettingBarView$p", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent");
        android.widget.FrameLayout frameLayout = m1Var.f507134v;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMBottomStateSettingBarView$p", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent");
        return frameLayout;
    }

    public final void C() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("cancelAnimation", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent");
        android.animation.ObjectAnimator objectAnimator = this.D;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        android.animation.ObjectAnimator objectAnimator2 = this.E;
        if (objectAnimator2 != null) {
            objectAnimator2.cancel();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("cancelAnimation", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent");
    }

    public final w64.n D() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAdClickActionHandler", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdClickActionHandler", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent");
        return this.f507130r;
    }

    public final android.view.ViewGroup E() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMStateSettingAfterContainer", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) ((jz5.n) this.f507137y).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMStateSettingAfterContainer", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent");
        return viewGroup;
    }

    public final android.view.ViewGroup F() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMStateSettingBeforeContainer", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) ((jz5.n) this.f507136x).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMStateSettingBeforeContainer", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent");
        return viewGroup;
    }

    public final android.widget.TextView G() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMStateSettingLinkDesc", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent");
        android.widget.TextView textView = (android.widget.TextView) ((jz5.n) this.B).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMStateSettingLinkDesc", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent");
        return textView;
    }

    public final android.widget.TextView H() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMStateSettingLinkTitle", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent");
        android.widget.TextView textView = (android.widget.TextView) ((jz5.n) this.A).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMStateSettingLinkTitle", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent");
        return textView;
    }

    public final android.widget.TextView I() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMStateSettingTitle", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent");
        android.widget.TextView textView = (android.widget.TextView) ((jz5.n) this.f507135w).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMStateSettingTitle", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent");
        return textView;
    }

    public final void J(android.widget.TextView textView, java.lang.String str, s34.g1 g1Var, int i17) {
        int e17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initDiffStageText", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent");
        if (textView != null) {
            if (str == null) {
                str = "";
            }
            textView.setText(str);
        }
        if (textView != null) {
            if (com.p314xaae8f345.mm.ui.bk.C()) {
                e17 = ca4.n0.e(g1Var != null ? g1Var.b() : null, i17);
            } else {
                e17 = ca4.n0.e(g1Var != null ? g1Var.a() : null, i17);
            }
            textView.setTextColor(e17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initDiffStageText", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent");
    }

    public final void K(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 c17702x544f64e9, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("rebuildEmoticon", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent");
        s34.d dVar = c17702x544f64e9.f244143u0;
        if (dVar == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("rebuildEmoticon", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent");
            return;
        }
        java.lang.String j17 = j();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("override emoticon by worldCupAvatar (using avatar as emoji source), aid=");
        sb6.append(str3);
        sb6.append(", originUrlLen=");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getEmoticonUrl", "com.tencent.mm.plugin.sns.ad.adxml.AdClickToTextStatusUIInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getEmoticonUrl", "com.tencent.mm.plugin.sns.ad.adxml.AdClickToTextStatusUIInfo");
        java.lang.String str4 = dVar.f484144h;
        sb6.append(str4 != null ? str4.length() : 0);
        sb6.append(", customUrlLen=");
        sb6.append(str.length());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(j17, sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getClickActionType", "com.tencent.mm.plugin.sns.ad.adxml.AdClickToTextStatusUIInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getClickActionType", "com.tencent.mm.plugin.sns.ad.adxml.AdClickToTextStatusUIInfo");
        int i17 = dVar.f484137a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getImageUrl", "com.tencent.mm.plugin.sns.ad.adxml.AdClickToTextStatusUIInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getImageUrl", "com.tencent.mm.plugin.sns.ad.adxml.AdClickToTextStatusUIInfo");
        java.lang.String str5 = dVar.f484138b;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getIconId", "com.tencent.mm.plugin.sns.ad.adxml.AdClickToTextStatusUIInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getIconId", "com.tencent.mm.plugin.sns.ad.adxml.AdClickToTextStatusUIInfo");
        java.lang.String str6 = dVar.f484139c;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCustomIconDescription", "com.tencent.mm.plugin.sns.ad.adxml.AdClickToTextStatusUIInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCustomIconDescription", "com.tencent.mm.plugin.sns.ad.adxml.AdClickToTextStatusUIInfo");
        java.lang.String str7 = dVar.f484140d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSourceFooterData", "com.tencent.mm.plugin.sns.ad.adxml.AdClickToTextStatusUIInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSourceFooterData", "com.tencent.mm.plugin.sns.ad.adxml.AdClickToTextStatusUIInfo");
        java.lang.String str8 = dVar.f484141e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSourceVerifyInfo", "com.tencent.mm.plugin.sns.ad.adxml.AdClickToTextStatusUIInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSourceVerifyInfo", "com.tencent.mm.plugin.sns.ad.adxml.AdClickToTextStatusUIInfo");
        java.lang.String str9 = dVar.f484142f;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getDesc", "com.tencent.mm.plugin.sns.ad.adxml.AdClickToTextStatusUIInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getDesc", "com.tencent.mm.plugin.sns.ad.adxml.AdClickToTextStatusUIInfo");
        java.lang.String str10 = dVar.f484143g;
        java.lang.String a17 = dVar.a();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getVideoMd5", "com.tencent.mm.plugin.sns.ad.adxml.AdClickToTextStatusUIInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getVideoMd5", "com.tencent.mm.plugin.sns.ad.adxml.AdClickToTextStatusUIInfo");
        java.lang.String str11 = dVar.f484147k;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getExpiredTime", "com.tencent.mm.plugin.sns.ad.adxml.AdClickToTextStatusUIInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getExpiredTime", "com.tencent.mm.plugin.sns.ad.adxml.AdClickToTextStatusUIInfo");
        long j18 = dVar.f484148l;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getExpiredToast", "com.tencent.mm.plugin.sns.ad.adxml.AdClickToTextStatusUIInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getExpiredToast", "com.tencent.mm.plugin.sns.ad.adxml.AdClickToTextStatusUIInfo");
        c17702x544f64e9.f244143u0 = new s34.d(i17, str5, str6, str7, str8, str9, str10, str, str2, a17, str11, j18, dVar.f484149m);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("rebuildEmoticon", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent");
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0390  */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(java.lang.Object r29, boolean r30) {
        /*
            Method dump skipped, instructions count: 1011
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u84.m1.d(java.lang.Object, boolean):void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.l
    public void v(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resetComponentState", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resetComponentState", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent");
        super.v((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226) obj);
        this.M.removeCallbacksAndMessages(null);
        android.widget.FrameLayout frameLayout = this.f507134v;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        C();
        this.L = false;
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.K;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        this.K = null;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resetComponentState", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resetComponentState", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent");
    }
}
