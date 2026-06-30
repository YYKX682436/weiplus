package q31;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f441448d = 0;

    public j(q31.k kVar, q31.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f441448d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f441448d;
        this.f441448d = i17 + 1;
        if (i17 == 0) {
            return q31.v.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
