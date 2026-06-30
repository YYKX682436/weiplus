package com.tencent.mm.modelbase;

/* loaded from: classes6.dex */
public class y implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f70838d = 0;

    public y(com.tencent.mm.modelbase.z zVar, com.tencent.mm.modelbase.x xVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f70838d < 2;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f70838d;
        this.f70838d = i17 + 1;
        if (i17 == 0) {
            return kr2.t.INSTANCE;
        }
        if (i17 == 1) {
            return ic2.x.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 2");
    }
}
