package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui;

/* loaded from: classes9.dex */
public class f implements java.util.Comparator {
    public f(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.ActivityC19031x1cc5b0e9 activityC19031x1cc5b0e9) {
    }

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c2 = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c) obj2;
        if (c19091x9511676c.v0()) {
            return -1;
        }
        if (c19091x9511676c.D0()) {
            if (!c19091x9511676c2.v0()) {
                return -1;
            }
        } else {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.S(c19091x9511676c.f69239x93565523) < com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.S(c19091x9511676c2.f69239x93565523)) {
                return -1;
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.S(c19091x9511676c.f69239x93565523) <= com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.S(c19091x9511676c2.f69239x93565523)) {
                return 0;
            }
        }
        return 1;
    }
}
