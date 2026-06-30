package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1958xe36c918b;

/* loaded from: classes.dex */
public final class k1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f235622d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1958xe36c918b.m1 f235623e;

    public k1(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1958xe36c918b.m1 m1Var) {
        this.f235622d = str;
        this.f235623e = m1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/mod/components_wx_contact/PhonePreviewUIWxContact$loadCustomView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("copy phone num, size: ");
        java.lang.String str = this.f235622d;
        sb6.append(str.length());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PhonePreviewUI", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1958xe36c918b.m1 m1Var = this.f235623e;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b0.d(m1Var.m80379x76847179(), null, str, null);
        android.app.Activity m80379x76847179 = m1Var.m80379x76847179();
        int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(m80379x76847179);
        e4Var.d(com.p314xaae8f345.mm.R.C30867xcad56011.f571894st);
        e4Var.f293312f = false;
        e4Var.c();
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/mod/components_wx_contact/PhonePreviewUIWxContact$loadCustomView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
