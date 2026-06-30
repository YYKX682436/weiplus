package vr0;

/* loaded from: classes14.dex */
public final class d extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f520993d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f520994e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f520995f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ vr0.z f520996g;

    /* renamed from: h, reason: collision with root package name */
    public int f520997h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(vr0.z zVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f520996g = zVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f520995f = obj;
        this.f520997h |= Integer.MIN_VALUE;
        return this.f520996g.K(this);
    }
}
