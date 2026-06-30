package m02;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f404077d = 0;

    public j(m02.k kVar, m02.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f404077d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f404077d;
        this.f404077d = i17 + 1;
        if (i17 == 0) {
            return l02.s.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
