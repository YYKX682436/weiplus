package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes4.dex */
public final class t5 implements com.p314xaae8f345.mm.p794xb0fa9b5e.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 f164990d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f164991e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.u5 f164992f;

    public t5(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.u5 u5Var) {
        this.f164990d = e9Var;
        this.f164991e = i17;
        this.f164992f = u5Var;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11917xa9d79856 c11917xa9d79856 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11917xa9d79856) obj;
        boolean z17 = c11917xa9d79856.f160049f;
        int i17 = this.f164991e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = this.f164990d;
        if (!z17) {
            e9Var.a(i17, null);
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("unreadRedCount", java.lang.Integer.valueOf(c11917xa9d79856.f160047d));
        e9Var.a(i17, this.f164992f.p("ok", hashMap));
    }
}
