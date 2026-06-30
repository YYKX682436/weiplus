package v94;

/* loaded from: classes6.dex */
public class c implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f515697d = 0;

    public c(v94.d dVar, v94.b bVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f515697d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f515697d;
        this.f515697d = i17 + 1;
        if (i17 == 0) {
            return j40.s.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
