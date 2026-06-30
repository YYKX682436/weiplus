package tt2;

/* loaded from: classes.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.r0 f503485d;

    public l(in5.r0 r0Var) {
        this.f503485d = r0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View view = this.f503485d.f3639x46306858;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/shopping/adapter/FinderLiveShoppingListAdapter$_onBindViewHolder$4", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/shopping/adapter/FinderLiveShoppingListAdapter$_onBindViewHolder$4", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
