package tk;

/* loaded from: classes6.dex */
public class l implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f501400d = 0;

    public l(tk.m mVar, tk.k kVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f501400d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f501400d;
        this.f501400d = i17 + 1;
        if (i17 == 0) {
            return ox.a0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
