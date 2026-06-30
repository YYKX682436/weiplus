package ms5;

/* loaded from: classes10.dex */
public final class b extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f412672d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f412673e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f412674f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p2886xc5476f33.p2887xb4097826.p2888x3e7b17c6.api.p2889xb06a26a3.AbstractC25298xba75790f f412675g;

    /* renamed from: h, reason: collision with root package name */
    public int f412676h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.p314xaae8f345.p2886xc5476f33.p2887xb4097826.p2888x3e7b17c6.api.p2889xb06a26a3.AbstractC25298xba75790f abstractC25298xba75790f, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f412675g = abstractC25298xba75790f;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f412674f = obj;
        this.f412676h |= Integer.MIN_VALUE;
        return this.f412675g.n(null, null, this);
    }
}
