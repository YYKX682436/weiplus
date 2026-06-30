package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1958xe36c918b;

/* loaded from: classes.dex */
public final class l1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f235627d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1958xe36c918b.m1 f235628e;

    public l1(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1958xe36c918b.m1 m1Var) {
        this.f235627d = str;
        this.f235628e = m1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/mod/components_wx_contact/PhonePreviewUIWxContact$loadCustomView$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent("android.intent.action.DIAL");
        intent.setFlags(268435456);
        intent.setData(android.net.Uri.parse("tel:" + this.f235627d));
        try {
            android.app.Activity m80379x76847179 = this.f235628e.m80379x76847179();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(m80379x76847179, arrayList2.toArray(), "com/tencent/mm/plugin/profile/ui/mod/components_wx_contact/PhonePreviewUIWxContact$loadCustomView$1$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            m80379x76847179.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(m80379x76847179, "com/tencent/mm/plugin/profile/ui/mod/components_wx_contact/PhonePreviewUIWxContact$loadCustomView$1$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } catch (android.content.ActivityNotFoundException unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ProfileMobilePhoneView", "ActivityNotFoundException!");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/mod/components_wx_contact/PhonePreviewUIWxContact$loadCustomView$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
