package sn1;

/* loaded from: classes9.dex */
public final class k extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public int f491572d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f491573e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f491574f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ sn1.z f491575g;

    /* renamed from: h, reason: collision with root package name */
    public int f491576h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(sn1.z zVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f491575g = zVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f491574f = obj;
        this.f491576h |= Integer.MIN_VALUE;
        return this.f491575g.a(0, null, null, null, null, this);
    }
}
