package gx0;

/* loaded from: classes5.dex */
public final class l1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f358183d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f358184e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gx0.r1 f358185f;

    /* renamed from: g, reason: collision with root package name */
    public int f358186g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(gx0.r1 r1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f358185f = r1Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f358184e = obj;
        this.f358186g |= Integer.MIN_VALUE;
        return this.f358185f.n7(null, null, null, this);
    }
}
