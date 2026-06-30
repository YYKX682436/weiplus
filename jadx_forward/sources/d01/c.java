package d01;

/* loaded from: classes6.dex */
public class c implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f306794d = 0;

    public c(d01.d dVar, d01.b bVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f306794d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f306794d;
        this.f306794d = i17 + 1;
        if (i17 == 0) {
            return d01.h.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
