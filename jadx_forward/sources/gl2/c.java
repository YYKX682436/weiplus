package gl2;

/* loaded from: classes3.dex */
public final class c extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f354333d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f354334e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gl2.e f354335f;

    /* renamed from: g, reason: collision with root package name */
    public int f354336g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(gl2.e eVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f354335f = eVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f354334e = obj;
        this.f354336g |= Integer.MIN_VALUE;
        return this.f354335f.m(this);
    }
}
