package c00;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f118503d = 0;

    public f(c00.g gVar, c00.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f118503d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f118503d;
        this.f118503d = i17 + 1;
        if (i17 == 0) {
            return b00.s.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
