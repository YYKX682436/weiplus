package bg2;

/* loaded from: classes2.dex */
public final class h3 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f101662d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f101663e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f101664f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f101665g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ bg2.z3 f101666h;

    /* renamed from: i, reason: collision with root package name */
    public int f101667i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3(bg2.z3 z3Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f101666h = z3Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f101665g = obj;
        this.f101667i |= Integer.MIN_VALUE;
        return bg2.z3.Y6(this.f101666h, null, null, this);
    }
}
