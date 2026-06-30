package com.tencent.mm.plugin.appbrand.complaint;

/* loaded from: classes6.dex */
public class p implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f77196d = 0;

    public p(com.tencent.mm.plugin.appbrand.complaint.q qVar, com.tencent.mm.plugin.appbrand.complaint.o oVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f77196d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f77196d;
        this.f77196d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.complaint.j.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
