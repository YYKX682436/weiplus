package jg0;

/* loaded from: classes12.dex */
public final class h extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f381103d;

    /* renamed from: e, reason: collision with root package name */
    public long f381104e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f381105f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ jg0.x f381106g;

    /* renamed from: h, reason: collision with root package name */
    public int f381107h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(jg0.x xVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f381106g = xVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f381105f = obj;
        this.f381107h |= Integer.MIN_VALUE;
        return this.f381106g.D(null, this);
    }
}
