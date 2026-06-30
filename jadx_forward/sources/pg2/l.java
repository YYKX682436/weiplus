package pg2;

/* loaded from: classes3.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f435678d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pg2.j0 f435679e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f435680f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ co0.s f435681g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10846x3bc26740 f435682h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.view.View f435683i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ug5.v f435684m;

    public l(android.view.View view, pg2.j0 j0Var, android.app.Activity activity, co0.s sVar, com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10846x3bc26740 c10846x3bc26740, android.view.View view2, ug5.v vVar) {
        this.f435678d = view;
        this.f435679e = j0Var;
        this.f435680f = activity;
        this.f435681g = sVar;
        this.f435682h = c10846x3bc26740;
        this.f435683i = view2;
        this.f435684m = vVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View view = this.f435678d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/fluent/performer/FinderLiveSurfaceViewService$changeSurfaceViewToLiveRoom$3$onFirstFrameRender$2", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/fluent/performer/FinderLiveSurfaceViewService$changeSurfaceViewToLiveRoom$3$onFirstFrameRender$2", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        co0.s sVar = this.f435681g;
        int i17 = sVar != null ? sVar.U1 : 0;
        int i18 = sVar != null ? sVar.V1 : 0;
        pg2.j0 j0Var = this.f435679e;
        android.app.Activity activity = this.f435680f;
        jz5.l wi6 = pg2.j0.wi(j0Var, activity, i17, i18);
        int intValue = ((java.lang.Number) wi6.f384366d).intValue();
        int intValue2 = ((java.lang.Number) wi6.f384367e).intValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveSurfaceViewService", "changeSurfaceViewToLiveRoom w=" + intValue + " h=" + intValue2);
        this.f435682h.a(intValue, intValue2);
        android.view.Window window = activity.getWindow();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(window, "getWindow(...)");
        ug5.x.e(window, -16777216);
        android.view.View view2 = this.f435683i;
        if (view2 != null) {
            pm0.v.B(view2);
        }
        ug5.f fVar = ug5.v.f509188g;
        this.f435684m.b(false);
    }
}
