package rx;

/* loaded from: classes11.dex */
public final class c extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f482188d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rx.f f482189e;

    /* renamed from: f, reason: collision with root package name */
    public int f482190f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(rx.f fVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f482189e = fVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f482188d = obj;
        this.f482190f |= Integer.MIN_VALUE;
        return this.f482189e.Ni(null, this);
    }
}
