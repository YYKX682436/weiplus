package co5;

/* loaded from: classes2.dex */
public final class a extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f125339d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ co5.b f125340e;

    /* renamed from: f, reason: collision with root package name */
    public int f125341f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(co5.b bVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f125340e = bVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f125339d = obj;
        this.f125341f |= Integer.MIN_VALUE;
        return this.f125340e.a(null, this);
    }
}
