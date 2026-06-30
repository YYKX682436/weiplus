package ah3;

/* loaded from: classes12.dex */
public final class g extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f86407d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f86408e;

    /* renamed from: f, reason: collision with root package name */
    public int f86409f;

    /* renamed from: g, reason: collision with root package name */
    public int f86410g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f86411h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ah3.m f86412i;

    /* renamed from: m, reason: collision with root package name */
    public int f86413m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(ah3.m mVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f86412i = mVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f86411h = obj;
        this.f86413m |= Integer.MIN_VALUE;
        return this.f86412i.d(0, 0, this);
    }
}
