package hr3;

/* loaded from: classes12.dex */
public final class rf extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f365486d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hr3.ag f365487e;

    /* renamed from: f, reason: collision with root package name */
    public int f365488f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rf(hr3.ag agVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f365487e = agVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f365486d = obj;
        this.f365488f |= Integer.MIN_VALUE;
        return this.f365487e.b(null, null, null, this);
    }
}
