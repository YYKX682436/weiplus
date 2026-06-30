package com.tencent.mm.plugin.appbrand.jsruntime;

/* loaded from: classes7.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsruntime.b f83981d;

    public c(com.tencent.mm.plugin.appbrand.jsruntime.b bVar) {
        this.f83981d = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.ArrayList arrayList;
        synchronized (this.f83981d.f83974o) {
            arrayList = new java.util.ArrayList(this.f83981d.f83975p);
            this.f83981d.f83975p.clear();
            this.f83981d.f83975p = null;
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.appbrand.jsruntime.d0) it.next()).a();
        }
    }
}
