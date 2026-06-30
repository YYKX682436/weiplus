package r50;

/* loaded from: classes5.dex */
public final class z implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r50.j0 f474152d;

    public z(r50.j0 j0Var) {
        this.f474152d = j0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/feature/forward/uic/ForwardMsgPreviewKeyboardUIC$onCreate$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        r50.j0 j0Var = this.f474152d;
        int i17 = j0Var.f474131t;
        if (i17 == 0) {
            j0Var.U6(2);
        } else if (i17 == 1) {
            j0Var.U6(2);
        } else if (i17 == 2) {
            j0Var.U6(1);
        }
        yj0.a.h(this, "com/tencent/mm/feature/forward/uic/ForwardMsgPreviewKeyboardUIC$onCreate$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
