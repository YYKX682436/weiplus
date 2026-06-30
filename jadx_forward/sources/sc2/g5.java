package sc2;

/* loaded from: classes2.dex */
public final class g5 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.animation.ValueAnimator f487443d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f487444e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g5(android.animation.ValueAnimator valueAnimator, android.view.View view) {
        super(0);
        this.f487443d = valueAnimator;
        this.f487444e = view;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.Object animatedValue = this.f487443d.getAnimatedValue();
        java.lang.Float f17 = animatedValue instanceof java.lang.Float ? (java.lang.Float) animatedValue : null;
        if (f17 != null) {
            float floatValue = f17.floatValue();
            android.view.View view = this.f487444e;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Float.valueOf(floatValue));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/component/FinderBaseCarouseCardJumperObserver$animateSetViewAlpha$1$1", "invoke", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/feed/component/FinderBaseCarouseCardJumperObserver$animateSetViewAlpha$1$1", "invoke", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        return jz5.f0.f384359a;
    }
}
