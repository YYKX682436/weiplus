package m32;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f404789d = 0;

    public j(m32.k kVar, m32.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f404789d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f404789d;
        this.f404789d = i17 + 1;
        if (i17 == 0) {
            return m32.z.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
