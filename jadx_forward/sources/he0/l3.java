package he0;

/* loaded from: classes6.dex */
public class l3 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f362285d = 0;

    public l3(he0.m3 m3Var, he0.k3 k3Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f362285d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f362285d;
        this.f362285d = i17 + 1;
        if (i17 == 0) {
            return he0.b6.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
