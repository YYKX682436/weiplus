package yx0;

/* loaded from: classes5.dex */
public final class y2 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f549312d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f549313e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f549314f;

    /* renamed from: g, reason: collision with root package name */
    public int f549315g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2(yx0.b8 b8Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f549314f = b8Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f549313e = obj;
        this.f549315g |= Integer.MIN_VALUE;
        return this.f549314f.V(null, null, null, null, this);
    }
}
