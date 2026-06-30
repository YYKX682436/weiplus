package com.tencent.mm.modelsimple;

/* loaded from: classes6.dex */
public class m implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f71370d = 0;

    public m(com.tencent.mm.modelsimple.n nVar, com.tencent.mm.modelsimple.l lVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f71370d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f71370d;
        this.f71370d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.modelsimple.d.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
