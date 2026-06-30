package nc5;

/* loaded from: classes5.dex */
public final class n implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nc5.o f417744d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 f417745e;

    public n(nc5.o oVar, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var) {
        this.f417744d = oVar;
        this.f417745e = z2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/gallery/query/MediaHistoryQueryHeaderUI$showSettingPermissionDialog$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        nc5.o oVar = this.f417744d;
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(oVar.f417746a).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bmb, (android.view.ViewGroup) null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2(oVar.f417746a, 0, 0, false, true);
        z2Var.j(inflate);
        z2Var.C();
        ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) inflate.findViewById(com.p314xaae8f345.mm.R.id.cz7)).setOnClickListener(new nc5.i(z2Var, oVar));
        this.f417745e.B();
        ((c61.ec) ((qk.x7) i95.n0.c(qk.x7.class))).Bi(105);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/gallery/query/MediaHistoryQueryHeaderUI$showSettingPermissionDialog$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
