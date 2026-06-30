package sr1;

/* loaded from: classes.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f492990d = 0;

    public b(sr1.c cVar, sr1.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f492990d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f492990d;
        this.f492990d = i17 + 1;
        if (i17 == 0) {
            return sr1.d0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
