package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt;

/* loaded from: classes9.dex */
public class z5 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.List f260003a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19020x7623dbfb f260004b;

    public z5(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19020x7623dbfb activityC19020x7623dbfb, java.util.List list) {
        this.f260004b = activityC19020x7623dbfb;
        this.f260003a = list;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        boolean z17;
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19020x7623dbfb.R1;
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19020x7623dbfb activityC19020x7623dbfb = this.f260004b;
        java.util.Iterator it = activityC19020x7623dbfb.e7().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c) it.next();
            java.util.Iterator it6 = this.f260003a.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    z17 = false;
                    break;
                }
                if (c19091x9511676c.f69225xed6d60f6.equals(((com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c) it6.next()).f69225xed6d60f6)) {
                    z17 = true;
                    break;
                }
            }
            if (!z17) {
                activityC19020x7623dbfb.W = c19091x9511676c.f69225xed6d60f6;
                activityC19020x7623dbfb.X = c19091x9511676c;
                break;
            }
        }
        activityC19020x7623dbfb.h7(false);
        return null;
    }
}
