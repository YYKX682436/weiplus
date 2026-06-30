package bg2;

/* loaded from: classes2.dex */
public final class c3 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f101507d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f101508e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bg2.z3 f101509f;

    /* renamed from: g, reason: collision with root package name */
    public int f101510g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(bg2.z3 z3Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f101509f = z3Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f101508e = obj;
        this.f101510g |= Integer.MIN_VALUE;
        return this.f101509f.Z6(this);
    }
}
