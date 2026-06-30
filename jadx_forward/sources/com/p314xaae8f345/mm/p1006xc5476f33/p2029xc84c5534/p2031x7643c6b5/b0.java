package com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5;

/* loaded from: classes12.dex */
public final class b0 extends com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.m {
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.n
    public void X3(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.C17193xfa87980b c17193xfa87980b;
        bm5.f1.a();
        if (bundle == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.KVReportService", "bundle is null");
            return;
        }
        try {
            bundle.setClassLoader(com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.C17193xfa87980b.class.getClassLoader());
            if (bundle.getInt("type") != 1 || (c17193xfa87980b = (com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.C17193xfa87980b) bundle.getParcelable("BUNDLE_IDKEYGROUP")) == null) {
                return;
            }
            java.util.ArrayList arrayList = c17193xfa87980b.f239652f;
            java.util.ArrayList arrayList2 = c17193xfa87980b.f239651e;
            java.util.ArrayList arrayList3 = c17193xfa87980b.f239650d;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.KVReportService", "KVReportService onReceive kvdata lenght: %d, idkey data lenght:%d,group lenght:%d", java.lang.Integer.valueOf(arrayList3.size()), java.lang.Integer.valueOf(arrayList2.size()), java.lang.Integer.valueOf(arrayList.size()));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.KVReportService", "KVReportService received done");
        } catch (java.lang.Throwable th6) {
            oj.j.d("MicroMsg.KVReportService", th6, "", new java.lang.Object[0]);
        }
    }
}
