package zh4;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f554504d = 0;

    public f(zh4.g gVar, zh4.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f554504d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f554504d;
        this.f554504d = i17 + 1;
        if (i17 == 0) {
            return zh4.r.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
