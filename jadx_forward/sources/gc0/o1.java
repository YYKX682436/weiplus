package gc0;

/* loaded from: classes5.dex */
public final class o1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f351764d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gc0.p2 f351765e;

    /* renamed from: f, reason: collision with root package name */
    public int f351766f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(gc0.p2 p2Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f351765e = p2Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f351764d = obj;
        this.f351766f |= Integer.MIN_VALUE;
        return gc0.p2.P6(this.f351765e, null, this);
    }
}
