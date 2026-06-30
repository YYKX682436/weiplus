package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1131x97eed868;

@mk0.a
/* loaded from: classes13.dex */
final class i implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {
    private i() {
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1131x97eed868.d dVar;
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1131x97eed868.e eVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1131x97eed868.e.f165621b;
        java.lang.String m46222x9616526c = ((com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d) obj).m46222x9616526c();
        eVar.getClass();
        if (!android.text.TextUtils.isEmpty(m46222x9616526c)) {
            synchronized (eVar.f165622a) {
                dVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1131x97eed868.d) eVar.f165622a.get(m46222x9616526c);
            }
            if (dVar == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandKeepAliveMMSavior", "unbindKeepAliveService not had connector of %s", m46222x9616526c);
            } else {
                synchronized (dVar) {
                    z17 = true;
                    dVar.f165618a--;
                    dVar.f165618a = java.lang.Math.max(0, dVar.f165618a);
                    if (dVar.f165618a != 0) {
                        z17 = false;
                    }
                }
                if (z17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandKeepAliveMMSavior.KeepAliveServiceConnector", "unbindKeepAliveService, processName:%s", dVar.f165619b);
                    try {
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.unbindService(dVar.f165620c);
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandKeepAliveMMSavior.KeepAliveServiceConnector", "unbindKeepAliveService exp:%s", e17);
                    }
                }
            }
        }
        try {
            rVar.a(com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10757xa20383b0.f149940d);
        } catch (java.lang.SecurityException unused) {
        }
    }
}
