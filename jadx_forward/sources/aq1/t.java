package aq1;

/* loaded from: classes6.dex */
public class t implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f94626d = 0;

    public t(aq1.u uVar, aq1.s sVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f94626d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f94626d;
        this.f94626d = i17 + 1;
        if (i17 == 0) {
            return aq1.r0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
