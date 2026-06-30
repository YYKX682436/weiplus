package yt3;

/* loaded from: classes10.dex */
public final class h4 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f547014d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f547015e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f547016f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yt3.r4 f547017g;

    /* renamed from: h, reason: collision with root package name */
    public int f547018h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h4(yt3.r4 r4Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f547017g = r4Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f547016f = obj;
        this.f547018h |= Integer.MIN_VALUE;
        return this.f547017g.d(null, this);
    }
}
