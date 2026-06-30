package gf2;

/* loaded from: classes8.dex */
public final class f implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f352809a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1485x1fb0fe64.p1486x373aa5.C14195x2dafdb49 f352810b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f352811c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.p f352812d;

    public f(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1485x1fb0fe64.p1486x373aa5.C14195x2dafdb49 c14195x2dafdb49, java.lang.String str2, yz5.p pVar) {
        this.f352809a = str;
        this.f352810b = c14195x2dafdb49;
        this.f352811c = str2;
        this.f352812d = pVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j
    public final void a(boolean z17, java.lang.String str, int i17) {
        if (z17) {
            java.lang.String str2 = this.f352809a;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                return;
            }
            g45.b.f350379a.a(str2 == null ? "" : str2, str, 0);
            ((dk5.s5) tg3.t1.a()).Vi(this.f352810b.getContext(), this.f352809a, this.f352811c, 0, "", "", null);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.C16508x1e702dd3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.C16508x1e702dd3.class)).Ai().g(str2);
            if (str2 != null) {
                this.f352812d.mo149xb9724478(0, kz5.c0.d(str2));
            }
        }
    }
}
