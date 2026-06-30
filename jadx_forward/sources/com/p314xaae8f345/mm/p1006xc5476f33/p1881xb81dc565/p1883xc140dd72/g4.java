package com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72;

/* loaded from: classes7.dex */
class g4 implements com.p314xaae8f345.mm.p794xb0fa9b5e.k0 {
    private g4() {
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.k0
    /* renamed from: invoke */
    public java.lang.Object mo32082xb9724478(java.lang.Object obj) {
        android.os.Bundle bundle = new android.os.Bundle();
        boolean z17 = iq.b.H() || vq4.p0.c() || vq4.p0.d();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Multitalk.ILinkService", "steve: check voip state:%b,%b,%b", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(iq.b.H()), java.lang.Boolean.valueOf(vq4.p0.c()), java.lang.Boolean.valueOf(vq4.p0.d()));
        bundle.putBoolean("is_in_voip", z17);
        return bundle;
    }
}
