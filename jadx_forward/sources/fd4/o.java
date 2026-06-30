package fd4;

/* loaded from: classes4.dex */
public class o extends fd4.c {

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.C18407xdfdc90f6 f342852q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.ViewGroup f342853r;

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.td f342854s;

    /* renamed from: t, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.b1 f342855t = new fd4.n(this);

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003d, code lost:
    
        if (r11.f247692b <= r5) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0092  */
    @Override // fd4.c, fd4.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(int r9, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 r10, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.n r11, android.view.ViewGroup.LayoutParams r12) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fd4.o.a(int, com.tencent.mm.plugin.sns.storage.SnsInfo, com.tencent.mm.plugin.sns.storage.n, android.view.ViewGroup$LayoutParams):void");
    }

    @Override // fd4.l
    public void g(long j17, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onVideoPlaying", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.LongPressAdBusiness");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.td tdVar = this.f342854s;
        tdVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkLongPressGesture", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl");
        if (tdVar.f252047h) {
            ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.od(tdVar, j17));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkLongPressGesture", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkLongPressGesture", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onVideoPlaying", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.LongPressAdBusiness");
    }

    @Override // fd4.c, fd4.l
    public void i(android.app.Activity activity, i64.b1 b1Var, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i iVar, u74.d dVar, u74.f fVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCreate", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.LongPressAdBusiness");
        super.i(activity, b1Var, iVar, dVar, fVar);
        if (this.f342852q == null) {
            this.f342852q = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.C18407xdfdc90f6) ((android.view.ViewStub) dVar.f506698z.findViewById(com.p314xaae8f345.mm.R.id.n5s)).inflate();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LongPressAdBusiness", "buildContent many times");
        }
        if (this.f342853r == null) {
            android.view.View inflate = ((android.view.ViewStub) dVar.f506698z.findViewById(com.p314xaae8f345.mm.R.id.f564190kf)).inflate();
            this.f342853r = (android.view.ViewGroup) inflate;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LongPressAdBusiness", "buildContent many times2");
        }
        this.f342852q.setVisibility(8);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.td tdVar = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.td(this.f342820d, this.f342852q, dVar.f506687o, this.f342827n == 0 ? 1 : 2, this.f342853r);
        this.f342854s = tdVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.b1 b1Var2 = this.f342855t;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setOnActionListener", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl");
        tdVar.f252053n = b1Var2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setOnActionListener", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCreate", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.LongPressAdBusiness");
    }

    @Override // fd4.c, fd4.l
    public void j() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAdRemoved", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.LongPressAdBusiness");
        super.j();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2147x5f7cac22.C17800x9656c5e8.b(2, 3, this.f342825i);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAdRemoved", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.LongPressAdBusiness");
    }

    @Override // fd4.c, fd4.l
    /* renamed from: onVideoPause */
    public void mo129355x65d3157a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onVideoPause", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.LongPressAdBusiness");
        super.mo129355x65d3157a();
        this.f342854s.d();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onVideoPause", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.LongPressAdBusiness");
    }
}
