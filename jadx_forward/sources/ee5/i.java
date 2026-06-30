package ee5;

/* loaded from: classes5.dex */
public final class i implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ee5.j f333454d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 f333455e;

    public i(ee5.j jVar, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var) {
        this.f333454d = jVar;
        this.f333455e = z2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/search/multi/uic/FTSMultiImageQueryOpenUIC$showSettingPermissionDialog$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        de5.a.f310929a.g(105);
        ee5.j jVar = this.f333454d;
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(jVar.m158354x19263085()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bmb, (android.view.ViewGroup) null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2(jVar.m158354x19263085(), 0, 0, false, false);
        ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.czv)).setTextColor(jVar.m158355x7444d5ad(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c));
        ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.cza)).setTextColor(jVar.m158355x7444d5ad(com.p314xaae8f345.mm.R.C30859x5a72f63.f77645xad7ef2c));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) inflate.findViewById(com.p314xaae8f345.mm.R.id.cz7);
        c22699x3dcdb352.m82040x7541828(jVar.m158355x7444d5ad(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
        z2Var.j(inflate);
        z2Var.C();
        c22699x3dcdb352.setOnClickListener(new ee5.e(z2Var, jVar));
        this.f333455e.B();
        yj0.a.h(this, "com/tencent/mm/ui/chatting/search/multi/uic/FTSMultiImageQueryOpenUIC$showSettingPermissionDialog$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
