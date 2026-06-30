package m90;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f406414d = 0;

    public j(m90.k kVar, m90.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f406414d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f406414d;
        this.f406414d = i17 + 1;
        if (i17 == 0) {
            return m90.e1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
