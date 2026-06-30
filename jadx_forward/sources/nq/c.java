package nq;

/* loaded from: classes8.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nq.f f420396d;

    public c(nq.f fVar) {
        this.f420396d = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.ViewPropertyAnimator animate;
        android.view.ViewPropertyAnimator alpha;
        android.view.ViewPropertyAnimator duration;
        android.view.ViewPropertyAnimator listener;
        nq.f fVar = this.f420396d;
        android.view.View view = fVar.f420404e;
        if (view == null || view.getVisibility() != 0 || fVar.f420406g) {
            return;
        }
        com.p314xaae8f345.mm.p676x4c4db2ad.p678x373aa5.SurfaceHolderCallback2C10435xb52e77fb surfaceHolderCallback2C10435xb52e77fb = fVar.f420408i;
        if (surfaceHolderCallback2C10435xb52e77fb != null) {
            surfaceHolderCallback2C10435xb52e77fb.setVisibility(0);
        }
        fVar.f420406g = true;
        android.view.View view2 = fVar.f420404e;
        if (view2 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/dynamicbackground/view/DynamicBackgroundGLSurfaceView$GLRenderer$onDrawFrame$1", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view2, "com/tencent/mm/dynamicbackground/view/DynamicBackgroundGLSurfaceView$GLRenderer$onDrawFrame$1", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        mq.h.b("MicroMsg.DynamicBgSurfaceView", "alvinluo GradientColorBackgroundView do alpha animation", new java.lang.Object[0]);
        android.view.View view3 = fVar.f420404e;
        if (view3 == null || (animate = view3.animate()) == null || (alpha = animate.alpha(0.0f)) == null || (duration = alpha.setDuration(nq.f.f420399n)) == null || (listener = duration.setListener(new nq.b(this))) == null) {
            return;
        }
        listener.start();
    }
}
