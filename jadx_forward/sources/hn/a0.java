package hn;

/* loaded from: classes6.dex */
public class a0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f363833d = 0;

    public a0(hn.b0 b0Var, hn.z zVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f363833d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f363833d;
        this.f363833d = i17 + 1;
        if (i17 == 0) {
            return hn.j0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
