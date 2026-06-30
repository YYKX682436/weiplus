package w04;

/* loaded from: classes6.dex */
public class c implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f523457d = 0;

    public c(w04.d dVar, w04.b bVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f523457d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f523457d;
        this.f523457d = i17 + 1;
        if (i17 == 0) {
            return v04.c.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
