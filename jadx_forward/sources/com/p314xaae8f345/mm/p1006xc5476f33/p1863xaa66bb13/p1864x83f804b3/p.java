package com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3;

/* loaded from: classes11.dex */
public final class p implements com.p314xaae8f345.mm.p944x882e457a.j1 {
    @Override // com.p314xaae8f345.mm.p944x882e457a.j1
    /* renamed from: onSceneEnd */
    public void mo10099x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (i17 == 0 && i18 == 0) {
            boolean z17 = m1Var instanceof com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.m3;
            com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.o oVar = com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.o.f230234a;
            if (!z17) {
                if (m1Var instanceof l41.h0) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onSceneEnd MMFunc_VerifyOpenIMContact, tpUsername: ");
                    l41.h0 h0Var = (l41.h0) m1Var;
                    sb6.append(h0Var.f397356f);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactRelationUpdateOnSceneEnd", sb6.toString());
                    oVar.b(((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(h0Var.f397356f, true));
                    return;
                }
                return;
            }
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("onSceneEnd rtVERIFYUSER, verifyUser: ");
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.m3 m3Var = (com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.m3) m1Var;
            sb7.append(m3Var.f270912f.size());
            sb7.append(", op=");
            sb7.append(m3Var.f270913g);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactRelationUpdateOnSceneEnd", sb7.toString());
            if (m3Var.f270913g == 3) {
                java.util.List<java.lang.String> list = m3Var.f270912f;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "getVerifyUser(...)");
                for (java.lang.String str2 : list) {
                    oVar.a(str2, ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str2, true).J0());
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactRelationUpdateOnSceneEnd", "onSceneEnd rtVERIFYUSER, notify beforeAddContact: " + str2);
                }
            }
        }
    }
}
