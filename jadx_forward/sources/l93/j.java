package l93;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f398814d = 0;

    public j(l93.k kVar, l93.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f398814d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f398814d;
        this.f398814d = i17 + 1;
        if (i17 == 0) {
            return l93.d.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
