package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes11.dex */
public class g4 extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22371xa262f838.EnterpriseConversationFmUI f289230a;

    public g4(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22371xa262f838.EnterpriseConversationFmUI enterpriseConversationFmUI) {
        this.f289230a = enterpriseConversationFmUI;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message message) {
        r01.m y07;
        int i17;
        if (message == null || message.what != 1) {
            return;
        }
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22371xa262f838.EnterpriseConversationFmUI enterpriseConversationFmUI = this.f289230a;
        if (enterpriseConversationFmUI.mo78409x676b27cd() == null || enterpriseConversationFmUI.mo78409x676b27cd().isFinishing()) {
            return;
        }
        int count = enterpriseConversationFmUI.f288883i.getCount();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        int i18 = 0;
        int i19 = 0;
        int i27 = 0;
        int i28 = 0;
        for (int i29 = 0; i29 < count; i29++) {
            com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p7 item = enterpriseConversationFmUI.f288883i.getItem(i29);
            com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var = item == null ? null : item.f289498c;
            if (l4Var == null) {
                com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p7 item2 = enterpriseConversationFmUI.f288883i.getItem(i29);
                s01.b bVar = item2 == null ? null : item2.f289499d;
                if (bVar != null && (i17 = bVar.f69079xa35b5abb) > 0) {
                    i19 += i17;
                }
            } else {
                java.lang.String h17 = l4Var.h1();
                if (h17 != null) {
                    if (c01.e2.J(h17) && r01.z.i(h17)) {
                        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(h17, true);
                        boolean K = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().K(h17);
                        boolean z17 = (n17 == null || (n17.m124896xfb85f7b0() & 2048) == 0) ? false : true;
                        if (z17 && !K) {
                            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().S(h17);
                        } else if (!z17 && K) {
                            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().V(h17);
                        }
                        if (l4Var.d1() > 0) {
                            if (c01.e2.Q(h17)) {
                                i27++;
                            } else {
                                i28++;
                                i18 += l4Var.d1();
                            }
                        }
                    } else {
                        linkedList.add(h17);
                    }
                }
            }
        }
        r01.m y08 = r01.q3.bj().y0(enterpriseConversationFmUI.f288884m);
        int i37 = y08 != null ? y08.f66038x29b98d8d : 0;
        long j17 = y08 != null ? y08.f66046x771ad30a : 0L;
        long j18 = y08 != null ? y08.f66050x2a8d0441 : 0L;
        int i38 = (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(enterpriseConversationFmUI.f288892u) || (y07 = r01.q3.bj().y0(enterpriseConversationFmUI.f288892u)) == null) ? 0 : y07.f66038x29b98d8d;
        int i39 = i18 + i19;
        enterpriseConversationFmUI.m80497x2636cab1(i39, false);
        if (i39 > 0) {
            enterpriseConversationFmUI.mo78695xbf7c1df6(enterpriseConversationFmUI.f288878d + "(" + i39 + ")");
        } else {
            enterpriseConversationFmUI.mo78695xbf7c1df6(enterpriseConversationFmUI.f288878d);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EnterpriseConversationUI", "redNumSum:%s, redBizChatNumSum:%s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(12892, enterpriseConversationFmUI.f288884m, java.lang.Integer.valueOf(enterpriseConversationFmUI.f288893v), java.lang.Integer.valueOf(count), "", java.lang.Integer.valueOf(enterpriseConversationFmUI.f288890s), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(i28), java.lang.Long.valueOf(enterpriseConversationFmUI.f288891t), java.lang.Integer.valueOf(i38), java.lang.Integer.valueOf(i37), java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18));
        if (linkedList.size() > 0) {
            ((com.p314xaae8f345.mm.p2621x8fb0427b.m4) c01.d9.b().r()).m(linkedList);
            enterpriseConversationFmUI.f288883i.q();
        }
        if (r01.q3.Ai().c(enterpriseConversationFmUI.f288884m, null)) {
            r01.q3.bj().b1(enterpriseConversationFmUI.f288884m, null);
        }
        java.util.List i110 = r01.q3.cj().i1(enterpriseConversationFmUI.f288884m);
        int i47 = 0;
        while (true) {
            java.util.ArrayList arrayList = (java.util.ArrayList) i110;
            if (i47 >= arrayList.size()) {
                return;
            }
            java.lang.String str = (java.lang.String) arrayList.get(i47);
            if (c01.e2.J(str)) {
                r01.q3.Ai().c(str, null);
            }
            i47++;
        }
    }
}
