package x64;

/* loaded from: classes4.dex */
public final class h implements d44.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x64.j f533819a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f533820b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f533821c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f533822d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f533823e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f533824f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f533825g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ v64.d f533826h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f533827i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 f533828j;

    public h(x64.j jVar, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, int i17, java.lang.String str2, java.lang.String str3, int i18, v64.d dVar, android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 c17702x544f64e9) {
        this.f533819a = jVar;
        this.f533820b = str;
        this.f533821c = c17933xe8d1b226;
        this.f533822d = i17;
        this.f533823e = str2;
        this.f533824f = str3;
        this.f533825g = i18;
        this.f533826h = dVar;
        this.f533827i = context;
        this.f533828j = c17702x544f64e9;
    }

    @Override // d44.b
    public final void a(java.lang.String str, int i17, int i18, java.lang.Object obj) {
        java.lang.String str2;
        java.lang.String str3;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var;
        com.p314xaae8f345.mm.p958xdb1a85af.C11137xb05b06ad c11137xb05b06ad;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onResult", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderLiveNoticeClick2$doClick$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getTAG$p", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderLiveNoticeClick2");
        x64.j jVar = this.f533819a;
        jVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getTAG$p", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderLiveNoticeClick2");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdFinderLiveNoticeClick2", "requestLivingNoticeState callback, errorCode is  " + i18 + ", snsId is " + str + ", livingStatus is " + obj);
        if (i18 == 0) {
            java.lang.Integer num = obj instanceof java.lang.Integer ? (java.lang.Integer) obj : null;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.i0.g(str, num != null ? num.intValue() : 0);
            int i19 = this.f533822d;
            android.content.Context context = this.f533827i;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "$context");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$doFinderJumpLogic", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderLiveNoticeClick2");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doFinderJumpLogic", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderLiveNoticeClick2");
            java.lang.String str4 = this.f533820b;
            int c17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.i0.c(str4, 1);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = this.f533821c;
            java.lang.String str5 = c17933xe8d1b226.m70347x10413e67(i19).f38104xce64ddf1;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("finderLivingNoticeStatus is ");
            sb6.append(c17);
            sb6.append(", finderUsername is ");
            java.lang.String str6 = this.f533823e;
            sb6.append(str6);
            sb6.append(", finderLiveNoticeId is ");
            sb6.append(this.f533824f);
            sb6.append(", snsIdStr is ");
            sb6.append(str4);
            sb6.append(", scene is ");
            int i27 = this.f533825g;
            sb6.append(i27);
            sb6.append(", uxInfo is ");
            sb6.append(str5);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdFinderLiveNoticeClick2", sb6.toString());
            v64.d dVar = this.f533826h;
            if (dVar != null) {
                u3Var = null;
                c11137xb05b06ad = (com.p314xaae8f345.mm.p958xdb1a85af.C11137xb05b06ad) dVar.a("snsAdClick", null);
            } else {
                u3Var = null;
                c11137xb05b06ad = null;
            }
            if (c17 == 513) {
                a84.u0.a(c11137xb05b06ad, 41);
                ca4.z0.x0(c11137xb05b06ad);
                l44.s4.h(context, str6, str5, str4, i27);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doFinderJumpLogic", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderLiveNoticeClick2");
            } else {
                a84.u0.a(c11137xb05b06ad, 43);
                p52.h.f433549a.f(l44.s4.m(str5, str4, i27), str6);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 c17702x544f64e9 = this.f533828j;
                if (c17702x544f64e9 == null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doFinderJumpLogic", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderLiveNoticeClick2");
                } else {
                    ca4.z0.x0(c11137xb05b06ad);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doNoticeLogic", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderLiveNoticeClick2");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showProgressDlg", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderLiveNoticeClick2");
                    if (context instanceof android.app.Activity) {
                        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 Q = db5.e1.Q(context, "", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gga), true, true, null);
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showProgressDlg", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderLiveNoticeClick2");
                        u3Var2 = Q;
                    } else {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showProgressDlg", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderLiveNoticeClick2");
                        u3Var2 = u3Var;
                    }
                    java.lang.String T = ca4.z0.T(c17933xe8d1b226);
                    java.lang.String str7 = c17702x544f64e9.f38004xa53ddf1c;
                    boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    if (str7 == null) {
                        str7 = "";
                    }
                    java.lang.String str8 = c17702x544f64e9.X;
                    java.lang.String str9 = str8 == null ? "" : str8;
                    d44.h.f(T, str7, str9, new x64.i(u3Var2, jVar, T, str7, context, i19, c17933xe8d1b226, c17702x544f64e9, str9));
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doNoticeLogic", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderLiveNoticeClick2");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doFinderJumpLogic", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderLiveNoticeClick2");
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$doFinderJumpLogic", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderLiveNoticeClick2");
            str2 = "onResult";
            str3 = "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderLiveNoticeClick2$doClick$1";
        } else {
            str2 = "onResult";
            str3 = "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderLiveNoticeClick2$doClick$1";
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str2, str3);
    }
}
