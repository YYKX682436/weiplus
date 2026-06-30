package fw;

/* loaded from: classes6.dex */
public class e implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f348562d = 0;

    public e(fw.f fVar, fw.d dVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f348562d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f348562d;
        this.f348562d = i17 + 1;
        if (i17 == 0) {
            return fw.c.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
