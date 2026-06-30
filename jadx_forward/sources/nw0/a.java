package nw0;

/* loaded from: classes5.dex */
public final class a extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f422278d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f422279e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f422280f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ nw0.h f422281g;

    /* renamed from: h, reason: collision with root package name */
    public int f422282h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(nw0.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f422281g = hVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f422280f = obj;
        this.f422282h |= Integer.MIN_VALUE;
        return nw0.h.a(this.f422281g, null, null, this);
    }
}
