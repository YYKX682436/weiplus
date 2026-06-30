package g4;

/* loaded from: classes5.dex */
public final class b0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f349739d;

    /* renamed from: e, reason: collision with root package name */
    public int f349740e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g4.c0 f349741f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(g4.c0 c0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f349741f = c0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f349739d = obj;
        this.f349740e |= Integer.MIN_VALUE;
        return this.f349741f.mo771x2f8fd3(null, this);
    }
}
