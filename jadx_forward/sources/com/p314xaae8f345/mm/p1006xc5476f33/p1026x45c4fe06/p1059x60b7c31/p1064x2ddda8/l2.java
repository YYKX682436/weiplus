package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8;

/* loaded from: classes7.dex */
public class l2 implements k80.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.n2 f161159a;

    public l2(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.C12003x30f468c2 c12003x30f468c2, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.n2 n2Var) {
        this.f161159a = n2Var;
    }

    @Override // k80.j
    public void a(int i17, int i18, java.lang.String str, k80.k kVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiLogin", "onSceneEnd errType = %d, errCode = %d ,errMsg = %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        java.lang.String str2 = "";
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.n2 n2Var = this.f161159a;
        if (i17 != 0 || i18 != 0) {
            if (i17 != 4) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.h2) n2Var).a(-1, java.lang.String.format("cgi fail(%d,%d)", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)), new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1087x5c4d1e6.C12092x3a87b473(jc1.f.f380457m));
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1087x5c4d1e6.C12092x3a87b473 c12092x3a87b473 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1087x5c4d1e6.C12092x3a87b473();
            c12092x3a87b473.f162399d = 1000;
            if (kVar != null) {
                bl0.c cVar = (bl0.c) kVar;
                if (cVar.H() != null && cVar.H().f460619d != null && cVar.H().f460619d.f459026f != 0) {
                    c12092x3a87b473.f162399d = cVar.H().f460619d.f459026f;
                }
            }
            if (i18 == -3003) {
                c12092x3a87b473.f162399d = 1003;
                str2 = "fail:meet server frequency limit";
            }
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.h2) n2Var).a(-1, str2, c12092x3a87b473);
            return;
        }
        if (kVar != null) {
            bl0.c cVar2 = (bl0.c) kVar;
            if (cVar2.H() != null && cVar2.H().f460619d != null) {
                r45.l24 H = cVar2.H();
                r45.j14 j14Var = H.f460619d;
                int i19 = j14Var.f459024d;
                java.lang.String str3 = j14Var.f459025e;
                java.lang.String str4 = H.f460628p;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiLogin", "stev NetSceneJSLogin jsErrcode %d", java.lang.Integer.valueOf(i19));
                if (i19 != -12000) {
                    if (i19 == 0) {
                        java.lang.String str5 = H.f460620e;
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.h2 h2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.h2) n2Var;
                        h2Var.getClass();
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiLogin", "onSuccess !");
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.C12003x30f468c2 c12003x30f468c2 = h2Var.f161102a;
                        c12003x30f468c2.f160897q = str5;
                        c12003x30f468c2.f160898r = "ok";
                        c12003x30f468c2.c();
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiLogin", "resp data code [%s]", str5);
                        return;
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1087x5c4d1e6.C12092x3a87b473 c12092x3a87b4732 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1087x5c4d1e6.C12092x3a87b473();
                    int i27 = H.f460619d.f459026f;
                    c12092x3a87b4732.f162399d = i27;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiLogin", "resp data errno:%d", java.lang.Integer.valueOf(i27));
                    if (i19 == -12001) {
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.h2) n2Var).a(i19, str3, c12092x3a87b4732);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiLogin", "onSceneEnd NetSceneJSLogin Invalid Scope %s", str3);
                        return;
                    } else if (i19 == -12002) {
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.h2) n2Var).a(i19, str3, c12092x3a87b4732);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiLogin", "onSceneEnd NetSceneJSLogin Invalid Data %s", str3);
                        return;
                    } else if (i19 == -12003) {
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.h2) n2Var).a(i19, str3, c12092x3a87b4732);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiLogin", "onSceneEnd NetSceneJSLogin Invalid ApiName %s", str3);
                        return;
                    } else {
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.h2) n2Var).a(i19, str3, c12092x3a87b4732);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiLogin", "onSceneEnd NetSceneJSLogin %s", str3);
                        return;
                    }
                }
                java.util.LinkedList linkedList = H.f460621f;
                java.lang.String str6 = H.f460622g;
                java.lang.String str7 = H.f460623h;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiLogin", "stev appName %s, appIconUrl %s", str6, str7);
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.h2 h2Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.h2) n2Var;
                h2Var2.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiLogin", "onConfirm !");
                int size = linkedList.size();
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.C12003x30f468c2 c12003x30f468c22 = h2Var2.f161102a;
                c12003x30f468c22.f160905y = size;
                for (int i28 = 0; i28 < c12003x30f468c22.f160905y; i28++) {
                    r45.jv5 jv5Var = (r45.jv5) linkedList.get(i28);
                    try {
                        c12003x30f468c22.f160906z.putByteArray(i28 + "", jv5Var.mo14344x5f01b1f6());
                    } catch (java.io.IOException e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiLogin", "IOException %s", e17.getMessage());
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.JsApiLogin", e17, "", new java.lang.Object[0]);
                        c12003x30f468c22.f160898r = "fail";
                        c12003x30f468c22.E = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1087x5c4d1e6.C12092x3a87b473(jc1.b.f380408a);
                        c12003x30f468c22.c();
                        return;
                    }
                }
                c12003x30f468c22.f160902v = str4;
                c12003x30f468c22.f160903w = str6;
                c12003x30f468c22.f160904x = str7;
                c12003x30f468c22.f160898r = "needConfirm";
                c12003x30f468c22.c();
                return;
            }
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.h2) n2Var).a(-1, java.lang.String.format("cgi fail response null", new java.lang.Object[0]), new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1087x5c4d1e6.C12092x3a87b473(jc1.f.f380458n));
    }
}
