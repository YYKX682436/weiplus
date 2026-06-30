package zf0;

/* loaded from: classes12.dex */
public final class o extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f554024d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f554025e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zf0.v0 f554026f;

    /* renamed from: g, reason: collision with root package name */
    public int f554027g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(zf0.v0 v0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f554026f = v0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f554025e = obj;
        this.f554027g |= Integer.MIN_VALUE;
        return zf0.v0.E(this.f554026f, null, this);
    }
}
