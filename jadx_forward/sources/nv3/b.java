package nv3;

/* loaded from: classes5.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ev3.d f422182d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f422183e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a f422184f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f422185g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ rv3.v f422186h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ev3.d dVar, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a, boolean z17, rv3.v vVar) {
        super(2);
        this.f422182d = dVar;
        this.f422183e = i17;
        this.f422184f = c16997xb0aa383a;
        this.f422185g = z17;
        this.f422186h = vVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        ev3.d dVar;
        if (((java.lang.Boolean) obj).booleanValue() && (dVar = this.f422182d) != null) {
            dVar.i(this.f422183e, this.f422184f, this.f422185g, this.f422186h);
        }
        return jz5.f0.f384359a;
    }
}
