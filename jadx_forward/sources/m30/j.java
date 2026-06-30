package m30;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f404638d = 0;

    public j(m30.k kVar, m30.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f404638d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f404638d;
        this.f404638d = i17 + 1;
        if (i17 == 0) {
            return m30.r.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
