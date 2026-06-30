package l80;

/* loaded from: classes6.dex */
public class h implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f398529d = 0;

    public h(l80.i iVar, l80.g gVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f398529d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f398529d;
        this.f398529d = i17 + 1;
        if (i17 == 0) {
            return l80.l.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
