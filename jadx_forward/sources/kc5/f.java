package kc5;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f388094d = 0;

    public f(kc5.g gVar, kc5.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f388094d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f388094d;
        this.f388094d = i17 + 1;
        if (i17 == 0) {
            return kc5.t.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
