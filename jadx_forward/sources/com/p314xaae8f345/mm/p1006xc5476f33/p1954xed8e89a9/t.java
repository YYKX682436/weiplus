package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9;

/* loaded from: classes6.dex */
public class t implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f235149d = 0;

    public t(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.u uVar, com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.s sVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f235149d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f235149d;
        this.f235149d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.r.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
