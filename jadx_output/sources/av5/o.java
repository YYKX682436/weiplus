package av5;

/* loaded from: classes16.dex */
public final class o extends java.util.AbstractList implements java.util.RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ av5.y f14423d;

    public o(av5.y yVar, av5.n nVar) {
        this.f14423d = yVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public java.lang.Object get(int i17) {
        av5.y yVar = this.f14423d;
        av5.y.a(i17, yVar.f14462a.f14431h.f14420f);
        av5.u c17 = yVar.c(yVar.f14462a.f14431h.f14421g + (i17 * 4));
        return new av5.e(c17.f24762a.position(), c17.m());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f14423d.f14462a.f14431h.f14420f;
    }
}
