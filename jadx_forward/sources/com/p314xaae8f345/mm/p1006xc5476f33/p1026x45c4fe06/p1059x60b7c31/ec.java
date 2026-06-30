package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes7.dex */
public class ec implements com.p314xaae8f345.mm.p944x882e457a.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11938xcba80598 f162304d;

    public ec(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11938xcba80598 c11938xcba80598) {
        this.f162304d = c11938xcba80598;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.e3
    /* renamed from: callback */
    public int mo1034xf5bc2045(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.j14 j14Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11938xcba80598 c11938xcba80598 = this.f162304d;
        if (i17 != 0 || i18 != 0) {
            c11938xcba80598.f160139o = 0;
            c11938xcba80598.f160142r = "cgi fail";
            c11938xcba80598.c();
            return 0;
        }
        r45.p24 p24Var = (r45.p24) oVar.f152244b.f152233a;
        if (p24Var == null || (j14Var = p24Var.f464213d) == null) {
            c11938xcba80598.f160139o = 0;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiRefreshSession", "JSRefreshSessionRequest failed, response is null!");
            c11938xcba80598.c();
        } else {
            int i19 = j14Var.f459024d;
            c11938xcba80598.f160138n = i19;
            c11938xcba80598.f160142r = j14Var.f459025e;
            if (i19 == 0) {
                c11938xcba80598.f160137m = p24Var.f464214e;
                c11938xcba80598.f160138n = i19;
                c11938xcba80598.f160139o = 1;
                c11938xcba80598.c();
            } else {
                c11938xcba80598.f160138n = i19;
                c11938xcba80598.f160139o = 2;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiRefreshSession", "JSRefreshSessionRequest ERROR %s", str);
                c11938xcba80598.c();
            }
        }
        return 0;
    }
}
