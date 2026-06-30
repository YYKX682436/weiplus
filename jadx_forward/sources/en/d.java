package en;

/* loaded from: classes6.dex */
public class d implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f336769d = 0;

    public d(en.e eVar, en.c cVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f336769d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f336769d;
        this.f336769d = i17 + 1;
        if (i17 == 0) {
            return en.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
