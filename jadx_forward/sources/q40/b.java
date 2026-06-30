package q40;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f441555d = 0;

    public b(q40.c cVar, q40.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f441555d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f441555d;
        this.f441555d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.z2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
