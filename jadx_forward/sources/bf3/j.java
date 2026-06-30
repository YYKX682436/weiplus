package bf3;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f101168d = 0;

    public j(bf3.k kVar, bf3.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f101168d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f101168d;
        this.f101168d = i17 + 1;
        if (i17 == 0) {
            return bf3.z0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
