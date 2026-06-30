package qx3;

/* loaded from: classes10.dex */
public final class c extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f448876d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f448877e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f448878f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f448879g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ qx3.d f448880h;

    /* renamed from: i, reason: collision with root package name */
    public int f448881i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(qx3.d dVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f448880h = dVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f448879g = obj;
        this.f448881i |= Integer.MIN_VALUE;
        return this.f448880h.b(null, this);
    }
}
