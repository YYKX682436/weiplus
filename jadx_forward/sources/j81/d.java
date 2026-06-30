package j81;

/* loaded from: classes6.dex */
public class d implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f379677d = 0;

    public d(j81.e eVar, j81.c cVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f379677d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f379677d;
        this.f379677d = i17 + 1;
        if (i17 == 0) {
            return j81.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
