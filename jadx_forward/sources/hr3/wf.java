package hr3;

/* loaded from: classes12.dex */
public final class wf extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f365690d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f365691e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ hr3.ag f365692f;

    /* renamed from: g, reason: collision with root package name */
    public int f365693g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wf(hr3.ag agVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f365692f = agVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f365691e = obj;
        this.f365693g |= Integer.MIN_VALUE;
        return this.f365692f.g(null, this);
    }
}
