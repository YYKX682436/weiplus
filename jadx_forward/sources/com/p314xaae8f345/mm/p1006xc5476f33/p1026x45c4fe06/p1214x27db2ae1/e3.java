package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1;

/* loaded from: classes7.dex */
public final class e3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 f172236d;

    public e3(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 interfaceC11702x4ae7c33) {
        this.f172236d = interfaceC11702x4ae7c33;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.f3.f172239d.c();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onCommLibUsingVersionUpdate, reader: ");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 interfaceC11702x4ae7c33 = this.f172236d;
        sb6.append(interfaceC11702x4ae7c33);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaCommLibV8SnapshotServiceImpl", sb6.toString());
        java.lang.String b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.j2.b(interfaceC11702x4ae7c33);
        if (b17 == null || b17.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxaCommLibV8SnapshotServiceImpl", "onCommLibUsingVersionUpdate, reader is invalid");
            return;
        }
        java.util.Set set = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.f3.f172241f;
        if (set.contains(interfaceC11702x4ae7c33)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaCommLibV8SnapshotServiceImpl", "onCommLibUsingVersionUpdate, is creating now");
            return;
        }
        set.add(interfaceC11702x4ae7c33);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.l3.f172303f.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.l3[] m53214xcee59d22 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.l3.m53214xcee59d22();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.l3 l3Var : m53214xcee59d22) {
            if (!l3Var.f172309e) {
                arrayList.add(l3Var);
            }
        }
        java.util.concurrent.atomic.AtomicInteger atomicInteger = new java.util.concurrent.atomic.AtomicInteger(arrayList.size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaCommLibV8SnapshotServiceImpl", "onCommLibUsingVersionUpdate, creatingCount: " + atomicInteger);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.k3 k3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.l3.f172303f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.d3 d3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.d3(interfaceC11702x4ae7c33, b17, atomicInteger);
        k3Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.l3[] m53214xcee59d222 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.l3.m53214xcee59d22();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.l3 l3Var2 : m53214xcee59d222) {
            if (!l3Var2.f172309e) {
                arrayList2.add(l3Var2);
            }
        }
        java.util.Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            d3Var.mo146xb9724478(it.next());
        }
    }
}
