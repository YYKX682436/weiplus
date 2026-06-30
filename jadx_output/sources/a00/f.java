package a00;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f359d = 0;

    public f(a00.g gVar, a00.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f359d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f359d;
        this.f359d = i17 + 1;
        if (i17 == 0) {
            return v02.h0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
