package s72;

/* loaded from: classes12.dex */
public final class k extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f485606d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f485607e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ s72.j0 f485608f;

    /* renamed from: g, reason: collision with root package name */
    public int f485609g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(s72.j0 j0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f485608f = j0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f485607e = obj;
        this.f485609g |= Integer.MIN_VALUE;
        return this.f485608f.V6(this);
    }
}
