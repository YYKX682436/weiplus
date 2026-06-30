package vh4;

/* loaded from: classes.dex */
public final class d extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f518594d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vh4.e f518595e;

    /* renamed from: f, reason: collision with root package name */
    public int f518596f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(vh4.e eVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f518595e = eVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f518594d = obj;
        this.f518596f |= Integer.MIN_VALUE;
        return this.f518595e.a(this);
    }
}
