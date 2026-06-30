package fr2;

/* loaded from: classes.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f347242d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f347243e;

    public c(boolean z17, android.view.View view) {
        this.f347242d = z17;
        this.f347243e = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View view;
        if (this.f347242d || (view = this.f347243e) == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/nearby/ui/special/uic/FinderLivePlayTogetherBottomBarUIC$animBtnLayout$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/nearby/ui/special/uic/FinderLivePlayTogetherBottomBarUIC$animBtnLayout$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
