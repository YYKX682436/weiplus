package uz;

/* loaded from: classes6.dex */
public class w0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f513630d = 0;

    public w0(uz.x0 x0Var, uz.v0 v0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f513630d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f513630d;
        this.f513630d = i17 + 1;
        if (i17 == 0) {
            return uz.w1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
