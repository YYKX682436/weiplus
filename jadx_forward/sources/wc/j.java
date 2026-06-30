package wc;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f525989d = 0;

    public j(wc.k kVar, wc.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f525989d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f525989d;
        this.f525989d = i17 + 1;
        if (i17 == 0) {
            return vc.t.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
