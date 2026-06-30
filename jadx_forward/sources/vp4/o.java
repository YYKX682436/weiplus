package vp4;

/* loaded from: classes10.dex */
public final class o extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f520588d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f520589e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f520590f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f520591g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ vp4.p f520592h;

    /* renamed from: i, reason: collision with root package name */
    public int f520593i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(vp4.p pVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f520592h = pVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f520591g = obj;
        this.f520593i |= Integer.MIN_VALUE;
        return this.f520592h.d(null, null, this);
    }
}
