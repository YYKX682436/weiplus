package dk2;

/* loaded from: classes3.dex */
public final class h1 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dk2.r4 f315081a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f315082b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yz5.p f315083c;

    public h1(dk2.r4 r4Var, java.lang.String str, yz5.p pVar) {
        this.f315081a = r4Var;
        this.f315082b = str;
        this.f315083c = pVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap;
        r45.xn1 xn1Var;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap2;
        r45.xn1 xn1Var2;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        int i17 = 0;
        boolean z17 = fVar.f152148a == 0 && fVar.f152149b == 0;
        dk2.r4 r4Var = this.f315081a;
        java.lang.String str = r4Var.f315542d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doGetFinderLiveContact success:");
        sb6.append(z17);
        sb6.append(" username:");
        java.lang.String str2 = this.f315082b;
        sb6.append(str2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        if (z17) {
            gk2.e eVar = r4Var.f315540b;
            if (eVar != null && (concurrentHashMap2 = ((mm2.c1) eVar.a(mm2.c1.class)).f410313b2) != null) {
                r45.bs1 bs1Var = (r45.bs1) fVar.f152151d;
                concurrentHashMap2.put(str2, java.lang.Boolean.valueOf(pm0.v.z((bs1Var == null || (xn1Var2 = (r45.xn1) bs1Var.m75936x14adae67(1)) == null) ? 0 : xn1Var2.m75939xb282bd08(2), 1)));
            }
            if (eVar != null && (concurrentHashMap = ((mm2.c1) eVar.a(mm2.c1.class)).f410318c2) != null) {
                r45.bs1 bs1Var2 = (r45.bs1) fVar.f152151d;
                if (bs1Var2 != null && (xn1Var = (r45.xn1) bs1Var2.m75936x14adae67(1)) != null) {
                    i17 = xn1Var.m75939xb282bd08(2);
                }
                concurrentHashMap.put(str2, java.lang.Boolean.valueOf(pm0.v.z(i17, 2)));
            }
        }
        yz5.p pVar = this.f315083c;
        if (pVar == null) {
            return null;
        }
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
        r45.bs1 bs1Var3 = (r45.bs1) fVar.f152151d;
        pVar.mo149xb9724478(valueOf, bs1Var3 != null ? (r45.xn1) bs1Var3.m75936x14adae67(1) : null);
        return jz5.f0.f384359a;
    }
}
