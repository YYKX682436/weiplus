package ch4;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f41513d = 0;

    public f(ch4.g gVar, ch4.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f41513d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f41513d;
        this.f41513d = i17 + 1;
        if (i17 == 0) {
            return ch4.t.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
