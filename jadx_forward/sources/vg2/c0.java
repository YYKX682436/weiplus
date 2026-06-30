package vg2;

/* loaded from: classes.dex */
public final class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vg2.e0 f518021d;

    public c0(vg2.e0 e0Var) {
        this.f518021d = e0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View view = this.f518021d.f518032c;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/gift/widget/GiftDesignerTipsWidget$adjustWidget$3", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/gift/widget/GiftDesignerTipsWidget$adjustWidget$3", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
