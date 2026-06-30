package l0;

/* loaded from: classes14.dex */
public final class u2 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f396073d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f396074e;

    /* renamed from: f, reason: collision with root package name */
    public float f396075f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f396076g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ l0.a3 f396077h;

    /* renamed from: i, reason: collision with root package name */
    public int f396078i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(l0.a3 a3Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f396077h = a3Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f396076g = obj;
        this.f396078i |= Integer.MIN_VALUE;
        return this.f396077h.c(null, null, this);
    }
}
