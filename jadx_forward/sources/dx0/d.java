package dx0;

/* loaded from: classes5.dex */
public final class d extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f325958d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dx0.g f325959e;

    /* renamed from: f, reason: collision with root package name */
    public int f325960f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(dx0.g gVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f325959e = gVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f325958d = obj;
        this.f325960f |= Integer.MIN_VALUE;
        return dx0.g.a(this.f325959e, null, this);
    }
}
