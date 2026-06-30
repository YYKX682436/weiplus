package tg3;

/* loaded from: classes4.dex */
public class x implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f500758d = 0;

    public x(tg3.y yVar, tg3.w wVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f500758d < 12;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f500758d;
        this.f500758d = i17 + 1;
        switch (i17) {
            case 0:
                return n90.s1.INSTANCE;
            case 1:
                return n90.d1.INSTANCE;
            case 2:
                return oh1.y1.INSTANCE;
            case 3:
                return n90.v1.INSTANCE;
            case 4:
                return n90.g1.INSTANCE;
            case 5:
                return n90.a1.INSTANCE;
            case 6:
                return n90.j1.INSTANCE;
            case 7:
                return n90.u0.INSTANCE;
            case 8:
                return n90.x0.INSTANCE;
            case 9:
                return n90.y1.INSTANCE;
            case 10:
                return n90.p1.INSTANCE;
            case 11:
                return n90.m1.INSTANCE;
            default:
                throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 12");
        }
    }
}
