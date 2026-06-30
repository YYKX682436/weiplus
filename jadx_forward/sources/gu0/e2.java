package gu0;

/* loaded from: classes5.dex */
public final class e2 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f357194d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f357195e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gu0.k2 f357196f;

    /* renamed from: g, reason: collision with root package name */
    public int f357197g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(gu0.k2 k2Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f357196f = k2Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f357195e = obj;
        this.f357197g |= Integer.MIN_VALUE;
        return this.f357196f.x(this);
    }
}
