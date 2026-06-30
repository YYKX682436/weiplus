package ir1;

/* loaded from: classes5.dex */
public final class v0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ir1.i1 f375594d;

    public v0(ir1.i1 i1Var) {
        this.f375594d = i1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/brandservice/conversation/ui/BizFansHalfScreenProfileView$bindUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        jr1.i iVar = jr1.i.f382893a;
        ir1.i1 i1Var = this.f375594d;
        int i17 = i1Var.f375519f;
        java.lang.String str = i1Var.f375518e;
        hr1.a aVar = i1Var.P;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(aVar);
        java.lang.String field_identityName = aVar.f66209x4f67f8e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_identityName, "field_identityName");
        hr1.a aVar2 = i1Var.P;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(aVar2);
        iVar.d(i17, str, field_identityName, aVar2.f66210x4f9943d, true, new ir1.u0(i1Var));
        yj0.a.h(this, "com/tencent/mm/plugin/brandservice/conversation/ui/BizFansHalfScreenProfileView$bindUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
