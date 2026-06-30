package f50;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f341115d = 0;

    public j(f50.k kVar, f50.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f341115d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f341115d;
        this.f341115d = i17 + 1;
        if (i17 == 0) {
            return e50.e1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
