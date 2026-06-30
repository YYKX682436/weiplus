package x64;

/* loaded from: classes4.dex */
public final class i implements d44.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f533829a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x64.j f533830b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f533831c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f533832d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f533833e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f533834f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f533835g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 f533836h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f533837i;

    public i(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var, x64.j jVar, java.lang.String str, java.lang.String str2, android.content.Context context, int i17, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 c17702x544f64e9, java.lang.String str3) {
        this.f533829a = u3Var;
        this.f533830b = jVar;
        this.f533831c = str;
        this.f533832d = str2;
        this.f533833e = context;
        this.f533834f = i17;
        this.f533835g = c17933xe8d1b226;
        this.f533836h = c17702x544f64e9;
        this.f533837i = str3;
    }

    @Override // d44.b
    public void a(java.lang.String str, int i17, int i18, java.lang.Object obj) {
        java.lang.String str2;
        java.lang.String str3;
        int i19;
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onResult", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderLiveNoticeClick2$doNoticeLogic$1");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f533829a;
        if (u3Var != null && u3Var.isShowing()) {
            u3Var.dismiss();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getTAG$p", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderLiveNoticeClick2");
        this.f533830b.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getTAG$p", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderLiveNoticeClick2");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("outSnsId is ");
        sb6.append(this.f533831c);
        sb6.append(", snsId is ");
        sb6.append(str);
        sb6.append(", finderUsername is ");
        java.lang.String finderUsername = this.f533832d;
        sb6.append(finderUsername);
        sb6.append(", actionType is ");
        sb6.append(i17);
        sb6.append(", errorCode is ");
        sb6.append(i18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdFinderLiveNoticeClick2", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = this.f533835g;
        android.content.Context context = this.f533833e;
        if (i18 == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.i0.g(str, 513);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.b bVar = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.b(context);
            int i27 = this.f533834f;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showBottomSheet", "com.tencent.mm.plugin.sns.ad.widget.living.AdFinderNoticeSuccessHalfScreenWidget");
            if (str == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showBottomSheet", "com.tencent.mm.plugin.sns.ad.widget.living.AdFinderNoticeSuccessHalfScreenWidget");
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 c17702x544f64e9 = this.f533836h;
                if (c17702x544f64e9 == null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showBottomSheet", "com.tencent.mm.plugin.sns.ad.widget.living.AdFinderNoticeSuccessHalfScreenWidget");
                } else if (c17933xe8d1b226 == null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showBottomSheet", "com.tencent.mm.plugin.sns.ad.widget.living.AdFinderNoticeSuccessHalfScreenWidget");
                } else {
                    bVar.f245219i = c17702x544f64e9;
                    bVar.f245218h = c17933xe8d1b226;
                    bVar.f245220m = i27;
                    bVar.f245221n = str;
                    if (i27 == 0) {
                        str2 = "onResult";
                        str3 = "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderLiveNoticeClick2$doNoticeLogic$1";
                        i19 = 1;
                    } else {
                        str2 = "onResult";
                        str3 = "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderLiveNoticeClick2$doNoticeLogic$1";
                        i19 = 2;
                    }
                    bVar.f245226s = new com.p314xaae8f345.mm.p958xdb1a85af.C11137xb05b06ad(i27, i19, c17933xe8d1b226.f68891x29d1292e, 41, 41);
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = bVar.f245216f;
                    java.lang.String str4 = bVar.f245215e;
                    boolean z18 = false;
                    if (k0Var == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str4, "init finder notice success bottomSheet");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initBottomSheet", "com.tencent.mm.plugin.sns.ad.widget.living.AdFinderNoticeSuccessHalfScreenWidget");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initContentView", "com.tencent.mm.plugin.sns.ad.widget.living.AdFinderNoticeSuccessHalfScreenWidget");
                        android.content.Context context2 = bVar.f245214d;
                        android.view.View inflate = android.view.LayoutInflater.from(context2).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cqt, (android.view.ViewGroup) null);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
                        bVar.f245217g = inflate;
                        bVar.f245222o = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.kfl);
                        bVar.f245223p = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f566431fv1);
                        bVar.f245224q = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.osy);
                        bVar.f245225r = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.d2m);
                        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.bys);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
                        findViewById.setOnClickListener(bVar);
                        android.widget.Button button = (android.widget.Button) inflate.findViewById(com.p314xaae8f345.mm.R.id.kfg);
                        if (button != null) {
                            button.setOnClickListener(bVar);
                        }
                        android.widget.TextView textView = bVar.f245222o;
                        com.p314xaae8f345.mm.ui.bk.r0(textView != null ? textView.getPaint() : null, 0.8f);
                        android.widget.TextView textView2 = bVar.f245223p;
                        com.p314xaae8f345.mm.ui.bk.r0(textView2 != null ? textView2.getPaint() : null, 0.8f);
                        android.widget.TextView textView3 = bVar.f245224q;
                        com.p314xaae8f345.mm.ui.bk.r0(textView3 != null ? textView3.getPaint() : null, 0.8f);
                        android.widget.TextView textView4 = bVar.f245225r;
                        com.p314xaae8f345.mm.ui.bk.r0(textView4 != null ? textView4.getPaint() : null, 0.8f);
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initContentView", "com.tencent.mm.plugin.sns.ad.widget.living.AdFinderNoticeSuccessHalfScreenWidget");
                        z17 = true;
                        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0(context2, true, 0);
                        bVar.f245216f = k0Var2;
                        k0Var2.s(bVar.f245217g, true);
                        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var3 = bVar.f245216f;
                        if (k0Var3 != null) {
                            k0Var3.e(true);
                        }
                        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var4 = bVar.f245216f;
                        if (k0Var4 != null) {
                            k0Var4.V1 = true;
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initBottomSheet", "com.tencent.mm.plugin.sns.ad.widget.living.AdFinderNoticeSuccessHalfScreenWidget");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("refreshView", "com.tencent.mm.plugin.sns.ad.widget.living.AdFinderNoticeSuccessHalfScreenWidget");
                        android.widget.TextView textView5 = bVar.f245223p;
                        if (textView5 != null) {
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 c17702x544f64e92 = bVar.f245219i;
                            textView5.setText(c17702x544f64e92 != null ? c17702x544f64e92.f244103a0 : null);
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("refreshView", "com.tencent.mm.plugin.sns.ad.widget.living.AdFinderNoticeSuccessHalfScreenWidget");
                    } else {
                        z17 = true;
                    }
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var5 = bVar.f245216f;
                    if (k0Var5 != null && !k0Var5.i()) {
                        z18 = z17;
                    }
                    if (z18) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str4, "show finder notice success bottomSheet, snsId is " + bVar.f245221n + ", mSource is " + bVar.f245220m);
                        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var6 = bVar.f245216f;
                        if (k0Var6 != null) {
                            k0Var6.v();
                        }
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showBottomSheet", "com.tencent.mm.plugin.sns.ad.widget.living.AdFinderNoticeSuccessHalfScreenWidget");
                }
            }
            str2 = "onResult";
            str3 = "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderLiveNoticeClick2$doNoticeLogic$1";
        } else {
            str2 = "onResult";
            str3 = "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderLiveNoticeClick2$doNoticeLogic$1";
            d44.h.b(context, i18);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(finderUsername, "$finderUsername");
        java.lang.String finderLiveNoticeId = this.f533837i;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(finderLiveNoticeId, "$finderLiveNoticeId");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$reportResultData", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderLiveNoticeClick2");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportResultData", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderLiveNoticeClick2");
        java.lang.String str5 = c17933xe8d1b226.m70354x74235b3e().f38172xd73c98cc;
        java.lang.String str6 = c17933xe8d1b226.m70347x10413e67(this.f533834f).f38104xce64ddf1;
        d44.a aVar = new d44.a();
        aVar.c(str, str6, str5, finderUsername, finderLiveNoticeId, i18, 3);
        a84.t0.a(aVar);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportResultData", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderLiveNoticeClick2");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$reportResultData", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderLiveNoticeClick2");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str2, str3);
    }
}
