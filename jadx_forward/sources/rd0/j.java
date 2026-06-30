package rd0;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f475744d = 0;

    public j(rd0.k kVar, rd0.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f475744d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f475744d;
        this.f475744d = i17 + 1;
        if (i17 == 0) {
            return qd0.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
