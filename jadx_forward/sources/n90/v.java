package n90;

/* loaded from: classes6.dex */
public class v implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f417369d = 0;

    public v(n90.w wVar, n90.u uVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f417369d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f417369d;
        this.f417369d = i17 + 1;
        if (i17 == 0) {
            return n90.j1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
