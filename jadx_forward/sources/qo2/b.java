package qo2;

/* loaded from: classes3.dex */
public final class b extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f447101d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f447102e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qo2.e f447103f;

    /* renamed from: g, reason: collision with root package name */
    public int f447104g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(qo2.e eVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f447103f = eVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f447102e = obj;
        this.f447104g |= Integer.MIN_VALUE;
        return qo2.e.a(this.f447103f, null, this);
    }
}
