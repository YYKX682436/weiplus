package vx2;

/* loaded from: classes.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f522769d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f522770e;

    public b(android.view.View view, yz5.a aVar) {
        this.f522769d = view;
        this.f522770e = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View view = this.f522769d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/seek/FinderSeekHelper$animateDismiss$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/view/seek/FinderSeekHelper$animateDismiss$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f522769d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/view/seek/FinderSeekHelper$animateDismiss$1", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/view/seek/FinderSeekHelper$animateDismiss$1", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        this.f522770e.mo152xb9724478();
    }
}
