package j25;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f378844d = 0;

    public f(j25.g gVar, j25.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f378844d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f378844d;
        this.f378844d = i17 + 1;
        if (i17 == 0) {
            return j25.p.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
