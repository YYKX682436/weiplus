package jg0;

/* loaded from: classes12.dex */
public final class k extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f381113d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f381114e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ jg0.x f381115f;

    /* renamed from: g, reason: collision with root package name */
    public int f381116g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(jg0.x xVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f381115f = xVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f381114e = obj;
        this.f381116g |= Integer.MIN_VALUE;
        return jg0.x.H(this.f381115f, this);
    }
}
