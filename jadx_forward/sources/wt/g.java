package wt;

/* loaded from: classes12.dex */
public final class g extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f530769d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f530770e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ wt.i f530771f;

    /* renamed from: g, reason: collision with root package name */
    public int f530772g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(wt.i iVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f530771f = iVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f530770e = obj;
        this.f530772g |= Integer.MIN_VALUE;
        return this.f530771f.e(null, null, this);
    }
}
