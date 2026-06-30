package hg2;

/* loaded from: classes3.dex */
public final class j extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f362892d;

    /* renamed from: e, reason: collision with root package name */
    public int f362893e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f362894f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ hg2.l f362895g;

    /* renamed from: h, reason: collision with root package name */
    public int f362896h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(hg2.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f362895g = lVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f362894f = obj;
        this.f362896h |= Integer.MIN_VALUE;
        return hg2.l.Z6(this.f362895g, 0, this);
    }
}
