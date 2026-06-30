package v60;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f514937d = 0;

    public j(v60.k kVar, v60.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f514937d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f514937d;
        this.f514937d = i17 + 1;
        if (i17 == 0) {
            return v60.a0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
