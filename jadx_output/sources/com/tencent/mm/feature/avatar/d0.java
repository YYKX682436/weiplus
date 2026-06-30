package com.tencent.mm.feature.avatar;

/* loaded from: classes6.dex */
public class d0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f65146d = 0;

    public d0(com.tencent.mm.feature.avatar.e0 e0Var, com.tencent.mm.feature.avatar.c0 c0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f65146d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f65146d;
        this.f65146d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.feature.avatar.x.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
