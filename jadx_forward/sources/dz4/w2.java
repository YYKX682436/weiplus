package dz4;

/* loaded from: classes12.dex */
public final class w2 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f326976d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f326977e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f326978f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ dz4.y2 f326979g;

    /* renamed from: h, reason: collision with root package name */
    public int f326980h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(dz4.y2 y2Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f326979g = y2Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f326978f = obj;
        this.f326980h |= Integer.MIN_VALUE;
        return dz4.y2.a(this.f326979g, null, null, null, this);
    }
}
