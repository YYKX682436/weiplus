package n13;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f415641d = 0;

    public f(n13.g gVar, n13.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f415641d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f415641d;
        this.f415641d = i17 + 1;
        if (i17 == 0) {
            return dk5.z.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
