package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app;

@j95.b(m140513x1e06fd29 = {com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.C11577xd02dca59.class})
/* loaded from: classes7.dex */
public class l8 extends i95.w implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.r5 {
    public static boolean wi(java.lang.String str, cl0.g gVar) {
        try {
            cl0.g gVar2 = new cl0.g(gVar.mo15082x48bce8a4("invokeData"));
            java.lang.String mo15082x48bce8a4 = gVar2.mo15082x48bce8a4(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d);
            cl0.g gVar3 = new cl0.g(gVar2.mo15082x48bce8a4("args"));
            if (!"standaloneFunctionalDirectApi".equals(mo15082x48bce8a4)) {
                return false;
            }
            oj1.e.a(str, oj1.d.m151484xdce0328(gVar3.mo15082x48bce8a4("standaloneDirectApiType")), gVar3);
            return true;
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    public int Ai() {
        if (!gm0.j1.b().f354787q || !i95.n0.h(l81.q0.class)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.ServiceForWebView", "getWxaCommLibVersion, invalid account status, stack:%s", android.util.Log.getStackTraceString(new java.lang.Throwable()));
            return -1;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.x7.a();
        if (a17 == null) {
            try {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.v7.b();
                a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.x7.a();
            } catch (c01.c unused) {
                return -1;
            }
        }
        if (a17 == null) {
            return -1;
        }
        return a17.i();
    }

    public void Eh(final java.lang.String str, final r.a aVar) {
        if (!android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.f8.a(true, new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.app.l8$$a
                @Override // java.lang.Runnable
                public final void run() {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 I = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.u0.C().I(str);
                    r.a aVar2 = aVar;
                    if (I == null) {
                        if (aVar2 != null) {
                            aVar2.mo1850x58b836e("fail miniprogram not running");
                            return;
                        }
                        return;
                    }
                    if (aVar2 != null) {
                        aVar2.mo1850x58b836e("ok");
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1139xc4aaf986.C12362x460991bc a17 = k91.h0.a(I);
                    a17.Z = true;
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.a) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8.x.f166565a).a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, a17);
                }
            });
        } else if (aVar != null) {
            aVar.mo1850x58b836e("fail invalid appId");
        }
    }

    public void Ug(java.lang.String str, java.lang.String str2, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.q5 q5Var) {
        if (android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.ServiceForWebView", "privateOpenWeappFunctionalPage invalid uuid");
        } else {
            pq5.h.a().q(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r8(this, str, str2, q5Var)).B();
        }
    }

    public km5.q g2(java.lang.String str) {
        return pq5.h.a().h(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.n8(this, str));
    }

    public void oh(int i17, java.lang.String str, java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.o oVar;
        android.util.SparseArray sparseArray = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.a.f165403a;
        android.util.SparseArray sparseArray2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.a.f165403a;
        synchronized (sparseArray2) {
            oVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.o) sparseArray2.get(i17);
        }
        if (oVar != null) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            of1.w1 w1Var = (of1.w1) oVar;
            jSONObject.put("htmlId", w1Var.m151224xd4bfd001());
            jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, str);
            jSONObject.put("arg", obj);
            w1Var.F(jSONObject);
        }
    }

    public void p7(java.util.List list) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.q.c(list, k91.h1.MP_PRELOAD, null).a(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.p8(this));
    }

    public void sd(java.lang.String str, java.lang.String str2, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1092x3781d168.C12141x9d1ae043 c12141x9d1ae043 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1092x3781d168.C12141x9d1ae043();
        c12141x9d1ae043.f162804d = str;
        c12141x9d1ae043.f162805e = str2;
        c12141x9d1ae043.f162806f = i17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.m0.b(str, c12141x9d1ae043);
    }

    public void xh(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.u0.C().P(com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.EnumC3941xa739ed99.f129159e, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.x6.f170361s);
    }
}
