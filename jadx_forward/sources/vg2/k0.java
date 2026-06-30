package vg2;

/* loaded from: classes3.dex */
public final class k0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vg2.v0 f518066d;

    public k0(vg2.v0 v0Var) {
        this.f518066d = v0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View view = this.f518066d.f518136d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/gift/widget/GiftPkSelectPanelWidget$adjustWidget$4", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/gift/widget/GiftPkSelectPanelWidget$adjustWidget$4", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
