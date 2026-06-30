package g65;

/* loaded from: classes6.dex */
public class c implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f350723d = 0;

    public c(g65.d dVar, g65.b bVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f350723d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f350723d;
        this.f350723d = i17 + 1;
        if (i17 == 0) {
            return yp4.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
