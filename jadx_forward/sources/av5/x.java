package av5;

/* loaded from: classes16.dex */
public final class x extends java.util.AbstractList implements java.util.RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ av5.y f95993d;

    public x(av5.y yVar, av5.n nVar) {
        this.f95993d = yVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public java.lang.Object get(int i17) {
        av5.y yVar = this.f95993d;
        av5.v vVar = yVar.f95996b;
        av5.o0 o0Var = yVar.f95995a;
        av5.y.a(i17, o0Var.f95959c.f95953f);
        return vVar.get(yVar.f95997c.getInt(o0Var.f95959c.f95954g + (i17 * 4)));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f95993d.f95995a.f95959c.f95953f;
    }
}
