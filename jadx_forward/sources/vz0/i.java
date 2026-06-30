package vz0;

/* loaded from: classes14.dex */
public final class i extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f523139d;

    /* renamed from: e, reason: collision with root package name */
    public int f523140e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vz0.j f523141f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(vz0.j jVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f523141f = jVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f523139d = obj;
        this.f523140e |= Integer.MIN_VALUE;
        return this.f523141f.mo771x2f8fd3(null, this);
    }
}
