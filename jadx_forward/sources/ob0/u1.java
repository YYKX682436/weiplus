package ob0;

/* loaded from: classes6.dex */
public class u1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f425506d = 0;

    public u1(ob0.v1 v1Var, ob0.t1 t1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f425506d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f425506d;
        this.f425506d = i17 + 1;
        if (i17 == 0) {
            return vk.q.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
