package com.tencent.mm.plugin.appbrand.v8_snapshot;

/* loaded from: classes7.dex */
public final class e3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader f90703d;

    public e3(com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader iCommLibReader) {
        this.f90703d = iCommLibReader;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.appbrand.v8_snapshot.f3.f90706d.c();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onCommLibUsingVersionUpdate, reader: ");
        com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader iCommLibReader = this.f90703d;
        sb6.append(iCommLibReader);
        com.tencent.mars.xlog.Log.i("MicroMsg.WxaCommLibV8SnapshotServiceImpl", sb6.toString());
        java.lang.String b17 = com.tencent.mm.plugin.appbrand.v8_snapshot.j2.b(iCommLibReader);
        if (b17 == null || b17.length() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WxaCommLibV8SnapshotServiceImpl", "onCommLibUsingVersionUpdate, reader is invalid");
            return;
        }
        java.util.Set set = com.tencent.mm.plugin.appbrand.v8_snapshot.f3.f90708f;
        if (set.contains(iCommLibReader)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WxaCommLibV8SnapshotServiceImpl", "onCommLibUsingVersionUpdate, is creating now");
            return;
        }
        set.add(iCommLibReader);
        com.tencent.mm.plugin.appbrand.v8_snapshot.l3.f90770f.getClass();
        com.tencent.mm.plugin.appbrand.v8_snapshot.l3[] values = com.tencent.mm.plugin.appbrand.v8_snapshot.l3.values();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.tencent.mm.plugin.appbrand.v8_snapshot.l3 l3Var : values) {
            if (!l3Var.f90776e) {
                arrayList.add(l3Var);
            }
        }
        java.util.concurrent.atomic.AtomicInteger atomicInteger = new java.util.concurrent.atomic.AtomicInteger(arrayList.size());
        com.tencent.mars.xlog.Log.i("MicroMsg.WxaCommLibV8SnapshotServiceImpl", "onCommLibUsingVersionUpdate, creatingCount: " + atomicInteger);
        com.tencent.mm.plugin.appbrand.v8_snapshot.k3 k3Var = com.tencent.mm.plugin.appbrand.v8_snapshot.l3.f90770f;
        com.tencent.mm.plugin.appbrand.v8_snapshot.d3 d3Var = new com.tencent.mm.plugin.appbrand.v8_snapshot.d3(iCommLibReader, b17, atomicInteger);
        k3Var.getClass();
        com.tencent.mm.plugin.appbrand.v8_snapshot.l3[] values2 = com.tencent.mm.plugin.appbrand.v8_snapshot.l3.values();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (com.tencent.mm.plugin.appbrand.v8_snapshot.l3 l3Var2 : values2) {
            if (!l3Var2.f90776e) {
                arrayList2.add(l3Var2);
            }
        }
        java.util.Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            d3Var.invoke(it.next());
        }
    }
}
