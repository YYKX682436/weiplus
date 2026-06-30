package kd0;

/* loaded from: classes6.dex */
public class w implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f388219d = 0;

    public w(kd0.x xVar, kd0.v vVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f388219d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f388219d;
        this.f388219d = i17 + 1;
        if (i17 == 0) {
            return jd0.x1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
