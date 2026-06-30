package ia0;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f371422d = 0;

    public j(ia0.k kVar, ia0.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f371422d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f371422d;
        this.f371422d = i17 + 1;
        if (i17 == 0) {
            return ia0.p.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
