package k84;

/* loaded from: classes4.dex */
public class g4 implements android.view.GestureDetector.OnDoubleTapListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2136xd0c93d50.C17781x303781f f386577d;

    public g4(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2136xd0c93d50.C17781x303781f c17781x303781f) {
        this.f386577d = c17781x303781f;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(android.view.MotionEvent motionEvent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDoubleTap", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/widget/adsocial/AdSocialAttitudeView$1", "android/view/GestureDetector$OnDoubleTapListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2136xd0c93d50.C17781x303781f c17781x303781f = this.f386577d;
        java.lang.String a17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2136xd0c93d50.C17781x303781f.a(c17781x303781f);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onDoubleTap, mSupportDoubleTap is ");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$200", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
        boolean z17 = c17781x303781f.f245000z1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$200", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
        sb6.append(z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(a17, sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$200", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
        boolean z18 = c17781x303781f.f245000z1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$200", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
        if (!z18) {
            yj0.a.i(false, this, "com/tencent/mm/plugin/sns/ad/widget/adsocial/AdSocialAttitudeView$1", "android/view/GestureDetector$OnDoubleTapListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDoubleTap", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView$1");
            return false;
        }
        if (c17781x303781f.m()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2136xd0c93d50.C17781x303781f.a(c17781x303781f), "onDoubleTap, do liked");
            boolean b17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2136xd0c93d50.C17781x303781f.b(c17781x303781f, false);
            yj0.a.i(b17, this, "com/tencent/mm/plugin/sns/ad/widget/adsocial/AdSocialAttitudeView$1", "android/view/GestureDetector$OnDoubleTapListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDoubleTap", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView$1");
            return b17;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$300", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
        long j17 = c17781x303781f.N;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$300", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
        if (currentTimeMillis - j17 > 800) {
            long currentTimeMillis2 = java.lang.System.currentTimeMillis();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$302", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
            c17781x303781f.N = currentTimeMillis2;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$302", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
            l44.b3 b3Var = l44.b3.f397574a;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$400", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = c17781x303781f.f244990u;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$400", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAdLikedStateDoubleTap", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper");
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("onAdLikedStateDoubleTap() called with: snsInfo = ");
            sb7.append(c17933xe8d1b226);
            sb7.append(", model snsId is ");
            sb7.append(c17933xe8d1b226 != null ? c17933xe8d1b226.m70367x7525eefd() : null);
            sb7.append(", snsIdStr is ");
            sb7.append(ca4.z0.t0(c17933xe8d1b226 != null ? c17933xe8d1b226.f68891x29d1292e : 0L));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdInteractHelper", sb7.toString());
            ((p3325xe03a0797.p3326xc267989b.p3328x30012e.q2) l44.b3.f397582i).e(c17933xe8d1b226);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAdLikedStateDoubleTap", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2136xd0c93d50.C17781x303781f.a(c17781x303781f), "already liked and double tap");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2136xd0c93d50.C17781x303781f.a(c17781x303781f), "already liked and double tap, you must click button slowly");
        }
        yj0.a.i(true, this, "com/tencent/mm/plugin/sns/ad/widget/adsocial/AdSocialAttitudeView$1", "android/view/GestureDetector$OnDoubleTapListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDoubleTap", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView$1");
        return true;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTapEvent(android.view.MotionEvent motionEvent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDoubleTapEvent", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDoubleTapEvent", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView$1");
        return false;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(android.view.MotionEvent motionEvent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onSingleTapConfirmed", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2136xd0c93d50.C17781x303781f c17781x303781f = this.f386577d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2136xd0c93d50.C17781x303781f.a(c17781x303781f), "onSingleTapConfirmed");
        boolean b17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2136xd0c93d50.C17781x303781f.b(c17781x303781f, true);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSingleTapConfirmed", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView$1");
        return b17;
    }
}
