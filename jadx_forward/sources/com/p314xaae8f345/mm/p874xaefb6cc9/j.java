package com.p314xaae8f345.mm.p874xaefb6cc9;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f150615d = 0;

    public j(com.p314xaae8f345.mm.p874xaefb6cc9.k kVar, com.p314xaae8f345.mm.p874xaefb6cc9.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f150615d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f150615d;
        this.f150615d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p874xaefb6cc9.z0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
