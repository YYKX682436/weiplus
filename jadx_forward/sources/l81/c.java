package l81;

/* loaded from: classes6.dex */
public class c implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f398582d = 0;

    public c(l81.d dVar, l81.b bVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f398582d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f398582d;
        this.f398582d = i17 + 1;
        if (i17 == 0) {
            return qh1.e.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
