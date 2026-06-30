package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\nB\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/plugin/sns/ui/monitor/SnsJankActivity;", "Lcom/tencent/mm/plugin/secdata/ui/WxPresenterSecDataActivity;", "Lf4/g;", "Landroid/widget/AbsListView$OnScrollListener;", "Landroid/view/View;", "root", "Ljz5/f0;", "bindJankView", "<init>", "()V", "sd4/c", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity */
/* loaded from: classes15.dex */
public abstract class AbstractActivityC18370x899ce1db extends com.p314xaae8f345.mm.p1006xc5476f33.p2050x75681b7b.ui.AbstractActivityC17355xa9316823 implements f4.g, android.widget.AbsListView.OnScrollListener {

    /* renamed from: s, reason: collision with root package name */
    public static final sd4.c f251462s = new sd4.c(null);

    /* renamed from: t, reason: collision with root package name */
    public static f4.s f251463t;

    /* renamed from: u, reason: collision with root package name */
    public static int f251464u;

    /* renamed from: m, reason: collision with root package name */
    public f4.i f251470m;

    /* renamed from: p, reason: collision with root package name */
    public long f251473p;

    /* renamed from: q, reason: collision with root package name */
    public long f251474q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f251475r;

    /* renamed from: e, reason: collision with root package name */
    public final int f251465e = hashCode();

    /* renamed from: f, reason: collision with root package name */
    public long f251466f = -1;

    /* renamed from: g, reason: collision with root package name */
    public long f251467g = -1;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6845xe5e3baf5 f251468h = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6845xe5e3baf5();

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f251469i = jz5.h.b(new sd4.d(this));

    /* renamed from: n, reason: collision with root package name */
    public final sd4.a f251471n = new sd4.a(0, 0, 0, 0, 0, 0, 0, 0, 255, null);

    /* renamed from: o, reason: collision with root package name */
    public final sd4.b f251472o = new sd4.b(0, null, 3, null);

    public final float T6() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getRefreshRate", "com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity");
        float floatValue = ((java.lang.Number) ((jz5.n) this.f251469i).mo141623x754a37bb()).floatValue();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getRefreshRate", "com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity");
        return floatValue;
    }

    /* renamed from: bindJankView */
    public final void m71149xba2d9956(android.view.View root) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("bindJankView", "com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsJankActivity", "bindJankView");
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_sns_improve_jank_global_report, false)) {
            android.view.ViewParent parent = root.getParent();
            while (parent instanceof android.view.View) {
                root = parent;
                parent = root.getParent();
            }
            java.lang.Object tag = root.getTag(com.p314xaae8f345.mm.R.id.jid);
            if (tag == null) {
                tag = new f4.s();
                root.setTag(com.p314xaae8f345.mm.R.id.jid, tag);
            }
            f251463t = (f4.s) tag;
            android.view.Window window = getWindow();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(window, "getWindow(...)");
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            this.f251470m = new f4.i(window, p3325xe03a0797.p3326xc267989b.h2.a(p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a), this, null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("bindJankView", "com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity");
    }

    @Override // com.p314xaae8f345.mm.p811x323c3e.AbstractActivityC10805x83c6e8d6, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCreate", "com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity");
        super.onCreate(bundle);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("create", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineCoroutines");
        id4.a.f372460a = p3325xe03a0797.p3326xc267989b.z0.b();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("create", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineCoroutines");
        this.f251466f = getIntent().getLongExtra("sns_jump_timestamp", -1L);
        int T6 = (int) T6();
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6845xe5e3baf5 c6845xe5e3baf5 = this.f251468h;
        c6845xe5e3baf5.f141674m = T6;
        c6845xe5e3baf5.f141676o = java.lang.System.currentTimeMillis();
        c6845xe5e3baf5.f141683v = 2;
        c6845xe5e3baf5.f141685x = c6845xe5e3baf5.b("UniqueKey", com.p314xaae8f345.mm.sdk.p2603x2137b148.y.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a, lp0.a.f401785f) + '|' + com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274642e, true);
        od4.b bVar = od4.b.f426181a;
        int T62 = (int) T6();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setRefreshRate", "com.tencent.mm.plugin.sns.ui.item.improve.report.SnsMethodReport");
        od4.b.f426184d = T62;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setRefreshRate", "com.tencent.mm.plugin.sns.ui.item.improve.report.SnsMethodReport");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("start", "com.tencent.mm.plugin.sns.report.SnsDropFrameReporter");
        if (!ta4.u.f498370b) {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.q1) ((ob0.x2) i95.n0.c(ob0.x2.class))).wi(ta4.u.f498369a);
            ta4.u.f498370b = true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("start", "com.tencent.mm.plugin.sns.report.SnsDropFrameReporter");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsJankActivity", "[" + hashCode() + "]onCreate clickJumpToPageTimeMs:" + this.f251466f);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCreate", "com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity");
    }

    @Override // com.p314xaae8f345.mm.p811x323c3e.AbstractActivityC10805x83c6e8d6, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDestroy", "com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("stop", "com.tencent.mm.plugin.sns.report.SnsDropFrameReporter");
        if (ta4.u.f498370b) {
            ob0.x2 x2Var = (ob0.x2) i95.n0.c(ob0.x2.class);
            ta4.u uVar = ta4.u.f498369a;
            com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.q1 q1Var = (com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.q1) x2Var;
            kj.m mVar = q1Var.f149166d;
            if (mVar == null || !mVar.f389749d) {
                java.lang.Object[] objArr = new java.lang.Object[1];
                kj.m mVar2 = q1Var.f149166d;
                objArr[0] = mVar2 == null ? "null" : java.lang.Boolean.valueOf(mVar2.f389749d);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FrameTraceService", "unregister failed, frameTrace=%s", objArr);
            } else {
                q1Var.f149166d.l(uVar, false);
            }
            ta4.u.f498370b = false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("stop", "com.tencent.mm.plugin.sns.report.SnsDropFrameReporter");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsJankActivity", "onDestroy PageEnterCount:" + f251464u + " jank info:\n系统刷新率:" + T6() + '\n' + this.f251471n);
        super.onDestroy();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("destroy", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineCoroutines");
        p3325xe03a0797.p3326xc267989b.y0 y0Var = id4.a.f372460a;
        if (y0Var != null) {
            p3325xe03a0797.p3326xc267989b.z0.c(y0Var, null);
        }
        id4.a.f372460a = null;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("destroy", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineCoroutines");
        this.f251470m = null;
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_sns_improve_jank_global_report, false)) {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6845xe5e3baf5 c6845xe5e3baf5 = this.f251468h;
            c6845xe5e3baf5.f141679r = c6845xe5e3baf5.b("SessionId", java.lang.String.valueOf(this.f251465e), true);
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6845xe5e3baf5 c6845xe5e3baf52 = this.f251468h;
            od4.b bVar = od4.b.f426181a;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCpuName", "com.tencent.mm.plugin.sns.ui.item.improve.report.SnsMethodReport");
            java.lang.String str = od4.b.f426183c;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCpuName", "com.tencent.mm.plugin.sns.ui.item.improve.report.SnsMethodReport");
            c6845xe5e3baf52.f141682u = c6845xe5e3baf52.b("CpuInfo", str, true);
            this.f251468h.f141677p = java.lang.System.currentTimeMillis();
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6845xe5e3baf5 c6845xe5e3baf53 = this.f251468h;
            sd4.a aVar = this.f251471n;
            aVar.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getPageScrollTimeMs", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
            long j17 = aVar.f488216c;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPageScrollTimeMs", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
            c6845xe5e3baf53.f141667f = (int) j17;
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6845xe5e3baf5 c6845xe5e3baf54 = this.f251468h;
            sd4.a aVar2 = this.f251471n;
            aVar2.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getJankFrameTimeMs", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
            long j18 = aVar2.f488219f;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getJankFrameTimeMs", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
            c6845xe5e3baf54.f141668g = (int) j18;
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6845xe5e3baf5 c6845xe5e3baf55 = this.f251468h;
            sd4.a aVar3 = this.f251471n;
            aVar3.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getPageScrollJankTimeMs", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
            long j19 = aVar3.f488217d;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPageScrollJankTimeMs", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
            c6845xe5e3baf55.f141669h = (int) j19;
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6845xe5e3baf5 c6845xe5e3baf56 = this.f251468h;
            sd4.a aVar4 = this.f251471n;
            aVar4.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTotalFrameCount", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
            int i17 = aVar4.f488215b;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTotalFrameCount", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
            c6845xe5e3baf56.f141670i = i17;
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6845xe5e3baf5 c6845xe5e3baf57 = this.f251468h;
            sd4.a aVar5 = this.f251471n;
            aVar5.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getJankFrame", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
            int i18 = aVar5.f488218e;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getJankFrame", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
            c6845xe5e3baf57.f141671j = i18;
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6845xe5e3baf5 c6845xe5e3baf58 = this.f251468h;
            sd4.a aVar6 = this.f251471n;
            aVar6.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getScrollFrameCount", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
            int i19 = aVar6.f488221h;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getScrollFrameCount", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
            c6845xe5e3baf58.f141672k = i19;
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6845xe5e3baf5 c6845xe5e3baf59 = this.f251468h;
            sd4.a aVar7 = this.f251471n;
            aVar7.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getScrollJankFrame", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
            int i27 = aVar7.f488220g;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getScrollJankFrame", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
            c6845xe5e3baf59.f141673l = i27;
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6845xe5e3baf5 c6845xe5e3baf510 = this.f251468h;
            sd4.a aVar8 = this.f251471n;
            aVar8.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getPageTotalTimeMs", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
            long j27 = aVar8.f488214a;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPageTotalTimeMs", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
            c6845xe5e3baf510.f141675n = (int) j27;
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6845xe5e3baf5 c6845xe5e3baf511 = this.f251468h;
            int i28 = f251464u;
            f251464u = i28 + 1;
            c6845xe5e3baf511.f141680s = i28;
            c6845xe5e3baf511.f141681t = ld4.a.f399638a.a() ? 1 : 2;
            this.f251468h.k();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDestroy", "com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity");
    }

    @Override // com.p314xaae8f345.mm.p811x323c3e.AbstractActivityC10805x83c6e8d6, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPause", "com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsJankActivity", "[" + hashCode() + "]onPause");
        super.onPause();
        f4.i iVar = this.f251470m;
        if (iVar != null) {
            iVar.a(false);
        }
        sd4.a aVar = this.f251471n;
        aVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getPageTotalTimeMs", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
        long j17 = aVar.f488214a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPageTotalTimeMs", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
        long currentTimeMillis = j17 + (java.lang.System.currentTimeMillis() - this.f251473p);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setPageTotalTimeMs", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
        aVar.f488214a = currentTimeMillis;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setPageTotalTimeMs", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPause", "com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity");
    }

    @Override // com.p314xaae8f345.mm.p811x323c3e.AbstractActivityC10805x83c6e8d6, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onResume", "com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsJankActivity", "[" + hashCode() + "]onResume");
        super.onResume();
        f4.i iVar = this.f251470m;
        if (iVar != null) {
            iVar.a(true);
        }
        this.f251473p = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onResume", "com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity");
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(android.widget.AbsListView absListView, int i17, int i18, int i19) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onScroll", "com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        arrayList.add(java.lang.Integer.valueOf(i19));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/monitor/SnsJankActivity", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/monitor/SnsJankActivity", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onScroll", "com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity");
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(android.widget.AbsListView absListView, int i17) {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onScrollStateChanged", "com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/monitor/SnsJankActivity", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
        sd4.b bVar = this.f251472o;
        bVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getScrollState", "com.tencent.mm.plugin.sns.ui.monitor.ScrollState");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getScrollState", "com.tencent.mm.plugin.sns.ui.monitor.ScrollState");
        if (bVar.f488222a != i17) {
            sd4.c cVar = f251462s;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getScrollWord", "com.tencent.mm.plugin.sns.ui.monitor.ScrollState");
            java.lang.String str2 = bVar.f488223b;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getScrollWord", "com.tencent.mm.plugin.sns.ui.monitor.ScrollState");
            cVar.b(str2);
            if (i17 == 1) {
                str = "onScrollStateChanged";
                bVar.a("scroll");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startScroll", "com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity");
                if (!this.f251475r) {
                    this.f251475r = true;
                    this.f251474q = java.lang.System.currentTimeMillis();
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startScroll", "com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity");
            } else if (i17 != 2) {
                bVar.a("idle");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("stopScroll", "com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity");
                if (this.f251475r) {
                    this.f251475r = false;
                    sd4.a aVar = this.f251471n;
                    aVar.getClass();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getPageScrollTimeMs", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
                    long j17 = aVar.f488216c;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPageScrollTimeMs", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
                    str = "onScrollStateChanged";
                    long currentTimeMillis = j17 + (java.lang.System.currentTimeMillis() - this.f251474q);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setPageScrollTimeMs", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
                    aVar.f488216c = currentTimeMillis;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setPageScrollTimeMs", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
                } else {
                    str = "onScrollStateChanged";
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("stopScroll", "com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity");
            } else {
                str = "onScrollStateChanged";
                bVar.a("fling");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startScroll", "com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity");
                if (!this.f251475r) {
                    this.f251475r = true;
                    this.f251474q = java.lang.System.currentTimeMillis();
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startScroll", "com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity");
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getScrollWord", "com.tencent.mm.plugin.sns.ui.monitor.ScrollState");
            java.lang.String str3 = bVar.f488223b;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getScrollWord", "com.tencent.mm.plugin.sns.ui.monitor.ScrollState");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addState$default", "com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity$Companion");
            cVar.a(str3, "");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addState$default", "com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity$Companion");
        } else {
            str = "onScrollStateChanged";
        }
        java.lang.String str4 = str;
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/monitor/SnsJankActivity", "android/widget/AbsListView$OnScrollListener", str4, "(Landroid/widget/AbsListView;I)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str4, "com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onWindowFocusChanged", "com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity");
        super.onWindowFocusChanged(z17);
        if (this.f251467g < 0) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            this.f251467g = currentTimeMillis;
            long j17 = this.f251466f;
            if (j17 > 0) {
                int i17 = (int) (currentTimeMillis - j17);
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6845xe5e3baf5 c6845xe5e3baf5 = this.f251468h;
                c6845xe5e3baf5.f141678q = i17;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsJankActivity", "[" + hashCode() + "]enter page cost:" + c6845xe5e3baf5.f141678q);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onWindowFocusChanged", "com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity");
    }

    @Override // f4.g
    public void q1(f4.d frameData) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onFrame", "com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameData, "frameData");
        sd4.a aVar = this.f251471n;
        aVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTotalFrameCount", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
        int i17 = aVar.f488215b;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTotalFrameCount", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setTotalFrameCount", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
        aVar.f488215b = i17 + 1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setTotalFrameCount", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
        if (this.f251475r) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getScrollFrameCount", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
            int i18 = aVar.f488221h;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getScrollFrameCount", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setScrollFrameCount", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
            aVar.f488221h = i18 + 1;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setScrollFrameCount", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
        }
        if (frameData.f340914c) {
            boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_sns_improve_jank_frame_report, false);
            long j17 = frameData.f340913b;
            if (fj6) {
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6896x3a99aa92 c6896x3a99aa92 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6896x3a99aa92();
                c6896x3a99aa92.f142116d = c6896x3a99aa92.b("SessionId", java.lang.String.valueOf(this.f251465e), true);
                od4.b bVar = od4.b.f426181a;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCpuName", "com.tencent.mm.plugin.sns.ui.item.improve.report.SnsMethodReport");
                java.lang.String str = od4.b.f426183c;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCpuName", "com.tencent.mm.plugin.sns.ui.item.improve.report.SnsMethodReport");
                c6896x3a99aa92.f142123k = c6896x3a99aa92.b("CpuInfo", str, true);
                c6896x3a99aa92.f142117e = frameData.f340912a;
                c6896x3a99aa92.f142118f = j17;
                c6896x3a99aa92.f142121i = c6896x3a99aa92.b("JankState", r26.i0.v(frameData.f340915d.toString(), ",", ";", false, 4, null), true);
                c6896x3a99aa92.f142122j = ld4.a.f399638a.a() ? 1 : 2;
                if (frameData instanceof f4.e) {
                    c6896x3a99aa92.f142119g = ((f4.e) frameData).f340916e;
                }
                if (frameData instanceof f4.f) {
                    c6896x3a99aa92.f142120h = ((f4.f) frameData).f340918g;
                }
                c6896x3a99aa92.k();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getJankFrame", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
            int i19 = aVar.f488218e;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getJankFrame", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setJankFrame", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
            aVar.f488218e = i19 + 1;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setJankFrame", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getJankFrameTimeMs", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
            long j18 = aVar.f488219f;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getJankFrameTimeMs", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
            long j19 = j17 / 1000000;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setJankFrameTimeMs", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
            aVar.f488219f = j18 + j19;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setJankFrameTimeMs", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
            if (this.f251475r) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getScrollJankFrame", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
                int i27 = aVar.f488220g;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getScrollJankFrame", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setScrollJankFrame", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
                aVar.f488220g = i27 + 1;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setScrollJankFrame", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getPageScrollJankTimeMs", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
                long j27 = aVar.f488217d;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPageScrollJankTimeMs", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setPageScrollJankTimeMs", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
                aVar.f488217d = j27 + j19;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setPageScrollJankTimeMs", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsJankActivity", "jank frame:" + frameData);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71151xee51f8e0();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onFrame", "com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity");
    }
}
