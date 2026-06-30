package zc5;

/* loaded from: classes12.dex */
public final class k extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f552999d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f553000e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f553001f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f553002g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f553003h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ zc5.m f553004i;

    /* renamed from: m, reason: collision with root package name */
    public int f553005m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(zc5.m mVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f553004i = mVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f553003h = obj;
        this.f553005m |= Integer.MIN_VALUE;
        return this.f553004i.c(null, false, this);
    }
}
