package zu4;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f557409d = 0;

    public b(zu4.c cVar, zu4.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f557409d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f557409d;
        this.f557409d = i17 + 1;
        if (i17 == 0) {
            return zu4.j.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
