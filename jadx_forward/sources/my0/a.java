package my0;

/* loaded from: classes5.dex */
public final class a extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f414176d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f414177e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ my0.e f414178f;

    /* renamed from: g, reason: collision with root package name */
    public int f414179g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(my0.e eVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f414178f = eVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f414177e = obj;
        this.f414179g |= Integer.MIN_VALUE;
        java.lang.Object e17 = this.f414178f.e(null, null, this);
        return e17 == pz5.a.f440719d ? e17 : p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(e17);
    }
}
