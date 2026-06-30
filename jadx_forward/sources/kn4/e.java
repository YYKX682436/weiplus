package kn4;

/* loaded from: classes6.dex */
public class e implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f391216d = 0;

    public e(kn4.f fVar, kn4.d dVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f391216d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f391216d;
        this.f391216d = i17 + 1;
        if (i17 == 0) {
            return kn4.u.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
