package g4;

/* loaded from: classes14.dex */
public final class s4 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f350088d;

    /* renamed from: e, reason: collision with root package name */
    public int f350089e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g4.u4 f350090f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f350091g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s4(g4.u4 u4Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f350090f = u4Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f350088d = obj;
        this.f350089e |= Integer.MIN_VALUE;
        return this.f350090f.a(0, null, this);
    }
}
