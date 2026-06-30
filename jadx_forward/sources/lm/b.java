package lm;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f400829d = 0;

    public b(lm.c cVar, lm.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f400829d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f400829d;
        this.f400829d = i17 + 1;
        if (i17 == 0) {
            return lm.s.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
