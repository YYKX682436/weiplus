package nw1;

/* loaded from: classes14.dex */
public final class c extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f422308d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f422309e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nw1.d f422310f;

    /* renamed from: g, reason: collision with root package name */
    public int f422311g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(nw1.d dVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f422310f = dVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f422309e = obj;
        this.f422311g |= Integer.MIN_VALUE;
        return this.f422310f.b(this);
    }
}
