package ne;

/* loaded from: classes6.dex */
public class h implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f418014d = 0;

    public h(ne.i iVar, ne.g gVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f418014d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f418014d;
        this.f418014d = i17 + 1;
        if (i17 == 0) {
            return k91.g0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
