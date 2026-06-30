package ud0;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f508106d = 0;

    public b(ud0.c cVar, ud0.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f508106d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f508106d;
        this.f508106d = i17 + 1;
        if (i17 == 0) {
            return td0.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
