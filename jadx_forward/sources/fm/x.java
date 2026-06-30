package fm;

/* loaded from: classes6.dex */
public class x implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f345544d = 0;

    public x(fm.y yVar, fm.w wVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f345544d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f345544d;
        this.f345544d = i17 + 1;
        if (i17 == 0) {
            return fm.i0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
