package xs;

/* loaded from: classes6.dex */
public class v implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f537808d = 0;

    public v(xs.w wVar, xs.u uVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f537808d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f537808d;
        this.f537808d = i17 + 1;
        if (i17 == 0) {
            return dl0.i.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
