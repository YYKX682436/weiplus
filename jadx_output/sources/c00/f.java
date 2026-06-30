package c00;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f36970d = 0;

    public f(c00.g gVar, c00.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f36970d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f36970d;
        this.f36970d = i17 + 1;
        if (i17 == 0) {
            return b00.s.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
