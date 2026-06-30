package xp4;

/* loaded from: classes10.dex */
public final class c extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f537481d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xp4.e f537482e;

    /* renamed from: f, reason: collision with root package name */
    public int f537483f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(xp4.e eVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f537482e = eVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f537481d = obj;
        this.f537483f |= Integer.MIN_VALUE;
        return this.f537482e.a(null, this);
    }
}
