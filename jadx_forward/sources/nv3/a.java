package nv3;

/* loaded from: classes5.dex */
public final class a extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rv3.h f422176d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f422177e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dv3.c f422178f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f422179g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ev3.d f422180h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f422181i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(rv3.h hVar, boolean z17, dv3.c cVar, int i17, ev3.d dVar, int i18) {
        super(2);
        this.f422176d = hVar;
        this.f422177e = z17;
        this.f422178f = cVar;
        this.f422179g = i17;
        this.f422180h = dVar;
        this.f422181i = i18;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        ev3.d dVar;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        rv3.h hVar = this.f422176d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a = hVar.f481928d;
        boolean z17 = this.f422177e;
        c16997xb0aa383a.L = z17;
        dv3.c cVar = this.f422178f;
        if (cVar != null) {
            cVar.m8147xed6e4d18(this.f422179g);
        }
        if (booleanValue && (dVar = this.f422180h) != null) {
            dVar.b(this.f422181i, hVar.f481928d, z17, hVar.f481929e);
        }
        return jz5.f0.f384359a;
    }
}
