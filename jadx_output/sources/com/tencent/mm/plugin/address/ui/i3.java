package com.tencent.mm.plugin.address.ui;

/* loaded from: classes12.dex */
public class i3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s71.b f74561d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.address.ui.n3 f74562e;

    public i3(com.tencent.mm.plugin.address.ui.n3 n3Var, s71.b bVar) {
        this.f74562e = n3Var;
        this.f74561d = bVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/address/ui/WalletSelectAddrUI$AddressesAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.util.HashMap hashMap = new java.util.HashMap();
        com.tencent.mm.plugin.address.ui.n3 n3Var = this.f74562e;
        hashMap.put("enter_scene_address", java.lang.Integer.valueOf(n3Var.f74605g.f74503v));
        hashMap.put("page_state", java.lang.Integer.valueOf(n3Var.f74605g.f74505x ? 2 : 1));
        hashMap.put("oper_enter_type", 1);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Gj(50135, "copy_address", hashMap, 33328);
        com.tencent.mm.plugin.address.ui.WalletSelectAddrUI.T6(n3Var.f74605g, this.f74561d);
        yj0.a.h(this, "com/tencent/mm/plugin/address/ui/WalletSelectAddrUI$AddressesAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
