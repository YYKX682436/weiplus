package v04;

/* loaded from: classes6.dex */
public class e implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f513844d = 0;

    public e(v04.f fVar, v04.d dVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f513844d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f513844d;
        this.f513844d = i17 + 1;
        if (i17 == 0) {
            return v04.c.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
