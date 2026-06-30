package cj4;

/* loaded from: classes5.dex */
public final class q implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cj4.a0 f123551d;

    public q(cj4.a0 a0Var) {
        this.f123551d = a0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/logic/BaseProfileLoadLogic$handleDesc$1$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        cj4.a0 a0Var = this.f123551d;
        if (!a0Var.X()) {
            yj0.a.h(this, "com/tencent/mm/plugin/textstatus/logic/BaseProfileLoadLogic$handleDesc$1$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        a0Var.Q1 = true;
        a0Var.M(4);
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/logic/BaseProfileLoadLogic$handleDesc$1$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
