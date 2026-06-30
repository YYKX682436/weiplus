package hm0;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f363722d = 0;

    public n(hm0.o oVar, hm0.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f363722d < 7;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f363722d;
        this.f363722d = i17 + 1;
        switch (i17) {
            case 0:
                return o90.r.INSTANCE;
            case 1:
                return el4.c0.INSTANCE;
            case 2:
                return com.p314xaae8f345.mm.p689xc5a27af6.app.p691xdb7d1c3f.s0.INSTANCE;
            case 3:
                return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.l.INSTANCE;
            case 4:
                return ah0.b2.INSTANCE;
            case 5:
                return gt.l5.INSTANCE;
            case 6:
                return ez3.n.INSTANCE;
            default:
                throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 7");
        }
    }
}
