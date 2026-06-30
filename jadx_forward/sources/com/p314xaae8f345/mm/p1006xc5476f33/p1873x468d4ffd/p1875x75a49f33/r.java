package com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33;

/* loaded from: classes10.dex */
public class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.s f230616d;

    public r(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.s sVar) {
        this.f230616d = sVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.s sVar = this.f230616d;
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16538x58704dc4 c16538x58704dc4 = sVar.f230618d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16538x58704dc4 c16538x58704dc42 = sVar.f230618d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.j a17 = c16538x58704dc4.f230417s.a();
            c16538x58704dc42.f230407f = a17.mo66866x37a7fa50();
            c16538x58704dc42.f230417s.c(a17);
            z17 = true;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("RecyclerThumbSeekBar", e17, "Try to init fetcher error : %s", e17.getMessage());
            z17 = false;
        }
        if (!z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16538x58704dc4 c16538x58704dc43 = sVar.f230618d;
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16538x58704dc4.f230404w;
            c16538x58704dc43.getClass();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.u(c16538x58704dc43));
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16538x58704dc4 c16538x58704dc44 = sVar.f230618d;
        int i18 = c16538x58704dc44.f230407f;
        if (i18 >= 10000) {
            c16538x58704dc44.f230406e = (c16538x58704dc44.f230416r.f152728h * 1000) / 10;
        } else {
            if (i18 <= 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("RecyclerThumbSeekBar", "RecyclerThumbSeekBar duration invalid %d", java.lang.Integer.valueOf(i18));
                com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16538x58704dc4 c16538x58704dc45 = sVar.f230618d;
                c16538x58704dc45.getClass();
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.u(c16538x58704dc45));
                return;
            }
            c16538x58704dc44.f230406e = i18 / 10;
        }
        int i19 = c16538x58704dc44.f230406e;
        c16538x58704dc44.getClass();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.t(c16538x58704dc44));
    }
}
