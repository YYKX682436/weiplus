package w50;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f524482d = 0;

    public f(w50.g gVar, w50.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f524482d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f524482d;
        this.f524482d = i17 + 1;
        if (i17 == 0) {
            return w50.l.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
