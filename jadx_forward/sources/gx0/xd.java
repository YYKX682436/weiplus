package gx0;

/* loaded from: classes5.dex */
public final class xd extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f358708d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f358709e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gx0.bf f358710f;

    /* renamed from: g, reason: collision with root package name */
    public int f358711g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xd(gx0.bf bfVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f358710f = bfVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f358709e = obj;
        this.f358711g |= Integer.MIN_VALUE;
        return this.f358710f.f7(this);
    }
}
