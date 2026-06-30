package zt1;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f557092d = 0;

    public f(zt1.g gVar, zt1.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f557092d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f557092d;
        this.f557092d = i17 + 1;
        if (i17 == 0) {
            return zt1.d.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
