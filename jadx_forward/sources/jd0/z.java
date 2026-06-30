package jd0;

/* loaded from: classes6.dex */
public class z implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f380666d = 0;

    public z(jd0.a0 a0Var, jd0.y yVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f380666d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f380666d;
        this.f380666d = i17 + 1;
        if (i17 == 0) {
            return jd0.c2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
