package qk;

/* loaded from: classes6.dex */
public class l4 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f445753d = 0;

    public l4(qk.m4 m4Var, qk.k4 k4Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f445753d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f445753d;
        this.f445753d = i17 + 1;
        if (i17 == 0) {
            return ef0.i3.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
