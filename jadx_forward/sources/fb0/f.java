package fb0;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f342357d = 0;

    public f(fb0.g gVar, fb0.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f342357d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f342357d;
        this.f342357d = i17 + 1;
        if (i17 == 0) {
            return gb0.o.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
