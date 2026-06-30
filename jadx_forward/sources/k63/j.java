package k63;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f386080d = 0;

    public j(k63.k kVar, k63.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f386080d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f386080d;
        this.f386080d = i17 + 1;
        if (i17 == 0) {
            return k63.v.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
