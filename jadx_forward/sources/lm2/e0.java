package lm2;

/* loaded from: classes3.dex */
public final class e0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f400914d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f400915e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ lm2.h0 f400916f;

    /* renamed from: g, reason: collision with root package name */
    public int f400917g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(lm2.h0 h0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f400916f = h0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f400915e = obj;
        this.f400917g |= Integer.MIN_VALUE;
        return this.f400916f.f(null, false, this);
    }
}
