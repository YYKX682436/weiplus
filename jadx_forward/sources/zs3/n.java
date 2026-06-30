package zs3;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f556804d = 0;

    public n(zs3.o oVar, zs3.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f556804d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f556804d;
        this.f556804d = i17 + 1;
        if (i17 == 0) {
            return zs3.a0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
