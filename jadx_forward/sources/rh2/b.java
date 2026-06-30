package rh2;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f477171d = 0;

    public b(rh2.c cVar, rh2.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f477171d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f477171d;
        this.f477171d = i17 + 1;
        if (i17 == 0) {
            return rh2.l.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
