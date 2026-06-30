package f81;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f341649d = 0;

    public f(f81.g gVar, f81.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f341649d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f341649d;
        this.f341649d = i17 + 1;
        if (i17 == 0) {
            return f81.p.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
