package c42;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f119913d = 0;

    public f(c42.g gVar, c42.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f119913d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f119913d;
        this.f119913d = i17 + 1;
        if (i17 == 0) {
            return c42.m.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
