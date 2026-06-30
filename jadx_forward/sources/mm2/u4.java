package mm2;

/* loaded from: classes10.dex */
public final class u4 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f410990d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f410991e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f410992f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f410993g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f410994h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ mm2.v4 f410995i;

    /* renamed from: m, reason: collision with root package name */
    public int f410996m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u4(mm2.v4 v4Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f410995i = v4Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f410994h = obj;
        this.f410996m |= Integer.MIN_VALUE;
        return this.f410995i.Q6(null, null, false, this);
    }
}
