package yd;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f542484d = 0;

    public j(yd.k kVar, yd.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f542484d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f542484d;
        this.f542484d = i17 + 1;
        if (i17 == 0) {
            return ka1.i.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
