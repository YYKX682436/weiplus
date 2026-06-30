package nu0;

/* loaded from: classes5.dex */
public final class c3 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f421437d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nu0.b4 f421438e;

    /* renamed from: f, reason: collision with root package name */
    public int f421439f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(nu0.b4 b4Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f421438e = b4Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f421437d = obj;
        this.f421439f |= Integer.MIN_VALUE;
        return this.f421438e.v7(this);
    }
}
