package yy0;

/* loaded from: classes4.dex */
public final class s7 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f549856d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f549857e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yy0.g8 f549858f;

    /* renamed from: g, reason: collision with root package name */
    public int f549859g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s7(yy0.g8 g8Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f549858f = g8Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f549857e = obj;
        this.f549859g |= Integer.MIN_VALUE;
        return this.f549858f.wi(null, this);
    }
}
