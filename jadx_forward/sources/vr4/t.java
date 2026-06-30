package vr4;

/* loaded from: classes6.dex */
public class t implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f521332d = 0;

    public t(vr4.u uVar, vr4.s sVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f521332d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f521332d;
        this.f521332d = i17 + 1;
        if (i17 == 0) {
            return vr4.t0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
