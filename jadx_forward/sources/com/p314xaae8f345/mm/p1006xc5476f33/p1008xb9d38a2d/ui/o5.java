package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* loaded from: classes14.dex */
public class o5 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11413x78c85cdf f155618d;

    public o5(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11413x78c85cdf activityC11413x78c85cdf) {
        this.f155618d = activityC11413x78c85cdf;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        java.lang.String str;
        int itemId = menuItem.getItemId();
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11413x78c85cdf activityC11413x78c85cdf = this.f155618d;
        if (itemId == 7009) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11413x78c85cdf.k7(activityC11413x78c85cdf, activityC11413x78c85cdf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l8k) + com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d());
            v61.d.f(1);
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
            com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11413x78c85cdf.k7(activityC11413x78c85cdf, activityC11413x78c85cdf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.lse, d17, str2, e17, str));
            v61.d.f(1);
            return;
        }
        if (itemId == 7012) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11413x78c85cdf.k7(activityC11413x78c85cdf, activityC11413x78c85cdf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ff_, com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d()));
            v61.d.g("frozen_account_login", 1);
            v61.d.f(1);
            return;
        }
        switch (itemId) {
            case com.p314xaae8f345.p373xbe494963.C3727x6f6b8f94.f14497x624e96ad /* 7002 */:
                if ((activityC11413x78c85cdf instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11419x78fe9e98) || (activityC11413x78c85cdf instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11435xdfb0be4)) {
                    int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11413x78c85cdf.f154856y0;
                    activityC11413x78c85cdf.getClass();
                    v61.d.g("login_other_account", 1);
                }
                int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11413x78c85cdf.f154856y0;
                activityC11413x78c85cdf.l7();
                v61.d.f(1);
                return;
            case 7003:
                int i27 = com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11413x78c85cdf.f154856y0;
                activityC11413x78c85cdf.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11404xb70180da.f154810p.a(activityC11413x78c85cdf, new android.content.Intent(activityC11413x78c85cdf, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11461x47892174.class));
                v61.d.f(1);
                return;
            case 7004:
                com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11413x78c85cdf.T6(activityC11413x78c85cdf);
                v61.d.f(1);
                v61.d.g("security_center_login", 1);
                return;
            default:
                return;
        }
    }
}
