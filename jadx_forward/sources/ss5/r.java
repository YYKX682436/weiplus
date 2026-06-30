package ss5;

/* loaded from: classes6.dex */
public class r implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f493705d = 0;

    public r(ss5.s sVar, ss5.q qVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f493705d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f493705d;
        this.f493705d = i17 + 1;
        if (i17 == 0) {
            return vd2.c3.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
