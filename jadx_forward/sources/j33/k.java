package j33;

/* loaded from: classes.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f378975d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j33.m f378976e;

    public k(android.view.View view, j33.m mVar) {
        this.f378975d = view;
        this.f378976e = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View view = this.f378975d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/gallery/utils/AnimChangeVisibilityTask$doAnimUpdateViewVisibility$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/gallery/utils/AnimChangeVisibilityTask$doAnimUpdateViewVisibility$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        yz5.a aVar = this.f378976e.f378980f;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
    }
}
