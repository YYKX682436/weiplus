package al1;

/* loaded from: classes7.dex */
public class v extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1220xbd1ca1d.C12762x8fe39d2d f87349d;

    public v(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1220xbd1ca1d.C12762x8fe39d2d c12762x8fe39d2d) {
        this.f87349d = c12762x8fe39d2d;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1220xbd1ca1d.C12762x8fe39d2d c12762x8fe39d2d = this.f87349d;
        android.view.View findViewById = c12762x8fe39d2d.findViewById(com.p314xaae8f345.mm.R.id.eyp);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/widget/actionbar/AppBrandOptionButton$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/appbrand/widget/actionbar/AppBrandOptionButton$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1220xbd1ca1d.C12762x8fe39d2d.f172565i;
        c12762x8fe39d2d.f172566d.setVisibility(0);
        if (!c12762x8fe39d2d.f172570h) {
            c12762x8fe39d2d.f172566d.setAlpha(1.0f);
        }
        c12762x8fe39d2d.f172566d.setImageDrawable(c12762x8fe39d2d.mo53334xd83f0ace());
        c12762x8fe39d2d.f172567e = null;
    }
}
