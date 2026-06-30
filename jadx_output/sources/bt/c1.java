package bt;

@j95.b(dependencies = {com.tencent.mm.plugin.zero.m1.class, com.tencent.mm.plugin.zero.LoadProtocolJNIService.class})
/* loaded from: classes11.dex */
public class c1 extends i95.w {

    /* renamed from: d, reason: collision with root package name */
    public volatile c01.m8 f24066d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.console.CommandLine f24067e = new com.tencent.mm.console.CommandLine();

    @Override // i95.w
    public void onCreate(android.content.Context context) {
        int i17;
        java.lang.String str;
        int i18;
        int i19;
        uk.c cVar;
        boolean z17;
        boolean z18;
        super.onCreate(context);
        km0.b a17 = gm0.j1.p().a();
        com.tencent.mm.app.w7 w7Var = com.tencent.mm.app.w7.f53896f;
        com.tencent.mm.app.s7 s7Var = new com.tencent.mm.app.s7(com.tencent.mm.sdk.platformtools.x2.f193071a);
        java.util.HashMap hashMap = (java.util.HashMap) s7Var.f53772a;
        hashMap.put("qqmail", java.lang.Integer.valueOf(com.tencent.mm.R.string.fvb));
        hashMap.put("gh_051d9102de63", java.lang.Integer.valueOf(com.tencent.mm.R.string.o59));
        hashMap.put("schedule_message", java.lang.Integer.valueOf(com.tencent.mm.R.string.p0l));
        hashMap.put("fmessage", java.lang.Integer.valueOf(com.tencent.mm.R.string.fuc));
        hashMap.put("floatbottle", java.lang.Integer.valueOf(com.tencent.mm.R.string.ftv));
        hashMap.put("lbsapp", java.lang.Integer.valueOf(com.tencent.mm.R.string.fui));
        hashMap.put("shakeapp", java.lang.Integer.valueOf(com.tencent.mm.R.string.fvl));
        hashMap.put("medianote", java.lang.Integer.valueOf(com.tencent.mm.R.string.fur));
        hashMap.put("qqfriend", java.lang.Integer.valueOf(com.tencent.mm.R.string.fv9));
        hashMap.put("newsapp", java.lang.Integer.valueOf(com.tencent.mm.R.string.fvh));
        hashMap.put("facebookapp", java.lang.Integer.valueOf(com.tencent.mm.R.string.fu7));
        hashMap.put("masssendapp", java.lang.Integer.valueOf(com.tencent.mm.R.string.fuo));
        hashMap.put("meishiapp", java.lang.Integer.valueOf(com.tencent.mm.R.string.fuu));
        hashMap.put("feedsapp", java.lang.Integer.valueOf(com.tencent.mm.R.string.fu_));
        hashMap.put("voipapp", java.lang.Integer.valueOf(com.tencent.mm.R.string.fvr));
        hashMap.put("weixin", java.lang.Integer.valueOf(com.tencent.mm.R.string.hdp));
        hashMap.put("filehelper", java.lang.Integer.valueOf(com.tencent.mm.R.string.fto));
        hashMap.put("cardpackage", java.lang.Integer.valueOf(com.tencent.mm.R.string.fty));
        hashMap.put("officialaccounts", java.lang.Integer.valueOf(com.tencent.mm.R.string.fuz));
        hashMap.put("service_officialaccounts", java.lang.Integer.valueOf(com.tencent.mm.R.string.msy));
        hashMap.put("voicevoipapp", java.lang.Integer.valueOf(com.tencent.mm.R.string.fvu));
        hashMap.put("helper_entry", java.lang.Integer.valueOf(com.tencent.mm.R.string.fuf));
        hashMap.put("voiceinputapp", java.lang.Integer.valueOf(com.tencent.mm.R.string.fvo));
        hashMap.put("linkedinplugin", java.lang.Integer.valueOf(com.tencent.mm.R.string.ful));
        hashMap.put("notifymessage", java.lang.Integer.valueOf(com.tencent.mm.R.string.fuw));
        hashMap.put("gh_f0a92aa7146c", java.lang.Integer.valueOf(com.tencent.mm.R.string.f492272fw2));
        hashMap.put("gh_e087bb5b95e6", java.lang.Integer.valueOf(com.tencent.mm.R.string.f492271fw1));
        hashMap.put("appbrandcustomerservicemsg", java.lang.Integer.valueOf(com.tencent.mm.R.string.ftp));
        hashMap.put("appbrand_notify_message", java.lang.Integer.valueOf(com.tencent.mm.R.string.fts));
        hashMap.put("opencustomerservicemsg", java.lang.Integer.valueOf(com.tencent.mm.R.string.f492268fv5));
        hashMap.put("conversationboxservice", java.lang.Integer.valueOf(com.tencent.mm.R.string.f492258fu1));
        hashMap.put("BrandEcsTemplateMsg@fakeuser", java.lang.Integer.valueOf(com.tencent.mm.R.string.msw));
        if (1 == j62.e.g().i("clicfg_minishop_plugin_enabled", 1, true, true)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WorkerProfile", "hardcode mini shop nickname");
            hashMap.put("gh_579db1f2cf89", java.lang.Integer.valueOf(com.tencent.mm.R.string.fuv));
        }
        hashMap.put("gh_b4af18eac3d5", java.lang.Integer.valueOf(com.tencent.mm.R.string.f492270fw0));
        hashMap.put("gh_3dfda90e39d6", java.lang.Integer.valueOf(com.tencent.mm.R.string.bvz));
        hashMap.put("gh_25d9ac85a4bc", java.lang.Integer.valueOf(com.tencent.mm.R.string.fvx));
        hashMap.put("gh_43f2581f6fd6", java.lang.Integer.valueOf(com.tencent.mm.R.string.lez));
        ((java.util.HashMap) s7Var.f53773b).put("weixin", java.lang.Integer.valueOf(com.tencent.mm.R.string.hdo));
        com.tencent.mm.contact.s.I2 = s7Var;
        com.tencent.mm.contact.s.H2 = new com.tencent.mm.app.t7();
        com.tencent.mm.app.w7 w7Var2 = com.tencent.mm.app.w7.f53896f;
        c01.d9.e().a(-1, w7Var2);
        com.tencent.mm.modelbase.y2.f70840h = w7Var2;
        c01.u.f37498f = w7Var2;
        com.tencent.mm.app.a8 a8Var = com.tencent.mm.app.a8.f53329b;
        com.tencent.mars.xlog.Log.i("MicroMsg.VAS.WxVAS", "init isVASOpen:" + a8Var.e());
        com.tencent.mm.ui.MMFragmentActivity.aReporter = com.tencent.mm.app.a8.f53331d;
        com.tencent.mm.ui.vas.VASActivity.Companion.getClass();
        com.tencent.mm.ui.vas.VASActivity.vasController = a8Var;
        com.tencent.mm.protobuf.n.f192172a = j62.e.g().c(new com.tencent.mm.repairer.config.global.RepairerConfigProtobufReportSize());
        com.tencent.mm.protobuf.n.f192173b = new ax1.e0();
        zn4.f.f474502d = j62.e.g().c(new com.tencent.mm.repairer.config.serialize.RepairerConfigUseNewSerialize()) != 1;
        com.tencent.mars.xlog.Log.i("MicroMsg.SerializeTelemetryHelper.XML", "useLegacyParser: " + zn4.f.f474502d);
        zn4.f.f474500b = ax1.f0.f14995d;
        zn4.f.f474501c = ax1.g0.f14998d;
        com.tencent.mm.ui.b4.f197210a = j62.e.g().c(new com.tencent.mm.repairer.config.edge2edge.RepairerConfigFixEdgeToEdgeForApi35()) == 1;
        com.tencent.mars.xlog.Log.i("MicroMsg.Edge2EdgeHelper", "initExp SwitchEnable=" + com.tencent.mm.ui.b4.f197210a + " from=SplashServer");
        com.tencent.mm.opensdk.utils.Log.setLogImpl(new bt.z0(this));
        com.tencent.mm.ui.yk.f212594a = new bt.a1(this);
        android.app.Application application = a17.f308989c;
        com.tencent.mm.sdk.platformtools.a0.e(application);
        try {
            java.util.HashMap hashMap2 = (java.util.HashMap) com.tencent.mm.sdk.platformtools.b2.a(com.tencent.mm.sdk.platformtools.t8.e(application.getAssets().open("profile.ini")));
            java.lang.String str2 = (java.lang.String) hashMap2.get("PROFILE_DEVICE_TYPE");
            if (str2 == null) {
                str2 = "";
            }
            com.tencent.mm.sdk.platformtools.a0.f192442e = str2;
            if (str2.length() <= 0) {
                com.tencent.mm.sdk.platformtools.a0.f192442e = "" + android.os.Build.VERSION.SDK_INT;
            }
            if (com.tencent.mm.sdk.platformtools.a0.d((java.lang.String) hashMap2.get("UPDATE_MODE")) != 0) {
                com.tencent.mm.sdk.platformtools.a0.f192438a = com.tencent.mm.sdk.platformtools.a0.d((java.lang.String) hashMap2.get("UPDATE_MODE"));
            }
            com.tencent.mm.sdk.platformtools.a0.f192443f = com.tencent.mm.sdk.platformtools.a0.d((java.lang.String) hashMap2.get("BUILD_REVISION"));
            try {
                z17 = java.lang.Boolean.parseBoolean((java.lang.String) hashMap2.get("GPRS_ALERT"));
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.ChannelUtil", e17, "", new java.lang.Object[0]);
                com.tencent.mars.xlog.Log.w("MicroMsg.SDK.ChannelUtil", e17.getMessage());
                z17 = false;
            }
            com.tencent.mm.sdk.platformtools.a0.f192447j = z17;
            com.tencent.mm.sdk.platformtools.a0.f192441d = com.tencent.mm.sdk.platformtools.a0.d((java.lang.String) hashMap2.get("AUTO_ADD_ACOUNT"));
            try {
                z18 = java.lang.Boolean.parseBoolean((java.lang.String) hashMap2.get("NOKIA_AOL"));
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.ChannelUtil", e18, "", new java.lang.Object[0]);
                com.tencent.mars.xlog.Log.w("MicroMsg.SDK.ChannelUtil", e18.getMessage());
                z18 = false;
            }
            com.tencent.mm.sdk.platformtools.a0.f192448k = z18;
            com.tencent.mars.xlog.Log.w("MicroMsg.SDK.ChannelUtil", "profileDeviceType=" + com.tencent.mm.sdk.platformtools.a0.f192442e);
            com.tencent.mars.xlog.Log.w("MicroMsg.SDK.ChannelUtil", "updateMode=" + com.tencent.mm.sdk.platformtools.a0.f192438a);
            com.tencent.mars.xlog.Log.w("MicroMsg.SDK.ChannelUtil", "shouldShowGprsAlert=" + com.tencent.mm.sdk.platformtools.a0.f192447j);
            com.tencent.mars.xlog.Log.w("MicroMsg.SDK.ChannelUtil", "autoAddAccount=" + com.tencent.mm.sdk.platformtools.a0.f192441d);
            com.tencent.mars.xlog.Log.w("MicroMsg.SDK.ChannelUtil", "isNokiaol=" + com.tencent.mm.sdk.platformtools.a0.f192448k);
            java.lang.String str3 = (java.lang.String) hashMap2.get("MARKET_URL");
            if (str3 != null && str3.trim().length() != 0 && android.net.Uri.parse(str3) != null) {
                com.tencent.mm.sdk.platformtools.a0.f192444g = str3;
            }
            com.tencent.mars.xlog.Log.w("MicroMsg.SDK.ChannelUtil", "marketURL=" + com.tencent.mm.sdk.platformtools.a0.f192444g);
            i17 = 0;
        } catch (java.lang.Exception e19) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.ChannelUtil", "setup profile from profile.ini failed");
            i17 = 0;
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.ChannelUtil", e19, "", new java.lang.Object[0]);
        }
        try {
            java.lang.String str4 = application.getPackageManager().getPackageInfo(application.getPackageName(), i17).applicationInfo.sourceDir;
            com.tencent.mars.xlog.Log.i("MicroMsg.WorkerProfile", "initChannelUtil sourceFile = %s", str4);
            if (application.getApplicationInfo().targetSdkVersion <= 29) {
                com.tencent.mm.app.w7.a(str4);
                uk.b b17 = uk.b.b(str4);
                if (b17 == null || (cVar = b17.f428482b) == null) {
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    objArr[0] = java.lang.Boolean.valueOf(b17 == null);
                    com.tencent.mars.xlog.Log.e("MicroMsg.WorkerProfile", "initChannelUtil something null %s", objArr);
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WorkerProfile", "apk external info not null");
                    int i27 = cVar.f428484e;
                    if (i27 != 0) {
                        com.tencent.mm.sdk.platformtools.a0.f192439b = i27;
                        com.tencent.mars.xlog.Log.i("MicroMsg.WorkerProfile", "read channelId from apk external");
                    }
                    int i28 = cVar.f428486g;
                    if (i28 != 0) {
                        com.tencent.mm.sdk.platformtools.a0.f192438a = i28;
                        com.tencent.mars.xlog.Log.i("MicroMsg.WorkerProfile", "ext.updateMode = %s", java.lang.Integer.valueOf(i28));
                    }
                    java.lang.String str5 = cVar.f428487h;
                    if (str5 != null) {
                        com.tencent.mm.sdk.platformtools.a0.f192443f = com.tencent.mm.sdk.platformtools.t8.P(str5, 0);
                    }
                    java.lang.String str6 = cVar.f428488i;
                    if (str6 != null) {
                        com.tencent.mm.sdk.platformtools.a0.f192444g = str6;
                    }
                    java.lang.String str7 = cVar.f428485f;
                    if (str7 != null) {
                        com.tencent.mm.sdk.platformtools.a0.f192442e = str7;
                    }
                    boolean z19 = cVar.f428491o;
                    if (z19) {
                        com.tencent.mm.sdk.platformtools.a0.f192448k = z19;
                        com.tencent.mars.xlog.Log.i("MicroMsg.WorkerProfile", "ext.isNokiaol = %s", java.lang.Boolean.valueOf(z19));
                    }
                    int i29 = cVar.f428490n;
                    if (i29 != 0) {
                        com.tencent.mm.sdk.platformtools.a0.f192441d = i29;
                        com.tencent.mars.xlog.Log.i("MicroMsg.WorkerProfile", "ext.autoAddAccount = %s", java.lang.Integer.valueOf(i29));
                    }
                    boolean z27 = cVar.f428489m;
                    if (z27) {
                        com.tencent.mm.sdk.platformtools.a0.f192447j = z27;
                        com.tencent.mars.xlog.Log.i("MicroMsg.WorkerProfile", "ext.shouldShowGprsAlert = %s", java.lang.Boolean.valueOf(z27));
                    }
                }
            }
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WorkerProfile", "initChannelUtil NameNotFoundException");
        } catch (java.lang.Exception e27) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WorkerProfile", "Exception in initChannel, %s", e27.getMessage());
        }
        if (com.tencent.mm.app.c0.b()) {
            java.io.RandomAccessFile randomAccessFile = null;
            try {
                try {
                    java.io.RandomAccessFile B = com.tencent.mm.vfs.w6.B(com.tencent.mm.app.c0.f53355a, true);
                    long length = B.length();
                    com.tencent.mars.xlog.Log.i("MicroMsg.ChannelHistory", "correctChannleIdBySource fileLen:%d  curChannelId:%d", java.lang.Long.valueOf(length), java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.a0.f192439b));
                    if (length <= 0) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.ChannelHistory", "channel history file fileLen <= 0");
                        try {
                            B.close();
                        } catch (java.lang.Exception e28) {
                            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ChannelHistory", e28, "Close ChannelHistory History file failed.", "");
                        }
                    } else {
                        java.lang.String readLine = B.readLine();
                        int i37 = com.tencent.mm.sdk.platformtools.a0.f192439b;
                        com.tencent.mm.sdk.platformtools.a0.f192440c = i37;
                        if (com.tencent.mm.sdk.platformtools.t8.K0(readLine)) {
                            str = "";
                            i18 = i37;
                        } else {
                            str = "" + readLine + ",";
                            i18 = com.tencent.mm.sdk.platformtools.t8.P(readLine, 0);
                            if (i18 != com.tencent.mm.sdk.platformtools.a0.f192439b) {
                                com.tencent.mm.sdk.platformtools.a0.f192440c = i18;
                                com.tencent.mars.xlog.Log.i("MicroMsg.ChannelHistory", "real correct final channelid: " + com.tencent.mm.sdk.platformtools.a0.f192439b);
                            }
                        }
                        if (com.tencent.mm.sdk.platformtools.x2.f193074d) {
                            while (true) {
                                java.lang.String readLine2 = B.readLine();
                                if (com.tencent.mm.sdk.platformtools.t8.K0(readLine2)) {
                                    break;
                                }
                                str = str + readLine2 + ",";
                                i18 = com.tencent.mm.sdk.platformtools.t8.P(readLine2, 0);
                            }
                            com.tencent.mars.xlog.Log.i("MicroMsg.ChannelHistory", "channel list: %s", str);
                            if (i18 != i37) {
                                B.seek(length);
                                B.write(java.lang.String.format("%d\n", java.lang.Integer.valueOf(i37)).getBytes());
                                com.tencent.mars.xlog.Log.i("MicroMsg.ChannelHistory", "channelid change from %d to %d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i37));
                            }
                        }
                        try {
                            B.close();
                        } catch (java.lang.Exception e29) {
                            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ChannelHistory", e29, "Close ChannelHistory History file failed.", "");
                        }
                    }
                } finally {
                }
            } catch (java.lang.Exception e37) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ChannelHistory", e37, "Open ChannelHistory History file failed.", "");
                if (0 != 0) {
                    try {
                        randomAccessFile.close();
                    } catch (java.lang.Exception e38) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ChannelHistory", e38, "Close ChannelHistory History file failed.", "");
                    }
                }
            }
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.ChannelHistory", "channel history file does not exit!");
        }
        com.tencent.mm.booter.s b18 = com.tencent.mm.booter.s.b(application);
        if (b18 != null && (i19 = b18.f63562a) != -1) {
            com.tencent.mm.sdk.platformtools.a0.f192439b = i19;
        }
        android.content.Context applicationContext = a17.f308989c.getApplicationContext();
        int i38 = com.tencent.mm.sdk.platformtools.a0.f192439b;
        int i39 = o45.wf.f343029g;
        if (applicationContext != null && i38 >= 0 && i39 >= 637534208) {
            try {
                android.content.SharedPreferences sharedPreferences = applicationContext.getSharedPreferences("crash_status_file", 4);
                int i47 = sharedPreferences.getInt("channel", -1);
                int i48 = sharedPreferences.getInt("version", 0);
                if (i47 != i38 || i48 != i39) {
                    android.content.SharedPreferences.Editor edit = sharedPreferences.edit();
                    edit.putInt("channel", i38);
                    edit.putInt("version", i39);
                    edit.commit();
                }
            } catch (java.lang.Throwable unused2) {
            }
        }
        if (com.tencent.mm.sdk.platformtools.a0.f192443f > 0) {
            com.tencent.mm.sdk.platformtools.a0.f192445h = true;
        }
        com.tencent.mm.app.w7.b(-1);
        com.tencent.mars.xlog.Log.i("LegacyWorkProfileOnSplashService", "set device type :%s  %s", wo.q.f447780a, com.tencent.mm.sdk.platformtools.s9.f192973a);
        com.tencent.mm.feature.app.extension.w0.f65032d = com.tencent.mm.ui.MMActivity.initLanguage(((km0.c) gm0.j1.p().a()).f308989c.getBaseContext());
        oo3.j jVar = (oo3.j) i95.n0.c(oo3.j.class);
        c01.m8 wi6 = wi();
        ((mo3.g) jVar).f330407d = wi6;
        mo3.f.f330406a = wi6;
        com.tencent.mm.pluginsdk.ui.w wVar = new com.tencent.mm.pluginsdk.ui.w(new com.tencent.mm.app.b0());
        java.util.Objects.toString(wVar);
        com.tencent.mm.pluginsdk.ui.u.f192025a = wVar;
        k35.p.f303943a = new bt.b1(this);
        this.f24067e.alive();
    }

    public c01.m8 wi() {
        if (this.f24066d == null) {
            synchronized (this) {
                if (this.f24066d == null) {
                    this.f24066d = new com.tencent.mm.booter.notification.x(com.tencent.mm.sdk.platformtools.x2.f193071a.getApplicationContext());
                }
            }
        }
        return this.f24066d;
    }
}
