package com.p314xaae8f345.mm.p669x38b6e557;

/* loaded from: classes5.dex */
public class l1 implements com.p314xaae8f345.mm.p669x38b6e557.g5 {
    @Override // com.p314xaae8f345.mm.p669x38b6e557.g5
    public void a(android.content.Intent intent) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            try {
                java.lang.String stringExtra = intent.getStringExtra("packageId");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Shell", "packageId = " + stringExtra);
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.l0 h17 = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.u.f174270a.d().h(java.lang.Long.parseLong(stringExtra));
                if (h17 != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Shell", "packageInfo.getFirstBackupStartTime = " + h17.f297422f);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Shell", "packageInfo.getLastBackupStopOrErrorTime = " + h17.f297421e);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Shell", "packageInfo.getIsDeleted = " + h17.f297424h);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Shell", "packageInfo is null");
                }
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Shell", "packageInfo error = " + th6.getMessage());
            }
        }
    }
}
