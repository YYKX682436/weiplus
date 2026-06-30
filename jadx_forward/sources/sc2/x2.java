package sc2;

/* loaded from: classes2.dex */
public final class x2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sc2.b3 f487887d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f487888e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f487889f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f487890g;

    public x2(sc2.b3 b3Var, float f17, android.view.View view, android.view.View view2) {
        this.f487887d = b3Var;
        this.f487888e = f17;
        this.f487889f = view;
        this.f487890g = view2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        sc2.b3 b3Var = this.f487887d;
        java.lang.String str = b3Var.f487309w;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("height=");
        sb6.append(this.f487888e);
        sb6.append(", after 1=");
        android.view.View view = b3Var.f487310x;
        sb6.append(view != null ? java.lang.Float.valueOf(view.getTranslationY()) : null);
        sb6.append(" 2=");
        android.view.View view2 = this.f487889f;
        sb6.append(view2 != null ? java.lang.Float.valueOf(view2.getTranslationY()) : null);
        sb6.append(" 3=");
        android.view.View view3 = this.f487890g;
        sb6.append(view3 != null ? java.lang.Float.valueOf(view3.getTranslationY()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        android.view.View view4 = b3Var.f487310x;
        if (view4 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view4, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/component/FeedJumperBigBtnObserver$animateFollow$1$onAnimationEnd$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/finder/feed/component/FeedJumperBigBtnObserver$animateFollow$1$onAnimationEnd$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view5 = b3Var.f487310x;
        if (view5 != null) {
            view5.setTranslationY(0.0f);
        }
        if (view2 != null) {
            view2.setTranslationY(0.0f);
        }
        if (view3 == null) {
            return;
        }
        view3.setTranslationY(0.0f);
    }
}
