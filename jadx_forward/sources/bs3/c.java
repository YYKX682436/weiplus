package bs3;

/* loaded from: classes4.dex */
public final class c extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f105521d;

    /* renamed from: e, reason: collision with root package name */
    public int f105522e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bs3.d f105523f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(bs3.d dVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f105523f = dVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f105521d = obj;
        this.f105522e |= Integer.MIN_VALUE;
        return this.f105523f.mo771x2f8fd3(null, this);
    }
}
