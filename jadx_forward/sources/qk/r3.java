package qk;

/* loaded from: classes6.dex */
public class r3 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f445856d = 0;

    public r3(qk.s3 s3Var, qk.q3 q3Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f445856d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f445856d;
        this.f445856d = i17 + 1;
        if (i17 == 0) {
            return ef0.z2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
