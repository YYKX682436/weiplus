package t23;

/* loaded from: classes6.dex */
public class t implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f496799d = 0;

    public t(t23.u uVar, t23.s sVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f496799d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f496799d;
        this.f496799d = i17 + 1;
        if (i17 == 0) {
            return t23.s0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
