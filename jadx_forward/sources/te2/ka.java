package te2;

/* loaded from: classes8.dex */
public final class ka implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f499708a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ te2.hc f499709b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f499710c;

    public ka(java.lang.String str, te2.hc hcVar, java.lang.String str2) {
        this.f499708a = str;
        this.f499709b = hcVar;
        this.f499710c = str2;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j
    public final void a(boolean z17, java.lang.String str, int i17) {
        if (z17) {
            java.lang.String str2 = this.f499708a;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                return;
            }
            g45.b.f350379a.a(str2 == null ? "" : str2, str, 0);
            tg3.a1 a17 = tg3.t1.a();
            te2.hc hcVar = this.f499709b;
            ((dk5.s5) a17).Zi(hcVar.m158354x19263085(), this.f499708a, this.f499710c, 0, "", "", null, new com.p314xaae8f345.mm.p956x88360526.C11131x285e79f8(hcVar.F, 1));
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.j.c("已发送", null, hcVar.m158354x19263085(), null, null);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.C16508x1e702dd3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.C16508x1e702dd3.class)).Ai().g(str2);
        }
    }
}
