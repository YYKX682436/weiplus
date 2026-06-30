package gk0;

/* loaded from: classes9.dex */
public final class a extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f353943d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gk0.b f353944e;

    /* renamed from: f, reason: collision with root package name */
    public int f353945f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(gk0.b bVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f353944e = bVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f353943d = obj;
        this.f353945f |= Integer.MIN_VALUE;
        return this.f353944e.a(null, this);
    }
}
