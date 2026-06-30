package ib2;

/* loaded from: classes2.dex */
public final class x extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f371709d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ib2.i0 f371710e;

    /* renamed from: f, reason: collision with root package name */
    public int f371711f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(ib2.i0 i0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f371710e = i0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f371709d = obj;
        this.f371711f |= Integer.MIN_VALUE;
        java.lang.Object a17 = ib2.i0.a(this.f371710e, null, this);
        return a17 == pz5.a.f440719d ? a17 : p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(a17);
    }
}
