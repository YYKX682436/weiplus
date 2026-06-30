package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* loaded from: classes11.dex */
public class p0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.AbstractActivityC11397xe10f852e f155636d;

    public p0(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.AbstractActivityC11397xe10f852e abstractActivityC11397xe10f852e) {
        this.f155636d = abstractActivityC11397xe10f852e;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        java.lang.String str;
        int itemId = menuItem.getItemId();
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.AbstractActivityC11397xe10f852e abstractActivityC11397xe10f852e = this.f155636d;
        if (itemId == 7009) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.AbstractActivityC11397xe10f852e.e7(abstractActivityC11397xe10f852e, abstractActivityC11397xe10f852e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l8k) + com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d());
            return;
        }
        if (itemId == 7010) {
            java.lang.String d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d();
            java.lang.String str2 = wo.w0.k() + "_" + java.lang.System.currentTimeMillis();
            java.lang.String e17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.e();
            u11.a a17 = u11.b.a(e17);
            if (a17 != null) {
                e17 = a17.f505261b;
                str = a17.f505262c;
            } else {
                str = "";
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.AbstractActivityC11397xe10f852e.e7(abstractActivityC11397xe10f852e, abstractActivityC11397xe10f852e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.lse, d17, str2, e17, str));
            return;
        }
        if (itemId == 7012) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.AbstractActivityC11397xe10f852e.e7(abstractActivityC11397xe10f852e, abstractActivityC11397xe10f852e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ff_, com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d()));
            return;
        }
        switch (itemId) {
            case com.p314xaae8f345.p373xbe494963.C3727x6f6b8f94.f14497x624e96ad /* 7002 */:
                abstractActivityC11397xe10f852e.I[4] = 1;
                android.content.Intent intent = new android.content.Intent(abstractActivityC11397xe10f852e, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11453xa58e34bc.class);
                intent.putExtra("mobile_input_purpose", 1);
                int[] iArr = new int[5];
                iArr[4] = 1;
                intent.putExtra("kv_report_login_method_data", iArr);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(abstractActivityC11397xe10f852e, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/BaseLoginVoiceUI", "switchUser", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                abstractActivityC11397xe10f852e.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(abstractActivityC11397xe10f852e, "com/tencent/mm/plugin/account/ui/BaseLoginVoiceUI", "switchUser", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                return;
            case 7003:
                int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.AbstractActivityC11397xe10f852e.L;
                abstractActivityC11397xe10f852e.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11404xb70180da.f154810p.a(abstractActivityC11397xe10f852e, new android.content.Intent(abstractActivityC11397xe10f852e, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11461x47892174.class));
                return;
            case 7004:
                com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.AbstractActivityC11397xe10f852e.U6(abstractActivityC11397xe10f852e);
                return;
            default:
                return;
        }
    }
}
