package ab0;

/* loaded from: classes6.dex */
public class c implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f2697d = 0;

    public c(ab0.d dVar, ab0.b bVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f2697d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f2697d;
        this.f2697d = i17 + 1;
        if (i17 == 0) {
            return za0.j.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
