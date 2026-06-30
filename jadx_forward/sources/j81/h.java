package j81;

/* loaded from: classes6.dex */
public class h implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f379680d = 0;

    public h(j81.i iVar, j81.g gVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f379680d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f379680d;
        this.f379680d = i17 + 1;
        if (i17 == 0) {
            return k81.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
