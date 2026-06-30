package e00;

/* loaded from: classes9.dex */
public final class r extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f327346d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f327347e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e00.s f327348f;

    /* renamed from: g, reason: collision with root package name */
    public int f327349g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(e00.s sVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f327348f = sVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f327347e = obj;
        this.f327349g |= Integer.MIN_VALUE;
        return this.f327348f.b(null, null, null, null, this);
    }
}
