package oo2;

/* loaded from: classes6.dex */
public class v implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f428713d = 0;

    public v(oo2.w wVar, oo2.u uVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f428713d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f428713d;
        this.f428713d = i17 + 1;
        if (i17 == 0) {
            return oo2.i.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
