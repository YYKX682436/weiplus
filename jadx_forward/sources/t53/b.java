package t53;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f497255d = 0;

    public b(t53.c cVar, t53.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f497255d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f497255d;
        this.f497255d = i17 + 1;
        if (i17 == 0) {
            return t53.n0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
