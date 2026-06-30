package pg2;

/* loaded from: classes3.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f435670d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pg2.j0 f435671e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f435672f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ co0.s f435673g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10846x3bc26740 f435674h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout f435675i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.view.View f435676m;

    public k(android.view.View view, pg2.j0 j0Var, android.app.Activity activity, co0.s sVar, com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10846x3bc26740 c10846x3bc26740, android.widget.FrameLayout frameLayout, android.view.View view2) {
        this.f435670d = view;
        this.f435671e = j0Var;
        this.f435672f = activity;
        this.f435673g = sVar;
        this.f435674h = c10846x3bc26740;
        this.f435675i = frameLayout;
        this.f435676m = view2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ez2.e eVar = ez2.g.f339435a;
        if (eVar != null) {
            eVar.j();
        }
        android.view.View view = this.f435670d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/fluent/performer/FinderLiveSurfaceViewService$changeSurfaceViewToLiveRoom$3$onFirstFrameRender$1$1", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/fluent/performer/FinderLiveSurfaceViewService$changeSurfaceViewToLiveRoom$3$onFirstFrameRender$1$1", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        co0.s sVar = this.f435673g;
        int i17 = sVar != null ? sVar.U1 : 0;
        int i18 = sVar != null ? sVar.V1 : 0;
        pg2.j0 j0Var = this.f435671e;
        android.app.Activity activity = this.f435672f;
        jz5.l wi6 = pg2.j0.wi(j0Var, activity, i17, i18);
        this.f435674h.a(((java.lang.Number) wi6.f384366d).intValue(), ((java.lang.Number) wi6.f384367e).intValue());
        android.view.Window window = activity.getWindow();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(window, "getWindow(...)");
        ug5.x.e(window, -16777216);
        this.f435675i.removeView(this.f435676m);
    }
}
