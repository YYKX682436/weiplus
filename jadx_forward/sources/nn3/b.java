package nn3;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f420208d = 0;

    public b(nn3.c cVar, nn3.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f420208d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f420208d;
        this.f420208d = i17 + 1;
        if (i17 == 0) {
            return nn3.g.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
