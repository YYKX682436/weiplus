package hm0;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f363716d = 0;

    public f(hm0.g gVar, hm0.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f363716d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f363716d;
        this.f363716d = i17 + 1;
        if (i17 == 0) {
            return c01.c2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
