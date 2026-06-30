package com.tencent.mm.plugin.appbrand.jsruntime;

/* loaded from: classes7.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsruntime.b f83984d;

    public e(com.tencent.mm.plugin.appbrand.jsruntime.b bVar) {
        this.f83984d = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.ArrayList arrayList;
        synchronized (this.f83984d) {
            arrayList = new java.util.ArrayList(this.f83984d.f83971i);
            arrayList.addAll(this.f83984d.f83972m);
            this.f83984d.f83971i.clear();
            this.f83984d.f83972m.clear();
        }
        for (int i17 = 0; i17 < arrayList.size(); i17++) {
            com.tencent.mm.plugin.appbrand.jsruntime.x xVar = (com.tencent.mm.plugin.appbrand.jsruntime.x) arrayList.get(i17);
            if (xVar != null) {
                xVar.onDestroy();
            }
        }
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
    }
}
