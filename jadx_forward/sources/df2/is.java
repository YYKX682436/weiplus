package df2;

/* loaded from: classes10.dex */
public final class is implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.lt f311961d;

    public is(df2.lt ltVar) {
        this.f311961d = ltVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/LivePromoteBannerController$initView$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int action = motionEvent.getAction();
        df2.lt ltVar = this.f311961d;
        if (action == 0) {
            java.lang.String str = df2.lt.W;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LivePromoteBannerController", "bannerRv action down");
            p3325xe03a0797.p3326xc267989b.r2 r2Var = ltVar.B;
            if (r2Var != null) {
                p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
            }
        } else if (action == 1) {
            java.lang.String str2 = df2.lt.W;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LivePromoteBannerController", "bannerRv action up");
            ltVar.x7();
            ltVar.N = true;
        } else if (action == 3) {
            java.lang.String str3 = df2.lt.W;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LivePromoteBannerController", "bannerRv action cancel");
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/finder/live/controller/LivePromoteBannerController$initView$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
