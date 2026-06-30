package com.p314xaae8f345.mm.p1006xc5476f33.p1934xc206bf10;

/* loaded from: classes13.dex */
class n implements com.p314xaae8f345.mm.p794xb0fa9b5e.k0 {
    private n() {
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.k0
    /* renamed from: invoke */
    public java.lang.Object mo32082xb9724478(java.lang.Object obj) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        fo3.s sVar = fo3.s.INSTANCE;
        android.os.Bundle bundle2 = new android.os.Bundle();
        try {
            sVar.Ig();
            byte[] byteArray = bundle.getByteArray("a_k_a_r_i_f_o");
            if (byteArray != null) {
                byte[] h17 = com.p314xaae8f345.mm.p975xc206bf10.C11193xebe3852e.h(byteArray);
                if (h17 == null) {
                    h17 = new byte[0];
                }
                bundle2.putByteArray("result", h17);
            }
        } finally {
            try {
                return bundle2;
            } finally {
            }
        }
        return bundle2;
    }
}
