package dd5;

/* loaded from: classes12.dex */
public final class a3 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f310618d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f310619e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dd5.c3 f310620f;

    /* renamed from: g, reason: collision with root package name */
    public int f310621g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(dd5.c3 c3Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f310620f = c3Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f310619e = obj;
        this.f310621g |= Integer.MIN_VALUE;
        return this.f310620f.A(null, this);
    }
}
