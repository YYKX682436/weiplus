package com.tencent.mm.model.newabtest;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f70398d = 0;

    public j(com.tencent.mm.model.newabtest.k kVar, com.tencent.mm.model.newabtest.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f70398d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f70398d;
        this.f70398d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.model.newabtest.b0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
