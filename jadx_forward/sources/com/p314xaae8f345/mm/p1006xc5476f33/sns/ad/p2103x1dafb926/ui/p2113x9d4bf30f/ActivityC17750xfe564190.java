package com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.ui.p2113x9d4bf30f;

@db5.a(m123858x6ac9171 = 35)
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/tencent/mm/plugin/sns/ad/landingpage/ui/activity/HalfScreenVangoghPageUI;", "Lcom/tencent/mm/ui/MMActivity;", "Lm54/x;", "Lx54/b;", "<init>", "()V", "y54/y", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(m168215x6ac9171 = 0)
/* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI */
/* loaded from: classes4.dex */
public final class ActivityC17750xfe564190 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements m54.x, x54.b {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f244712n = 0;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2108x1c644e5f.C17742x250976b0 f244715f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.ViewGroup f244716g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f244717h;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f244713d = new java.util.LinkedHashMap();

    /* renamed from: e, reason: collision with root package name */
    public final m54.k0 f244714e = new m54.k0(true);

    /* renamed from: i, reason: collision with root package name */
    public final y54.y f244718i = new y54.y(0, 0, 0, 0, 0, 0, 63, null);

    /* renamed from: m, reason: collision with root package name */
    public final m54.l f244719m = new m54.l();

    public static final void T6(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.ui.p2113x9d4bf30f.ActivityC17750xfe564190 activityC17750xfe564190) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$adjustHalfScreenContainerTransYIfNeed", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI");
        activityC17750xfe564190.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("adjustHalfScreenContainerTransYIfNeed", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2108x1c644e5f.C17742x250976b0 c17742x250976b0 = activityC17750xfe564190.f244715f;
        if (c17742x250976b0 != null) {
            float translationY = c17742x250976b0.getTranslationY();
            if (translationY < 0.0f && java.lang.Math.abs(translationY) > c17742x250976b0.m69457x7bbfcd63()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.HalfScreenVangogh", "it is going to adjust transY");
                c17742x250976b0.setTranslationY(-c17742x250976b0.m69457x7bbfcd63());
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("adjustHalfScreenContainerTransYIfNeed", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$adjustHalfScreenContainerTransYIfNeed", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI");
    }

    public static final /* synthetic */ y54.y U6(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.ui.p2113x9d4bf30f.ActivityC17750xfe564190 activityC17750xfe564190) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getContentSizeAttr$p", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI");
        y54.y yVar = activityC17750xfe564190.f244718i;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getContentSizeAttr$p", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI");
        return yVar;
    }

    @Override // x54.b
    public void K3(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("removeActivityResultObserver", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI");
        this.f244713d.remove(java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("removeActivityResultObserver", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI");
    }

    @Override // x54.b
    public void L2(int i17, x54.a observer) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("putActivityResultObserver", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(observer, "observer");
        this.f244713d.put(java.lang.Integer.valueOf(i17), observer);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("putActivityResultObserver", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI");
    }

    public final void V6() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("animateHide", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2108x1c644e5f.C17742x250976b0 c17742x250976b0 = this.f244715f;
        if (c17742x250976b0 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("animateHide", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hideWithAnimation", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.ScrollableFrameLayout");
        c17742x250976b0.m();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hideWithAnimation", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.ScrollableFrameLayout");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("animateHide", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI");
    }

    public final void W6() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("configContentLayoutParams", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2108x1c644e5f.C17742x250976b0 c17742x250976b0 = this.f244715f;
        y54.y yVar = this.f244718i;
        if (c17742x250976b0 != null) {
            c17742x250976b0.m69469x5755d9d7(yVar.a());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2108x1c644e5f.C17742x250976b0 c17742x250976b02 = this.f244715f;
        android.view.ViewGroup.LayoutParams layoutParams = c17742x250976b02 != null ? c17742x250976b02.getLayoutParams() : null;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.topMargin = yVar.a();
            boolean r17 = u4().r();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getContentViewHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI$ContentSizeAttr");
            int i17 = r17 ? yVar.f541107e : (yVar.f541104b - yVar.f541105c) - yVar.f541106d;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getContentViewHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI$ContentSizeAttr");
            marginLayoutParams.height = i17;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("configContentLayoutParams", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI");
    }

    public final void X6(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("liteAppRunStatus", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI");
        q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
        if (g0Var != null) {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) g0Var).ek(java.lang.Boolean.valueOf(z17));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("liteAppRunStatus", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI");
    }

    public final void Y6(java.lang.String event) {
        java.lang.Long l17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("notifyEventToFront", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI");
        q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
        if (g0Var == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("notifyEventToFront", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI");
            return;
        }
        java.util.Iterator it = ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) g0Var).tj("wxalite0c45e912005759856ea55eb382e8c509").iterator();
        while (true) {
            if (!it.hasNext()) {
                l17 = null;
                break;
            } else {
                l17 = (java.lang.Long) it.next();
                if (l17 != null) {
                    break;
                }
            }
        }
        if (l17 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("notifyEventToFront", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI");
            return;
        }
        long longValue = l17.longValue();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onEvent", "com.tencent.mm.plugin.sns.ad.liteapp.jsapi.LiteAppEventSender");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        try {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).Vj(longValue, event, null);
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onEvent", "com.tencent.mm.plugin.sns.ad.liteapp.jsapi.LiteAppEventSender");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("notifyEventToFront", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI");
    }

    public final void Z6(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onNavigationBarVisibleChanged", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI");
        W6();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2108x1c644e5f.C17742x250976b0 c17742x250976b0 = this.f244715f;
        if (c17742x250976b0 != null) {
            c17742x250976b0.requestLayout();
        }
        if (z17 && !u4().r()) {
            Y6("onNavigationBarChanged");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onNavigationBarVisibleChanged", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("finish", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI");
        super.finish();
        overridePendingTransition(0, 0);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("finish", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLayoutId", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLayoutId", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI");
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.coz;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        jz5.f0 f0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onActivityResult", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI");
        x54.a aVar = (x54.a) ((java.util.LinkedHashMap) this.f244713d).get(java.lang.Integer.valueOf(i17));
        if (aVar != null) {
            aVar.mo142005x9d4787cb(i17, i18, intent);
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            super.onActivityResult(i17, i18, intent);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onActivityResult", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onBackPressed", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI");
        V6();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onBackPressed", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(63:1|(1:326)|5|(1:7)|8|(2:10|(1:12)(57:324|14|(1:16)|17|(1:19)(1:323)|20|(1:22)(3:233|234|(1:236)(86:238|(1:240)|241|(1:243)|244|(1:246)|247|(1:249)|250|(1:252)|253|(1:255)(1:321)|(1:257)|258|(1:260)(1:320)|(1:262)|263|(1:265)(1:319)|(1:267)|268|(1:270)(1:318)|(1:272)|273|(1:317)(1:277)|(3:279|(1:281)|282)|283|(1:316)(1:287)|(3:289|(1:291)|292)|293|(1:295)|296|(1:315)(1:300)|(3:302|(1:304)|305)|306|(1:314)(1:310)|(1:312)|313|24|25|26|(2:28|(1:30)(1:31))|32|33|(1:35)(1:229)|36|(2:38|(1:40))|41|(1:43)|44|(1:48)|49|(1:51)(1:228)|52|(1:56)|57|(1:59)|60|(1:62)|63|64|65|(24:70|(1:72)(2:209|(1:211)(3:212|213|(17:215|216|217|75|(3:203|(1:207)|208)(5:78|(1:80)(3:198|(1:200)(1:202)|201)|81|(1:83)|84)|85|(1:87)(1:197)|88|(4:90|(1:92)|(1:94)|95)(3:188|(2:190|(1:192))(2:194|(1:196))|193)|96|(1:98)|99|(1:187)|103|(1:184)(4:107|(1:109)(1:183)|(1:111)(10:145|(1:147)(1:182)|148|(1:150)|151|(1:153)|(1:155)|156|(1:158)(1:181)|(1:160)(9:162|(1:164)|165|(1:180)(1:169)|(1:171)|172|(1:174)(1:179)|(1:176)(1:178)|177))|(2:113|114)(8:116|(1:118)(3:141|(1:143)|144)|119|(1:121)(3:135|(1:139)|140)|122|(1:124)(4:127|128|(1:130)|132)|125|126))|161|(0)(0))(25:218|219|(1:221)|222|74|75|(0)|203|(2:205|207)|208|85|(0)(0)|88|(0)(0)|96|(0)|99|(1:101)|185|187|103|(1:105)|184|161|(0)(0))))|73|74|75|(0)|203|(0)|208|85|(0)(0)|88|(0)(0)|96|(0)|99|(0)|185|187|103|(0)|184|161|(0)(0))|225|(0)(0)|73|74|75|(0)|203|(0)|208|85|(0)(0)|88|(0)(0)|96|(0)|99|(0)|185|187|103|(0)|184|161|(0)(0)))|23|24|25|26|(0)|32|33|(0)(0)|36|(0)|41|(0)|44|(2:46|48)|49|(0)(0)|52|(2:54|56)|57|(0)|60|(0)|63|64|65|(25:67|70|(0)(0)|73|74|75|(0)|203|(0)|208|85|(0)(0)|88|(0)(0)|96|(0)|99|(0)|185|187|103|(0)|184|161|(0)(0))|225|(0)(0)|73|74|75|(0)|203|(0)|208|85|(0)(0)|88|(0)(0)|96|(0)|99|(0)|185|187|103|(0)|184|161|(0)(0)))(1:325)|13|14|(0)|17|(0)(0)|20|(0)(0)|23|24|25|26|(0)|32|33|(0)(0)|36|(0)|41|(0)|44|(0)|49|(0)(0)|52|(0)|57|(0)|60|(0)|63|64|65|(0)|225|(0)(0)|73|74|75|(0)|203|(0)|208|85|(0)(0)|88|(0)(0)|96|(0)|99|(0)|185|187|103|(0)|184|161|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x046f, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x0470, code lost:
    
        r22 = "onCreate";
        r23 = "SnsAd.HalfScreenVangogh";
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x0299, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x029a, code lost:
    
        ca4.q.c("linkToLandingPageProxy", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0713  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0737  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x083a  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0852  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x067b  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x05d9  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0591  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x040f A[Catch: all -> 0x046f, TryCatch #4 {all -> 0x046f, blocks: (B:65:0x03e8, B:67:0x03fa, B:72:0x0406, B:209:0x040f, B:211:0x0421, B:212:0x0429), top: B:64:0x03e8 }] */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x00fc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0280 A[Catch: all -> 0x0299, TryCatch #1 {all -> 0x0299, blocks: (B:26:0x027a, B:28:0x0280, B:30:0x0286, B:31:0x028d), top: B:25:0x027a }] */
    /* JADX WARN: Removed duplicated region for block: B:323:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x03fa A[Catch: all -> 0x046f, TryCatch #4 {all -> 0x046f, blocks: (B:65:0x03e8, B:67:0x03fa, B:72:0x0406, B:209:0x040f, B:211:0x0421, B:212:0x0429), top: B:64:0x03e8 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0406 A[Catch: all -> 0x046f, TryCatch #4 {all -> 0x046f, blocks: (B:65:0x03e8, B:67:0x03fa, B:72:0x0406, B:209:0x040f, B:211:0x0421, B:212:0x0429), top: B:64:0x03e8 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x04a9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x05d6  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0615  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0703  */
    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r30) {
        /*
            Method dump skipped, instructions count: 2295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.ui.p2113x9d4bf30f.ActivityC17750xfe564190.onCreate(android.os.Bundle):void");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDestroy", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI");
        X6(false);
        m54.l pageParam = u4();
        m54.k0 k0Var = this.f244714e;
        k0Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDestroy", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghPageUIHelper");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pageParam, "pageParam");
        long currentTimeMillis = k0Var.f405821a > 0 ? java.lang.System.currentTimeMillis() - k0Var.f405821a : 0L;
        if (currentTimeMillis > 0) {
            long j17 = currentTimeMillis - k0Var.f405823c;
            if (j17 > 0) {
                currentTimeMillis = j17;
            }
        }
        m54.j0.f405820a.a(4003056, (int) currentTimeMillis, pageParam);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDestroy", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghPageUIHelper");
        if (!u4().u()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.HalfScreenVangogh", "the half screen vangogh page state is false");
            n54.i.d(false);
        }
        super.onDestroy();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDestroy", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, android.app.Activity
    public void onStart() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onStart", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI");
        super.onStart();
        m54.k0 k0Var = this.f244714e;
        k0Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onStart", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghPageUIHelper");
        if (k0Var.f405822b > 0) {
            k0Var.f405823c += java.lang.System.currentTimeMillis() - k0Var.f405822b;
        }
        k0Var.f405822b = 0L;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onStart", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghPageUIHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onStart", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onStop() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onStop", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI");
        super.onStop();
        m54.k0 k0Var = this.f244714e;
        k0Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onStop", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghPageUIHelper");
        k0Var.f405822b = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onStop", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghPageUIHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onStop", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI");
    }

    @Override // m54.x
    public m54.l u4() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getPageParam", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPageParam", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI");
        return this.f244719m;
    }
}
