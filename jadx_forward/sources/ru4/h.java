package ru4;

/* loaded from: classes.dex */
public class h implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f481321d = 0;

    public h(ru4.i iVar, ru4.g gVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f481321d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f481321d;
        this.f481321d = i17 + 1;
        if (i17 == 0) {
            return ru4.c.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
