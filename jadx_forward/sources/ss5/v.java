package ss5;

/* loaded from: classes6.dex */
public class v implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f493708d = 0;

    public v(ss5.w wVar, ss5.u uVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f493708d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f493708d;
        this.f493708d = i17 + 1;
        if (i17 == 0) {
            return vd2.e5.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
