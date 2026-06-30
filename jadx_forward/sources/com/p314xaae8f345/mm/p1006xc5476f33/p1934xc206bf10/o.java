package com.p314xaae8f345.mm.p1006xc5476f33.p1934xc206bf10;

/* loaded from: classes13.dex */
class o implements com.p314xaae8f345.mm.p794xb0fa9b5e.k0 {
    private o() {
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.k0
    /* renamed from: invoke */
    public java.lang.Object mo32082xb9724478(java.lang.Object obj) {
        android.content.Intent intent = (android.content.Intent) obj;
        fo3.s sVar = fo3.s.INSTANCE;
        android.os.Bundle bundle = new android.os.Bundle();
        try {
            sVar.Ig();
            byte[] g17 = com.p314xaae8f345.mm.p975xc206bf10.C11193xebe3852e.g(intent);
            if (g17 == null) {
                g17 = new byte[0];
            }
            bundle.putByteArray("result", g17);
        } finally {
            try {
                return bundle;
            } finally {
            }
        }
        return bundle;
    }
}
