package zs3;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f556798d = 0;

    public f(zs3.g gVar, zs3.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f556798d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f556798d;
        this.f556798d = i17 + 1;
        if (i17 == 0) {
            return bt3.z1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
