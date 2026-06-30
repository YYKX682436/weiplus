package vg2;

/* loaded from: classes3.dex */
public final class d1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vg2.r1 f518024d;

    public d1(vg2.r1 r1Var) {
        this.f518024d = r1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View view = this.f518024d.f518097e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/gift/widget/GiftSkinSelectPanelWidget$adjustWidget$4", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/gift/widget/GiftSkinSelectPanelWidget$adjustWidget$4", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
