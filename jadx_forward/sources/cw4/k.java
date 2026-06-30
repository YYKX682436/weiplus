package cw4;

/* loaded from: classes6.dex */
public class k implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f305765d = 0;

    public k(cw4.l lVar, cw4.j jVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f305765d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f305765d;
        this.f305765d = i17 + 1;
        if (i17 == 0) {
            return cw4.x0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
