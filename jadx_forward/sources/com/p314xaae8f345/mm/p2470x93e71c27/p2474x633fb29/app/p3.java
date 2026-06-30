package com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app;

/* loaded from: classes12.dex */
public final class p3 implements com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.h3 {

    /* renamed from: d, reason: collision with root package name */
    public final lt.o0 f270565d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f270566e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f270567f;

    public p3(android.content.Context context, lt.o0 o0Var) {
        this.f270566e = context;
        this.f270565d = o0Var;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.h3
    public void a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u3 u3Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LoadAppInfoAfterLogin", "OnScenEnd, errType = %d, errCode = %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        zo3.p.Bi().a(7, this);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var2 = this.f270567f;
        if (u3Var2 != null && u3Var2.isShowing()) {
            this.f270567f.dismiss();
            this.f270567f = null;
        }
        lt.o0 o0Var = this.f270565d;
        if (o0Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11470xc22f6d8b activityC11470xc22f6d8b = ((com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.li) o0Var).f155554a.f155581a;
            int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11470xc22f6d8b.f155193v;
            activityC11470xc22f6d8b.W6(-1);
        }
        android.content.SharedPreferences d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.d();
        if (d17 != null) {
            d17.edit().putString("key_app_ids_registion_while_not_login", "").commit();
        }
    }
}
