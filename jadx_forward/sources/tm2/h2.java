package tm2;

/* loaded from: classes3.dex */
public final class h2 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tm2.s2 f502053a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f502054b;

    public h2(tm2.s2 s2Var, int i17) {
        this.f502053a = s2Var;
        this.f502054b = i17;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1
    public final void a(boolean z17, java.lang.String str) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("PARAM_FINDER_LIVE_LIVE_FINISH_MANUAL", true);
        tm2.s2 s2Var = this.f502053a;
        fm2.b bVar = s2Var.f101134c;
        if (bVar != null) {
            bVar.mo46557x60d69242(qo0.b.H, bundle);
        }
        boolean z18 = ((mm2.c1) s2Var.c(mm2.c1.class)).Y4;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.u8 u8Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.u8.f184132a;
        if (z18) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.p8 p8Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.p8.f183993a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n8.f183942b = 0;
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.B(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.p8.f183996d, 1141L);
            gk2.e eVar = s2Var.f101142a;
            int i17 = this.f502054b;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("0-vBitrate:");
            hn0.v vVar = hn0.v.f363973a;
            sb6.append(hn0.v.f363975c);
            u8Var.b(eVar, cg1.b.f4374x366c91de, i17, "externalErrorClose", sb6.toString());
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.p8 p8Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.p8.f183993a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n8.f183942b = 0;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.B(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.p8.f183996d, 1131L);
        gk2.e eVar2 = s2Var.f101142a;
        int i18 = this.f502054b;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("0-vBitrate:");
        hn0.v vVar2 = hn0.v.f363973a;
        sb7.append(hn0.v.f363975c);
        u8Var.b(eVar2, 1131, i18, "secondaryErrorClose", sb7.toString());
    }
}
