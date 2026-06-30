package ao1;

/* loaded from: classes6.dex */
public class e implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f12529d = 0;

    public e(ao1.f fVar, ao1.d dVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f12529d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f12529d;
        this.f12529d = i17 + 1;
        if (i17 == 0) {
            return ao1.c.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
