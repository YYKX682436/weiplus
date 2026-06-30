package bi4;

/* loaded from: classes6.dex */
public class w implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f21096d = 0;

    public w(bi4.x xVar, bi4.v vVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f21096d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f21096d;
        this.f21096d = i17 + 1;
        if (i17 == 0) {
            return ki4.k0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
