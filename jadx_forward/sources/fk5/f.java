package fk5;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f345195d = 0;

    public f(fk5.g gVar, fk5.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f345195d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f345195d;
        this.f345195d = i17 + 1;
        if (i17 == 0) {
            return fk5.v.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
