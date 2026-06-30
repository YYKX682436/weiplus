package dt;

/* loaded from: classes6.dex */
public class l3 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f324553d = 0;

    public l3(dt.m3 m3Var, dt.k3 k3Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f324553d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f324553d;
        this.f324553d = i17 + 1;
        if (i17 == 0) {
            return dt.b6.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
