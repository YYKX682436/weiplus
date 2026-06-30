package ht1;

/* loaded from: classes6.dex */
public class r implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f366334d = 0;

    public r(ht1.s sVar, ht1.q qVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f366334d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f366334d;
        this.f366334d = i17 + 1;
        if (i17 == 0) {
            return ht1.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
