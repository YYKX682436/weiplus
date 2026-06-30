package com.p314xaae8f345.mm.p1006xc5476f33.p1782x5fa53e3.p1783xd8ddcc92;

/* loaded from: classes8.dex */
public final class e extends com.p314xaae8f345.mm.p971x6de15a2e.r0 {
    @Override // com.p314xaae8f345.mm.p971x6de15a2e.s0
    /* renamed from: onNetworkChange */
    public void mo8869xde9f63df(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetworkChangeSubProcessImpl", "onNetworkChange() called with: st = " + i17);
        for (java.lang.String str : com.p314xaae8f345.mm.p1006xc5476f33.p1782x5fa53e3.p1783xd8ddcc92.f.f223963d) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
            java.lang.String m40061x1de3608b = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40061x1de3608b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            java.lang.String a17 = bm5.f1.a();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetworkChangeSubProcessImpl", "hy: %s on network changed: %d, changed to %s, %s", a17, java.lang.Integer.valueOf(i17), m40061x1de3608b, str);
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("from_process", a17);
            bundle.putInt("newState", i17);
            com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(str, bundle, com.tencent.mm.plugin.ilink.net_change.f.a.class, new com.p314xaae8f345.mm.p1006xc5476f33.p1782x5fa53e3.p1783xd8ddcc92.d(a17));
        }
    }
}
