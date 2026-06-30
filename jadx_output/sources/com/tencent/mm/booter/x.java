package com.tencent.mm.booter;

/* loaded from: classes6.dex */
public class x implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f63588d = 0;

    public x(com.tencent.mm.booter.y yVar, com.tencent.mm.booter.w wVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f63588d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f63588d;
        this.f63588d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.booter.v.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
