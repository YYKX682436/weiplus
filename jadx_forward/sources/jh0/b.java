package jh0;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f381302d = 0;

    public b(jh0.c cVar, jh0.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f381302d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f381302d;
        this.f381302d = i17 + 1;
        if (i17 == 0) {
            return jh0.r.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
