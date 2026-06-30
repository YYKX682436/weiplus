package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public class d4 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.j3 f159097a;

    public d4(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.j3 j3Var) {
        this.f159097a = j3Var;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        final km5.b c17 = km5.u.c();
        boolean o17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.r.o(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.x0.WASERVICE, 2, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.d0() { // from class: com.tencent.mm.plugin.appbrand.d4$$a
            @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.d0
            /* renamed from: onReady */
            public final void mo50152xb03baf04() {
                km5.b.this.c(java.lang.Boolean.TRUE);
            }
        }, "AppBrandRuntimeBoostStrategy.tryGetProcessPreloadedPageView");
        this.f159097a.h("tryGetProcessPreloadedPageView shouldWait[%b]", java.lang.Boolean.valueOf(o17));
        if (o17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.w.g(this.f159097a.f159983b.f156336n, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1193x3606cc.C12595xe6b43f9f.f35259x1504001a);
        } else {
            c17.c(java.lang.Boolean.FALSE);
        }
        return java.lang.Boolean.valueOf(o17);
    }
}
