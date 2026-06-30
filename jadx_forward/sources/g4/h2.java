package g4;

/* loaded from: classes5.dex */
public final class h2 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f349882d;

    /* renamed from: e, reason: collision with root package name */
    public int f349883e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g4.i2 f349884f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(g4.i2 i2Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f349884f = i2Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f349882d = obj;
        this.f349883e |= Integer.MIN_VALUE;
        return this.f349884f.mo771x2f8fd3(null, this);
    }
}
