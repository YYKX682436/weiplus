package ir1;

/* loaded from: classes5.dex */
public final class q0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ir1.i1 f375569d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3133xd0ce8b26.mm.biz.p5 f375570e;

    public q0(ir1.i1 i1Var, com.p314xaae8f345.p3133xd0ce8b26.mm.biz.p5 p5Var) {
        this.f375569d = i1Var;
        this.f375570e = p5Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/brandservice/conversation/ui/BizFansHalfScreenProfileView$bindUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ir1.i1 i1Var = this.f375569d;
        i1Var.f375517d.B();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_User", this.f375570e.f300009f);
        j45.l.j(i1Var.getContext(), com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", intent, null);
        yj0.a.h(this, "com/tencent/mm/plugin/brandservice/conversation/ui/BizFansHalfScreenProfileView$bindUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
