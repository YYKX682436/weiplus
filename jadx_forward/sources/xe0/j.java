package xe0;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f535284d = 0;

    public j(xe0.k kVar, xe0.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f535284d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f535284d;
        this.f535284d = i17 + 1;
        if (i17 == 0) {
            return we0.z0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
