package com.tencent.mm.plugin.appbrand;

/* loaded from: classes6.dex */
public class nb implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f86063d = 0;

    public nb(com.tencent.mm.plugin.appbrand.ob obVar, com.tencent.mm.plugin.appbrand.mb mbVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f86063d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f86063d;
        this.f86063d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.s9.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
