package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt;

/* loaded from: classes9.dex */
public class w5 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hs4.d f259957d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19020x7623dbfb f259958e;

    public w5(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19020x7623dbfb activityC19020x7623dbfb, hs4.d dVar) {
        this.f259958e = activityC19020x7623dbfb;
        this.f259957d = dVar;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        hs4.d dVar = this.f259957d;
        if (dVar == null) {
            return;
        }
        dVar.c();
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19020x7623dbfb activityC19020x7623dbfb = this.f259958e;
        int i18 = activityC19020x7623dbfb.S;
        boolean z17 = true;
        if (i18 == 1 || i18 == 2) {
            activityC19020x7623dbfb.getClass();
            android.os.Bundle bundle = new android.os.Bundle();
            com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 c19760x34448d56 = (com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56) activityC19020x7623dbfb.m83105x7498fe14().get("key_pay_info");
            if (c19760x34448d56 == null) {
                c19760x34448d56 = new com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56();
                c19760x34448d56.f273647m = "";
                if (activityC19020x7623dbfb.S == 1) {
                    if (activityC19020x7623dbfb.Z == 0) {
                        c19760x34448d56.f273642e = 45;
                    } else {
                        c19760x34448d56.f273642e = 52;
                    }
                } else if (activityC19020x7623dbfb.Z == 0) {
                    c19760x34448d56.f273642e = 51;
                } else {
                    c19760x34448d56.f273642e = 53;
                }
            }
            bundle.putParcelable("key_pay_info", c19760x34448d56);
            if (activityC19020x7623dbfb.S == 1) {
                if (activityC19020x7623dbfb.Z == 0) {
                    bundle.putInt("key_scene", 45);
                } else {
                    bundle.putInt("key_scene", 52);
                }
                bundle.putInt("key_bind_scene", 16);
            } else {
                if (activityC19020x7623dbfb.Z == 0) {
                    bundle.putInt("key_scene", 51);
                } else {
                    bundle.putInt("key_scene", 53);
                }
                bundle.putInt("key_bind_scene", 17);
            }
            bundle.putBoolean("key_need_bind_response", true);
            bundle.putInt("key_req_bind_scene", 0);
            bundle.putBoolean("key_is_bind_bankcard", true);
            if (com.p314xaae8f345.mm.p2802xd031a825.b.a().b()) {
                activityC19020x7623dbfb.Q1.mo48813x58998cd();
                com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.n1.d(6, bundle.getInt("key_bind_scene"));
                com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.i1.b(bundle.getInt("key_bind_scene"));
                ((h45.q) i95.n0.c(h45.q.class)).mo24800xa4a1f2e8(activityC19020x7623dbfb, bundle);
            } else {
                z17 = false;
            }
            if (z17) {
                return;
            }
            com.p314xaae8f345.mm.p2802xd031a825.a.j(activityC19020x7623dbfb, com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.e.class, bundle, new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.a6(activityC19020x7623dbfb));
        }
    }
}
