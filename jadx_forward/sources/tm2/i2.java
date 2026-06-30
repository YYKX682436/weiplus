package tm2;

/* loaded from: classes3.dex */
public final class i2 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tm2.s2 f502058a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f502059b;

    public i2(tm2.s2 s2Var, int i17) {
        this.f502058a = s2Var;
        this.f502059b = i17;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1
    public final void a(boolean z17, java.lang.String str) {
        tm2.s2 s2Var = this.f502058a;
        boolean z18 = ((mm2.c1) s2Var.c(mm2.c1.class)).Y4;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.u8 u8Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.u8.f184132a;
        if (z18) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.p8 p8Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.p8.f183993a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n8.f183942b = 0;
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.B(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.p8.f183996d, 1142L);
            gk2.e eVar = s2Var.f101142a;
            int i17 = this.f502059b;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("0-vBitrate:");
            hn0.v vVar = hn0.v.f363973a;
            sb6.append(hn0.v.f363975c);
            u8Var.b(eVar, cg1.c.f4376x366c91de, i17, "externalErrorCancel", sb6.toString());
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.p8 p8Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.p8.f183993a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n8.f183942b = 0;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.B(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.p8.f183996d, 1132L);
        gk2.e eVar2 = s2Var.f101142a;
        int i18 = this.f502059b;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("0-vBitrate:");
        hn0.v vVar2 = hn0.v.f363973a;
        sb7.append(hn0.v.f363975c);
        u8Var.b(eVar2, 1132, i18, "secondaryErrorCancel", sb7.toString());
    }
}
