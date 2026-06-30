package com.tencent.mm.plugin.appbrand.appusage;

/* loaded from: classes7.dex */
public final class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.appusage.v f76574d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f76575e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f76576f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.appusage.r f76577g;

    public u(com.tencent.mm.plugin.appbrand.appusage.v vVar, java.util.List list, boolean z17, com.tencent.mm.plugin.appbrand.appusage.r rVar) {
        this.f76574d = vVar;
        this.f76575e = list;
        this.f76576f = z17;
        this.f76577g = rVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.List xi6 = this.f76574d.xi(Integer.MAX_VALUE, com.tencent.mm.plugin.appbrand.appusage.y5.DESC);
        if (xi6 == null) {
            xi6 = kz5.p0.f313996d;
        }
        java.util.List list = this.f76575e;
        boolean z17 = this.f76576f;
        com.tencent.mm.plugin.appbrand.appusage.v vVar = this.f76574d;
        com.tencent.mm.plugin.appbrand.appusage.r rVar = this.f76577g;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[collection] reorderWithCallback, before calculateDiff oldList.size=");
        sb6.append(xi6.size());
        sb6.append(" reorderList.size= ");
        kotlin.jvm.internal.o.d(list);
        sb6.append(list.size());
        sb6.append(' ');
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCollectionStorageExport[collection]", sb6.toString());
        if (z17 && xi6.size() != list.size()) {
            if (rVar != null) {
                rVar.c();
                return;
            }
            return;
        }
        androidx.recyclerview.widget.c0 a17 = androidx.recyclerview.widget.h0.a(new com.tencent.mm.plugin.appbrand.appusage.o3(xi6, list), true);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCollectionStorageExport[collection]", "[collection] reorderWithCallback, after calculateDiff oldList.size=" + xi6.size() + " reorderList.size= " + list.size() + ' ');
        com.tencent.mm.plugin.appbrand.appusage.l lVar = (com.tencent.mm.plugin.appbrand.appusage.l) i95.n0.c(com.tencent.mm.plugin.appbrand.appusage.l.class);
        java.util.List S0 = kz5.n0.S0(xi6);
        java.util.List S02 = kz5.n0.S0(list);
        lVar.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(S0);
        com.tencent.mm.pointers.PInt pInt = new com.tencent.mm.pointers.PInt(0);
        lVar.requireAccountInitialized();
        synchronized (lVar.f76500d) {
            a17.a(new com.tencent.mm.plugin.appbrand.appusage.h(pInt, S0, S02, rVar, lVar, arrayList));
        }
        boolean z18 = pInt.value > 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCollectionStorageExport[collection]", "[collection] reorderWithCallback, changed = " + z18);
        if (z18) {
            ((com.tencent.mm.plugin.appbrand.appusage.w2) com.tencent.mm.plugin.appbrand.app.r9.fj(com.tencent.mm.plugin.appbrand.appusage.w2.class)).n0(com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo.class, list, null);
        }
        vVar.f76584d.set(false);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCollectionStorageExport[collection]", "[collection] reorderWithCallback, before run callback");
        if (rVar != null) {
            rVar.c();
        }
    }
}
