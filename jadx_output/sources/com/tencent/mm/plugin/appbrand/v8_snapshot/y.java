package com.tencent.mm.plugin.appbrand.v8_snapshot;

/* loaded from: classes6.dex */
public class y implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f90844d = 0;

    public y(com.tencent.mm.plugin.appbrand.v8_snapshot.z zVar, com.tencent.mm.plugin.appbrand.v8_snapshot.x xVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f90844d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f90844d;
        this.f90844d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.v8_snapshot.m.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
