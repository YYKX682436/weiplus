package com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae;

/* loaded from: classes15.dex */
public class f0 extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.C12937x3f78629e f175278a;

    public f0(com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.C12937x3f78629e c12937x3f78629e) {
        this.f175278a = c12937x3f78629e;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.y5 y5Var;
        ((kt.e) ((lt.m0) i95.n0.c(lt.m0.class))).getClass();
        if (java.lang.System.currentTimeMillis() - com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.y5.f270694i >= 600000) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppUtil", "hy: get comm model time expired");
            y5Var = null;
        } else {
            y5Var = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.y5.f270693h;
        }
        if (y5Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WXCommProvider", "hy: has wxcomm query request. start to continue requesting");
            android.database.Cursor b17 = this.f175278a.b(y5Var.f270695a, y5Var.f270696b, y5Var.f270697c, y5Var.f270698d, y5Var.f270699e, y5Var.f270700f, y5Var.f270701g);
            if (b17 != null) {
                b17.close();
            }
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.y5.f270693h = null;
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.y5.f270694i = -1L;
        }
    }
}
