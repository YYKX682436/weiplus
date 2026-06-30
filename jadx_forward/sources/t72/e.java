package t72;

/* loaded from: classes4.dex */
public final class e extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f497582d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f497583e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ t72.l f497584f;

    /* renamed from: g, reason: collision with root package name */
    public int f497585g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(t72.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f497584f = lVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f497583e = obj;
        this.f497585g |= Integer.MIN_VALUE;
        return this.f497584f.V6(null, this);
    }
}
