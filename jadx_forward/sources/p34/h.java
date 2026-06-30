package p34;

/* loaded from: classes6.dex */
public class h implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f433213d = 0;

    public h(p34.i iVar, p34.g gVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f433213d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f433213d;
        this.f433213d = i17 + 1;
        if (i17 == 0) {
            return p34.q.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
