package com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5;

/* loaded from: classes12.dex */
public class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f239838d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.C17196xafa566d5 f239839e;

    public s(com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.C17196xafa566d5 c17196xafa566d5, android.content.Intent intent) {
        this.f239839e = c17196xafa566d5;
        this.f239838d = intent;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.C17193xfa87980b c17193xfa87980b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.KVCommCrossProcessReceiver", "summeranrt true report runnable run tid:%d", java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        android.content.Intent intent = this.f239838d;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.C17196xafa566d5.f239657a;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.C17196xafa566d5 c17196xafa566d5 = this.f239839e;
        c17196xafa566d5.getClass();
        try {
            int g17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.g(intent, "type", 0);
            if (g17 == 1) {
                android.os.Bundle bundleExtra = intent.getBundleExtra("INTENT_IDKEYGROUP");
                if (bundleExtra != null && (c17193xfa87980b = (com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.C17193xfa87980b) bundleExtra.getParcelable("BUNDLE_IDKEYGROUP")) != null) {
                    java.util.ArrayList arrayList = c17193xfa87980b.f239652f;
                    java.util.ArrayList arrayList2 = c17193xfa87980b.f239651e;
                    java.util.ArrayList arrayList3 = c17193xfa87980b.f239650d;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.KVCommCrossProcessReceiver", "KVBroadCast onReceive kvdata lenght: %d, idkey data lenght:%d,group lenght:%d", java.lang.Integer.valueOf(arrayList3.size()), java.lang.Integer.valueOf(arrayList2.size()), java.lang.Integer.valueOf(arrayList.size()));
                    java.util.Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.C17194xb20112dd c17194xb20112dd = (com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.C17194xb20112dd) it.next();
                        if (c17194xb20112dd != null) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.x.a(c17194xb20112dd.f239654d, c17194xb20112dd.f239655e, c17194xb20112dd.f239656f);
                        }
                    }
                    java.util.Iterator it6 = arrayList2.iterator();
                    while (it6.hasNext()) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.C17202xbfa55fb c17202xbfa55fb = (com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.C17202xbfa55fb) it6.next();
                        if (c17202xbfa55fb != null) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.x.b(c17202xbfa55fb.f239675d, c17202xbfa55fb.f239676e, c17202xbfa55fb.f239677f, c17202xbfa55fb.f239678g);
                        }
                    }
                    java.util.Iterator it7 = arrayList3.iterator();
                    while (it7.hasNext()) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.C17197xb3ea717 c17197xb3ea717 = (com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.C17197xb3ea717) it7.next();
                        if (c17197xb3ea717 != null) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.x.h(c17197xb3ea717.f239664d, c17197xb3ea717.f239665e, c17197xb3ea717.f239666f, c17197xb3ea717.f239667g, c17197xb3ea717.f239668h, c17197xb3ea717.f239669i);
                        }
                    }
                }
            } else if (g17 == 2) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.KVCommCrossProcessReceiver", "KVBroadCast onReceive TYPE_ONCRASHOREXCEPTION");
                com.p314xaae8f345.p542x3306d5.C4436xdd79435b.m37523x79d8456e(0);
                if (com.p314xaae8f345.p2841xd11c237d.C23006xdd79435b.m84223xdac2174d()) {
                    com.p314xaae8f345.p2841xd11c237d.C23006xdd79435b.m84236x79d8456e(0);
                }
            }
            if (gm0.k2.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
                new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3().mo50297x7c4d7ca2(new com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.u(c17196xafa566d5), 5000L);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.KVCommCrossProcessReceiver", e17, "", new java.lang.Object[0]);
        }
    }
}
