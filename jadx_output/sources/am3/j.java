package am3;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f8789d = 0;

    public j(am3.k kVar, am3.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f8789d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f8789d;
        this.f8789d = i17 + 1;
        if (i17 == 0) {
            return am3.t.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
