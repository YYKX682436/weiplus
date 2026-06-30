package cb1;

/* loaded from: classes6.dex */
public class c implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f40218d = 0;

    public c(cb1.d dVar, cb1.b bVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f40218d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f40218d;
        this.f40218d = i17 + 1;
        if (i17 == 0) {
            return cb1.d1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
