package jg0;

/* loaded from: classes12.dex */
public final class f extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public long f381096d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f381097e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f381098f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ jg0.x f381099g;

    /* renamed from: h, reason: collision with root package name */
    public int f381100h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(jg0.x xVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f381099g = xVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f381098f = obj;
        this.f381100h |= Integer.MIN_VALUE;
        return this.f381099g.M(this);
    }
}
