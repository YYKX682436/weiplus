package az0;

/* loaded from: classes16.dex */
public final class w9 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f97558d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ az0.xb f97559e;

    /* renamed from: f, reason: collision with root package name */
    public int f97560f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w9(az0.xb xbVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f97559e = xbVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f97558d = obj;
        this.f97560f |= Integer.MIN_VALUE;
        java.lang.Object p07 = this.f97559e.p0(null, null, this);
        return p07 == pz5.a.f440719d ? p07 : p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p07);
    }
}
