package zl2;

/* loaded from: classes3.dex */
public final class i5 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public boolean f555356d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f555357e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f555358f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ zl2.j5 f555359g;

    /* renamed from: h, reason: collision with root package name */
    public int f555360h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i5(zl2.j5 j5Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f555359g = j5Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f555358f = obj;
        this.f555360h |= Integer.MIN_VALUE;
        return this.f555359g.d(null, null, false, this);
    }
}
