package dk2;

/* loaded from: classes3.dex */
public final class qc extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f315497d;

    /* renamed from: e, reason: collision with root package name */
    public int f315498e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f315499f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ dk2.rc f315500g;

    /* renamed from: h, reason: collision with root package name */
    public int f315501h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qc(dk2.rc rcVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f315500g = rcVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f315499f = obj;
        this.f315501h |= Integer.MIN_VALUE;
        return dk2.rc.a(this.f315500g, null, this);
    }
}
