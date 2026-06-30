package wd0;

/* loaded from: classes6.dex */
public class t implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f526298d = 0;

    public t(wd0.u uVar, wd0.s sVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f526298d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f526298d;
        this.f526298d = i17 + 1;
        if (i17 == 0) {
            return u14.u.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
