package az0;

/* loaded from: classes16.dex */
public final class ua extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f97480d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ az0.xb f97481e;

    /* renamed from: f, reason: collision with root package name */
    public int f97482f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ua(az0.xb xbVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f97481e = xbVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f97480d = obj;
        this.f97482f |= Integer.MIN_VALUE;
        return this.f97481e.m0(this);
    }
}
