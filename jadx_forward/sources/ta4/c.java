package ta4;

/* loaded from: classes6.dex */
public class c implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f498261d = 0;

    public c(ta4.d dVar, ta4.b bVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f498261d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f498261d;
        this.f498261d = i17 + 1;
        if (i17 == 0) {
            return ta4.o.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
