package m31;

/* loaded from: classes3.dex */
public final class m0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m31.p1 f404699d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f404700e;

    public m0(m31.p1 p1Var, java.util.List list) {
        this.f404699d = p1Var;
        this.f404700e = list;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/msgsubscription/ui/SubscribeMsgRequestDialog$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        m31.p1 p1Var = this.f404699d;
        p1Var.A.setChecked(!r0.isChecked());
        for (m31.q0 q0Var : this.f404700e) {
            p1Var.A.isChecked();
            q0Var.getClass();
        }
        yj0.a.h(this, "com/tencent/mm/msgsubscription/ui/SubscribeMsgRequestDialog$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
