package io4;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f375053d = 0;

    public b(io4.c cVar, io4.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f375053d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f375053d;
        this.f375053d = i17 + 1;
        if (i17 == 0) {
            return io4.h.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
