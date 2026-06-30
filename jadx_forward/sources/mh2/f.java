package mh2;

/* loaded from: classes10.dex */
public final class f extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f407856d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mh2.k f407857e;

    /* renamed from: f, reason: collision with root package name */
    public int f407858f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(mh2.k kVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f407857e = kVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f407856d = obj;
        this.f407858f |= Integer.MIN_VALUE;
        return this.f407857e.e(null, this);
    }
}
