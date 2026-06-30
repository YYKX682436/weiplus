package h01;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f359385d = 0;

    public j(h01.k kVar, h01.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f359385d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f359385d;
        this.f359385d = i17 + 1;
        if (i17 == 0) {
            return h01.b0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
