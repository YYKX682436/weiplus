package fc;

/* loaded from: classes16.dex */
public abstract class c extends fc.o implements java.util.Iterator {

    /* renamed from: g, reason: collision with root package name */
    public final fc.s f342438g;

    public c(fc.s sVar) {
        super(sVar);
        this.f342438g = sVar;
    }

    public abstract java.lang.Object a(int i17);

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int mo129318x47548d9f = mo129318x47548d9f();
        this.f342455f = mo129318x47548d9f;
        if (mo129318x47548d9f >= 0) {
            return a(mo129318x47548d9f);
        }
        throw new java.util.NoSuchElementException();
    }

    @Override // fc.o
    /* renamed from: nextIndex */
    public final int mo129318x47548d9f() {
        int i17;
        java.lang.Object obj;
        int i18 = this.f342454e;
        fc.s sVar = this.f342438g;
        if (i18 != sVar.f342433d) {
            throw new java.util.ConcurrentModificationException();
        }
        java.lang.Object[] objArr = sVar.f342461i;
        int i19 = this.f342455f;
        while (true) {
            i17 = i19 - 1;
            if (i19 <= 0 || !((obj = objArr[i17]) == null || obj == fc.s.f342459n)) {
                break;
            }
            i19 = i17;
        }
        return i17;
    }
}
