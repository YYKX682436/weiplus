package av5;

/* loaded from: classes16.dex */
public final class v extends java.util.AbstractList implements java.util.RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ av5.y f95991d;

    public v(av5.y yVar, av5.n nVar) {
        this.f95991d = yVar;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public java.lang.String get(int i17) {
        av5.y yVar = this.f95991d;
        av5.y.a(i17, yVar.f95995a.f95958b.f95953f);
        return yVar.c(yVar.c(yVar.f95995a.f95958b.f95954g + (i17 * 4)).m()).r().f95946e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f95991d.f95995a.f95958b.f95953f;
    }
}
