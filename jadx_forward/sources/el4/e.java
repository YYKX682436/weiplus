package el4;

/* loaded from: classes6.dex */
public class e implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f335543d = 0;

    public e(el4.f fVar, el4.d dVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f335543d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f335543d;
        this.f335543d = i17 + 1;
        if (i17 == 0) {
            return el4.c.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
