package kw1;

/* loaded from: classes14.dex */
public final class i extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f394377d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f394378e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kw1.k f394379f;

    /* renamed from: g, reason: collision with root package name */
    public int f394380g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(kw1.k kVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f394379f = kVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f394378e = obj;
        this.f394380g |= Integer.MIN_VALUE;
        return this.f394379f.b(this);
    }
}
