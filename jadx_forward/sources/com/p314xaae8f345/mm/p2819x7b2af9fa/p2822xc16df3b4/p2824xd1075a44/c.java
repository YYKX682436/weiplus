package com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2824xd1075a44;

/* loaded from: classes15.dex */
public final class c extends com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2824xd1075a44.o {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f296289a;

    public c(int i17) {
        this.f296289a = new java.util.ArrayList(i17);
    }

    @Override // com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2824xd1075a44.o
    public void a(int i17) {
        try {
            java.util.Iterator it = ((java.util.ArrayList) this.f296289a).iterator();
            while (it.hasNext()) {
                ((com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2824xd1075a44.o) it.next()).a(i17);
            }
        } catch (java.util.ConcurrentModificationException e17) {
            throw new java.lang.IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e17);
        }
    }

    @Override // com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2824xd1075a44.o
    public void b(int i17, float f17, int i18) {
        try {
            java.util.Iterator it = ((java.util.ArrayList) this.f296289a).iterator();
            while (it.hasNext()) {
                ((com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2824xd1075a44.o) it.next()).b(i17, f17, i18);
            }
        } catch (java.util.ConcurrentModificationException e17) {
            throw new java.lang.IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e17);
        }
    }

    @Override // com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2824xd1075a44.o
    public void c(int i17) {
        try {
            java.util.Iterator it = ((java.util.ArrayList) this.f296289a).iterator();
            while (it.hasNext()) {
                ((com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2824xd1075a44.o) it.next()).c(i17);
            }
        } catch (java.util.ConcurrentModificationException e17) {
            throw new java.lang.IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e17);
        }
    }
}
