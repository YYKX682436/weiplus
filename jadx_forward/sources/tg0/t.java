package tg0;

/* loaded from: classes6.dex */
public class t implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f500643d = 0;

    public t(tg0.u uVar, tg0.s sVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f500643d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f500643d;
        this.f500643d = i17 + 1;
        if (i17 == 0) {
            return sg0.d2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
