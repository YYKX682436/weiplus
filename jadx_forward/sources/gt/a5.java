package gt;

/* loaded from: classes7.dex */
public class a5 extends gp1.e0 {
    @Override // gp1.x
    public void G0(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d) {
        if (c12886x91aa2b6d == null) {
            return;
        }
        int i17 = c12886x91aa2b6d.f174579d;
        if (i17 == 19) {
            if (i17 != 19 || c12886x91aa2b6d.G == null) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandVoIP1v1FloatBallHelper", "handleBallInfoClicked, appbrand voip float ball");
            java.lang.String string = c12886x91aa2b6d.G.getString("appId");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1103x5d6d1928.C12198xffa35265 c12198xffa35265 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1103x5d6d1928.C12198xffa35265();
            c12198xffa35265.f164007d = 1;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.m0.b(string, c12198xffa35265);
            return;
        }
        if (i17 == 1 && i17 == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandFloatBallHelper", "handleBallInfoRemoved, appbrand content float ball");
            java.lang.String string2 = c12886x91aa2b6d.G.getString("appId");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.C11869x56177d91 c11869x56177d91 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.C11869x56177d91();
            c11869x56177d91.f159591d = 1;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.m0.b(string2, c11869x56177d91);
        }
    }

    @Override // gp1.e0, gp1.x
    public void V(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d) {
    }

    @Override // gp1.e0, gp1.x
    public void X0(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d) {
        int i17;
        if (c12886x91aa2b6d != null && (i17 = c12886x91aa2b6d.f174579d) == 1 && i17 == 1 && c12886x91aa2b6d.G != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandFloatBallHelper", "handleBallInfoAdded, appbrand content float ball");
            java.lang.String string = c12886x91aa2b6d.G.getString("appId");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.C11869x56177d91 c11869x56177d91 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.C11869x56177d91();
            c11869x56177d91.f159591d = 2;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.m0.b(string, c11869x56177d91);
        }
    }

    @Override // gp1.x
    public void r0(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6 h6Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6 h6Var2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6 h6Var3;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6 h6Var4;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6 h6Var5;
        if (c12886x91aa2b6d == null) {
            return;
        }
        int i17 = c12886x91aa2b6d.f174579d;
        if (i17 == 1 || (i17 == 20 && c12886x91aa2b6d.f174580e == 1)) {
            if (c12886x91aa2b6d.G != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandFloatBallHelper", "handleBallInfoClicked, openAppBrand ballInfo:%s", c12886x91aa2b6d);
                java.lang.String string = c12886x91aa2b6d.G.getString("appId");
                java.lang.String string2 = c12886x91aa2b6d.G.getString(dm.i4.f66875xa013b0d5);
                int i18 = c12886x91aa2b6d.G.getInt("versionType");
                if ((com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string2) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) || (h6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class)) == null) {
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandFloatBallHelper", "openAppBrand, launch:%s#%s", string, java.lang.Integer.valueOf(i18));
                if (!rh1.b.a()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 c12559xbdae8559 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559();
                    c12559xbdae8559.f169323f = 1131;
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) h6Var).aj(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, string2, string, i18, -1, null, c12559xbdae8559);
                    return;
                }
                l81.b1 b1Var = new l81.b1();
                b1Var.f398545a = string2;
                b1Var.f398547b = string;
                b1Var.f398549c = i18;
                b1Var.f398551d = -1;
                b1Var.f398555f = null;
                b1Var.f398565k = 1131;
                b1Var.f398552d0 = true;
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) h6Var).bj(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, b1Var);
                return;
            }
            return;
        }
        if (i17 == 17) {
            if (i17 == 17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandVOIPFloatBallHelper", "handleBallInfoClicked, appbrand voip float ball");
                java.lang.String string3 = c12886x91aa2b6d.G.getString("appId");
                java.lang.String string4 = c12886x91aa2b6d.G.getString(dm.i4.f66875xa013b0d5);
                int i19 = c12886x91aa2b6d.G.getInt("versionType");
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 c12559xbdae85592 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559();
                c12559xbdae85592.f169323f = 1131;
                if ((com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string4) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string3)) || (h6Var5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class)) == null) {
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandVOIPFloatBallHelper", "openAppBrand, launch:%s#%s", string3, java.lang.Integer.valueOf(i19));
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) h6Var5).aj(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, string4, string3, i19, -1, null, c12559xbdae85592);
                return;
            }
            return;
        }
        if (i17 == 19) {
            if (i17 == 19) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandVoIP1v1FloatBallHelper", "handleBallInfoClicked, appbrand voip float ball");
                java.lang.String string5 = c12886x91aa2b6d.G.getString("appId");
                java.lang.String string6 = c12886x91aa2b6d.G.getString(dm.i4.f66875xa013b0d5);
                int i27 = c12886x91aa2b6d.G.getInt("versionType");
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 c12559xbdae85593 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559();
                c12559xbdae85593.f169323f = 1131;
                if ((com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string6) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string5)) || (h6Var4 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class)) == null) {
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandVoIP1v1FloatBallHelper", "openAppBrand, launch:%s#%s", string5, java.lang.Integer.valueOf(i27));
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) h6Var4).aj(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, string6, string5, i27, -1, null, c12559xbdae85593);
                return;
            }
            return;
        }
        if (i17 == 40) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.k1.w0(c12886x91aa2b6d);
            return;
        }
        if (i17 == 7) {
            if (rh1.b.a() && c12886x91aa2b6d.f174579d == 7) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandLocationFloatBallHelper", "handleBallInfoClicked, appbrand voip float ball");
                java.lang.String string7 = c12886x91aa2b6d.G.getString("appId");
                java.lang.String string8 = c12886x91aa2b6d.G.getString(dm.i4.f66875xa013b0d5);
                int i28 = c12886x91aa2b6d.G.getInt("versionType");
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 c12559xbdae85594 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559();
                c12559xbdae85594.f169323f = 1131;
                if ((com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string8) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string7)) || (h6Var3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class)) == null) {
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandLocationFloatBallHelper", "openAppBrand, launch:%s#%s", string7, java.lang.Integer.valueOf(i28));
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) h6Var3).aj(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, string8, string7, i28, -1, null, c12559xbdae85594);
                return;
            }
            return;
        }
        if (i17 == 33 && rh1.b.a() && c12886x91aa2b6d.f174579d == 33) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandBluetoothFloatBallHelper", "handleBallInfoClicked, appbrand voip float ball");
            java.lang.String string9 = c12886x91aa2b6d.G.getString("appId");
            java.lang.String string10 = c12886x91aa2b6d.G.getString(dm.i4.f66875xa013b0d5);
            int i29 = c12886x91aa2b6d.G.getInt("versionType");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 c12559xbdae85595 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559();
            c12559xbdae85595.f169323f = 1131;
            if ((com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string10) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string9)) || (h6Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class)) == null) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandBluetoothFloatBallHelper", "openAppBrand, launch:%s#%s", string9, java.lang.Integer.valueOf(i29));
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) h6Var2).aj(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, string10, string9, i29, -1, null, c12559xbdae85595);
        }
    }
}
