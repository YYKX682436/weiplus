package dt;

/* loaded from: classes6.dex */
public class x implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f324627d = 0;

    public x(dt.y yVar, dt.w wVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f324627d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f324627d;
        this.f324627d = i17 + 1;
        if (i17 == 0) {
            return dt.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
