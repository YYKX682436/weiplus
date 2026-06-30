package dj3;

/* loaded from: classes.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f314443d = 0;

    public f(dj3.g gVar, dj3.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f314443d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f314443d;
        this.f314443d = i17 + 1;
        if (i17 == 0) {
            return dj3.t.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
