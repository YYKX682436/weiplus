package vr0;

/* loaded from: classes14.dex */
public final class t extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f521045d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f521046e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f521047f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ vr0.z f521048g;

    /* renamed from: h, reason: collision with root package name */
    public int f521049h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(vr0.z zVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f521048g = zVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f521047f = obj;
        this.f521049h |= Integer.MIN_VALUE;
        return this.f521048g.n(null, this);
    }
}
