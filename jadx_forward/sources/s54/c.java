package s54;

/* loaded from: classes4.dex */
public class c implements r90.j {

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f484716e;

    /* renamed from: f, reason: collision with root package name */
    public di3.d f484717f;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f484715d = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public volatile int f484718g = 0;

    public c(s54.a aVar) {
    }

    public static s54.c a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getInstance", "com.tencent.mm.plugin.sns.ad.landingpage.helper.orientation.ScreenSwitchManager");
        s54.c cVar = s54.b.f484714a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$100", "com.tencent.mm.plugin.sns.ad.landingpage.helper.orientation.ScreenSwitchManager$ScreenSwitchManagerHolder");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$100", "com.tencent.mm.plugin.sns.ad.landingpage.helper.orientation.ScreenSwitchManager$ScreenSwitchManagerHolder");
        s54.c cVar2 = s54.b.f484714a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getInstance", "com.tencent.mm.plugin.sns.ad.landingpage.helper.orientation.ScreenSwitchManager");
        return cVar2;
    }

    @Override // r90.j
    /* renamed from: onOrientationChange */
    public void mo47333x15072581(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onOrientationChange", "com.tencent.mm.plugin.sns.ad.landingpage.helper.orientation.ScreenSwitchManager");
        if (i17 == 0) {
            this.f484718g = 0;
        } else if (i17 == 270) {
            this.f484718g = 90;
        } else if (i17 == 90) {
            this.f484718g = -90;
        } else if (i17 == 180) {
            this.f484718g = 180;
        } else {
            this.f484718g = -1;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f484716e)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ScreenSwitchManager", "componentId is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onOrientationChange", "com.tencent.mm.plugin.sns.ad.landingpage.helper.orientation.ScreenSwitchManager");
            return;
        }
        java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) ((java.util.HashMap) this.f484715d).get(this.f484716e);
        if (weakReference == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ScreenSwitchManager", "mViewRef is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onOrientationChange", "com.tencent.mm.plugin.sns.ad.landingpage.helper.orientation.ScreenSwitchManager");
        } else {
            android.view.View view = (android.view.View) weakReference.get();
            if (view instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2106x373aa5.ViewOnTouchListenerC17736xfc8efac) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2106x373aa5.ViewOnTouchListenerC17736xfc8efac) view).w(this.f484718g);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onOrientationChange", "com.tencent.mm.plugin.sns.ad.landingpage.helper.orientation.ScreenSwitchManager");
        }
    }
}
