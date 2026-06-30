package y30;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f540669d = 0;

    public j(y30.k kVar, y30.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f540669d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f540669d;
        this.f540669d = i17 + 1;
        if (i17 == 0) {
            return y30.v.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
