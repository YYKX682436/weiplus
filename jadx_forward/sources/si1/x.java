package si1;

/* loaded from: classes6.dex */
public class x implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f489832d = 0;

    public x(si1.y yVar, si1.w wVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f489832d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f489832d;
        this.f489832d = i17 + 1;
        if (i17 == 0) {
            return si1.z0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
