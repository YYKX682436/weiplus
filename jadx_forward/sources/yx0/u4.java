package yx0;

/* loaded from: classes5.dex */
public final class u4 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f549216d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f549217e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f549218f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f549219g;

    /* renamed from: h, reason: collision with root package name */
    public int f549220h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u4(yx0.b8 b8Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f549219g = b8Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f549218f = obj;
        this.f549220h |= Integer.MIN_VALUE;
        return yx0.b8.k(this.f549219g, null, null, this);
    }
}
