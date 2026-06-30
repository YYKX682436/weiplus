package we0;

/* loaded from: classes6.dex */
public class v implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f526706d = 0;

    public v(we0.w wVar, we0.u uVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f526706d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f526706d;
        this.f526706d = i17 + 1;
        if (i17 == 0) {
            return we0.k1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
