package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes16.dex */
public abstract class r implements java.util.Iterator {
    @Override // java.util.Iterator
    public java.lang.Object next() {
        com.p176xb6135e39.p283xc50a8b8b.q qVar = (com.p176xb6135e39.p283xc50a8b8b.q) this;
        int i17 = qVar.f126950d;
        if (i17 >= qVar.f126951e) {
            throw new java.util.NoSuchElementException();
        }
        qVar.f126950d = i17 + 1;
        return java.lang.Byte.valueOf(qVar.f126952f.k(i17));
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException();
    }
}
