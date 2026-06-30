package dk2;

/* loaded from: classes3.dex */
public final class c6 implements hn0.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gk2.e f314810a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dk2.xf f314811b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yz5.s f314812c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dk2.k6 f314813d;

    public c6(gk2.e eVar, dk2.xf xfVar, yz5.s sVar, dk2.k6 k6Var) {
        this.f314810a = eVar;
        this.f314811b = xfVar;
        this.f314812c = sVar;
        this.f314813d = k6Var;
    }

    @Override // hn0.i
    /* renamed from: callback */
    public void mo57125xf5bc2045(int i17, android.os.Bundle bundle) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("on enterRoom finish, liveData.business(LiveCommonSlice::class.java).enableAudioMode():");
        gk2.e eVar = this.f314810a;
        sb6.append(((mm2.c1) eVar.a(mm2.c1.class)).l7());
        sb6.append(" audioModeHolderBm:");
        sb6.append(((mm2.c1) eVar.a(mm2.c1.class)).I4);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveExternalHelper", sb6.toString());
        dk2.xf xfVar = this.f314811b;
        if (i17 > 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.u8.f184136e = c01.id.a();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.p8 p8Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.p8.f183993a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.r8 r8Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.t8.f184088a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.p8.c(p8Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.t8.A.f184073b, null, false, false, 14, null);
            if (xfVar != null) {
                dk2.xf.e(xfVar, ((mm2.e1) eVar.a(mm2.e1.class)).f410521r.m75942xfb822ef2(0), ((mm2.e1) eVar.a(mm2.e1.class)).f410516m, ((mm2.c1) eVar.a(mm2.c1.class)).f410399q, 1, false, new dk2.a6(this.f314810a, this.f314811b, this.f314813d, this.f314812c, i17), 16, null);
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.p8 p8Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.p8.f183993a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.r8 r8Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.t8.f184088a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.p8.c(p8Var2, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.t8.f184113z.f184073b, null, false, true, 6, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderLiveExternalHelper", "enter room fail");
        if (xfVar != null) {
            dk2.xf.f(xfVar, 0, dk2.b6.f314771d, 1, null);
        }
        this.f314812c.v(java.lang.Boolean.FALSE, java.lang.Integer.valueOf(i17), -1, null, null);
    }
}
