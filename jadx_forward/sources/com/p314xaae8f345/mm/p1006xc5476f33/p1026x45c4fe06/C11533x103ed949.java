package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* renamed from: com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainerWC$$d */
/* loaded from: classes7.dex */
public final /* synthetic */ class C11533x103ed949 implements java.util.function.Consumer {
    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object obj) {
        java.lang.Iterable iterable;
        java.lang.String sessionId = (java.lang.String) obj;
        android.util.SparseIntArray sparseIntArray = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11529x5d7a34bb.C;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.u0 u0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.u0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.u5) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.u5.class));
        u0Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandWxAssistantService", "removeAllAppId: sessionId:".concat(sessionId));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.w2 Di = u0Var.Di();
        Di.getClass();
        java.lang.String b17 = Di.b(sessionId);
        java.lang.String a17 = Di.a(sessionId);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.v2 v2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.w2.f173861a;
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.v2.a(v2Var).getInt(b17, -1);
        if (i17 == -1) {
            iterable = kz5.p0.f395529d;
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (i17 >= 0) {
                int i18 = 0;
                while (true) {
                    java.lang.String string = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.v2.a(v2Var).getString(a17 + i18, null);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
                    arrayList.add(string);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.v2.a(v2Var).W(a17 + i18);
                    if (i18 == i17) {
                        break;
                    } else {
                        i18++;
                    }
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.v2.a(v2Var).W(b17);
            iterable = arrayList;
        }
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            u0Var.Ri().remove((java.lang.String) it.next());
        }
        long g17 = u0Var.Ri().g();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandWxAssistantService", "removeAllAppId: sessionId:" + sessionId + " count:" + g17);
        if (g17 == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.n.f173769a.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.c3.f173683a.getClass();
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.c3.f173688f) {
                ((ku5.t0) ku5.t0.f394148d).B(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.e.f173728d);
            }
        }
    }
}
