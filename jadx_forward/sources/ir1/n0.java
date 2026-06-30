package ir1;

/* loaded from: classes5.dex */
public final class n0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ir1.i1 f375554d;

    public n0(ir1.i1 i1Var) {
        this.f375554d = i1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/brandservice/conversation/ui/BizFansHalfScreenProfileView$bindUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f375554d.f375517d.B();
        yj0.a.h(this, "com/tencent/mm/plugin/brandservice/conversation/ui/BizFansHalfScreenProfileView$bindUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
