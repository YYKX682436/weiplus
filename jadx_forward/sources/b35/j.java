package b35;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f99274d = 0;

    public j(b35.k kVar, b35.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f99274d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f99274d;
        this.f99274d = i17 + 1;
        if (i17 == 0) {
            return b35.d.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
