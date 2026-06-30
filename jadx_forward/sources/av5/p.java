package av5;

/* loaded from: classes16.dex */
public final class p extends java.util.AbstractList implements java.util.RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ av5.y f95983d;

    public p(av5.y yVar, av5.n nVar) {
        this.f95983d = yVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public java.lang.Object get(int i17) {
        av5.y yVar = this.f95983d;
        av5.y.a(i17, yVar.f95995a.f95963g.f95953f);
        return yVar.c(yVar.f95995a.f95963g.f95954g + (i17 * 32)).h();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f95983d.f95995a.f95963g.f95953f;
    }
}
