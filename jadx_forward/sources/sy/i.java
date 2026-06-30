package sy;

/* loaded from: classes6.dex */
public class i implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f495344d = 0;

    public i(sy.j jVar, sy.h hVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f495344d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f495344d;
        this.f495344d = i17 + 1;
        if (i17 == 0) {
            return sy.y.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
