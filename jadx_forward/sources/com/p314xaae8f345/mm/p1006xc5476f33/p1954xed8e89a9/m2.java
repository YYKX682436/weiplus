package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9;

/* loaded from: classes.dex */
public final class m2 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f235063d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f235064e;

    public m2(java.lang.String str, android.content.Context context) {
        this.f235063d = str;
        this.f235064e = context;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        java.lang.String str = this.f235063d;
        if (i17 != 0) {
            if (i17 != 1) {
                return;
            }
            android.content.Context context = this.f235064e;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.b0.d(context, null, str, null);
            dp.a.m125854x26a183b(context, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571894st), 0).show();
            return;
        }
        android.content.Intent intent = new android.content.Intent("android.intent.action.DIAL");
        intent.setFlags(268435456);
        intent.setData(android.net.Uri.parse("tel:" + str));
        try {
            android.content.Context context2 = this.f235064e;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context2, arrayList.toArray(), "com/tencent/mm/plugin/profile/ProfileUtilsKt$showBottomSheetCall$2", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context2.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context2, "com/tencent/mm/plugin/profile/ProfileUtilsKt$showBottomSheetCall$2", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } catch (android.content.ActivityNotFoundException unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ProfileMobilePhoneView", "ActivityNotFoundException!");
        }
    }
}
