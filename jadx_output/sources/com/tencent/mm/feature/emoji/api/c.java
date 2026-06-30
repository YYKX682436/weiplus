package com.tencent.mm.feature.emoji.api;

/* loaded from: classes6.dex */
public class c implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f66055d = 0;

    public c(com.tencent.mm.feature.emoji.api.d dVar, com.tencent.mm.feature.emoji.api.b bVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f66055d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f66055d;
        this.f66055d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.feature.emoji.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
