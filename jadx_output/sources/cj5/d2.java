package cj5;

/* loaded from: classes.dex */
public final class d2 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cj5.l2 f42101d;

    public d2(cj5.l2 l2Var) {
        this.f42101d = l2Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/mvvm/uic/base/SelectContactMainRecycleViewUIC$onCreate$1$1$hideVKBListener$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        this.f42101d.hideVKB();
        yj0.a.i(false, this, "com/tencent/mm/ui/mvvm/uic/base/SelectContactMainRecycleViewUIC$onCreate$1$1$hideVKBListener$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
