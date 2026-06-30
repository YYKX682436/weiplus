package fk4;

/* loaded from: classes12.dex */
public final class g extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f345136d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f345137e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fk4.k f345138f;

    /* renamed from: g, reason: collision with root package name */
    public int f345139g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(fk4.k kVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f345138f = kVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f345137e = obj;
        this.f345139g |= Integer.MIN_VALUE;
        return this.f345138f.d(this);
    }
}
