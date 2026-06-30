package gw0;

/* loaded from: classes5.dex */
public final class a extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f357662d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gw0.e f357663e;

    /* renamed from: f, reason: collision with root package name */
    public int f357664f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(gw0.e eVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f357663e = eVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f357662d = obj;
        this.f357664f |= Integer.MIN_VALUE;
        return this.f357663e.b(0, this);
    }
}
