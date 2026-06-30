package com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.p799xab215833;

/* loaded from: classes8.dex */
class a implements com.p314xaae8f345.mm.p794xb0fa9b5e.k0 {
    private a() {
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.k0
    /* renamed from: invoke */
    public java.lang.Object mo32082xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d c10756x2a5d7b2d = (com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d) obj;
        if (!gm0.j1.i().f354741a.f354832d || !gm0.j1.b().f354787q) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.IPCInvokeTask_GetABTestItem", "kernel or account not ready.");
            return null;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.c z07 = com.p314xaae8f345.mm.p939x633fb29.p941xf36549d3.z.Ai().z0(c10756x2a5d7b2d.f149939d);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("layerId", z07.f66192x72127c07);
        bundle.putString("business", z07.f66189xd967c965);
        bundle.putString("expId", z07.f66191x29106093);
        bundle.putString("rawXML", z07.f66195xde9f9b4);
        bundle.putLong("startTime", z07.f66197x1bb3b54a);
        bundle.putLong("endTime", z07.f66190x14c61803);
        bundle.putLong("sequence", z07.f66196x6e338166);
        bundle.putInt("prioritylevel", z07.f66194xac21bddb);
        bundle.putBoolean("needReport", z07.f66193x672cb5cf);
        return bundle;
    }
}
