package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public final class ge implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.he {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentSkipListSet f159785a = new java.util.concurrent.ConcurrentSkipListSet(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.be(this));

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f159786b = new java.util.concurrent.atomic.AtomicBoolean(false);

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.he
    public void a(java.lang.String str) {
        e(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ee(this, str));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.he
    public void b() {
        e(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.fe(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.he
    public void c() {
        e(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.de(this));
        this.f159786b.set(true);
        this.f159785a.clear();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.he
    public void d() {
        e(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ce(this));
    }

    public final void e(yz5.l lVar) {
        java.util.Iterator it = new java.util.LinkedList(this.f159785a).iterator();
        while (it.hasNext()) {
            lVar.mo146xb9724478((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.he) it.next());
        }
    }
}
