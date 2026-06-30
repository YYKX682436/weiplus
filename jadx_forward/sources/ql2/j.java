package ql2;

/* loaded from: classes.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f446057d = 0;

    public j(ql2.k kVar, ql2.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f446057d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f446057d;
        this.f446057d = i17 + 1;
        if (i17 == 0) {
            return ql2.p0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
