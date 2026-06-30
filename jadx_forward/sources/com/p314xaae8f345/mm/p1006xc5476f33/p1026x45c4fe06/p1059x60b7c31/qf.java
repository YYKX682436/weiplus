package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes7.dex */
public final class qf implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.x0 f164413a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f164414b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y f164415c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f164416d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.rf f164417e;

    public qf(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.x0 x0Var, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar, int i18, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.rf rfVar) {
        this.f164413a = x0Var;
        this.f164414b = i17;
        this.f164415c = yVar;
        this.f164416d = i18;
        this.f164417e = rfVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.d0
    /* renamed from: onReady */
    public final void mo50152xb03baf04() {
        boolean z17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.r.h(this.f164413a) != null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.PrivateJSApiPreloadMiniProgramEnv", "onReady, preloaded[" + z17 + ']');
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.rf rfVar = this.f164417e;
        int i17 = this.f164416d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar = this.f164415c;
        if (!z17) {
            yVar.a(i17, rfVar.o("fail"));
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.w6 w6Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.x6.f170351f;
        g0Var.A(this.f164414b, 40);
        yVar.a(i17, rfVar.o("ok"));
    }
}
