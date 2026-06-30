package kr2;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f392840d = 0;

    public f(kr2.g gVar, kr2.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f392840d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f392840d;
        this.f392840d = i17 + 1;
        if (i17 == 0) {
            return kr2.v.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
