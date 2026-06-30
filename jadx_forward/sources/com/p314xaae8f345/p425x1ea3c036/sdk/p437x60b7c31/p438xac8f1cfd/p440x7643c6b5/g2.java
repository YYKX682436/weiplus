package com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5;

/* loaded from: classes7.dex */
public final class g2 {
    public g2(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final void a(com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.a2 info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        java.util.ArrayList b17 = b(info);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.WAUDRLogic", "checkAsync info:" + info + " check for depend libs, checkList: " + b17);
        if (b17.isEmpty()) {
            return;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.udr.p pVar = new com.p314xaae8f345.p3133xd0ce8b26.aff.udr.p();
        com.p314xaae8f345.p3133xd0ce8b26.aff.udr.q qVar = new com.p314xaae8f345.p3133xd0ce8b26.aff.udr.q();
        qVar.c("ilinkres_14beccb0");
        java.util.LinkedList linkedList = qVar.f299081e;
        if (linkedList != null) {
            linkedList.addAll(b17);
        }
        java.util.LinkedList linkedList2 = pVar.f299078d;
        if (linkedList2 != null) {
            linkedList2.add(qVar);
        }
        ((com.p314xaae8f345.mm.udr.a1) ((com.p314xaae8f345.mm.udr.e0) i95.n0.c(com.p314xaae8f345.mm.udr.e0.class))).Ai(pVar, new com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.d2(info));
    }

    public final java.util.ArrayList b(com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.a2 a2Var) {
        java.lang.String str = a2Var.f128915a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.g2 g2Var = com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.h2.f128972a;
        com.p314xaae8f345.p3133xd0ce8b26.aff.udr.x Ui = ((com.p314xaae8f345.mm.udr.a1) ((com.p314xaae8f345.mm.udr.e0) i95.n0.c(com.p314xaae8f345.mm.udr.e0.class))).Ui("ilinkres_14beccb0", a2Var.f128915a);
        long j17 = Ui != null ? Ui.f299123e : 0L;
        if (j17 <= 0 || j17 < ((long) a2Var.f128916b)) {
            arrayList.add(str);
        }
        return arrayList;
    }

    public final java.lang.String c(com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.a2 info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        return ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ((jz5.n) com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.h2.f128973b).mo141623x754a37bb()).getString(info.f128915a + info.f128916b, "");
    }
}
