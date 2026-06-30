package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public class gf implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.n2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Set f159787d = new java.util.concurrent.CopyOnWriteArraySet();

    public void a() {
        java.util.Set set = this.f159787d;
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArraySet) set).iterator();
        while (it.hasNext()) {
            ((im5.a) it.next()).mo10668x2efc64();
        }
        ((java.util.concurrent.CopyOnWriteArraySet) set).clear();
    }

    @Override // im5.b
    /* renamed from: keep */
    public final void mo46316x322b85(im5.a aVar) {
        if (aVar != null) {
            ((java.util.concurrent.CopyOnWriteArraySet) this.f159787d).add(aVar);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.n2
    public void n2(im5.a aVar) {
        if (aVar != null) {
            ((java.util.concurrent.CopyOnWriteArraySet) this.f159787d).remove(aVar);
        }
    }
}
