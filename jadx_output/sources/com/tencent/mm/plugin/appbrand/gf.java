package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class gf implements com.tencent.mm.plugin.appbrand.utils.n2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Set f78254d = new java.util.concurrent.CopyOnWriteArraySet();

    public void a() {
        java.util.Set set = this.f78254d;
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArraySet) set).iterator();
        while (it.hasNext()) {
            ((im5.a) it.next()).dead();
        }
        ((java.util.concurrent.CopyOnWriteArraySet) set).clear();
    }

    @Override // im5.b
    public final void keep(im5.a aVar) {
        if (aVar != null) {
            ((java.util.concurrent.CopyOnWriteArraySet) this.f78254d).add(aVar);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.utils.n2
    public void n2(im5.a aVar) {
        if (aVar != null) {
            ((java.util.concurrent.CopyOnWriteArraySet) this.f78254d).remove(aVar);
        }
    }
}
