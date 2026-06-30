package l60;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f398275d = 0;

    public b(l60.c cVar, l60.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f398275d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f398275d;
        this.f398275d = i17 + 1;
        if (i17 == 0) {
            return l60.g.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
