package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui;

/* loaded from: classes9.dex */
public class w0 implements gt4.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.AbstractActivityC17129x6de84683 f239536a;

    public w0(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.AbstractActivityC17129x6de84683 abstractActivityC17129x6de84683) {
        this.f239536a = abstractActivityC17129x6de84683;
    }

    public boolean a(boolean z17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.AbstractActivityC17129x6de84683 abstractActivityC17129x6de84683 = this.f239536a;
        abstractActivityC17129x6de84683.L = z17;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            abstractActivityC17129x6de84683.H = null;
        } else {
            abstractActivityC17129x6de84683.H = str;
        }
        if (!abstractActivityC17129x6de84683.L) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                abstractActivityC17129x6de84683.I = null;
            } else {
                abstractActivityC17129x6de84683.I = str2;
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
                abstractActivityC17129x6de84683.f238665J = null;
            } else {
                abstractActivityC17129x6de84683.f238665J = str3;
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4)) {
                abstractActivityC17129x6de84683.K = null;
            } else {
                abstractActivityC17129x6de84683.K = str4;
            }
        }
        int i17 = abstractActivityC17129x6de84683.f238674n;
        if (i17 != 33 && i17 != 32) {
            if (!(abstractActivityC17129x6de84683.f238675o == 0)) {
                abstractActivityC17129x6de84683.E.setVisibility(8);
            } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(abstractActivityC17129x6de84683.I)) {
                abstractActivityC17129x6de84683.E.setVisibility(8);
            } else {
                abstractActivityC17129x6de84683.E.setVisibility(0);
                abstractActivityC17129x6de84683.F.setText(abstractActivityC17129x6de84683.I + "  " + abstractActivityC17129x6de84683.f238665J);
                abstractActivityC17129x6de84683.G.setText(abstractActivityC17129x6de84683.K);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.AbstractActivityC17129x6de84683.V6(abstractActivityC17129x6de84683);
        return true;
    }
}
