package pt0;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f439741d = 0;

    public f(pt0.g gVar, pt0.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f439741d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f439741d;
        this.f439741d = i17 + 1;
        if (i17 == 0) {
            return yk.j.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
