package sf0;

/* loaded from: classes.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f488479d = 0;

    public f(sf0.g gVar, sf0.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f488479d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f488479d;
        this.f488479d = i17 + 1;
        if (i17 == 0) {
            return sf0.m.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
