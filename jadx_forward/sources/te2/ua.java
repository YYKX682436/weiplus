package te2;

/* loaded from: classes3.dex */
public final class ua extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f500015d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f500016e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ te2.hc f500017f;

    /* renamed from: g, reason: collision with root package name */
    public int f500018g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ua(te2.hc hcVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f500017f = hcVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f500016e = obj;
        this.f500018g |= Integer.MIN_VALUE;
        return te2.hc.O6(this.f500017f, this);
    }
}
