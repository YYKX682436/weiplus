package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public final class ge implements com.tencent.mm.plugin.appbrand.he {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentSkipListSet f78252a = new java.util.concurrent.ConcurrentSkipListSet(new com.tencent.mm.plugin.appbrand.be(this));

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f78253b = new java.util.concurrent.atomic.AtomicBoolean(false);

    @Override // com.tencent.mm.plugin.appbrand.he
    public void a(java.lang.String str) {
        e(new com.tencent.mm.plugin.appbrand.ee(this, str));
    }

    @Override // com.tencent.mm.plugin.appbrand.he
    public void b() {
        e(new com.tencent.mm.plugin.appbrand.fe(this));
    }

    @Override // com.tencent.mm.plugin.appbrand.he
    public void c() {
        e(new com.tencent.mm.plugin.appbrand.de(this));
        this.f78253b.set(true);
        this.f78252a.clear();
    }

    @Override // com.tencent.mm.plugin.appbrand.he
    public void d() {
        e(new com.tencent.mm.plugin.appbrand.ce(this));
    }

    public final void e(yz5.l lVar) {
        java.util.Iterator it = new java.util.LinkedList(this.f78252a).iterator();
        while (it.hasNext()) {
            lVar.invoke((com.tencent.mm.plugin.appbrand.he) it.next());
        }
    }
}
