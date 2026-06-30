package jg0;

/* loaded from: classes12.dex */
public final class d extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f381086d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jg0.x f381087e;

    /* renamed from: f, reason: collision with root package name */
    public int f381088f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(jg0.x xVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f381087e = xVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f381086d = obj;
        this.f381088f |= Integer.MIN_VALUE;
        return this.f381087e.I(null, null, this);
    }
}
