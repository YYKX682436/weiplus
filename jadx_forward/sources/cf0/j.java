package cf0;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f122378d = 0;

    public j(cf0.k kVar, cf0.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f122378d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f122378d;
        this.f122378d = i17 + 1;
        if (i17 == 0) {
            return cf0.b0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
