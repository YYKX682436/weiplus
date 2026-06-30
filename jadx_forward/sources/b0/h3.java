package b0;

/* loaded from: classes14.dex */
public final class h3 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f97865d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f97866e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b0.m3 f97867f;

    /* renamed from: g, reason: collision with root package name */
    public int f97868g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3(b0.m3 m3Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f97867f = m3Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f97866e = obj;
        this.f97868g |= Integer.MIN_VALUE;
        return this.f97867f.b(0L, this);
    }
}
