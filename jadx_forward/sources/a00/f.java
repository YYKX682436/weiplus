package a00;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f81892d = 0;

    public f(a00.g gVar, a00.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f81892d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f81892d;
        this.f81892d = i17 + 1;
        if (i17 == 0) {
            return v02.h0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
