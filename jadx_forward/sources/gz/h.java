package gz;

/* loaded from: classes6.dex */
public class h implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f359183d = 0;

    public h(gz.i iVar, gz.g gVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f359183d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f359183d;
        this.f359183d = i17 + 1;
        if (i17 == 0) {
            return kp.k1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
