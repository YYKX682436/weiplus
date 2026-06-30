package fd4;

/* loaded from: classes4.dex */
public class f extends fd4.c {

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2145xb118bc57.C17795xc0e4d885 f342832q;

    /* renamed from: r, reason: collision with root package name */
    public int f342833r;

    /* renamed from: s, reason: collision with root package name */
    public int f342834s;

    /* renamed from: t, reason: collision with root package name */
    public android.graphics.Point f342835t;

    /* renamed from: u, reason: collision with root package name */
    public s34.k f342836u;

    /* renamed from: v, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f342837v;

    /* renamed from: w, reason: collision with root package name */
    public android.graphics.Bitmap f342838w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f342839x = false;

    /* renamed from: y, reason: collision with root package name */
    public boolean f342840y = false;

    /* renamed from: z, reason: collision with root package name */
    public boolean f342841z = true;
    public long A = 0;
    public long B = 0;
    public final s84.a C = new s84.a();
    public long D = 0;
    public final s84.j E = new fd4.d(this);
    public final android.os.Handler F = new fd4.e(this, android.os.Looper.getMainLooper());

    public static /* synthetic */ s84.a s(fd4.f fVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
        s84.a aVar = fVar.C;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
        return aVar;
    }

    public static int t(fd4.f fVar) {
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$400", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
        fVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("calcDragTime", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
        if (fVar.D != 0) {
            i17 = (int) (java.lang.System.currentTimeMillis() - fVar.D);
            if (i17 > 0) {
                fVar.C.f486422a += i17;
            }
            fVar.D = 0L;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("DragAdBusiness", "calcDragTime, startTime==0");
            i17 = -1;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("calcDragTime", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$400", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
        return i17;
    }

    @Override // fd4.c, fd4.l
    public void a(int i17, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.n nVar, android.view.ViewGroup.LayoutParams layoutParams) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onRefresh", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
        super.a(i17, c17933xe8d1b226, nVar, layoutParams);
        if (ca4.m0.V(this.f342837v, c17933xe8d1b226)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DragAdBusiness", "onRefresh, same ad:" + ca4.z0.y0(c17933xe8d1b226) + ", hash=" + hashCode());
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DragAdBusiness", "onRefresh, snsInfo changed, last=" + ca4.z0.y0(this.f342837v) + ", cur=" + ca4.z0.y0(c17933xe8d1b226) + ", hash=" + hashCode());
            v();
            this.f342837v = c17933xe8d1b226;
        }
        s34.k kVar = nVar.f38337x4c39e945;
        this.f342836u = kVar;
        if (kVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("DragAdBusiness", "mAdDragInfo==null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onRefresh", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
        } else {
            w();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onRefresh", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
        }
    }

    @Override // fd4.c, fd4.l
    public void e() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCardClickAnimEnd", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
        super.e();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2145xb118bc57.C17795xc0e4d885 c17795xc0e4d885 = this.f342832q;
        if (c17795xc0e4d885 != null) {
            c17795xc0e4d885.m69582x5f152dab(false);
            this.f342832q.b(false);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCardClickAnimEnd", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
    }

    @Override // fd4.l
    public void g(long j17, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onVideoPlaying", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
        android.os.Message obtain = android.os.Message.obtain();
        obtain.what = 1;
        obtain.arg1 = (int) j17;
        obtain.arg2 = i17;
        android.os.Handler handler = this.F;
        handler.removeMessages(1);
        handler.sendMessageDelayed(obtain, 50L);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onVideoPlaying", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
    }

    @Override // fd4.c, fd4.l
    public void i(android.app.Activity activity, i64.b1 b1Var, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i iVar, u74.d dVar, u74.f fVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCreate", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
        super.i(activity, b1Var, iVar, dVar, fVar);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2145xb118bc57.C17795xc0e4d885 c17795xc0e4d885 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2145xb118bc57.C17795xc0e4d885(activity);
        this.f342832q = c17795xc0e4d885;
        c17795xc0e4d885.m69583xc40e67e9(this.E);
        this.f342832q.m69582x5f152dab(false);
        this.f342832q.b(false);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCreate", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
    }

    @Override // fd4.c, fd4.l
    public void j() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAdRemoved", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
        super.j();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = this.f342825i;
        int i17 = this.f342822f.T.f506664a;
        s84.a aVar = this.C;
        a84.t0.a(new s84.b(c17933xe8d1b226, i17, aVar));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DragAdBusiness", "onAdRemoved, reportData:" + aVar);
        v();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAdRemoved", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
    }

    @Override // fd4.c
    public boolean n() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isNeedBreakFrameContainer", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isNeedBreakFrameContainer", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
        return true;
    }

    @Override // fd4.c
    public void o(android.widget.FrameLayout frameLayout) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onBreakFrameContainerInflated", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
        super.o(frameLayout);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onBreakFrameContainerInflated", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
    }

    @Override // fd4.c
    public void p(android.widget.FrameLayout frameLayout, int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onBreakFrameContainerSizeCalcFinish", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
        super.p(frameLayout, i17, i18);
        if (this.f342832q.getParent() == null) {
            frameLayout.addView(this.f342832q, m() ? new android.widget.FrameLayout.LayoutParams(-1, -1) : new android.widget.FrameLayout.LayoutParams(i17, i18));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onBreakFrameContainerSizeCalcFinish", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
    }

    @Override // fd4.c
    public void q(int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onContentPreDraw", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
        u(this.f342822f);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onContentPreDraw", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
    }

    public final void u(u74.d dVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("calcOffset", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
        this.f342833r = dVar.f506698z.getWidth();
        this.f342834s = dVar.f506698z.getHeight();
        int[] iArr = new int[2];
        dVar.f506696x.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        dVar.f506698z.getLocationOnScreen(iArr2);
        this.f342835t = new android.graphics.Point(iArr2[0], iArr2[1] - iArr[1]);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DragAdBusiness", "calcOffset, w=" + this.f342833r + ", h=" + this.f342834s + ", offset=" + this.f342835t + ", root[0]=" + iArr[0] + ", root[1]=" + iArr[1] + ", content[0]=" + iArr2[0] + ", content[1]=" + iArr2[1]);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("calcOffset", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
    }

    public final void v() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doClear", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
        this.F.removeCallbacksAndMessages(null);
        s84.a aVar = this.C;
        aVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reset", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragReportData$DragData");
        aVar.f486422a = 0;
        aVar.f486423b = 0;
        aVar.f486424c = 0;
        aVar.f486425d = 0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reset", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragReportData$DragData");
        this.f342832q.m69582x5f152dab(false);
        this.f342832q.b(false);
        this.f342832q.m69584xda184948(null);
        this.f342837v = null;
        this.f342836u = null;
        this.f342838w = null;
        this.f342839x = false;
        this.f342840y = false;
        this.f342841z = true;
        this.A = 0L;
        this.D = 0L;
        this.B = 0L;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doClear", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
    }

    public final void w() {
        android.graphics.Point point;
        s34.k kVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("tryInitData", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
        if (!this.f342839x) {
            if (this.f342833r == 0 || this.f342835t == null) {
                u(this.f342822f);
            }
            int i17 = this.f342833r;
            if (i17 <= 0 || this.f342834s <= 0 || (point = this.f342835t) == null || (kVar = this.f342836u) == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("DragAdBusiness", "tryInitData, mContentW=" + this.f342833r + ", mOffset=" + this.f342835t);
            } else {
                this.f342839x = true;
                android.graphics.Rect a17 = s34.k.a(kVar.f484215c, i17, point);
                android.graphics.Rect a18 = s34.k.a(this.f342836u.f484217e, this.f342833r, this.f342835t);
                android.graphics.Rect a19 = s34.k.a(this.f342836u.f484216d, this.f342833r, this.f342835t);
                android.graphics.Rect a27 = s34.k.a(this.f342836u.f484218f, this.f342833r, this.f342835t);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DragAdBusiness", "tryInitData succ");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2145xb118bc57.C17795xc0e4d885 c17795xc0e4d885 = this.f342832q;
                c17795xc0e4d885.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initData", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdDragViewContainer", "initData");
                android.graphics.Rect rect = c17795xc0e4d885.f245093e;
                rect.set(a17);
                c17795xc0e4d885.f245096h.set(a18);
                c17795xc0e4d885.f245094f.set(a19);
                c17795xc0e4d885.f245095g.set(a27);
                int i18 = rect.right - rect.left;
                int i19 = rect.bottom - rect.top;
                android.view.ViewGroup.LayoutParams layoutParams = c17795xc0e4d885.f245098m.getLayoutParams();
                layoutParams.width = i18;
                layoutParams.height = i19;
                c17795xc0e4d885.f245098m.setLayoutParams(layoutParams);
                c17795xc0e4d885.f245098m.setVisibility(8);
                c17795xc0e4d885.d();
                if (c17795xc0e4d885.f245106u) {
                    c17795xc0e4d885.invalidate();
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initData", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer");
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initDragBmp", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
        try {
            if (this.f342838w == null && java.lang.System.currentTimeMillis() - this.A >= 1000) {
                this.A = java.lang.System.currentTimeMillis();
                this.f342838w = this.f342836u.b();
            }
            if (this.f342838w != null && !this.f342840y) {
                this.f342840y = true;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DragAdBusiness", "onVideoPlaying, setDragViewImg");
                this.f342832q.m69584xda184948(this.f342838w);
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("DragAdBusiness", "checkSetDragBmp, exp=" + th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initDragBmp", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("tryInitData", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
    }
}
