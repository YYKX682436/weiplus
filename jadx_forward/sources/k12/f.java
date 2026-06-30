package k12;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f384714d = 0;

    public f(k12.g gVar, k12.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f384714d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f384714d;
        this.f384714d = i17 + 1;
        if (i17 == 0) {
            return g30.i.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
