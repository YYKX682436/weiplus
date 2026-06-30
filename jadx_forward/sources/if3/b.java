package if3;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f372690d = 0;

    public b(if3.c cVar, if3.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f372690d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f372690d;
        this.f372690d = i17 + 1;
        if (i17 == 0) {
            return if3.x.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
