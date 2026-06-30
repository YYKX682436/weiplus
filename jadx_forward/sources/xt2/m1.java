package xt2;

/* loaded from: classes10.dex */
public final class m1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f538417d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f538418e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ xt2.u1 f538419f;

    /* renamed from: g, reason: collision with root package name */
    public int f538420g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(xt2.u1 u1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f538419f = u1Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f538418e = obj;
        this.f538420g |= Integer.MIN_VALUE;
        return xt2.u1.a(this.f538419f, this);
    }
}
