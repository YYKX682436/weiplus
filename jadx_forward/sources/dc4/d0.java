package dc4;

/* loaded from: classes4.dex */
public class d0 extends dc4.v implements i64.k0 {
    public android.view.View A;
    public android.view.View B;
    public android.view.View C;
    public android.view.View D;
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2143x50995631.C17792xc6c22fda E;
    public final i64.b1 F;
    public int G;
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.pa H;
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ra I;

    /* renamed from: J, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.C17806x48d2cd43 f310257J;
    public android.view.ViewGroup K;
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.j0 L;
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.C17806x48d2cd43 M;
    public n74.n1 N;
    public android.view.ViewStub P;
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.C17805xb6909733 Q;
    public android.view.ViewStub R;
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.C17803x7f9d5a75 S;
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.v T;
    public android.view.ViewStub U;
    public a44.k V;
    public android.view.ViewGroup W;
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2221x6b0147b.C18390xafce807 X;
    public boolean Y;
    public final java.lang.String Z;

    /* renamed from: l1, reason: collision with root package name */
    public android.view.View f310258l1;

    /* renamed from: p, reason: collision with root package name */
    public android.content.Context f310259p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f310262q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f310263r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f310264s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.Button f310265t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.Button f310266u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.View f310267v;

    /* renamed from: w, reason: collision with root package name */
    public android.view.View f310268w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.ImageView f310269x;

    /* renamed from: x0, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.l f310270x0;

    /* renamed from: y, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17972xe84284f4 f310272y;

    /* renamed from: y0, reason: collision with root package name */
    public j84.i0 f310273y0;

    /* renamed from: y1, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2150x7a6db1a9.p2151xf8ffc37b.C17814xa1ba4463 f310274y1;

    /* renamed from: z, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.C18410x906a0652 f310275z;

    /* renamed from: p0, reason: collision with root package name */
    public final android.os.Handler f310260p0 = new android.os.Handler(android.os.Looper.getMainLooper());

    /* renamed from: p1, reason: collision with root package name */
    public final w64.l f310261p1 = new dc4.z(this);

    /* renamed from: x1, reason: collision with root package name */
    public boolean f310271x1 = false;

    /* renamed from: z1, reason: collision with root package name */
    public final boolean f310276z1 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2150x7a6db1a9.p2151xf8ffc37b.C17814xa1ba4463.e();

    public d0(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 c19807x593d1720, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i iVar, i64.b1 b1Var) {
        this.f310364d = c19807x593d1720;
        this.f310365e = c17933xe8d1b226;
        this.f310371n = iVar;
        this.F = b1Var;
        this.Z = c17933xe8d1b226.m70363x51f8f990();
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x09eb  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0a08  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x07fc A[Catch: Exception -> 0x0814, TryCatch #0 {Exception -> 0x0814, blocks: (B:70:0x0792, B:72:0x07ac, B:75:0x07b3, B:77:0x07be, B:79:0x07d5, B:80:0x07f6, B:118:0x07fc, B:120:0x080e, B:121:0x07b8), top: B:69:0x0792 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x07be A[Catch: Exception -> 0x0814, TryCatch #0 {Exception -> 0x0814, blocks: (B:70:0x0792, B:72:0x07ac, B:75:0x07b3, B:77:0x07be, B:79:0x07d5, B:80:0x07f6, B:118:0x07fc, B:120:0x080e, B:121:0x07b8), top: B:69:0x0792 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0824  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0855  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0909  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0986  */
    @Override // dc4.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(android.view.View r33, android.view.View r34) {
        /*
            Method dump skipped, instructions count: 2598
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dc4.d0.c(android.view.View, android.view.View):void");
    }

    @Override // i64.k0
    public void d(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.v vVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAdRemoved", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem");
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.v.a(this.f310365e) && (vVar = this.T) != null) {
            vVar.b();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAdRemoved", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem");
    }

    @Override // dc4.v
    public void g() {
        boolean a17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2221x6b0147b.C18390xafce807 c18390xafce807;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPause", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem");
        try {
            a17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.v.a(this.f310365e);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardAdDetailItemView", "onPause, hasPlayedVideo=" + this.f310271x1 + ", useOnlineVideo=" + this.Y + ", isAdLivingStream=" + a17);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardAdDetailItemView", "onPause, exp=" + th6.toString());
        }
        if (a17) {
            this.T.g();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPause", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem");
            return;
        }
        if (this.f310271x1 && this.f310368h != null) {
            if (this.Y && (c18390xafce807 = this.X) != null) {
                c18390xafce807.F();
            }
            i64.b1 b1Var = this.F;
            if (b1Var != null && (c17933xe8d1b226 = this.f310365e) != null) {
                b1Var.q(c17933xe8d1b226.f68891x29d1292e);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPause", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem");
    }

    @Override // dc4.v
    public void h() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onScrollIdle", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2150x7a6db1a9.p2151xf8ffc37b.C17814xa1ba4463 c17814xa1ba4463 = this.f310274y1;
        if (c17814xa1ba4463 != null) {
            c17814xa1ba4463.F3();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onScrollIdle", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(31:18|(3:20|(1:22)(1:132)|23)(2:133|(31:138|(7:140|(1:144)|145|(1:147)(3:155|(1:157)|158)|148|(1:152)|153)(8:159|(1:161)|162|(2:164|(1:166)(2:189|(1:191)(2:192|(1:194)(2:195|(1:197)))))(2:198|(1:200)(2:201|(1:203)(2:204|(1:206)(1:207))))|167|(5:169|(1:171)(1:177)|172|(1:174)(1:176)|175)|178|(5:180|(1:182)(1:187)|183|(1:185)|186)(1:188))|154|25|(1:29)|30|(1:32)(2:125|(1:131))|33|34|35|(21:40|(1:122)(1:46)|47|(4:49|(1:53)|54|(1:56))(2:119|(1:121))|57|58|59|(1:116)(1:65)|66|(14:68|(1:72)|73|(4:77|(1:79)|80|(1:82))|111|112|84|(1:86)|87|88|89|(2:106|(1:108))(4:93|(1:95)|96|(1:98))|99|(1:105))(2:113|(1:115))|83|84|(0)|87|88|89|(1:91)|106|(0)|99|(3:101|103|105))|123|(0)(0)|57|58|59|(1:61)|116|66|(0)(0)|83|84|(0)|87|88|89|(0)|106|(0)|99|(0))(1:137))|24|25|(2:27|29)|30|(0)(0)|33|34|35|(24:37|40|(1:42)|122|47|(0)(0)|57|58|59|(0)|116|66|(0)(0)|83|84|(0)|87|88|89|(0)|106|(0)|99|(0))|123|(0)(0)|57|58|59|(0)|116|66|(0)(0)|83|84|(0)|87|88|89|(0)|106|(0)|99|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0812, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0813, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardAdDetailItemView", "refreshCommonShakeView, exp=" + r0);
        ca4.q.c("refreshCommonShakeView, cardAdDetail", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x07a9, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x07aa, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardAdDetailItemView", r0.toString());
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0830  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x080b A[Catch: Exception -> 0x0812, TRY_LEAVE, TryCatch #3 {Exception -> 0x0812, blocks: (B:89:0x07e4, B:91:0x07e8, B:93:0x07f0, B:95:0x07f4, B:96:0x07f7, B:98:0x07fb, B:106:0x0807, B:108:0x080b), top: B:88:0x07e4 }] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x079f A[Catch: all -> 0x07a9, TRY_ENTER, TryCatch #2 {all -> 0x07a9, blocks: (B:59:0x070d, B:61:0x0715, B:63:0x071b, B:66:0x0728, B:68:0x072d, B:70:0x0737, B:72:0x0744, B:73:0x0752, B:77:0x0759, B:79:0x075d, B:80:0x0764, B:82:0x078d, B:111:0x0795, B:113:0x079f, B:115:0x07a3), top: B:58:0x070d }] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x06fa A[Catch: all -> 0x0703, TryCatch #0 {all -> 0x0703, blocks: (B:35:0x0674, B:37:0x067c, B:40:0x0683, B:42:0x068b, B:44:0x0695, B:47:0x06a0, B:49:0x06aa, B:51:0x06b4, B:53:0x06c1, B:54:0x06c9, B:56:0x06cd, B:119:0x06fa, B:121:0x06fe, B:123:0x06a4), top: B:34:0x0674 }] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0630  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x062a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x06aa A[Catch: all -> 0x0703, TryCatch #0 {all -> 0x0703, blocks: (B:35:0x0674, B:37:0x067c, B:40:0x0683, B:42:0x068b, B:44:0x0695, B:47:0x06a0, B:49:0x06aa, B:51:0x06b4, B:53:0x06c1, B:54:0x06c9, B:56:0x06cd, B:119:0x06fa, B:121:0x06fe, B:123:0x06a4), top: B:34:0x0674 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0715 A[Catch: all -> 0x07a9, TryCatch #2 {all -> 0x07a9, blocks: (B:59:0x070d, B:61:0x0715, B:63:0x071b, B:66:0x0728, B:68:0x072d, B:70:0x0737, B:72:0x0744, B:73:0x0752, B:77:0x0759, B:79:0x075d, B:80:0x0764, B:82:0x078d, B:111:0x0795, B:113:0x079f, B:115:0x07a3), top: B:58:0x070d }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x072d A[Catch: all -> 0x07a9, TryCatch #2 {all -> 0x07a9, blocks: (B:59:0x070d, B:61:0x0715, B:63:0x071b, B:66:0x0728, B:68:0x072d, B:70:0x0737, B:72:0x0744, B:73:0x0752, B:77:0x0759, B:79:0x075d, B:80:0x0764, B:82:0x078d, B:111:0x0795, B:113:0x079f, B:115:0x07a3), top: B:58:0x070d }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x07b8  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x07e8 A[Catch: Exception -> 0x0812, TryCatch #3 {Exception -> 0x0812, blocks: (B:89:0x07e4, B:91:0x07e8, B:93:0x07f0, B:95:0x07f4, B:96:0x07f7, B:98:0x07fb, B:106:0x0807, B:108:0x080b), top: B:88:0x07e4 }] */
    @Override // dc4.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void j() {
        /*
            Method dump skipped, instructions count: 2113
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dc4.d0.j():void");
    }

    public final void l(s34.r0 r0Var, java.lang.String str, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkShowLivingAnim", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem");
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.C17805xb6909733.e(r0Var, z17)) {
            if (this.Q == null) {
                this.Q = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.C17805xb6909733) this.P.inflate();
            }
            if (this.Q != null) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new dc4.b0(this, r0Var, str), 150L);
            }
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.C17805xb6909733 c17805xb6909733 = this.Q;
            if (c17805xb6909733 != null) {
                c17805xb6909733.setVisibility(8);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkShowLivingAnim", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem");
    }

    public final void m(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.C17806x48d2cd43 c17806x48d2cd43;
        android.view.ViewStub viewStub;
        android.view.ViewStub viewStub2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fillLivingStatus", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem");
        try {
            if (o(c17933xe8d1b226)) {
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 m70371x485d7 = c17933xe8d1b226.m70371x485d7();
                if (this.K == null && (viewStub2 = (android.view.ViewStub) this.f310366f.findViewById(com.p314xaae8f345.mm.R.id.f564189ke)) != null) {
                    this.K = (android.view.ViewGroup) a84.y0.h(viewStub2);
                }
                if (this.f310257J == null && (viewStub = (android.view.ViewStub) this.f310366f.findViewById(com.p314xaae8f345.mm.R.id.f564186kb)) != null) {
                    this.f310257J = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.C17806x48d2cd43) a84.y0.h(viewStub);
                }
                android.view.ViewGroup viewGroup = this.K;
                if (viewGroup != null && (c17806x48d2cd43 = this.f310257J) != null) {
                    if (this.L == null) {
                        this.L = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.j0(viewGroup, c17806x48d2cd43, this.H);
                    }
                    if (m70371x485d7 != null && this.L != null) {
                        s34.r0 r0Var = c17933xe8d1b226.m70354x74235b3e().f38190xd2e4d0fd;
                        int c17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.i0.c(m70371x485d7.Id, r0Var.f484278a);
                        this.L.g(m70371x485d7.Id, r0Var);
                        this.L.h(c17);
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.i0.a(m70371x485d7.Id, this.L);
                        if (!com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.v.a(c17933xe8d1b226)) {
                            e74.i.f().d(1, c17933xe8d1b226);
                        }
                        l(r0Var, m70371x485d7.Id, com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.j0.f(c17));
                    }
                    if (ca4.m0.Z(this.f310259p)) {
                        this.f310257J.setVisibility(8);
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardAdDetailItemView", "the livingStatusLayout or livingDescBar is null!!");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillLivingStatus", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem");
                return;
            }
            android.view.ViewGroup viewGroup2 = this.K;
            if (viewGroup2 != null) {
                viewGroup2.setVisibility(8);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.C17806x48d2cd43 c17806x48d2cd432 = this.f310257J;
            if (c17806x48d2cd432 != null) {
                c17806x48d2cd432.setVisibility(8);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.C17805xb6909733 c17805xb6909733 = this.Q;
            if (c17805xb6909733 != null) {
                c17805xb6909733.setVisibility(8);
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardAdDetailItemView", "fillLivingViewInfo, exp=" + android.util.Log.getStackTraceString(th6));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillLivingStatus", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem");
    }

    public final void n() {
        android.widget.FrameLayout frameLayout;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initCommonShakeLogic", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem");
        android.view.View view = this.B;
        if (view instanceof android.widget.FrameLayout) {
            frameLayout = (android.widget.FrameLayout) view;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardAdDetailItemView", "initCommonShakeLogic, mediaContainer err");
            frameLayout = null;
        }
        android.widget.FrameLayout frameLayout2 = frameLayout;
        android.view.View findViewById = this.f310366f.findViewById(com.p314xaae8f345.mm.R.id.f564158jn);
        android.content.Context context = this.f310259p;
        if (context == null || frameLayout2 == null || findViewById == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardAdDetailItemView", "initCommonShakeLogic, params err");
        } else {
            this.f310274y1 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2150x7a6db1a9.p2151xf8ffc37b.C17814xa1ba4463(context, frameLayout2, findViewById, 1, new dc4.c0(this));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initCommonShakeLogic", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem");
    }

    public final boolean o(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("shouldShowLivingView", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem");
        if (c17933xe8d1b226 == null || c17933xe8d1b226.m70354x74235b3e() == null || c17933xe8d1b226.m70354x74235b3e().f38190xd2e4d0fd == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("shouldShowLivingView", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem");
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("shouldShowLivingView", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem");
        return true;
    }

    public final void p() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showPlayBtn", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardAdDetailItemView", "showPlayBtn");
        android.view.View view = this.f310258l1;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/detail/item/CardAdDetailItem", "showPlayBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/detail/item/CardAdDetailItem", "showPlayBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showPlayBtn", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem");
    }

    public final void q(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226) {
        int b17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateHeaderCardBtnState", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem");
        if (c17933xe8d1b226 == null || !c17933xe8d1b226.m70382xd6a8f11d()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateHeaderCardBtnState", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem");
            return;
        }
        int color = this.f310259p.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560257ff);
        int color2 = this.f310259p.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77636xad7ef29);
        android.widget.Button button = this.f310265t;
        if (button == null || this.f310266u == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateHeaderCardBtnState", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem");
            return;
        }
        button.setOnClickListener(this.f310371n.R);
        this.f310266u.setOnClickListener(this.f310371n.S);
        boolean z17 = true;
        if (c17933xe8d1b226.m70354x74235b3e().m70130x48976372() && (b17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.w2.b(c17933xe8d1b226.m70354x74235b3e().f38219x1bac43fb.f247656a, c17933xe8d1b226.m70375x338a8cc7())) > 0 && b17 <= 2) {
            if (b17 == 1) {
                this.f310266u.setTextColor(color2);
                this.f310266u.setText(c17933xe8d1b226.m70354x74235b3e().f38219x1bac43fb.a(1));
                this.f310265t.setTextColor(color);
                this.f310265t.setText(c17933xe8d1b226.m70354x74235b3e().f38219x1bac43fb.b(0));
            } else if (b17 == 2) {
                this.f310265t.setTextColor(color2);
                this.f310265t.setText(c17933xe8d1b226.m70354x74235b3e().f38219x1bac43fb.a(0));
                this.f310266u.setTextColor(color);
                this.f310266u.setText(c17933xe8d1b226.m70354x74235b3e().f38219x1bac43fb.b(1));
            }
            z17 = false;
        }
        if (z17) {
            this.f310265t.setTextColor(color);
            this.f310266u.setTextColor(color);
            this.f310265t.setText(c17933xe8d1b226.m70354x74235b3e().m70120x7059dc8f());
            this.f310266u.setText(c17933xe8d1b226.m70354x74235b3e().m70121xc830c35e());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateHeaderCardBtnState", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem");
    }
}
