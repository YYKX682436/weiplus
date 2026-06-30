package com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae;

/* loaded from: classes8.dex */
public class g1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f175282d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.ActivityC12947x60ff0ada f175283e;

    public g1(com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.ActivityC12947x60ff0ada activityC12947x60ff0ada, android.content.Intent intent) {
        this.f175283e = activityC12947x60ff0ada;
        this.f175282d = intent;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WXPayEntryActivity", "postLogin, cross platform cashier is paying");
        android.content.Intent intent = this.f175282d;
        java.lang.String l17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.l(intent, com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.InterfaceC11224x4860a6b.f32760x1a7d3e8);
        java.lang.String l18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.l(intent, "_wxapi_payreq_prepayid");
        java.lang.String l19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.l(intent, "_wxapi_payreq_partnerid");
        if (l17 == null) {
            l17 = "";
        }
        if (l19 == null) {
            l19 = "";
        }
        if (l18 == null) {
            l18 = "";
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(36486, "9", "9", "", "", "apppay", l17, l19, l18);
        this.f175283e.finish();
    }
}
