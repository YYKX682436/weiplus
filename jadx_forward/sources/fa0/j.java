package fa0;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f342191d = 0;

    public j(fa0.k kVar, fa0.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f342191d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f342191d;
        this.f342191d = i17 + 1;
        if (i17 == 0) {
            return va3.l0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
