package wa2;

/* loaded from: classes3.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f525649d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f525650e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f525651f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f525652g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f525653h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ wa2.n0 f525654i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f525655m;

    public g(android.view.View view, android.content.Intent intent, android.app.Activity activity, android.view.View view2, long j17, wa2.n0 n0Var, android.view.ViewGroup viewGroup) {
        this.f525649d = view;
        this.f525650e = intent;
        this.f525651f = activity;
        this.f525652g = view2;
        this.f525653h = j17;
        this.f525654i = n0Var;
        this.f525655m = viewGroup;
    }

    @Override // java.lang.Runnable
    public final void run() {
        wa2.u uVar = wa2.u.f525714d;
        android.view.View view = this.f525649d;
        android.content.Intent intent = this.f525650e;
        uVar.Ni(view, intent);
        android.view.View wi6 = uVar.wi(this.f525651f, intent);
        wa2.n0 n0Var = this.f525654i;
        n0Var.addView(wi6, n0Var.indexOfChild(n0Var.m173376x12263380()) + 1);
        android.graphics.Rect rect = new android.graphics.Rect();
        this.f525655m.getDrawingRect(rect);
        android.graphics.Rect Vi = uVar.Vi(intent);
        float Zi = uVar.Zi(Vi, rect, false);
        float[] bj6 = uVar.bj(rect, Vi);
        uVar.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(wi6, arrayList.toArray(), "com/tencent/mm/plugin/finder/animation/ActivityToggleAnimator$enterAnimation$1", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        wi6.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(wi6, "com/tencent/mm/plugin/finder/animation/ActivityToggleAnimator$enterAnimation$1", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.view.ViewPropertyAnimator animate = wi6.animate();
        if (animate != null) {
            animate.cancel();
        }
        android.view.ViewPropertyAnimator updateListener = wi6.animate().translationX(-bj6[0]).translationY(-bj6[1]).scaleX(Zi).scaleY(Zi).setUpdateListener(wa2.c.f525638d);
        android.view.ViewPropertyAnimator animate2 = wi6.animate();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(animate2, "animate(...)");
        android.view.ViewPropertyAnimator listener = updateListener.setListener(new wa2.a0(animate2, new wa2.d(this.f525652g, wi6, this.f525650e, this.f525649d, this.f525651f)));
        long j17 = this.f525653h;
        listener.setDuration(j17).start();
        android.view.ViewPropertyAnimator animate3 = view.animate();
        if (animate3 != null) {
            animate3.cancel();
        }
        android.view.ViewPropertyAnimator updateListener2 = view.animate().translationX(0.0f).translationY(0.0f).scaleX(1.0f).scaleY(1.0f).setUpdateListener(new wa2.e(view));
        android.view.ViewPropertyAnimator animate4 = view.animate();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(animate4, "animate(...)");
        updateListener2.setListener(new wa2.a0(animate4, new wa2.f(view))).setDuration(j17).start();
    }
}
