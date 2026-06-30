package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8;

/* loaded from: classes7.dex */
public class m2 implements k80.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.n2 f161170a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f161171b;

    public m2(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.C12003x30f468c2 c12003x30f468c2, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.n2 n2Var, int i17) {
        this.f161170a = n2Var;
        this.f161171b = i17;
    }

    @Override // k80.l
    public void a(int i17, int i18, java.lang.String str, k80.m mVar) {
        java.lang.String str2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiLogin", "onSceneEnd errType = %d, errCode = %d ,errMsg = %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.n2 n2Var = this.f161170a;
        if (i17 != 0 || i18 != 0) {
            if (i17 != 4) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.h2) n2Var).a(-1, "confirm cgi fail", new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1087x5c4d1e6.C12092x3a87b473(jc1.f.f380457m));
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1087x5c4d1e6.C12092x3a87b473 c12092x3a87b473 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1087x5c4d1e6.C12092x3a87b473();
            c12092x3a87b473.f162399d = 1000;
            if (mVar != null) {
                bl0.d dVar = (bl0.d) mVar;
                if (dVar.H() != null && dVar.H().f459042d != null && dVar.H().f459042d.f459026f != 0) {
                    c12092x3a87b473.f162399d = dVar.H().f459042d.f459026f;
                }
            }
            if (i18 == -3003) {
                c12092x3a87b473.f162399d = 1003;
                str2 = "fail:meet server frequency limit";
            } else {
                str2 = "";
            }
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.h2) n2Var).a(-1, str2, c12092x3a87b473);
            return;
        }
        if (!(mVar instanceof k80.m)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiLogin", "not jslogin cgi reqeust");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.h2) n2Var).a(-1, com.p314xaae8f345.map.sdk.p497x5a73344.vis.InterfaceC4273x137f8dd1.OnLayerStatusChangedListener.LayerStatusMsg.f16697x69dc35be, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1087x5c4d1e6.C12092x3a87b473(jc1.f.f380448d));
            return;
        }
        if (this.f161171b == 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiLogin", "press reject button");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.h2) n2Var).a(i18, "auth deny", new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1087x5c4d1e6.C12092x3a87b473(jc1.f.f380454j));
            return;
        }
        r45.j24 H = ((bl0.d) mVar).H();
        r45.j14 j14Var = H.f459042d;
        int i19 = j14Var.f459024d;
        java.lang.String str3 = j14Var.f459025e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiLogin", "stev NetSceneJSLoginConfirm jsErrcode %d", java.lang.Integer.valueOf(i19));
        if (i19 != 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1087x5c4d1e6.C12092x3a87b473 c12092x3a87b4732 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1087x5c4d1e6.C12092x3a87b473();
            c12092x3a87b4732.f162399d = H.f459042d.f459026f;
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.h2) n2Var).a(i19, str3, c12092x3a87b4732);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiLogin", "onSceneEnd NetSceneJSLoginConfirm %s errnoInfo.errno:%d", str3, java.lang.Integer.valueOf(c12092x3a87b4732.f162399d));
            return;
        }
        java.lang.String str4 = H.f459043e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.h2 h2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.h2) n2Var;
        h2Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiLogin", "onSuccess !");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.C12003x30f468c2 c12003x30f468c2 = h2Var.f161102a;
        c12003x30f468c2.f160897q = str4;
        c12003x30f468c2.f160898r = "ok";
        c12003x30f468c2.c();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiLogin", "resp data code [%s]", str4);
    }
}
