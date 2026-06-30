package us2;

/* loaded from: classes5.dex */
public final class q extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public int f512059d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f512060e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f512061f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ us2.u f512062g;

    /* renamed from: h, reason: collision with root package name */
    public int f512063h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(us2.u uVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f512062g = uVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f512061f = obj;
        this.f512063h |= Integer.MIN_VALUE;
        return this.f512062g.m(0, null, 0, this);
    }
}
