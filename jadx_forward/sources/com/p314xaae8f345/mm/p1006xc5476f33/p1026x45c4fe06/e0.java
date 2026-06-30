package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public final class e0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e0 f159518d = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e0();

    @Override // java.lang.Runnable
    public final void run() {
        java.util.List g17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.j0.f159976d.g();
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.qa Di = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.Di();
        com.p314xaae8f345.mm.vfs.r6[] b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.d9.b();
        if (b17 == null) {
            b17 = new com.p314xaae8f345.mm.vfs.r6[0];
        }
        for (com.p314xaae8f345.mm.vfs.r6 r6Var : b17) {
            java.lang.String o17 = r6Var.o();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o17, "getAbsolutePath(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.n9 p17 = Di.p(o17);
            if (p17 == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11661x55afe3eb i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y7.f157598a.i(o17);
                p17 = i17 != null ? com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.r7.f(i17) : null;
            }
            if (p17 != null) {
                linkedHashSet.add(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.j0.f159976d.h(p17.f67177x28d45f97));
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandFileCleaner", "all appId list size: " + ((java.util.ArrayList) g17).size() + ", keep record appId list size: " + linkedHashSet.size());
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(g17, 10));
        java.util.Iterator it = g17.iterator();
        while (it.hasNext()) {
            arrayList.add(((k91.v5) it.next()).f68904x28d45f97);
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : arrayList) {
            if (true ^ linkedHashSet.contains((java.lang.String) obj)) {
                arrayList2.add(obj);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.j0.f159976d;
        g0Var.a(arrayList2);
        long i18 = g0Var.i();
        long j17 = g0Var.j();
        java.util.List S0 = kz5.n0.S0(linkedHashSet);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6311xeb2cea90 c6311xeb2cea90 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6311xeb2cea90();
        c6311xeb2cea90.f136669d = 1L;
        c6311xeb2cea90.f136670e = c6311xeb2cea90.b("ResidueAppIds", kz5.n0.g0(S0, ":", null, null, 0, null, null, 62, null), true);
        c6311xeb2cea90.f136671f = i18;
        c6311xeb2cea90.f136672g = j17;
        c6311xeb2cea90.k();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandFileCleaner", "clean all appbrand storage finished, commLibFileSize: " + i18 + ", occupiedFileSize: " + j17);
    }
}
