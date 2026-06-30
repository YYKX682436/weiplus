package aj0;

/* loaded from: classes11.dex */
public final class c extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f86752d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f86753e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ aj0.e f86754f;

    /* renamed from: g, reason: collision with root package name */
    public int f86755g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(aj0.e eVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f86754f = eVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f86753e = obj;
        this.f86755g |= Integer.MIN_VALUE;
        return this.f86754f.a(this);
    }
}
