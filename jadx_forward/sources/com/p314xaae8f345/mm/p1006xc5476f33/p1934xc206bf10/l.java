package com.p314xaae8f345.mm.p1006xc5476f33.p1934xc206bf10;

/* loaded from: classes8.dex */
class l implements com.p314xaae8f345.mm.p794xb0fa9b5e.k0 {
    private l() {
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.k0
    /* renamed from: invoke */
    public java.lang.Object mo32082xb9724478(java.lang.Object obj) {
        android.os.Bundle bundle = new android.os.Bundle();
        try {
            bundle.putParcelableArrayList("result", lo3.g.INSTANCE.h());
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NormsgSourceImpl", "run cssfv error:" + th6);
        }
        return bundle;
    }
}
