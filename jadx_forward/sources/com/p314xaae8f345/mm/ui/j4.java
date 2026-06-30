package com.p314xaae8f345.mm.ui;

/* loaded from: classes6.dex */
public class j4 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f290529d = 0;

    public j4(com.p314xaae8f345.mm.ui.k4 k4Var, com.p314xaae8f345.mm.ui.i4 i4Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f290529d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f290529d;
        this.f290529d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.ui.c9.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
