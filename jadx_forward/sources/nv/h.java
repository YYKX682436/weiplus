package nv;

/* loaded from: classes6.dex */
public class h implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f421866d = 0;

    public h(nv.i iVar, nv.g gVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f421866d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f421866d;
        this.f421866d = i17 + 1;
        if (i17 == 0) {
            return nv.c.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
