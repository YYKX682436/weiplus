package com.tencent.mm.contact;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f64862d = 0;

    public j(com.tencent.mm.contact.k kVar, com.tencent.mm.contact.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f64862d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f64862d;
        this.f64862d = i17 + 1;
        if (i17 == 0) {
            return yq3.x.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
