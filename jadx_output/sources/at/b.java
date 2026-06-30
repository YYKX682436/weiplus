package at;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f13553d = 0;

    public b(at.c cVar, at.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f13553d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f13553d;
        this.f13553d = i17 + 1;
        if (i17 == 0) {
            return ql0.m.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
