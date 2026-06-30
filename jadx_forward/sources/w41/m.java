package w41;

/* loaded from: classes2.dex */
public final class m implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f524404d;

    public m(android.view.ViewGroup viewGroup) {
        this.f524404d = viewGroup;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/openim/ui/dialog/OpenIMKefuLocReqDialog$initDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Context context = this.f524404d.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1(context);
        y1Var.j(com.p314xaae8f345.mm.R.C30864xbddafb2a.bol);
        ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) y1Var.f293560f.findViewById(com.p314xaae8f345.mm.R.id.aa8)).setOnClickListener(new w41.t(y1Var));
        y1Var.s();
        yj0.a.h(this, "com/tencent/mm/openim/ui/dialog/OpenIMKefuLocReqDialog$initDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
