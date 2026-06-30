package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c;

/* loaded from: classes7.dex */
class m implements com.p314xaae8f345.mm.p794xb0fa9b5e.k0 {
    private m() {
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.k0
    /* renamed from: invoke */
    public java.lang.Object mo32082xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.C11726x8e5714cb c11726x8e5714cb = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.C11726x8e5714cb) obj;
        if (c11726x8e5714cb != null) {
            java.lang.String str = c11726x8e5714cb.f158318d;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                try {
                    return new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10750x9556b48c(((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.s1) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.s1.class)).z6(str, c11726x8e5714cb.f158319e));
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.AppBrandBackgroundFetchDataStorageIPC", "DeleteCall fail", e17);
                    return new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10750x9556b48c(false);
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.AppBrandBackgroundFetchDataStorageIPC", "DeleteCall:data or username is null");
        return new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10750x9556b48c(false);
    }
}
