package mc5;

/* loaded from: classes.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f407182d = 0;

    public b(mc5.c cVar, mc5.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f407182d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f407182d;
        this.f407182d = i17 + 1;
        if (i17 == 0) {
            return mc5.r.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
