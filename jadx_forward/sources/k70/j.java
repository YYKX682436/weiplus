package k70;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f386198d = 0;

    public j(k70.k kVar, k70.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f386198d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f386198d;
        this.f386198d = i17 + 1;
        if (i17 == 0) {
            return j70.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
