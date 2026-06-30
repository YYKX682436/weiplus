package df2;

/* loaded from: classes3.dex */
public final class ke extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f312106d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f312107e;

    /* renamed from: f, reason: collision with root package name */
    public float f312108f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f312109g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ df2.qe f312110h;

    /* renamed from: i, reason: collision with root package name */
    public int f312111i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ke(df2.qe qeVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f312110h = qeVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f312109g = obj;
        this.f312111i |= Integer.MIN_VALUE;
        return this.f312110h.c7(null, null, this);
    }
}
