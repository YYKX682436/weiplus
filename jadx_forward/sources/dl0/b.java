package dl0;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f316696d = 0;

    public b(dl0.c cVar, dl0.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f316696d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f316696d;
        this.f316696d = i17 + 1;
        if (i17 == 0) {
            return dl0.i.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
