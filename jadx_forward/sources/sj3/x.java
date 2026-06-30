package sj3;

/* loaded from: classes14.dex */
public final class x implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sj3.a1 f490325d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f490326e;

    public x(sj3.a1 a1Var, int i17) {
        this.f490325d = a1Var;
        this.f490326e = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/multitalk/ui/widget/ControlPanelLogic$handleBadNetworkLogic$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        sj3.a1 a1Var = this.f490325d;
        if (a1Var.f489945z) {
            a1Var.f489926d.W6(this.f490326e);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/multitalk/ui/widget/ControlPanelLogic$handleBadNetworkLogic$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
