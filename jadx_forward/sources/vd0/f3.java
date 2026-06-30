package vd0;

/* loaded from: classes8.dex */
public final class f3 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f516938d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f516939e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f516940f;

    /* renamed from: g, reason: collision with root package name */
    public int f516941g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f516942h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ vd0.l3 f516943i;

    /* renamed from: m, reason: collision with root package name */
    public int f516944m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3(vd0.l3 l3Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f516943i = l3Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f516942h = obj;
        this.f516944m |= Integer.MIN_VALUE;
        return this.f516943i.Di(null, null, this);
    }
}
