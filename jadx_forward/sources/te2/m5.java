package te2;

/* loaded from: classes3.dex */
public final class m5 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f499759d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f499760e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ te2.p8 f499761f;

    /* renamed from: g, reason: collision with root package name */
    public int f499762g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m5(te2.p8 p8Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f499761f = p8Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f499760e = obj;
        this.f499762g |= Integer.MIN_VALUE;
        return te2.p8.P6(this.f499761f, this);
    }
}
