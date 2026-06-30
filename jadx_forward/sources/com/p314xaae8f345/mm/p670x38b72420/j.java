package com.p314xaae8f345.mm.p670x38b72420;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f146395d = 0;

    public j(com.p314xaae8f345.mm.p670x38b72420.k kVar, com.p314xaae8f345.mm.p670x38b72420.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f146395d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f146395d;
        this.f146395d = i17 + 1;
        if (i17 == 0) {
            return yq3.x.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
