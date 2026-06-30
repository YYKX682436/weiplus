package w41;

/* loaded from: classes4.dex */
public final class o implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f524407d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k41.g0 f524408e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 f524409f;

    public o(android.view.ViewGroup viewGroup, k41.g0 g0Var, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var) {
        this.f524407d = viewGroup;
        this.f524408e = g0Var;
        this.f524409f = y1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/openim/ui/dialog/OpenIMKefuLocReqDialog$initDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.view.ViewGroup viewGroup = this.f524407d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.f(viewGroup.getContext(), viewGroup.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), false, 3, null);
        android.content.Context context = viewGroup.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        w41.n nVar = new w41.n(f17, this.f524409f);
        k41.g0 contact = this.f524408e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contact, "contact");
        l41.y1 y1Var = l41.y1.f397503a;
        java.lang.String str = contact.f68613xdec927b;
        if (str == null) {
            str = "";
        }
        y1Var.a(context, str, false, new l41.n1(nVar, contact, context));
        yj0.a.h(this, "com/tencent/mm/openim/ui/dialog/OpenIMKefuLocReqDialog$initDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
