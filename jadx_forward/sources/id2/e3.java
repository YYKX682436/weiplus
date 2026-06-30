package id2;

/* loaded from: classes3.dex */
public final class e3 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f372081d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f372082e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ id2.u3 f372083f;

    /* renamed from: g, reason: collision with root package name */
    public int f372084g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e3(id2.u3 u3Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f372083f = u3Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f372082e = obj;
        this.f372084g |= Integer.MIN_VALUE;
        return id2.u3.P6(this.f372083f, null, this);
    }
}
