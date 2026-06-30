package nc5;

/* loaded from: classes10.dex */
public final class l implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nc5.o f417741d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 f417742e;

    public l(nc5.o oVar, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var) {
        this.f417741d = oVar;
        this.f417742e = z2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/gallery/query/MediaHistoryQueryHeaderUI$showSettingPermissionDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ((c61.ec) ((qk.x7) i95.n0.c(qk.x7.class))).bj(true);
        nc5.o oVar = this.f417741d;
        oVar.f417749d = true;
        oVar.f417754i = true;
        this.f417742e.B();
        ((c61.ec) ((qk.x7) i95.n0.c(qk.x7.class))).Di(1);
        ((c61.ec) ((qk.x7) i95.n0.c(qk.x7.class))).Bi(102);
        oVar.f417756k = p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), null, null, new nc5.k(oVar, null), 3, null);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/gallery/query/MediaHistoryQueryHeaderUI$showSettingPermissionDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
