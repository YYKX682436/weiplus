package su4;

/* loaded from: classes6.dex */
public class e0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f494407d = 0;

    public e0(su4.f0 f0Var, su4.d0 d0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f494407d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f494407d;
        this.f494407d = i17 + 1;
        if (i17 == 0) {
            return sg0.i3.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
