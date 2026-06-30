package rj;

/* loaded from: classes6.dex */
public class c implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f477666d = 0;

    public c(rj.d dVar, rj.b bVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f477666d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f477666d;
        this.f477666d = i17 + 1;
        if (i17 == 0) {
            return b51.o.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
