package c35;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f38251d = 0;

    public f(c35.g gVar, c35.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f38251d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f38251d;
        this.f38251d = i17 + 1;
        if (i17 == 0) {
            return vf0.o1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
