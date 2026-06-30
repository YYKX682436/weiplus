package at4;

/* loaded from: classes6.dex */
public class x implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f13986d = 0;

    public x(at4.y yVar, at4.w wVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f13986d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f13986d;
        this.f13986d = i17 + 1;
        if (i17 == 0) {
            return at4.f1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
