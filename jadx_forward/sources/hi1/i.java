package hi1;

/* loaded from: classes6.dex */
public class i implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f363026d = 0;

    public i(hi1.j jVar, hi1.h hVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f363026d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f363026d;
        this.f363026d = i17 + 1;
        if (i17 == 0) {
            return hi1.g.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
