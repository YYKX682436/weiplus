package bn;

/* loaded from: classes12.dex */
public class a implements com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.InterfaceC27163xf4b45e4e {
    @Override // com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.InterfaceC27163xf4b45e4e
    /* renamed from: documentUser */
    public java.lang.String mo10832xa8312b86() {
        return com.p314xaae8f345.mm.vfs.q7.c("PublicResource") + "/cara";
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.InterfaceC27163xf4b45e4e
    /* renamed from: exptValue */
    public java.lang.String mo10833x202289ba(java.lang.String str) {
        return j62.e.g().j(str, "", false, true);
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.InterfaceC27163xf4b45e4e
    /* renamed from: isDebugging */
    public boolean mo10834x3a74e0e4() {
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        return false;
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.InterfaceC27163xf4b45e4e
    /* renamed from: isForeground */
    public boolean mo10835xf7b3660d() {
        return com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4683x847dbe1b.f19974x4fbc8495.mo40975xf7b3660d();
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.InterfaceC27163xf4b45e4e
    /* renamed from: kitchenBoolValue */
    public java.util.Optional mo10836x7f654963(java.lang.String str) {
        if (str.equals("KIT_CARA_ENABLE")) {
            return java.util.Optional.of(java.lang.Boolean.valueOf(j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2516x2e7b0d.C19964xba50b50c()) == 1));
        }
        if (str.equals("KIT_CARA_MADE_IN_HEAVEN")) {
            return java.util.Optional.of(java.lang.Boolean.valueOf(j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2516x2e7b0d.C19972xe76f176c()) == 1));
        }
        if (str.equals("KIT_CARA_HEAVENS_DOOR")) {
            return java.util.Optional.of(java.lang.Boolean.valueOf(j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2516x2e7b0d.C19965x36b60fac()) == 1));
        }
        if (str.equals("KIT_CARA_SHOW_ME_THE_SQL")) {
            return java.util.Optional.of(java.lang.Boolean.valueOf(j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2516x2e7b0d.C19974xc190c52a()) == 1));
        }
        if (str.equals("KIT_CARA_SHOW_ME_THE_REPORT")) {
            return java.util.Optional.of(java.lang.Boolean.valueOf(j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2516x2e7b0d.C19973x6d873c58()) == 1));
        }
        if (str.equals("KIT_CARA_PROPHET_SHUTDOWN_LIVE_REDDOT")) {
            return java.util.Optional.of(java.lang.Boolean.valueOf(j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2516x2e7b0d.C19971x3e1383a3()) == 1));
        }
        if (str.equals("KIT_CARA_PROPHET_LIVE_REDDOT_REPLACE_KARA")) {
            return java.util.Optional.of(java.lang.Boolean.valueOf(j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2516x2e7b0d.C19970x83f9d9ec()) == 1));
        }
        if (str.equals("KIT_CARA_PROPHET_SHUTDOWN_LIVE_CELL")) {
            return java.util.Optional.of(java.lang.Boolean.valueOf(j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2516x2e7b0d.C19968xda02ed2d()) == 1));
        }
        if (str.equals("KIT_CARA_PROPHET_LIVE_CELL_REPLACE_KARA")) {
            return java.util.Optional.of(java.lang.Boolean.valueOf(j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2516x2e7b0d.C19967xcb121722()) == 1));
        }
        return java.util.Optional.of(java.lang.Boolean.FALSE);
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.InterfaceC27163xf4b45e4e
    /* renamed from: kitchenFloatValue */
    public java.util.Optional mo10837x6e490f39(java.lang.String str) {
        return java.util.Optional.of(java.lang.Float.valueOf(str));
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.InterfaceC27163xf4b45e4e
    /* renamed from: kitchenIntValue */
    public java.util.Optional mo10838xf807fe86(java.lang.String str) {
        return str.equals("KIT_CARA_PROPHET_FAKE_PREDICTION_LIVE_REDDOT") ? java.util.Optional.of(java.lang.Integer.valueOf(j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2516x2e7b0d.C19969x9fa0e551()))) : str.equals("KIT_CARA_PROPHET_FAKE_PREDICTION_LIVE_CELL") ? java.util.Optional.of(java.lang.Integer.valueOf(j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2516x2e7b0d.C19966x3eb97f5b()))) : java.util.Optional.of(0);
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.InterfaceC27163xf4b45e4e
    /* renamed from: kitchenStringValue */
    public java.util.Optional mo10839x6795059c(java.lang.String str) {
        return java.util.Optional.of(java.lang.String.valueOf(str));
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.InterfaceC27163xf4b45e4e
    /* renamed from: packageServerData */
    public java.util.Optional mo10840x2a722a73(int i17) {
        ((yy.a) ((zy.r) i95.n0.c(zy.r.class))).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.p.c().getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.n0 e17 = com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.j0.f271212a.e(com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.c0.c(70, i17));
        byte[] bArr = null;
        if (e17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResDownloader.CheckResUpdateHelper", "getOriginalFilePath, %d.%d, get null info, return", 70, java.lang.Integer.valueOf(i17));
        } else {
            java.lang.String str = e17.f68777xf1e9b966;
            com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(str);
            java.lang.String str2 = a17.f294812f;
            if (str2 != null) {
                java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str2, false, false);
                if (!str2.equals(l17)) {
                    a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
                }
            }
            com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
            if (m17.a() ? m17.f294799a.F(m17.f294800b) : false) {
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e17.f68785x4b6e68b9)) {
                    java.lang.String p17 = com.p314xaae8f345.mm.vfs.w6.p(str);
                    if (p17 == null) {
                        p17 = "";
                    }
                    if (p17.equals(e17.f68785x4b6e68b9)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResDownloader.CheckResUpdateHelper", "getOriginalFilePath, %d.%d, file valid, ret = %s", 70, java.lang.Integer.valueOf(i17), str);
                        byte[] i18 = o35.a.i(str);
                        if (e17.f68776x7d1f4984 && e17.f68775x9cdeb823) {
                            java.lang.String str3 = e17.f68773x5efdd21f;
                            if (!android.text.TextUtils.isEmpty(str3)) {
                                i18 = com.p314xaae8f345.mm.p2496xc50a8ce6.C19776x5804ff1f.m75978x7824c1be(i18, str3.getBytes());
                            }
                            try {
                                bArr = kk.y.c(i18);
                            } catch (java.lang.Exception unused) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ResDownloader.CheckResUpdateHelper", "file decompress error");
                            }
                        }
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResDownloader.CheckResUpdateHelper", "getOriginalFilePath, %d.%d, file invalid, return null ", 70, java.lang.Integer.valueOf(i17));
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ResDownloader.CheckResUpdateHelper", "file %s not exists", str);
            }
        }
        return bArr != null ? java.util.Optional.of(bArr) : java.util.Optional.empty();
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.InterfaceC27163xf4b45e4e
    /* renamed from: reportKV */
    public void mo10841xe68be19f(int i17, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68478xbd3cda5f(i17, str);
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.InterfaceC27163xf4b45e4e
    /* renamed from: serverNow */
    public double mo10842xf43b1893() {
        return java.lang.System.currentTimeMillis() / 1000.0d;
    }
}
