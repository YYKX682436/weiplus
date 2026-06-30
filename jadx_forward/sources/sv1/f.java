package sv1;

/* loaded from: classes.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f494767d = 0;

    public f(sv1.g gVar, sv1.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f494767d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f494767d;
        this.f494767d = i17 + 1;
        if (i17 == 0) {
            return sv1.d.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
