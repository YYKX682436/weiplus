package m30;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f404635d = 0;

    public f(m30.g gVar, m30.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f404635d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f404635d;
        this.f404635d = i17 + 1;
        if (i17 == 0) {
            return m30.p.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
