package com.tencent.mm.plugin.appbrand.jsruntime;

/* loaded from: classes7.dex */
public abstract class a implements com.tencent.mm.plugin.appbrand.jsruntime.d1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Set f83963a = new java.util.LinkedHashSet();

    public final void b(java.lang.String str) {
        java.util.LinkedList linkedList;
        synchronized (this.f83963a) {
            linkedList = new java.util.LinkedList(this.f83963a);
        }
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.appbrand.jsapi.audio.c cVar = (com.tencent.mm.plugin.appbrand.jsapi.audio.c) ((com.tencent.mm.plugin.appbrand.jsruntime.c1) it.next());
            cVar.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.AudioInstanceContext", "onRevoked url:%s", str);
            n01.e eVar = cVar.f79168a;
            if (eVar != null) {
                dl3.j jVar = (dl3.j) eVar;
                synchronized (jVar.f235334a.U) {
                    ((java.util.HashSet) jVar.f235334a.f235322o).remove(str);
                }
            }
        }
    }
}
