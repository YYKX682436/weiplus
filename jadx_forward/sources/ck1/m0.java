package ck1;

/* loaded from: classes4.dex */
public final class m0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f123882d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f123883e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ck1.n0 f123884f;

    /* renamed from: g, reason: collision with root package name */
    public int f123885g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(ck1.n0 n0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f123884f = n0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f123883e = obj;
        this.f123885g |= Integer.MIN_VALUE;
        return this.f123884f.a(null, this);
    }
}
