package wv;

/* loaded from: classes6.dex */
public class t implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f531423d = 0;

    public t(wv.u uVar, wv.s sVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f531423d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f531423d;
        this.f531423d = i17 + 1;
        if (i17 == 0) {
            return wv.h0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
