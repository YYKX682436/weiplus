package h13;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f359668d = 0;

    public j(h13.k kVar, h13.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f359668d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f359668d;
        this.f359668d = i17 + 1;
        if (i17 == 0) {
            return h13.d0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
