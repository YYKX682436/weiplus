package al1;

/* loaded from: classes7.dex */
public class v extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.actionbar.AppBrandOptionButton f5816d;

    public v(com.tencent.mm.plugin.appbrand.widget.actionbar.AppBrandOptionButton appBrandOptionButton) {
        this.f5816d = appBrandOptionButton;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.tencent.mm.plugin.appbrand.widget.actionbar.AppBrandOptionButton appBrandOptionButton = this.f5816d;
        android.view.View findViewById = appBrandOptionButton.findViewById(com.tencent.mm.R.id.eyp);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/widget/actionbar/AppBrandOptionButton$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/appbrand/widget/actionbar/AppBrandOptionButton$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int i17 = com.tencent.mm.plugin.appbrand.widget.actionbar.AppBrandOptionButton.f91032i;
        appBrandOptionButton.f91033d.setVisibility(0);
        if (!appBrandOptionButton.f91037h) {
            appBrandOptionButton.f91033d.setAlpha(1.0f);
        }
        appBrandOptionButton.f91033d.setImageDrawable(appBrandOptionButton.getDefaultImageDrawable());
        appBrandOptionButton.f91034e = null;
    }
}
