package dv1;

/* loaded from: classes9.dex */
public final class a extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f325331d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f325332e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f325333f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f325334g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ dv1.b f325335h;

    /* renamed from: i, reason: collision with root package name */
    public int f325336i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(dv1.b bVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f325335h = bVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f325334g = obj;
        this.f325336i |= Integer.MIN_VALUE;
        return this.f325335h.i(null, null, this);
    }
}
