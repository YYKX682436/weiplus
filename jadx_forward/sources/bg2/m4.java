package bg2;

/* loaded from: classes2.dex */
public final class m4 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f101836d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f101837e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bg2.o4 f101838f;

    /* renamed from: g, reason: collision with root package name */
    public int f101839g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m4(bg2.o4 o4Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f101838f = o4Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f101837e = obj;
        this.f101839g |= Integer.MIN_VALUE;
        return this.f101838f.b7(this);
    }
}
