package xa3;

/* loaded from: classes6.dex */
public class v implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f534348d = 0;

    public v(xa3.w wVar, xa3.u uVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f534348d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f534348d;
        this.f534348d = i17 + 1;
        if (i17 == 0) {
            return xa3.l0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
