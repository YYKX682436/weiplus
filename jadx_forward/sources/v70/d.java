package v70;

/* loaded from: classes6.dex */
public class d implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f515138d = 0;

    public d(v70.e eVar, v70.c cVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f515138d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f515138d;
        this.f515138d = i17 + 1;
        if (i17 == 0) {
            return v70.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
