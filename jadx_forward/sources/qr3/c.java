package qr3;

/* loaded from: classes4.dex */
public final class c extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f447612d;

    /* renamed from: e, reason: collision with root package name */
    public int f447613e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qr3.d f447614f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(qr3.d dVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f447614f = dVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f447612d = obj;
        this.f447613e |= Integer.MIN_VALUE;
        return this.f447614f.mo771x2f8fd3(null, this);
    }
}
