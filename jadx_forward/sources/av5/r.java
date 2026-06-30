package av5;

/* loaded from: classes16.dex */
public final class r extends java.util.AbstractList implements java.util.RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ av5.y f95987d;

    public r(av5.y yVar, av5.n nVar) {
        this.f95987d = yVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public java.lang.Object get(int i17) {
        av5.y yVar = this.f95987d;
        av5.y.a(i17, yVar.f95995a.f95965i.f95953f);
        return yVar.c(yVar.f95995a.f95965i.f95954g + (i17 * 8)).n();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f95987d.f95995a.f95965i.f95953f;
    }
}
