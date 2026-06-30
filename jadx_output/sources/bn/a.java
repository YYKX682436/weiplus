package bn;

/* loaded from: classes12.dex */
public class a implements com.tencent.wechat.aff.cara.CaraNativeAppBase {
    @Override // com.tencent.wechat.aff.cara.CaraNativeAppBase
    public java.lang.String documentUser() {
        return com.tencent.mm.vfs.q7.c("PublicResource") + "/cara";
    }

    @Override // com.tencent.wechat.aff.cara.CaraNativeAppBase
    public java.lang.String exptValue(java.lang.String str) {
        return j62.e.g().j(str, "", false, true);
    }

    @Override // com.tencent.wechat.aff.cara.CaraNativeAppBase
    public boolean isDebugging() {
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        return false;
    }

    @Override // com.tencent.wechat.aff.cara.CaraNativeAppBase
    public boolean isForeground() {
        return com.tencent.matrix.lifecycle.supervisor.AppUIForegroundOwner.INSTANCE.isForeground();
    }

    @Override // com.tencent.wechat.aff.cara.CaraNativeAppBase
    public java.util.Optional kitchenBoolValue(java.lang.String str) {
        if (str.equals("KIT_CARA_ENABLE")) {
            return java.util.Optional.of(java.lang.Boolean.valueOf(j62.e.g().c(new com.tencent.mm.repairer.config.cara.RepairerConfigCaraEnable()) == 1));
        }
        if (str.equals("KIT_CARA_MADE_IN_HEAVEN")) {
            return java.util.Optional.of(java.lang.Boolean.valueOf(j62.e.g().c(new com.tencent.mm.repairer.config.cara.RepairerConfigCaraMode()) == 1));
        }
        if (str.equals("KIT_CARA_HEAVENS_DOOR")) {
            return java.util.Optional.of(java.lang.Boolean.valueOf(j62.e.g().c(new com.tencent.mm.repairer.config.cara.RepairerConfigCaraForceOpen()) == 1));
        }
        if (str.equals("KIT_CARA_SHOW_ME_THE_SQL")) {
            return java.util.Optional.of(java.lang.Boolean.valueOf(j62.e.g().c(new com.tencent.mm.repairer.config.cara.RepairerConfigCaraPrintSQL()) == 1));
        }
        if (str.equals("KIT_CARA_SHOW_ME_THE_REPORT")) {
            return java.util.Optional.of(java.lang.Boolean.valueOf(j62.e.g().c(new com.tencent.mm.repairer.config.cara.RepairerConfigCaraPrintReport()) == 1));
        }
        if (str.equals("KIT_CARA_PROPHET_SHUTDOWN_LIVE_REDDOT")) {
            return java.util.Optional.of(java.lang.Boolean.valueOf(j62.e.g().c(new com.tencent.mm.repairer.config.cara.RepairerConfigCaraLiveReddotShutdown()) == 1));
        }
        if (str.equals("KIT_CARA_PROPHET_LIVE_REDDOT_REPLACE_KARA")) {
            return java.util.Optional.of(java.lang.Boolean.valueOf(j62.e.g().c(new com.tencent.mm.repairer.config.cara.RepairerConfigCaraLiveReddotPredict()) == 1));
        }
        if (str.equals("KIT_CARA_PROPHET_SHUTDOWN_LIVE_CELL")) {
            return java.util.Optional.of(java.lang.Boolean.valueOf(j62.e.g().c(new com.tencent.mm.repairer.config.cara.RepairerConfigCaraLiveCellShutdown()) == 1));
        }
        if (str.equals("KIT_CARA_PROPHET_LIVE_CELL_REPLACE_KARA")) {
            return java.util.Optional.of(java.lang.Boolean.valueOf(j62.e.g().c(new com.tencent.mm.repairer.config.cara.RepairerConfigCaraLiveCellPredict()) == 1));
        }
        return java.util.Optional.of(java.lang.Boolean.FALSE);
    }

    @Override // com.tencent.wechat.aff.cara.CaraNativeAppBase
    public java.util.Optional kitchenFloatValue(java.lang.String str) {
        return java.util.Optional.of(java.lang.Float.valueOf(str));
    }

    @Override // com.tencent.wechat.aff.cara.CaraNativeAppBase
    public java.util.Optional kitchenIntValue(java.lang.String str) {
        return str.equals("KIT_CARA_PROPHET_FAKE_PREDICTION_LIVE_REDDOT") ? java.util.Optional.of(java.lang.Integer.valueOf(j62.e.g().c(new com.tencent.mm.repairer.config.cara.RepairerConfigCaraLiveReddotFakePrediction()))) : str.equals("KIT_CARA_PROPHET_FAKE_PREDICTION_LIVE_CELL") ? java.util.Optional.of(java.lang.Integer.valueOf(j62.e.g().c(new com.tencent.mm.repairer.config.cara.RepairerConfigCaraLiveCellFakePrediction()))) : java.util.Optional.of(0);
    }

    @Override // com.tencent.wechat.aff.cara.CaraNativeAppBase
    public java.util.Optional kitchenStringValue(java.lang.String str) {
        return java.util.Optional.of(java.lang.String.valueOf(str));
    }

    @Override // com.tencent.wechat.aff.cara.CaraNativeAppBase
    public java.util.Optional packageServerData(int i17) {
        ((yy.a) ((zy.r) i95.n0.c(zy.r.class))).getClass();
        com.tencent.mm.pluginsdk.res.downloader.checkresupdate.p.c().getClass();
        com.tencent.mm.pluginsdk.res.downloader.model.n0 e17 = com.tencent.mm.pluginsdk.res.downloader.model.j0.f189679a.e(com.tencent.mm.pluginsdk.res.downloader.checkresupdate.c0.c(70, i17));
        byte[] bArr = null;
        if (e17 == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ResDownloader.CheckResUpdateHelper", "getOriginalFilePath, %d.%d, get null info, return", 70, java.lang.Integer.valueOf(i17));
        } else {
            java.lang.String str = e17.field_filePath;
            com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str);
            java.lang.String str2 = a17.f213279f;
            if (str2 != null) {
                java.lang.String l17 = com.tencent.mm.vfs.e8.l(str2, false, false);
                if (!str2.equals(l17)) {
                    a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                }
            }
            com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
            if (m17.a() ? m17.f213266a.F(m17.f213267b) : false) {
                if (!com.tencent.mm.sdk.platformtools.t8.K0(e17.field_md5)) {
                    java.lang.String p17 = com.tencent.mm.vfs.w6.p(str);
                    if (p17 == null) {
                        p17 = "";
                    }
                    if (p17.equals(e17.field_md5)) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.ResDownloader.CheckResUpdateHelper", "getOriginalFilePath, %d.%d, file valid, ret = %s", 70, java.lang.Integer.valueOf(i17), str);
                        byte[] i18 = o35.a.i(str);
                        if (e17.field_fileEncrypt && e17.field_fileCompress) {
                            java.lang.String str3 = e17.field_encryptKey;
                            if (!android.text.TextUtils.isEmpty(str3)) {
                                i18 = com.tencent.mm.protocal.MMProtocalJni.aesDecrypt(i18, str3.getBytes());
                            }
                            try {
                                bArr = kk.y.c(i18);
                            } catch (java.lang.Exception unused) {
                                com.tencent.mars.xlog.Log.e("MicroMsg.ResDownloader.CheckResUpdateHelper", "file decompress error");
                            }
                        }
                    }
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.ResDownloader.CheckResUpdateHelper", "getOriginalFilePath, %d.%d, file invalid, return null ", 70, java.lang.Integer.valueOf(i17));
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.ResDownloader.CheckResUpdateHelper", "file %s not exists", str);
            }
        }
        return bArr != null ? java.util.Optional.of(bArr) : java.util.Optional.empty();
    }

    @Override // com.tencent.wechat.aff.cara.CaraNativeAppBase
    public void reportKV(int i17, java.lang.String str) {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(i17, str);
    }

    @Override // com.tencent.wechat.aff.cara.CaraNativeAppBase
    public double serverNow() {
        return java.lang.System.currentTimeMillis() / 1000.0d;
    }
}
