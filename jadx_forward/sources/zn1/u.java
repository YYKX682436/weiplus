package zn1;

/* loaded from: classes11.dex */
public final class u extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f556009d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zn1.w f556010e;

    /* renamed from: f, reason: collision with root package name */
    public int f556011f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(zn1.w wVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f556010e = wVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f556009d = obj;
        this.f556011f |= Integer.MIN_VALUE;
        return this.f556010e.a(null, null, this);
    }
}
