package s40;

/* loaded from: classes6.dex */
public class v implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f484449d = 0;

    public v(s40.w wVar, s40.u uVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f484449d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f484449d;
        this.f484449d = i17 + 1;
        if (i17 == 0) {
            return ci5.i.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
