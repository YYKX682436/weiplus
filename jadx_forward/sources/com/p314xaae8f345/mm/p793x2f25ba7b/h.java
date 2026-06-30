package com.p314xaae8f345.mm.p793x2f25ba7b;

/* loaded from: classes6.dex */
public class h implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f149830d = 0;

    public h(com.p314xaae8f345.mm.p793x2f25ba7b.i iVar, com.p314xaae8f345.mm.p793x2f25ba7b.g gVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f149830d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f149830d;
        this.f149830d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p793x2f25ba7b.n.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
