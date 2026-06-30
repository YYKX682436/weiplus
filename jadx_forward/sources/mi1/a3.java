package mi1;

/* loaded from: classes7.dex */
public final class a3 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f408044d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f408045e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mi1.b3 f408046f;

    /* renamed from: g, reason: collision with root package name */
    public int f408047g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(mi1.b3 b3Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f408046f = b3Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f408045e = obj;
        this.f408047g |= Integer.MIN_VALUE;
        return this.f408046f.b(null, this);
    }
}
