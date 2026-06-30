package com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.p2244x604ad99;

/* loaded from: classes8.dex */
public class l implements c01.yc {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f253658d;

    public l() {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f253658d = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5769xe77d2534>(a0Var) { // from class: com.tencent.mm.plugin.subapp.jdbiz.JDSysMsgNotifyLsn$1
            {
                this.f39173x3fe91575 = -382749404;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5769xe77d2534 c5769xe77d2534) {
                java.lang.String str;
                java.lang.String str2;
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5769xe77d2534 c5769xe77d25342 = c5769xe77d2534;
                if (!(c5769xe77d25342 instanceof com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5769xe77d2534)) {
                    return false;
                }
                am.yl ylVar = c5769xe77d25342.f136086g;
                if (ylVar.f90002b == null || (str = ylVar.f90001a) == null || !"bizjd".equals(str)) {
                    return false;
                }
                am.yl ylVar2 = c5769xe77d25342.f136086g;
                java.lang.String string = ylVar2.f90002b.getString(com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.InterfaceC11224x4860a6b.WXWebPage.f32847x4430964b);
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                if (string == null) {
                    string = "";
                }
                java.lang.String string2 = ylVar2.f90002b.getString("jump_url");
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11179, string2 != null ? string2 : "", com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.p2244x604ad99.q.Di().Zi().f253666b, 4);
                com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.p2244x604ad99.o Zi = com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.p2244x604ad99.q.Di().Zi();
                if (Zi != null && (str2 = Zi.f253666b) != null && str2.equals(string)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.p2244x604ad99.q.Di().wi();
                    com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.p2244x604ad99.q.Di().Ai();
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.p2244x604ad99.l.this.f253658d.mo48814x2efc64();
                return false;
            }
        };
    }

    @Override // c01.yc
    public void O0(com.p314xaae8f345.mm.p944x882e457a.p0 p0Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JDSysMsgNotifyLsn", "receivemsg jd");
        r45.j4 j4Var = p0Var.f152259a;
        if (j4Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JDSysMsgNotifyLsn", "onPreAddMessage cmdAM is null");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.p2244x604ad99.o oVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.p2244x604ad99.o();
        oVar.b(x51.j1.g(j4Var.f459094h));
        java.lang.String str = oVar.f253665a;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JDSysMsgNotifyLsn", "bizType ".concat(str));
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(oVar.f253665a)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JDSysMsgNotifyLsn", "bizTye is null or nil");
        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(oVar.f253666b)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JDSysMsgNotifyLsn", "activity id is null");
        } else if (!oVar.c(com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.p2244x604ad99.q.Di().Zi())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JDSysMsgNotifyLsn", "fo zu baoyou! the activityid is same");
        } else if (!com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.p2244x604ad99.q.Di().aj()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JDSysMsgNotifyLsn", "no config entrance, ignore msg");
        } else if (oVar.f253665a.equals("3")) {
            j4Var.f459100q = null;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(oVar.f253676l) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(oVar.f253679o) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(oVar.f253677m) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(oVar.f253678n) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(oVar.f253675k)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JDSysMsgNotifyLsn", "invalid params");
            } else if (oVar.d()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JDSysMsgNotifyLsn", "ingore msg due to msg is expired");
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.p2244x604ad99.q Di = com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.p2244x604ad99.q.Di();
                java.lang.String str2 = oVar.f253666b;
                Di.getClass();
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) ? false : ((java.util.HashMap) Di.f253685e).containsKey(str2)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JDSysMsgNotifyLsn", "activity id already show, " + oVar.f253666b);
                } else if (oVar.c(com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.p2244x604ad99.q.Di().Zi())) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.p2244x604ad99.q Di2 = com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.p2244x604ad99.q.Di();
                    java.lang.String str3 = oVar.f253666b;
                    Di2.getClass();
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
                        ((java.util.HashMap) Di2.f253685e).put(str3, 1);
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JDSysMsgNotifyLsn", "add activity id" + oVar.f253666b);
                    new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper()).mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.p2244x604ad99.k(this, oVar));
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JDSysMsgNotifyLsn", "the remind activitid is same");
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.p2244x604ad99.q.cj(oVar);
        } else if (oVar.f253665a.equals("1")) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.p2244x604ad99.q.cj(oVar);
        } else if (oVar.f253665a.equals("2")) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.p2244x604ad99.q.cj(oVar);
            java.lang.String str4 = com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.p2244x604ad99.q.Di().Vi().f253662a;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4)) {
                str4 = com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.p2244x604ad99.q.Di().Ui();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11178, str4, oVar.f253666b, 3, 1);
        }
        c01.d9.b().p().i(true);
    }

    @Override // c01.yc
    public void g1(com.p314xaae8f345.mm.p944x882e457a.r0 r0Var) {
    }
}
