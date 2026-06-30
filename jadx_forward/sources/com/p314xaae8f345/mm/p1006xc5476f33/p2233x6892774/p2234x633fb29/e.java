package com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29;

/* loaded from: classes12.dex */
public class e implements e75.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.f f253313d;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.f fVar) {
        this.f253313d = fVar;
    }

    @Override // e75.a
    /* renamed from: onChanged */
    public void mo2231x7bb163d5(java.lang.Object obj) {
        java.lang.Integer num = (java.lang.Integer) obj;
        int intValue = num.intValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.f fVar = this.f253313d;
        if (intValue != 1 && intValue != 2 && intValue != 3) {
            if ((intValue == 4 || intValue == 5) && com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.c0.b()) {
                long b17 = fVar.b();
                if (fVar.f253315b == 0) {
                    fVar.f253315b = com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.z.f253359a.a("KEY_LAST_UPLOAD_EXT_API_STEP_TIME_LONG", 0L);
                }
                boolean d17 = com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.c0.d(fVar.f253315b, c01.id.c());
                boolean c17 = com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.c0.c(fVar.a(), b17);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sport.ExtApiStepManager", "upload step %d %d result %b timeCondition %b stepCountCondition %b", num, java.lang.Long.valueOf(b17), java.lang.Boolean.valueOf((c17 || d17) ? fVar.c(b17) : false), java.lang.Boolean.valueOf(d17), java.lang.Boolean.valueOf(c17));
                return;
            }
            return;
        }
        if (com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.c0.b()) {
            long b18 = fVar.b();
            if (num.intValue() == 1) {
                r2 = fVar.c(b18);
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5401xe4b21f18 c5401xe4b21f18 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5401xe4b21f18();
                c5401xe4b21f18.f135744g.f89522a = 1;
                c5401xe4b21f18.b(android.os.Looper.getMainLooper());
            } else if (com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.c0.c(fVar.a(), b18)) {
                r2 = fVar.c(b18);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sport.ExtApiStepManager", "upload step %d %d %b", num, java.lang.Long.valueOf(b18), java.lang.Boolean.valueOf(r2));
        }
    }
}
