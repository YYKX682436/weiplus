package ra0;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f475005d = 0;

    public j(ra0.k kVar, ra0.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f475005d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f475005d;
        this.f475005d = i17 + 1;
        if (i17 == 0) {
            return en3.c0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
