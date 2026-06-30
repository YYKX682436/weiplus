package tg3;

/* loaded from: classes6.dex */
public class t implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f500750d = 0;

    public t(tg3.u uVar, tg3.s sVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f500750d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f500750d;
        this.f500750d = i17 + 1;
        if (i17 == 0) {
            return ih3.j.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
