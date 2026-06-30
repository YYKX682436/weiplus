package zl2;

/* loaded from: classes3.dex */
public final class l1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f555400d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f555401e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zl2.r4 f555402f;

    /* renamed from: g, reason: collision with root package name */
    public int f555403g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(zl2.r4 r4Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f555402f = r4Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f555401e = obj;
        this.f555403g |= Integer.MIN_VALUE;
        return this.f555402f.J(null, null, this);
    }
}
