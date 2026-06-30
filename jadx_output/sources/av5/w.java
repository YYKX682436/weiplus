package av5;

/* loaded from: classes16.dex */
public final class w extends java.util.AbstractList implements java.util.RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ av5.y f14459d;

    public w(av5.y yVar, av5.n nVar) {
        this.f14459d = yVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public java.lang.Object get(int i17) {
        av5.y yVar = this.f14459d;
        av5.o0 o0Var = yVar.f14462a;
        av5.y.a(i17, o0Var.f14426c.f14420f);
        return java.lang.Integer.valueOf(yVar.f14464c.getInt(o0Var.f14426c.f14421g + (i17 * 4)));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f14459d.f14462a.f14426c.f14420f;
    }
}
