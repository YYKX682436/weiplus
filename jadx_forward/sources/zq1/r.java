package zq1;

/* loaded from: classes6.dex */
public class r implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f556554d = 0;

    public r(zq1.s sVar, zq1.q qVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f556554d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f556554d;
        this.f556554d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.d.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
