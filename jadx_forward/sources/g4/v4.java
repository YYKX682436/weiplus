package g4;

/* loaded from: classes5.dex */
public final class v4 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f350125d;

    /* renamed from: e, reason: collision with root package name */
    public int f350126e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g4.w4 f350127f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v4(g4.w4 w4Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f350127f = w4Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f350125d = obj;
        this.f350126e |= Integer.MIN_VALUE;
        return this.f350127f.a(null, this);
    }
}
