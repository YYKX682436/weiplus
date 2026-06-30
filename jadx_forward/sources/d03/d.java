package d03;

/* loaded from: classes6.dex */
public class d implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f306895d = 0;

    public d(d03.e eVar, d03.c cVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f306895d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f306895d;
        this.f306895d = i17 + 1;
        if (i17 == 0) {
            return d03.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
