package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay;

/* loaded from: classes.dex */
public final class p implements com.p314xaae8f345.mm.p794xb0fa9b5e.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 f164179d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f164180e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.q f164181f;

    public p(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.q qVar) {
        this.f164179d = c0Var;
        this.f164180e = i17;
        this.f164181f = qVar;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        rk0.c.c("MicroMsg.JsApiGetAccessibilitySecureRiskInfoWC", "callback result", new java.lang.Object[0]);
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put("is_readmode_enable", java.lang.Boolean.valueOf(bundle.getBoolean("is_readmode_enable")));
        linkedHashMap.put("is_risk", java.lang.Boolean.valueOf(bundle.getBoolean("is_risk")));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.q qVar = this.f164181f;
        qVar.getClass();
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        linkedHashMap.put("errno", 0);
        this.f164179d.a(this.f164180e, qVar.t("ok", linkedHashMap));
    }
}
