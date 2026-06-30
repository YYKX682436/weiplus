package com.p314xaae8f345.mm.p617xd6d92827.p618x316220.p619x60b7c31;

/* loaded from: classes.dex */
public final class h extends lc3.b0 {

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f134705f = "";

    @Override // lc3.c0
    public java.lang.String f() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.z1.f35029x24728b;
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        lc3.e eVar = this.f399423a;
        if (eVar instanceof hq0.b0) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(eVar, "null cannot be cast to non-null type com.tencent.mm.magicbrush.plugin.scl.biz.MagicCardStarterSclBiz");
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((hq0.b0) eVar).f364503x.f375167a, "MagicAdMiniProgram")) {
                java.lang.String optString = data.optString("ad_info");
                this.f134705f = optString != null ? optString : "";
                i17 = 15175;
                com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p617xd6d92827.p618x316220.p619x60b7c31.C4979x8dfad7d2(this.f134705f, i17), com.p314xaae8f345.mm.p617xd6d92827.p618x316220.p619x60b7c31.f.class, new com.p314xaae8f345.mm.p617xd6d92827.p618x316220.p619x60b7c31.g(this));
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String optString2 = data.optString("ad_info");
        if (optString2 == null) {
            optString2 = "";
        }
        sb6.append(optString2);
        sb6.append(',');
        java.lang.String optString3 = data.optString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811);
        sb6.append(optString3 != null ? optString3 : "");
        this.f134705f = sb6.toString();
        i17 = 13297;
        com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p617xd6d92827.p618x316220.p619x60b7c31.C4979x8dfad7d2(this.f134705f, i17), com.p314xaae8f345.mm.p617xd6d92827.p618x316220.p619x60b7c31.f.class, new com.p314xaae8f345.mm.p617xd6d92827.p618x316220.p619x60b7c31.g(this));
    }
}
