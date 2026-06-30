package com.tencent.mm.plugin.account.ui;

/* loaded from: classes11.dex */
public class b9 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.MMFBFriendUI f73745d;

    public b9(com.tencent.mm.plugin.account.ui.MMFBFriendUI mMFBFriendUI) {
        this.f73745d = mMFBFriendUI;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/ui/MMFBFriendUI$4", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.tencent.mm.plugin.account.ui.MMFBFriendUI mMFBFriendUI = this.f73745d;
        r61.e0 e0Var = (r61.e0) mMFBFriendUI.f73452e.getItem(i17 - mMFBFriendUI.f73451d.getHeaderViewsCount());
        int i18 = e0Var.f392845d;
        if (i18 == 100 || i18 == 101) {
            android.content.Intent intent = new android.content.Intent();
            java.lang.String str = e0Var.f392846e;
            if (str == null) {
                str = "";
            }
            intent.putExtra("Contact_User", str);
            java.lang.String str2 = e0Var.f392847f;
            if (str2 == null) {
                str2 = "";
            }
            intent.putExtra("Contact_Nick", str2);
            intent.putExtra("Contact_KFacebookId", e0Var.f392842a);
            java.lang.String str3 = e0Var.f392843b;
            intent.putExtra("Contact_KFacebookName", str3 != null ? str3 : "");
            intent.putExtra("Contact_Scene", 31);
            ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.l(intent, mMFBFriendUI);
        }
        if (e0Var.f392845d == 102) {
            yj0.a.h(this, "com/tencent/mm/plugin/account/ui/MMFBFriendUI$4", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        } else {
            yj0.a.h(this, "com/tencent/mm/plugin/account/ui/MMFBFriendUI$4", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        }
    }
}
