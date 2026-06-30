package com.p314xaae8f345.mm.p2470x93e71c27.ui;

/* loaded from: classes.dex */
public class k2 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f272416d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.C19650x84c3dde8 f272417e;

    public k2(com.p314xaae8f345.mm.p2470x93e71c27.ui.C19650x84c3dde8 c19650x84c3dde8, java.lang.String str) {
        this.f272417e = c19650x84c3dde8;
        this.f272416d = str;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        java.lang.String str = this.f272416d;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.C19650x84c3dde8 c19650x84c3dde8 = this.f272417e;
        if (i17 != 0) {
            if (i17 == 1) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.b0.d(c19650x84c3dde8.getContext(), null, str, null);
                dp.a.m125854x26a183b(c19650x84c3dde8.getContext(), c19650x84c3dde8.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571894st), 0).show();
                return;
            }
            return;
        }
        android.content.Intent intent = new android.content.Intent("android.intent.action.DIAL");
        intent.setFlags(268435456);
        intent.setData(android.net.Uri.parse("tel:" + str));
        try {
            android.content.Context context = c19650x84c3dde8.getContext();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/ProfileMobilePhoneView$3", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/pluginsdk/ui/ProfileMobilePhoneView$3", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } catch (android.content.ActivityNotFoundException unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ProfileMobilePhoneView", "ActivityNotFoundException!");
        }
    }
}
