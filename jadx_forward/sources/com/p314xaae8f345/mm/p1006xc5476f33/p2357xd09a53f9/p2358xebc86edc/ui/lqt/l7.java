package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt;

/* loaded from: classes9.dex */
public class l7 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.List f259796a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19020x7623dbfb.AnonymousClass46 f259797b;

    public l7(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19020x7623dbfb.AnonymousClass46 anonymousClass46, java.util.List list) {
        this.f259797b = anonymousClass46;
        this.f259796a = list;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19020x7623dbfb activityC19020x7623dbfb;
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19020x7623dbfb.AnonymousClass46 anonymousClass46 = this.f259797b;
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19020x7623dbfb activityC19020x7623dbfb2 = com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19020x7623dbfb.this;
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19020x7623dbfb.R1;
        java.util.Iterator it = activityC19020x7623dbfb2.e7().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            activityC19020x7623dbfb = com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19020x7623dbfb.this;
            if (!hasNext) {
                break;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c) it.next();
            java.util.Iterator it6 = this.f259796a.iterator();
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
