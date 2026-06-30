package m40;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f404940d = 0;

    public j(m40.k kVar, m40.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f404940d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f404940d;
        this.f404940d = i17 + 1;
        if (i17 == 0) {
            return b92.z0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
