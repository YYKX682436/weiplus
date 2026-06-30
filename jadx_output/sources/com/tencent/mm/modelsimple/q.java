package com.tencent.mm.modelsimple;

/* loaded from: classes6.dex */
public class q implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f71398d = 0;

    public q(com.tencent.mm.modelsimple.r rVar, com.tencent.mm.modelsimple.p pVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f71398d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f71398d;
        this.f71398d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.modelsimple.v.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
