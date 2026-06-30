package jn;

/* loaded from: classes6.dex */
public class e implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f381997d = 0;

    public e(jn.f fVar, jn.d dVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f381997d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f381997d;
        this.f381997d = i17 + 1;
        if (i17 == 0) {
            return jn.c.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
