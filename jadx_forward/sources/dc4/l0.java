package dc4;

/* loaded from: classes4.dex */
public class l0 extends dc4.v implements i64.k0 {
    public k84.d4 A;
    public int B;

    /* renamed from: p, reason: collision with root package name */
    public final android.app.Activity f310302p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.n f310303q;

    /* renamed from: r, reason: collision with root package name */
    public final i64.b1 f310304r;

    /* renamed from: t, reason: collision with root package name */
    public u74.d f310306t;

    /* renamed from: v, reason: collision with root package name */
    public final fd4.l f310308v;

    /* renamed from: w, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.l f310309w;

    /* renamed from: x, reason: collision with root package name */
    public p44.z f310310x;

    /* renamed from: y, reason: collision with root package name */
    public final android.widget.RelativeLayout f310311y;

    /* renamed from: z, reason: collision with root package name */
    public final android.widget.FrameLayout f310312z;

    /* renamed from: s, reason: collision with root package name */
    public boolean f310305s = false;

    /* renamed from: u, reason: collision with root package name */
    public final u74.f f310307u = new u74.f();
    public final android.view.View.OnClickListener C = new dc4.i0(this);
    public boolean D = false;
    public boolean E = false;
    public final u74.e F = new dc4.k0(this);

    public l0(android.app.Activity activity, int i17, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 c19807x593d1720, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i iVar, i64.b1 b1Var, android.widget.RelativeLayout relativeLayout, android.widget.FrameLayout frameLayout) {
        fd4.l fVar;
        this.f310302p = activity;
        this.f310364d = c19807x593d1720;
        this.f310365e = c17933xe8d1b226;
        this.f310371n = iVar;
        this.f310304r = b1Var;
        this.f310311y = relativeLayout;
        this.f310312z = frameLayout;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("newFullCardBusinessByType", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.FullCardAdBusinessHelper");
        if (i17 == 35) {
            fVar = new fd4.f();
        } else if (i17 == 39) {
            fVar = new gd4.y(1);
        } else if (i17 == 41) {
            fVar = new fd4.m();
        } else if (i17 != 47) {
            switch (i17) {
                case 28:
                    fVar = new fd4.t();
                    break;
                case 29:
                    fVar = new fd4.k();
                    break;
                case 30:
                    fVar = new fd4.o();
                    break;
                case 31:
                    fVar = new fd4.r();
                    break;
                case 32:
                    fVar = new gd4.y(0);
                    break;
                default:
                    fVar = null;
                    break;
            }
        } else {
            fVar = new gd4.y(2);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("newFullCardBusinessByType", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.FullCardAdBusinessHelper");
        this.f310308v = fVar;
    }

    public static /* synthetic */ u74.d l(dc4.l0 l0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$100", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew");
        u74.d dVar = l0Var.f310306t;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$100", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew");
        return dVar;
    }

    @Override // dc4.v
    public void c(android.view.View view, android.view.View view2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initView", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FullCardAdDetailItemNew", "initView");
        this.f310366f = view;
        this.f310367g = view2;
        u74.d g17 = u74.f.g(view);
        this.f310306t = g17;
        boolean z17 = this.f310372o;
        u74.c cVar = g17.T;
        cVar.f506670g = z17;
        cVar.f506664a = ((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18022x27bfedac) this.f310302p).G7();
        u74.d dVar = this.f310306t;
        u74.c cVar2 = dVar.T;
        fd4.l lVar = this.f310308v;
        cVar2.f506668e = lVar;
        cVar2.f506669f = new dc4.e0(this);
        dVar.f506698z = view.findViewById(com.p314xaae8f345.mm.R.id.ggo);
        u74.d dVar2 = this.f310306t;
        dVar2.f506696x = this.f310369i;
        dVar2.f506697y = this.f310370m;
        this.f310368h = dVar2.f506687o;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = this.f310365e;
        if (c17933xe8d1b226 != null) {
            dVar2.T.f506671h = c17933xe8d1b226.m70413xd8243ab2();
        }
        if (lVar != null) {
            lVar.i(this.f310302p, this.f310304r, this.f310371n, this.f310306t, this.f310307u);
        }
        u74.e eVar = this.F;
        u74.f fVar = this.f310307u;
        fVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setWraperInterface", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper");
        fVar.f506708j = eVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setWraperInterface", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper");
        fVar.f(this.f310306t);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initView", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew");
    }

    @Override // i64.k0
    public void d(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAdRemoved", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew");
        fd4.l lVar = this.f310308v;
        if (lVar != null) {
            lVar.j();
        }
        p84.e eVar = this.f310307u.f506706h;
        if (eVar != null) {
            eVar.a();
        }
        p44.z zVar = this.f310310x;
        if (zVar != null) {
            zVar.f();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAdRemoved", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew");
    }

    @Override // dc4.v
    public void g() {
        u74.d dVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.g9 g9Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPause", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FullCardAdDetailItemNew", "onPause, hasPlayedVideo=" + this.D);
        this.E = true;
        try {
            if (this.D && (g9Var = (dVar = this.f310306t).f506687o) != null && g9Var.f249950g != null) {
                u74.f fVar = this.f310307u;
                boolean z17 = dVar.T.f506666c;
                fVar.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("pausePlay", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper");
                fVar.h(z17, false);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("pausePlay", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper");
                k84.d4 d4Var = this.A;
                if (d4Var != null && d4Var.n(this.f310365e)) {
                    k84.d4 d4Var2 = this.A;
                    d4Var2.getClass();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPause", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(d4Var2.j(), "onPause");
                    ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) d4Var2.O).k(java.lang.Boolean.FALSE);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPause", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onVideoPause", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew");
                fd4.l lVar = this.f310308v;
                if (lVar != null) {
                    lVar.mo129355x65d3157a();
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onVideoPause", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew");
                i64.b1 b1Var = this.f310304r;
                if (b1Var != null && (c17933xe8d1b226 = this.f310365e) != null) {
                    b1Var.q(c17933xe8d1b226.f68891x29d1292e);
                }
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FullCardAdDetailItemNew", "onPause, exp=" + e17.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPause", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew");
    }

    @Override // dc4.v
    public void i() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onUIDestroy", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew");
        super.i();
        fd4.l lVar = this.f310308v;
        if (lVar != null) {
            lVar.d();
        }
        p84.e eVar = this.f310307u.f506706h;
        if (eVar != null) {
            eVar.a();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onUIDestroy", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [int] */
    /* JADX WARN: Type inference failed for: r2v23, types: [com.tencent.mm.plugin.sns.ui.g9] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v0, types: [android.content.Context, android.app.Activity] */
    @Override // dc4.v
    public void j() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 c17903x3b438f4;
        int i17;
        java.lang.String str;
        u74.f fVar;
        android.content.Context context;
        i64.b1 b1Var;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        android.content.Context context2;
        java.lang.String str5;
        java.lang.String str6;
        dc4.l0 l0Var;
        i64.b1 b1Var2;
        u74.f fVar2;
        java.lang.String str7;
        java.lang.String str8;
        boolean z17;
        ?? r37;
        u74.f fVar3;
        java.lang.String str9;
        java.lang.String str10;
        ?? r102;
        android.view.ViewGroup.LayoutParams layoutParams;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226;
        android.view.View view;
        android.view.View view2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("refreshView", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FullCardAdDetailItemNew", "refreshView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 a17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.l1.a(this.f310365e.m70367x7525eefd());
        this.f310365e = a17;
        this.f310303q = null;
        if (a17 == null || a17.m70354x74235b3e() == null) {
            c17903x3b438f4 = null;
        } else {
            c17903x3b438f4 = this.f310365e.m70354x74235b3e();
            this.f310303q = c17903x3b438f4.f38182x86831750;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSource", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew");
        i64.b1 b1Var3 = this.f310304r;
        if (b1Var3 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSource", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew");
            i17 = b1Var3.f370628j;
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSource", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew");
            i17 = 1;
        }
        boolean z18 = this.f310372o;
        ?? r86 = this.f310302p;
        this.B = ca4.m0.y("MicroMsg.FullCardAdDetailItemNew", r86, i17, z18);
        this.f310306t.T.f506666c = u74.f.m(c17903x3b438f4);
        u74.d dVar = this.f310306t;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.n nVar = this.f310303q;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b2262 = this.f310365e;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 c19807x593d1720 = this.f310364d;
        u74.f fVar4 = this.f310307u;
        fVar4.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initData", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper");
        fVar4.f506699a = dVar;
        fVar4.f506700b = nVar;
        fVar4.f506701c = c17933xe8d1b2262;
        fVar4.f506702d = r86;
        fVar4.f506703e = b1Var3;
        fVar4.f506704f = c19807x593d1720;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initData", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper");
        k84.f4.b(this.f310306t, this.f310365e, this.f310371n, null);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("bindAdContinuousLikeComponent", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew");
        if (this.f310309w == null) {
            p012xc85e97e9.p093xedfae76a.y yVar = r86 instanceof p012xc85e97e9.p093xedfae76a.y ? (p012xc85e97e9.p093xedfae76a.y) r86 : null;
            android.view.View view3 = this.f310369i;
            u74.d dVar2 = this.f310306t;
            b1Var = b1Var3;
            str2 = "MicroMsg.FullCardAdDetailItemNew";
            str3 = "refreshView";
            str4 = "bindAdContinuousLikeComponent";
            fVar = fVar4;
            context = r86;
            str = "initData";
            this.f310309w = new dc4.g0(this, "AdContinuousLikeComponentDetail", yVar, view3, dVar2.H, dVar2.O, dVar2.T.f506664a, this.f310304r, this.f310371n);
        } else {
            str = "initData";
            fVar = fVar4;
            context = r86;
            b1Var = b1Var3;
            str2 = "MicroMsg.FullCardAdDetailItemNew";
            str3 = "refreshView";
            str4 = "bindAdContinuousLikeComponent";
        }
        this.f310309w.f(this.f310365e);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str4, "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("bindAdFireworkCheerComponent", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew");
        if (this.A == null) {
            p012xc85e97e9.p093xedfae76a.y yVar2 = context instanceof p012xc85e97e9.p093xedfae76a.y ? (p012xc85e97e9.p093xedfae76a.y) context : null;
            android.view.View view4 = this.f310369i;
            android.widget.RelativeLayout relativeLayout = this.f310311y;
            android.widget.FrameLayout frameLayout = this.f310312z;
            u74.d dVar3 = this.f310306t;
            b1Var2 = b1Var;
            context2 = context;
            fVar2 = fVar;
            str8 = str2;
            str5 = "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew";
            str6 = "bindAdFireworkCheerComponent";
            str7 = str3;
            dc4.f0 f0Var = new dc4.f0(this, "AdFireworkCheerComponent", yVar2, view4, relativeLayout, frameLayout, dVar3.H, dVar3.O, dVar3.M, this.B, dVar3.T.f506664a, this.f310304r, this.f310371n, null, null);
            l0Var = this;
            l0Var.A = f0Var;
        } else {
            context2 = context;
            str5 = "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew";
            str6 = "bindAdFireworkCheerComponent";
            l0Var = this;
            b1Var2 = b1Var;
            fVar2 = fVar;
            str7 = str3;
            str8 = str2;
        }
        k84.d4 d4Var = l0Var.A;
        u74.d dVar4 = l0Var.f310306t;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2136xd0c93d50.C17781x303781f c17781x303781f = dVar4.H;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2136xd0c93d50.C17779xdb9e82f9 c17779xdb9e82f9 = dVar4.M;
        d4Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("attachView", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        if (c17781x303781f != null) {
            d4Var.f386533q = c17781x303781f;
        }
        if (c17779xdb9e82f9 != null) {
            d4Var.f386534r = c17779xdb9e82f9;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("attachView", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        l0Var.A.f(l0Var.f310365e);
        java.lang.String str11 = str5;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str6, str11);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b2263 = l0Var.f310365e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isRandomPickCardAd", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isRandomPickCardAd", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic$Companion");
        if (c17933xe8d1b2263 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isRandomPickCardAd", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic$Companion");
            z17 = false;
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 m70354x74235b3e = c17933xe8d1b2263.m70354x74235b3e();
            z17 = (m70354x74235b3e != null ? m70354x74235b3e.f38268x3996fd45 : null) != null;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isRandomPickCardAd", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic$Companion");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isRandomPickCardAd", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic");
        if (z17 && l0Var.f310310x == null && context2 != null && (view = l0Var.f310306t.f506698z) != null && (view2 = l0Var.f310369i) != null) {
            l0Var.f310310x = new p44.z(context2, 1, l0Var.B, view, view2, l0Var.f310304r);
        }
        p44.z zVar = l0Var.f310310x;
        if (zVar != null) {
            zVar.e(l0Var.f310365e);
            p44.z zVar2 = l0Var.f310310x;
            zVar2.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onScrollIdle", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RandomPickCardLogic", "onScrollIdle");
            zVar2.f433406l.m();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onScrollIdle", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic");
            l0Var.f310310x.g();
        }
        android.view.View view5 = l0Var.f310306t.f506698z;
        if (view5 instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.ad.C18429x1cf5f998) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.ad.C18429x1cf5f998 c18429x1cf5f998 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.ad.C18429x1cf5f998) view5;
            r37 = 1;
            c18429x1cf5f998.m71294x1dcf827d(true);
            c18429x1cf5f998.c(l0Var.f310365e, 2);
        } else {
            r37 = 1;
        }
        l0Var.D = false;
        l0Var.E = false;
        if (l0Var.f310303q != null) {
            fVar3 = fVar2;
            layoutParams = fVar3.c(l0Var.B);
            str9 = str8;
        } else {
            fVar3 = fVar2;
            str9 = str8;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str9, "invalid full card");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b2264 = l0Var.f310365e;
            java.lang.String t07 = c17933xe8d1b2264 == null ? "" : ca4.z0.t0(c17933xe8d1b2264.f68891x29d1292e);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b2265 = l0Var.f310365e;
            if (c17933xe8d1b2265 != null) {
                boolean m70396x35f5a38c = c17933xe8d1b2265.m70396x35f5a38c();
                str10 = l0Var.f310365e.m70375x338a8cc7();
                r102 = m70396x35f5a38c;
            } else {
                str10 = "";
                r102 = 0;
            }
            ca4.e0.a("fullcard_info_null", t07, 0, r102, str10);
            layoutParams = null;
        }
        l0Var.f310306t.f506687o.a(l0Var.f310364d, 0, l0Var.f310365e.m70363x51f8f990(), r37);
        l0Var.f310306t.f506687o.f249954k.setVisibility(8);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i1 hj6 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.hj();
        r45.a90 a90Var = l0Var.f310364d.f39014x86965dde;
        r45.jj4 jj4Var = (a90Var == null || a90Var.f451373h.size() < r37) ? null : (r45.jj4) l0Var.f310364d.f39014x86965dde.f451373h.get(0);
        if (jj4Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.C18402xe28da210 c18402xe28da210 = l0Var.f310306t.f506688p;
            if (c18402xe28da210 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.qa qaVar = l0Var.f310303q.f38339xebc26caf;
                java.lang.String str12 = str;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(str12, "com.tencent.mm.plugin.sns.ui.widget.SnsAdCardVideoEndView");
                if (qaVar == null) {
                    c18402xe28da210.c(false);
                }
                c18402xe28da210.f252317d = qaVar;
                c18402xe28da210.f252328r = 2;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str12, "com.tencent.mm.plugin.sns.ui.widget.SnsAdCardVideoEndView");
                if (l0Var.f310306t.f506688p.a(l0Var.f310365e)) {
                    l0Var.f310305s = false;
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onRefresh", str11);
            fd4.l lVar = l0Var.f310308v;
            if (lVar != null) {
                i64.b1 b1Var4 = b1Var2;
                if (b1Var4 != null && (c17933xe8d1b226 = l0Var.f310365e) != null) {
                    java.lang.String t08 = ca4.z0.t0(c17933xe8d1b226.f68891x29d1292e);
                    if (!android.text.TextUtils.isEmpty(t08)) {
                        b1Var4.a(t08, l0Var);
                    }
                }
                lVar.a(0, l0Var.f310365e, l0Var.f310303q, layoutParams);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onRefresh", str11);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("refreshView, hash=");
            sb6.append(hashCode());
            sb6.append(", snsId=");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b2266 = l0Var.f310365e;
            sb6.append(c17933xe8d1b2266 != null ? java.lang.Long.valueOf(c17933xe8d1b2266.f68891x29d1292e) : "");
            sb6.append(", useOnlineVideo=");
            sb6.append(l0Var.f310306t.T.f506666c);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str9, sb6.toString());
            fVar3.e(jj4Var, hj6, 0, l0Var.f310306t.T.f506666c);
            int i18 = l0Var.f310364d.f39014x86965dde.f451370e;
            android.view.View.OnClickListener onClickListener = l0Var.C;
            if (i18 == r37) {
                l0Var.f310306t.f506684l.setTag(l0Var);
                l0Var.f310306t.f506684l.setOnClickListener(onClickListener);
            } else if (i18 == 15 || i18 == 5) {
                l0Var.f310306t.f506687o.f249947d.setTag(l0Var);
                l0Var.f310306t.f506694v.setTag(l0Var);
                l0Var.f310306t.f506687o.f249947d.setOnClickListener(onClickListener);
                l0Var.f310306t.f506694v.setOnClickListener(onClickListener);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b2267 = l0Var.f310365e;
                if (c17933xe8d1b2267 == null || !c17933xe8d1b2267.m70378x4c74e984()) {
                    fVar3.l(l0Var.f310306t.T.f506666c);
                } else {
                    n();
                }
                if (lVar != null) {
                    lVar.c();
                }
                k84.d4 d4Var2 = l0Var.A;
                if (d4Var2 != null && d4Var2.n(l0Var.f310365e)) {
                    k84.d4 d4Var3 = l0Var.A;
                    d4Var3.getClass();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPlay", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(d4Var3.j(), "onPlay");
                    ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) d4Var3.O).k(java.lang.Boolean.TRUE);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPlay", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
                }
                l0Var.D = r37;
            }
        } else {
            hj6.h(l0Var.f310306t.f506687o.f249950g, -1, context2.hashCode(), 0);
            l0Var.f310306t.f506687o.f249955l.setVisibility(8);
            l0Var.f310306t.f506687o.f249950g.m70617x360a109e(null);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2221x6b0147b.C18390xafce807 c18390xafce807 = l0Var.f310306t.f506695w;
            if (c18390xafce807 != null) {
                c18390xafce807.m70655x360a109e(null);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b2268 = l0Var.f310365e;
        if (c17933xe8d1b2268 != null && c17933xe8d1b2268.m70378x4c74e984()) {
            n();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str7, str11);
    }

    @Override // dc4.v
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 k(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2136xd0c93d50.C17781x303781f c17781x303781f;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b2262;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resetSnsInfoLikeFlag", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew");
        u74.d dVar = this.f310306t;
        if (dVar == null || (c17781x303781f = dVar.H) == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resetSnsInfoLikeFlag", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew");
            return c17933xe8d1b226;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resetSnsInfoLikeFlag", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
        if (c17933xe8d1b226 != null && (c17933xe8d1b2262 = c17781x303781f.f244990u) != null) {
            c17933xe8d1b226.m70448xb8471e25(c17933xe8d1b2262.m70360xbd8ebd19());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resetSnsInfoLikeFlag", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resetSnsInfoLikeFlag", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew");
        return c17933xe8d1b226;
    }

    public u74.d m() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getWrapViewHolder", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew");
        u74.d dVar = this.f310306t;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getWrapViewHolder", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew");
        return dVar;
    }

    public final void n() {
        android.app.Activity activity = this.f310302p;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showPlayBtn", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FullCardAdDetailItemNew", "showPlayBtn");
        try {
            this.f310306t.f506687o.f249952i.setVisibility(0);
            this.f310306t.f506687o.f249953j.setVisibility(8);
            this.f310306t.f506687o.f249952i.setImageDrawable(i65.a.i(activity, com.p314xaae8f345.mm.R.raw.f81043x73ab7191));
            this.f310306t.f506687o.f249952i.setContentDescription(activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hjf));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FullCardAdDetailItemNew", "showPlayBtn, exp=" + e17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showPlayBtn", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew");
    }
}
