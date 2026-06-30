package a82;

/* loaded from: classes6.dex */
public class d implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f1982d = 0;

    public d(a82.e eVar, a82.c cVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f1982d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f1982d;
        this.f1982d = i17 + 1;
        if (i17 == 0) {
            return a82.w1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
