package jh3;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f381352d = 0;

    public f(jh3.g gVar, jh3.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f381352d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f381352d;
        this.f381352d = i17 + 1;
        if (i17 == 0) {
            return jh3.s.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
