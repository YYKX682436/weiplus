package av5;

/* loaded from: classes16.dex */
public final class t extends java.util.AbstractList implements java.util.RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ av5.y f14456d;

    public t(av5.y yVar, av5.n nVar) {
        this.f14456d = yVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public java.lang.Object get(int i17) {
        av5.y yVar = this.f14456d;
        av5.y.a(i17, yVar.f14462a.f14427d.f14420f);
        return yVar.c(yVar.f14462a.f14427d.f14421g + (i17 * 12)).q();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f14456d.f14462a.f14427d.f14420f;
    }
}
