package pg0;

/* loaded from: classes6.dex */
public class v implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f435600d = 0;

    public v(pg0.w wVar, pg0.u uVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f435600d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f435600d;
        this.f435600d = i17 + 1;
        if (i17 == 0) {
            return pg0.s1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
