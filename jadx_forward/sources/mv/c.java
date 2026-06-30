package mv;

/* loaded from: classes6.dex */
public class c implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f413016d = 0;

    public c(mv.d dVar, mv.b bVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f413016d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f413016d;
        this.f413016d = i17 + 1;
        if (i17 == 0) {
            return yn1.u.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
