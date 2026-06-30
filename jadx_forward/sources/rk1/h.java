package rk1;

/* loaded from: classes7.dex */
public final class h implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.g f477946a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ rk1.e f477947b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f477948c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.nio.ByteBuffer f477949d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7115x3f2395b7 f477950e;

    public h(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.g gVar, rk1.e eVar, java.lang.String str, java.nio.ByteBuffer byteBuffer, com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7115x3f2395b7 c7115x3f2395b7) {
        this.f477946a = gVar;
        this.f477947b = eVar;
        this.f477948c = str;
        this.f477949d = byteBuffer;
        this.f477950e = c7115x3f2395b7;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.d0
    public final void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.g gVar = this.f477946a;
        long L = gVar.L();
        long G = gVar.G();
        com.p314xaae8f345.mm.p627x45c4fe06.p628xa770a5da.C5134xe8c411a2 a17 = rk1.c.a(rk1.m.f477963e);
        rk1.e eVar = this.f477947b;
        rk1.m.f477966h.put(eVar.f477937a, new rk1.d(this.f477946a, a17.m43197x519c6ca1(L, G, eVar.f477937a, eVar.f477939c, eVar.f477940d, eVar.f477941e, this.f477948c, java.lang.Runtime.getRuntime().availableProcessors(), this.f477949d), this.f477949d, this.f477950e));
        gVar.k(new rk1.g(eVar), false);
    }
}
