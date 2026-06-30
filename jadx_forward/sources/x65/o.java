package x65;

/* loaded from: classes14.dex */
public final class o extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f533915d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f533916e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f533917f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.sdk.p2597xc267989b.p2598x363585.p2599x5e0f67f.AbstractC20978xe5110392 f533918g;

    /* renamed from: h, reason: collision with root package name */
    public int f533919h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.p314xaae8f345.mm.sdk.p2597xc267989b.p2598x363585.p2599x5e0f67f.AbstractC20978xe5110392 abstractC20978xe5110392, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f533918g = abstractC20978xe5110392;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f533917f = obj;
        this.f533919h |= Integer.MIN_VALUE;
        return this.f533918g.e(null, this);
    }
}
