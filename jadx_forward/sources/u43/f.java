package u43;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f506183d = 0;

    public f(u43.g gVar, u43.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f506183d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f506183d;
        this.f506183d = i17 + 1;
        if (i17 == 0) {
            return j60.d.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
