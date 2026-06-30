package com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui;

/* loaded from: classes12.dex */
public class i3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s71.b f156094d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.n3 f156095e;

    public i3(com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.n3 n3Var, s71.b bVar) {
        this.f156095e = n3Var;
        this.f156094d = bVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/address/ui/WalletSelectAddrUI$AddressesAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.util.HashMap hashMap = new java.util.HashMap();
        com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.n3 n3Var = this.f156095e;
        hashMap.put("enter_scene_address", java.lang.Integer.valueOf(n3Var.f156138g.f156036v));
        hashMap.put("page_state", java.lang.Integer.valueOf(n3Var.f156138g.f156038x ? 2 : 1));
        hashMap.put("oper_enter_type", 1);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Gj(50135, "copy_address", hashMap, 33328);
        com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ActivityC11497x3bc191a.T6(n3Var.f156138g, this.f156094d);
        yj0.a.h(this, "com/tencent/mm/plugin/address/ui/WalletSelectAddrUI$AddressesAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
