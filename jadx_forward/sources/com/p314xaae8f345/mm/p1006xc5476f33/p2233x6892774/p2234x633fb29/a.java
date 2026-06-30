package com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29;

/* loaded from: classes12.dex */
public class a implements e75.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.d f253303d;

    public a(com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.d dVar) {
        this.f253303d = dVar;
    }

    @Override // e75.a
    /* renamed from: onChanged */
    public void mo2231x7bb163d5(java.lang.Object obj) {
        java.lang.Integer num = (java.lang.Integer) obj;
        int intValue = num.intValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.d dVar = this.f253303d;
        if (intValue == 1 || intValue == 2 || intValue == 3) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.t.d();
            dVar.getClass();
            if (com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.c0.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) && com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.c0.e()) {
                dVar.b();
                long a17 = dVar.a();
                if (num.intValue() == 1) {
                    r5 = dVar.d(a17);
                } else {
                    if (dVar.f253311c == 0) {
                        dVar.f253311c = com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.z.f253359a.a("KEY_LAST_UPLOAD_DEVICE_STEP_COUNT_LONG", 0L);
                    }
                    if (com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.c0.c(dVar.f253311c, a17)) {
                        r5 = dVar.d(a17);
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sport.DeviceStepManager", "upload step %d %d %b", num, java.lang.Long.valueOf(a17), java.lang.Boolean.valueOf(r5));
                return;
            }
            return;
        }
        if (intValue == 4 || intValue == 5) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.t.d();
            dVar.getClass();
            if (com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.c0.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) && com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.c0.e()) {
                dVar.b();
                long a18 = dVar.a();
                if (dVar.f253312d == 0) {
                    dVar.f253312d = com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.z.f253359a.a("KEY_LAST_UPLOAD_DEVICE_STEP_TIME_LONG", 0L);
                }
                boolean d17 = com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.c0.d(dVar.f253312d, c01.id.c());
                if (dVar.f253311c == 0) {
                    dVar.f253311c = com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.z.f253359a.a("KEY_LAST_UPLOAD_DEVICE_STEP_COUNT_LONG", 0L);
                }
                boolean c17 = com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.c0.c(dVar.f253311c, a18);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sport.DeviceStepManager", "upload step %d %d result %b timeCondition %b stepCountCondition %b", num, java.lang.Long.valueOf(a18), java.lang.Boolean.valueOf((c17 || d17) ? dVar.d(a18) : false), java.lang.Boolean.valueOf(d17), java.lang.Boolean.valueOf(c17));
            }
        }
    }
}
