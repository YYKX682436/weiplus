package we0;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f526644d = 0;

    public f(we0.g gVar, we0.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f526644d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f526644d;
        this.f526644d = i17 + 1;
        if (i17 == 0) {
            return we0.x0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
