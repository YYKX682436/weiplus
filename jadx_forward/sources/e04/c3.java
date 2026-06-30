package e04;

/* loaded from: classes15.dex */
public final class c3 {

    /* renamed from: a, reason: collision with root package name */
    public android.view.View f327411a;

    /* renamed from: b, reason: collision with root package name */
    public long f327412b;

    /* renamed from: c, reason: collision with root package name */
    public e04.z2 f327413c;

    /* renamed from: d, reason: collision with root package name */
    public wu5.c f327414d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f327415e;

    public final void a() {
        android.view.ViewPropertyAnimator animate;
        android.view.ViewPropertyAnimator listener;
        android.view.ViewPropertyAnimator updateListener;
        this.f327415e = true;
        wu5.c cVar = this.f327414d;
        if (cVar != null) {
            cVar.cancel(false);
        }
        android.view.View view = this.f327411a;
        if (view == null || (animate = view.animate()) == null || (listener = animate.setListener(null)) == null || (updateListener = listener.setUpdateListener(null)) == null) {
            return;
        }
        updateListener.cancel();
    }

    public final void b(boolean z17) {
        e04.z2 z2Var = this.f327413c;
        if (z2Var != null) {
            z2Var.c(z17);
        }
        if (z17) {
            c(true);
            return;
        }
        android.view.View view = this.f327411a;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/scanner/util/ScanViewShowAnimationTask", "startAnimationTask", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/scanner/util/ScanViewShowAnimationTask", "startAnimationTask", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/scanner/util/ScanViewShowAnimationTask", "startAnimationTask", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/scanner/util/ScanViewShowAnimationTask", "startAnimationTask", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        this.f327415e = true;
        wu5.c cVar = this.f327414d;
        if (cVar != null) {
            cVar.cancel(false);
        }
        ku5.u0 u0Var = ku5.t0.f394148d;
        e04.b3 b3Var = new e04.b3(this);
        long j17 = this.f327412b;
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        this.f327414d = t0Var.z(b3Var, j17, false);
        this.f327415e = false;
    }

    public final void c(boolean z17) {
        android.view.View view = this.f327411a;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/scanner/util/ScanViewShowAnimationTask", "startShowAnimation", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/scanner/util/ScanViewShowAnimationTask", "startShowAnimation", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        e04.z2 z2Var = this.f327413c;
        if (z2Var != null) {
            z2Var.b(z17);
        }
        e04.i3.a(this.f327411a, z17 ? 0.0f : 1.0f, z17 ? 1.0f : 0.0f, 200L, new e04.a3(z17, this));
    }
}
