package sc2;

/* loaded from: classes2.dex */
public final class u1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sc2.f2 f487809d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f487810e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f487811f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(sc2.f2 f2Var, android.view.ViewGroup viewGroup, android.view.ViewGroup viewGroup2) {
        super(0);
        this.f487809d = f2Var;
        this.f487810e = viewGroup;
        this.f487811f = viewGroup2;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        sc2.i1 i1Var = sc2.f2.f487413x;
        this.f487809d.getClass();
        android.view.ViewGroup viewGroup = this.f487810e;
        int childCount = viewGroup.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = viewGroup.getChildAt(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(childAt, "getChildAt(...)");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(childAt, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/component/FeedBaseCardJumperObserver", "resetChildView", "(Landroid/view/ViewGroup;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            childAt.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(childAt, "com/tencent/mm/plugin/finder/feed/component/FeedBaseCardJumperObserver", "resetChildView", "(Landroid/view/ViewGroup;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        viewGroup.setVisibility(8);
        android.view.ViewGroup viewGroup2 = this.f487811f;
        viewGroup2.setVisibility(0);
        viewGroup2.setAlpha(1.0f);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        int childCount2 = viewGroup2.getChildCount();
        for (int i18 = 0; i18 < childCount2; i18++) {
            android.view.View childAt2 = viewGroup2.getChildAt(i18);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(childAt2, "getChildAt(...)");
            android.animation.ObjectAnimator duration = android.animation.ObjectAnimator.ofFloat(childAt2, "alpha", 1.0f).setDuration(150L);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(duration, "setDuration(...)");
            arrayList2.add(duration);
        }
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.playTogether(arrayList2);
        animatorSet.addListener(new sc2.m1(null));
        animatorSet.start();
        return jz5.f0.f384359a;
    }
}
