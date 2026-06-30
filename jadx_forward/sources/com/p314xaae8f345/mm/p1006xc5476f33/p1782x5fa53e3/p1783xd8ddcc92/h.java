package com.p314xaae8f345.mm.p1006xc5476f33.p1782x5fa53e3.p1783xd8ddcc92;

/* loaded from: classes8.dex */
public final class h implements com.p314xaae8f345.mm.p1006xc5476f33.p1782x5fa53e3.p1783xd8ddcc92.a {
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1782x5fa53e3.p1783xd8ddcc92.a
    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetworkChangeSubProcessImpl", "startListen: ");
        c(0);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1782x5fa53e3.p1783xd8ddcc92.a
    public void b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetworkChangeSubProcessImpl", "stopListen: ");
        c(1);
    }

    public final void c(int i17) {
        java.lang.String a17 = bm5.f1.a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetworkChangeSubProcessImpl", "hy: %s operate network change: %d", a17, java.lang.Integer.valueOf(i17));
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("from_process", a17);
        bundle.putInt("opcode", i17);
        com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, bundle, com.p314xaae8f345.mm.p1006xc5476f33.p1782x5fa53e3.p1783xd8ddcc92.f.class, new com.p314xaae8f345.mm.p1006xc5476f33.p1782x5fa53e3.p1783xd8ddcc92.g(a17));
    }
}
