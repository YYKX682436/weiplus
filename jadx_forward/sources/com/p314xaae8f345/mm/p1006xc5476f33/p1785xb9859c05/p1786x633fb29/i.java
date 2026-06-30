package com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29;

/* loaded from: classes8.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f224002a;

    static {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        f224002a = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5647xda897aba>(a0Var) { // from class: com.tencent.mm.plugin.ipcall.model.IPCallAddressUpdater$1
            {
                this.f39173x3fe91575 = -1320342326;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5647xda897aba c5647xda897aba) {
                if (!(c5647xda897aba instanceof com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5647xda897aba)) {
                    return false;
                }
                s75.d.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.h(this), "IPCall_SyncAddressBook");
                return false;
            }
        };
    }

    public static void a(long j17) {
        android.database.Cursor y07 = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Vi().y0(j17);
        try {
            if (y07 != null) {
                try {
                    if (y07.moveToFirst()) {
                        while (!y07.isAfterLast()) {
                            s83.l lVar = new s83.l();
                            lVar.mo9015xbf5d97fd(y07);
                            lVar.f68172xcebea32a = -1L;
                            lVar.f68175x5d4904c3 = -1;
                            com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Vi().z0(lVar);
                            y07.moveToNext();
                        }
                    }
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.IPCallAddressUpdater", "updateDeleteAddressRecord error: %s", e17.getMessage());
                }
            }
            if (y07 == null) {
            }
        } finally {
            y07.close();
        }
    }
}
