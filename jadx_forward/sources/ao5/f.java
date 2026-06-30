package ao5;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f94100d = 0;

    public f(ao5.g gVar, ao5.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f94100d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f94100d;
        this.f94100d = i17 + 1;
        if (i17 == 0) {
            return ao5.t.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
