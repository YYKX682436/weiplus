package pg2;

/* loaded from: classes3.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f435701d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f435702e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ug5.v f435703f;

    public n(android.view.View view, android.app.Activity activity, ug5.v vVar) {
        this.f435701d = view;
        this.f435702e = activity;
        this.f435703f = vVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.Window window;
        android.view.View view = this.f435701d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/fluent/performer/FinderLiveSurfaceViewService$changeSurfaceViewToMultiStreamLiveRoom$1$1", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        boolean z17 = false;
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/fluent/performer/FinderLiveSurfaceViewService$changeSurfaceViewToMultiStreamLiveRoom$1$1", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.app.Activity activity = this.f435702e;
        if (activity != null && (window = activity.getWindow()) != null) {
            ug5.x.e(window, -16777216);
        }
        ug5.v vVar = this.f435703f;
        if (vVar != null && !vVar.f509195e) {
            z17 = true;
        }
        if (z17) {
            vVar.b(true);
        }
    }
}
