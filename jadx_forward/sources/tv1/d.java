package tv1;

/* loaded from: classes6.dex */
public class d implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f503789d = 0;

    public d(tv1.e eVar, tv1.c cVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f503789d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f503789d;
        this.f503789d = i17 + 1;
        if (i17 == 0) {
            return tv1.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
