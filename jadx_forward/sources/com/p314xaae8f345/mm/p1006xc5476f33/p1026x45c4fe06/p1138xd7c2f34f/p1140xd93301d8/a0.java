package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8;

/* loaded from: classes7.dex */
public final class a0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.a1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8.d0 f166473a;

    public a0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8.d0 d0Var) {
        this.f166473a = d0Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.a1
    public boolean a(java.lang.String[] instanceIdHolder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(instanceIdHolder, "instanceIdHolder");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.h0 h0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.u0.f170732h;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.u0 a17 = h0Var.a();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8.d0 d0Var = this.f166473a;
        com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.s d17 = a17.d(d0Var.f166483f);
        if (d17 == null) {
            instanceIdHolder[0] = d0Var.f166483f;
            return true;
        }
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        if (z65.c.a()) {
            iz5.a.a(2, d17.f129218b);
        }
        instanceIdHolder[0] = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.u.f(d0Var.f166482e, d17.f129217a, true);
        com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.r.u(h0Var.a(), d17.f129217a, d17.f129218b, false, 4, null);
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p0
    /* renamed from: c */
    public void b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 c11809xbc286be4, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 c12559xbdae8559, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandPreRenderColdStartService.Loader", "run()-OnPreLaunchResultListener.onResult, result:" + i17 + " config:" + c11809xbc286be4);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8.d0 d0Var = this.f166473a;
        if (c11809xbc286be4 == null) {
            l81.v0 v0Var = d0Var.f166485h;
            if (v0Var != null) {
                l81.v0.b(v0Var, -3, null, 2, null);
                return;
            }
            return;
        }
        d0Var.f166482e.b(c11809xbc286be4);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1139xc4aaf986.C12362x460991bc c12362x460991bc = d0Var.f166482e;
        c11809xbc286be4.S = c12362x460991bc.f166451u;
        c11809xbc286be4.V = c12362x460991bc.f166453w;
        c11809xbc286be4.f158836p2 = c12362x460991bc.G;
        c11809xbc286be4.f158844x2 = c12362x460991bc.N;
        com.p314xaae8f345.mm.p942x40c3c02f.C11105x57aff1b9 c11105x57aff1b9 = c12362x460991bc.f166447q;
        c11809xbc286be4.N1 = c11105x57aff1b9 != null ? c11105x57aff1b9.f151952h : 0;
        c11809xbc286be4.H = c11105x57aff1b9 != null ? c11105x57aff1b9.f151954m : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.g0.a(c11809xbc286be4, c12559xbdae8559);
        yz5.p pVar = d0Var.f166484g;
        if (pVar != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c12559xbdae8559);
            pVar.mo149xb9724478(c11809xbc286be4, c12559xbdae8559);
        }
    }
}
