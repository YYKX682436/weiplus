package g30;

/* loaded from: classes6.dex */
public class v implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f349589d = 0;

    public v(g30.w wVar, g30.u uVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f349589d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f349589d;
        this.f349589d = i17 + 1;
        if (i17 == 0) {
            return g30.l.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
