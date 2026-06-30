package en1;

/* loaded from: classes6.dex */
public class c implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f336805d = 0;

    public c(en1.d dVar, en1.b bVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f336805d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f336805d;
        this.f336805d = i17 + 1;
        if (i17 == 0) {
            return dn1.k.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
