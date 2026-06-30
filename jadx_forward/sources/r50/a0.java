package r50;

/* loaded from: classes5.dex */
public final class a0 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r50.j0 f474101d;

    public a0(r50.j0 j0Var) {
        this.f474101d = j0Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/feature/forward/uic/ForwardMsgPreviewKeyboardUIC$onCreate$1$1$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        r50.j0 j0Var = this.f474101d;
        if (j0Var.f474131t != 0) {
            j0Var.U6(0);
        }
        yj0.a.i(false, this, "com/tencent/mm/feature/forward/uic/ForwardMsgPreviewKeyboardUIC$onCreate$1$1$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
