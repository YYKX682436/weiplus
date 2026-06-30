package uz;

/* loaded from: classes6.dex */
public class g0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f513583d = 0;

    public g0(uz.h0 h0Var, uz.f0 f0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f513583d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f513583d;
        this.f513583d = i17 + 1;
        if (i17 == 0) {
            return uz.o.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
