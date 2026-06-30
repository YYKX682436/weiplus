package pt;

/* loaded from: classes6.dex */
public class v implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f439715d = 0;

    public v(pt.w wVar, pt.u uVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f439715d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f439715d;
        this.f439715d = i17 + 1;
        if (i17 == 0) {
            return ot.x.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
