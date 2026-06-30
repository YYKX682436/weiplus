package be0;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f19446d = 0;

    public b(be0.c cVar, be0.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f19446d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f19446d;
        this.f19446d = i17 + 1;
        if (i17 == 0) {
            return be0.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
