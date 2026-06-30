package sj4;

/* loaded from: classes.dex */
public class z implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f490440d = 0;

    public z(sj4.a0 a0Var, sj4.y yVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f490440d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f490440d;
        this.f490440d = i17 + 1;
        if (i17 == 0) {
            return sj4.l1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
