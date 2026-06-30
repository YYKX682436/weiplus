package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc;

/* loaded from: classes15.dex */
public class n0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.r0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t f162234a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f162235b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f162236c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.o0 f162237d;

    public n0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.o0 o0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t tVar, org.json.JSONObject jSONObject, int i17) {
        this.f162237d = o0Var;
        this.f162234a = tVar;
        this.f162235b = jSONObject;
        this.f162236c = i17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.r0
    public void a(android.view.View view, int i17, int i18, int i19, int i27) {
        java.lang.String f17;
        if (view instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.C12075x8f3ab8b2) {
            this.f162237d.getClass();
            boolean optBoolean = this.f162235b.optBoolean("independent", false);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t tVar = this.f162234a;
            c01.l2 b17 = tVar.M(optBoolean).b(this.f162236c, false);
            if (b17 == null || (f17 = b17.f(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, null)) == null) {
                return;
            }
            android.view.ViewGroup m50864xb42a7cc = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.C12075x8f3ab8b2) view).m50864xb42a7cc();
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, f17);
            hashMap.put("scrollLeft", java.lang.Integer.valueOf(ik1.w.d(i17)));
            hashMap.put("scrollTop", java.lang.Integer.valueOf(ik1.w.d(i18)));
            hashMap.put("scrollWidth", java.lang.Integer.valueOf(ik1.w.d(m50864xb42a7cc.getWidth())));
            hashMap.put("scrollHeight", java.lang.Integer.valueOf(ik1.w.d(m50864xb42a7cc.getHeight())));
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.q0 q0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.q0();
            q0Var.t(hashMap);
            tVar.i(q0Var, null);
        }
    }
}
