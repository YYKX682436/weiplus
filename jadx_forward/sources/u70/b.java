package u70;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f506616d = 0;

    public b(u70.c cVar, u70.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f506616d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f506616d;
        this.f506616d = i17 + 1;
        if (i17 == 0) {
            return u70.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
