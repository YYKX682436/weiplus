package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

/* loaded from: classes11.dex */
public final class r2 implements bi4.m0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.s2 f255770a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f255771b;

    public r2(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.s2 s2Var, android.content.Context context) {
        this.f255770a = s2Var;
        this.f255771b = context;
    }

    @Override // bi4.m0
    public void a(int i17, java.lang.Object obj) {
        java.lang.Boolean bool = obj instanceof java.lang.Boolean ? (java.lang.Boolean) obj : null;
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.s2 s2Var = this.f255770a;
        s2Var.getClass();
        android.content.Context context = this.f255771b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        uj4.e eVar = (uj4.e) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).e(uj4.e.class);
        if (eVar != null) {
            mj4.h hVar = s2Var.f255799n;
            java.lang.String l17 = hVar != null ? ((mj4.k) hVar).l() : null;
            if (l17 == null || r26.n0.N(l17)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(eVar.f509950d, "syncUpdateLike: failed");
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.p2274x2e7b10.C18676x82a91782 V6 = eVar.V6();
            if (V6 != null) {
                V6.f255315p.put(l17, java.lang.Boolean.valueOf(booleanValue));
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.n2 U6 = eVar.U6();
            if (U6 != null) {
                ((cj4.i1) U6.C).c0();
            }
        }
    }
}
