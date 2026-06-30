package m90;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f406393d = 0;

    public f(m90.g gVar, m90.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f406393d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f406393d;
        this.f406393d = i17 + 1;
        if (i17 == 0) {
            return m90.b1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
