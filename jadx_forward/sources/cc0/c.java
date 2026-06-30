package cc0;

/* loaded from: classes6.dex */
public class c implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f121945d = 0;

    public c(cc0.d dVar, cc0.b bVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f121945d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f121945d;
        this.f121945d = i17 + 1;
        if (i17 == 0) {
            return rq3.j.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
