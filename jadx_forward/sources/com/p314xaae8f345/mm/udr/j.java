package com.p314xaae8f345.mm.udr;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f278030d = 0;

    public j(com.p314xaae8f345.mm.udr.k kVar, com.p314xaae8f345.mm.udr.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f278030d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f278030d;
        this.f278030d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.udr.b1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
