package nq;

/* loaded from: classes8.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nq.f f420398d;

    public e(nq.f fVar) {
        this.f420398d = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        nq.f fVar = this.f420398d;
        android.view.View view = fVar.f420404e;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/dynamicbackground/view/DynamicBackgroundGLSurfaceView$GLRenderer$onDrawFrame$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/dynamicbackground/view/DynamicBackgroundGLSurfaceView$GLRenderer$onDrawFrame$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view2 = fVar.f420404e;
        if (view2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/dynamicbackground/view/DynamicBackgroundGLSurfaceView$GLRenderer$onDrawFrame$2", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(view2, "com/tencent/mm/dynamicbackground/view/DynamicBackgroundGLSurfaceView$GLRenderer$onDrawFrame$2", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        mq.h.b("MicroMsg.DynamicBgSurfaceView", "alvinluo showGradientView", new java.lang.Object[0]);
        com.p314xaae8f345.mm.p676x4c4db2ad.p678x373aa5.SurfaceHolderCallback2C10435xb52e77fb surfaceHolderCallback2C10435xb52e77fb = fVar.f420408i;
        if (surfaceHolderCallback2C10435xb52e77fb != null) {
            surfaceHolderCallback2C10435xb52e77fb.postDelayed(new nq.d(this), 50L);
        }
    }
}
