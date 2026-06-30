package com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui;

/* loaded from: classes12.dex */
public abstract class l3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.n3 f156120d;

    public l3(com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.n3 n3Var) {
        this.f156120d = n3Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/address/ui/WalletSelectAddrUI$AddressesAdapter$Clicklistener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getTag() instanceof s71.b) {
            s71.b bVar = (s71.b) view.getTag();
            java.util.HashMap hashMap = new java.util.HashMap();
            com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.n3 n3Var = this.f156120d;
            hashMap.put("enter_scene_address", java.lang.Integer.valueOf(n3Var.f156138g.f156036v));
            hashMap.put("page_state", java.lang.Integer.valueOf(n3Var.f156138g.f156038x ? 2 : 1));
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("select_address", "view_clk", hashMap, 33328);
            n3Var.f156138g.U6(bVar.f485503d, 1);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/address/ui/WalletSelectAddrUI$AddressesAdapter$Clicklistener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
