package com.p314xaae8f345.mm.p1006xc5476f33.p1934xc206bf10;

/* loaded from: classes13.dex */
class p implements com.p314xaae8f345.mm.p794xb0fa9b5e.k0 {
    private p() {
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.k0
    /* renamed from: invoke */
    public java.lang.Object mo32082xb9724478(java.lang.Object obj) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        fo3.s sVar = fo3.s.INSTANCE;
        android.os.Bundle bundle2 = new android.os.Bundle();
        try {
            sVar.Ig();
            byte[] i17 = com.p314xaae8f345.mm.p975xc206bf10.C11193xebe3852e.i(bundle.getInt("a_k_d_i"), bundle.getString("a_k_d_n"), bundle.getLong("a_k_t"), bundle.getInt("a_k_d_e_t"), bundle.getString("a_k_d_o_p"));
            if (i17 == null) {
                i17 = new byte[0];
            }
            bundle2.putByteArray("result", i17);
        } finally {
            try {
                return bundle2;
            } finally {
            }
        }
        return bundle2;
    }
}
