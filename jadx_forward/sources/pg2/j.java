package pg2;

/* loaded from: classes.dex */
public final class j extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f435665d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f435666e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f435667f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f435668g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(android.view.View view, boolean z17, boolean z18, android.view.View view2) {
        super(0);
        this.f435665d = view;
        this.f435666e = z17;
        this.f435667f = z18;
        this.f435668g = view2;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.view.View view;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveSurfaceViewService", "timeOutCompleteBlock");
        android.view.View view2 = this.f435665d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/fluent/performer/FinderLiveSurfaceViewService$changeSurfaceViewToLiveRoom$2", "invoke", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view2.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/fluent/performer/FinderLiveSurfaceViewService$changeSurfaceViewToLiveRoom$2", "invoke", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        if ((this.f435666e || !this.f435667f) && (view = this.f435668g) != null) {
            pm0.v.B(view);
        }
        return jz5.f0.f384359a;
    }
}
