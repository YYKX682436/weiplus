package kw1;

/* loaded from: classes14.dex */
public final class a extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f394341d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f394342e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f394343f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kw1.k f394344g;

    /* renamed from: h, reason: collision with root package name */
    public int f394345h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(kw1.k kVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f394344g = kVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f394343f = obj;
        this.f394345h |= Integer.MIN_VALUE;
        return this.f394344g.c(null, this);
    }
}
