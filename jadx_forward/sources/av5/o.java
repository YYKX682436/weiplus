package av5;

/* loaded from: classes16.dex */
public final class o extends java.util.AbstractList implements java.util.RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ av5.y f95956d;

    public o(av5.y yVar, av5.n nVar) {
        this.f95956d = yVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public java.lang.Object get(int i17) {
        av5.y yVar = this.f95956d;
        av5.y.a(i17, yVar.f95995a.f95964h.f95953f);
        av5.u c17 = yVar.c(yVar.f95995a.f95964h.f95954g + (i17 * 4));
        return new av5.e(c17.f106295a.position(), c17.m());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f95956d.f95995a.f95964h.f95953f;
    }
}
