package b93;

/* loaded from: classes6.dex */
public class i implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f18593d = 0;

    public i(b93.j jVar, b93.h hVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f18593d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f18593d;
        this.f18593d = i17 + 1;
        if (i17 == 0) {
            return b93.t.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
