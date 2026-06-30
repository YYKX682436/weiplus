package p05;

/* loaded from: classes6.dex */
public class i implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f432072d = 0;

    public i(p05.j jVar, p05.h hVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f432072d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f432072d;
        this.f432072d = i17 + 1;
        if (i17 == 0) {
            return p05.n1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
