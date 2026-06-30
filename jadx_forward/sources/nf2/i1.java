package nf2;

/* loaded from: classes5.dex */
public final class i1 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f418285a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.View f418286b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.View f418287c;

    /* renamed from: d, reason: collision with root package name */
    public final nf2.a f418288d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f418289e;

    /* renamed from: f, reason: collision with root package name */
    public android.animation.AnimatorSet f418290f;

    public i1(android.view.View renderArea, android.view.View menuBar, android.view.View collapsedButton, nf2.a layoutMode) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(renderArea, "renderArea");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menuBar, "menuBar");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(collapsedButton, "collapsedButton");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layoutMode, "layoutMode");
        this.f418285a = renderArea;
        this.f418286b = menuBar;
        this.f418287c = collapsedButton;
        this.f418288d = layoutMode;
    }

    public static final void a(nf2.i1 i1Var, android.view.View view) {
        i1Var.getClass();
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/lyrics/LiveLyricsCollapseAnimator", "resetViewTransform", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/controller/lyrics/LiveLyricsCollapseAnimator", "resetViewTransform", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }

    public final jz5.l b() {
        int ordinal = this.f418288d.ordinal();
        android.view.View view = this.f418286b;
        if (ordinal == 0) {
            return new jz5.l(java.lang.Float.valueOf(view.getWidth()), java.lang.Float.valueOf(view.getHeight()));
        }
        if (ordinal != 1) {
            throw new jz5.j();
        }
        return new jz5.l(java.lang.Float.valueOf(view.getWidth()), java.lang.Float.valueOf(view.getHeight()));
    }

    public final jz5.l c() {
        int ordinal = this.f418288d.ordinal();
        android.view.View view = this.f418285a;
        android.view.View view2 = this.f418286b;
        if (ordinal == 0) {
            view2.getLocationOnScreen(new int[2]);
            view.getLocationOnScreen(new int[2]);
            return new jz5.l(java.lang.Float.valueOf((r0[0] + view2.getWidth()) - r3[0]), java.lang.Float.valueOf(view.getHeight()));
        }
        if (ordinal != 1) {
            throw new jz5.j();
        }
        view2.getLocationOnScreen(new int[2]);
        view.getLocationOnScreen(new int[2]);
        return new jz5.l(java.lang.Float.valueOf(view.getWidth()), java.lang.Float.valueOf((r0[1] + view2.getHeight()) - r3[1]));
    }
}
