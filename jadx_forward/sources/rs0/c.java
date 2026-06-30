package rs0;

/* loaded from: classes6.dex */
public class c implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f480822d = 0;

    public c(rs0.d dVar, rs0.b bVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f480822d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f480822d;
        this.f480822d = i17 + 1;
        if (i17 == 0) {
            return rs0.u.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
