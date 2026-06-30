package vt3;

/* loaded from: classes5.dex */
public final class k extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f521535d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vt3.l f521536e;

    /* renamed from: f, reason: collision with root package name */
    public int f521537f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(vt3.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f521536e = lVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f521535d = obj;
        this.f521537f |= Integer.MIN_VALUE;
        return vt3.l.a(this.f521536e, this);
    }
}
