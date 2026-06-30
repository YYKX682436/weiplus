package wf0;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f527024d = 0;

    public b(wf0.c cVar, wf0.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f527024d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f527024d;
        this.f527024d = i17 + 1;
        if (i17 == 0) {
            return vf0.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
