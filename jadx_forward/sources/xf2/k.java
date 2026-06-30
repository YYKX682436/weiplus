package xf2;

/* loaded from: classes8.dex */
public final class k implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f535817a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1491x36113a39.p1492x373aa5.AbstractC14206xe2e594d5 f535818b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f535819c;

    public k(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1491x36113a39.p1492x373aa5.AbstractC14206xe2e594d5 abstractC14206xe2e594d5, java.lang.String str2) {
        this.f535817a = str;
        this.f535818b = abstractC14206xe2e594d5;
        this.f535819c = str2;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j
    public final void a(boolean z17, java.lang.String str, int i17) {
        if (z17) {
            java.lang.String str2 = this.f535817a;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                return;
            }
            g45.b.f350379a.a(str2 == null ? "" : str2, str, 0);
            ((dk5.s5) tg3.t1.a()).Vi(this.f535818b.getContext(), this.f535817a, this.f535819c, 0, "", "", null);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.C16508x1e702dd3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.C16508x1e702dd3.class)).Ai().g(str2);
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("share_username", str2);
            jSONObject.put("type", 6);
            jSONObject.put("share_type", 1);
            java.lang.String jSONObject2 = jSONObject.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
            i95.m c17 = i95.n0.c(ml2.r0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            ml2.r0.hj((ml2.r0) c17, ml2.b4.N1, jSONObject2, 0L, null, null, null, null, null, 252, null);
        }
    }
}
