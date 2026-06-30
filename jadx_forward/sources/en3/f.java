package en3;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f336829d = 0;

    public f(en3.g gVar, en3.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f336829d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f336829d;
        this.f336829d = i17 + 1;
        if (i17 == 0) {
            return en3.y.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
