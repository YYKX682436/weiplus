package le5;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f399702d = 0;

    public b(le5.c cVar, le5.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f399702d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f399702d;
        this.f399702d = i17 + 1;
        if (i17 == 0) {
            return fo.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
