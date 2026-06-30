package com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33;

/* loaded from: classes10.dex */
public final class i0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16539x811795fe f230568d;

    public i0(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16539x811795fe c16539x811795fe) {
        this.f230568d = c16539x811795fe;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16539x811795fe c16539x811795fe = this.f230568d;
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.j a17 = c16539x811795fe.f230435u.a();
            c16539x811795fe.f230422e = a17.mo66866x37a7fa50();
            c16539x811795fe.f230435u.c(a17);
            z17 = true;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("RecyclerThumbSeekBar", e17, "Try to init fetcher error : %s", e17.getMessage());
            z17 = false;
        }
        if (!z17) {
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16539x811795fe.B;
            c16539x811795fe.getClass();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.l0(c16539x811795fe));
        } else {
            int i18 = c16539x811795fe.f230422e;
            if (i18 > 0) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.m0(c16539x811795fe));
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("RecyclerThumbSeekBar", "RecyclerThumbSeekBar duration invalid %d", java.lang.Integer.valueOf(i18));
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.l0(c16539x811795fe));
            }
        }
    }
}
