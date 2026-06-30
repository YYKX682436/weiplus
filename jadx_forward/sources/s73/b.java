package s73;

/* loaded from: classes.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f485710d = 0;

    public b(s73.c cVar, s73.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f485710d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f485710d;
        this.f485710d = i17 + 1;
        if (i17 == 0) {
            return s73.k.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
