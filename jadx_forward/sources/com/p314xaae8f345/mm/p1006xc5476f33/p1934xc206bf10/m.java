package com.p314xaae8f345.mm.p1006xc5476f33.p1934xc206bf10;

/* loaded from: classes13.dex */
class m implements com.p314xaae8f345.mm.p794xb0fa9b5e.k0 {
    private m() {
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.k0
    /* renamed from: invoke */
    public java.lang.Object mo32082xb9724478(java.lang.Object obj) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        fo3.s sVar = fo3.s.INSTANCE;
        android.os.Bundle bundle2 = new android.os.Bundle();
        try {
            sVar.Ig();
            bundle.setClassLoader(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getClassLoader());
            long j17 = bundle.getLong("a_k_r_t");
            com.p314xaae8f345.mm.p1006xc5476f33.p1934xc206bf10.api.C16753xd2202397 c16753xd2202397 = (com.p314xaae8f345.mm.p1006xc5476f33.p1934xc206bf10.api.C16753xd2202397) bundle.getParcelable("a_k_c_s");
            com.p314xaae8f345.mm.p1006xc5476f33.p1934xc206bf10.api.C16751xb808cbcb c16751xb808cbcb = (com.p314xaae8f345.mm.p1006xc5476f33.p1934xc206bf10.api.C16751xb808cbcb) bundle.getParcelable("a_k_a_m_s");
            byte[] c17 = com.p314xaae8f345.mm.p975xc206bf10.C11193xebe3852e.c(j17, c16753xd2202397.c(), c16751xb808cbcb.b(), bundle.getLong("a_k_pr_r_t"), ((com.p314xaae8f345.mm.p1006xc5476f33.p1934xc206bf10.api.C16753xd2202397) bundle.getParcelable("a_k_pr_c_s")).c(), ((com.p314xaae8f345.mm.p1006xc5476f33.p1934xc206bf10.api.C16751xb808cbcb) bundle.getParcelable("a_k_pr_a_m_s")).b());
            if (c17 == null) {
                c17 = new byte[0];
            }
            bundle2.putByteArray("result", c17);
        } finally {
            try {
                return bundle2;
            } finally {
            }
        }
        return bundle2;
    }
}
