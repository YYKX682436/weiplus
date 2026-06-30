package yl2;

/* loaded from: classes3.dex */
public final class m0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f544580d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yl2.g1 f544581e;

    /* renamed from: f, reason: collision with root package name */
    public int f544582f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(yl2.g1 g1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f544581e = g1Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f544580d = obj;
        this.f544582f |= Integer.MIN_VALUE;
        return this.f544581e.l(null, false, this);
    }
}
