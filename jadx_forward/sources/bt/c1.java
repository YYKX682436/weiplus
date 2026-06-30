package bt;

@j95.b(m140513x1e06fd29 = {com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.m1.class, com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.C19574xf4ebdfae.class})
/* loaded from: classes11.dex */
public class c1 extends i95.w {

    /* renamed from: d, reason: collision with root package name */
    public volatile c01.m8 f105599d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p669x38b6e557.C10404xc4d0dbf f105600e = new com.p314xaae8f345.mm.p669x38b6e557.C10404xc4d0dbf();

    @Override // i95.w
    /* renamed from: onCreate */
    public void mo8845x3e5a77bb(android.content.Context context) {
        int i17;
        java.lang.String str;
        int i18;
        int i19;
        uk.c cVar;
        boolean z17;
        boolean z18;
        super.mo8845x3e5a77bb(context);
        km0.b a17 = gm0.j1.p().a();
        com.p314xaae8f345.mm.app.w7 w7Var = com.p314xaae8f345.mm.app.w7.f135429f;
        com.p314xaae8f345.mm.app.s7 s7Var = new com.p314xaae8f345.mm.app.s7(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        java.util.HashMap hashMap = (java.util.HashMap) s7Var.f135305a;
        hashMap.put("qqmail", java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30867xcad56011.fvb));
        hashMap.put("gh_051d9102de63", java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30867xcad56011.o59));
        hashMap.put("schedule_message", java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30867xcad56011.p0l));
        hashMap.put("fmessage", java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30867xcad56011.fuc));
        hashMap.put("floatbottle", java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30867xcad56011.ftv));
        hashMap.put("lbsapp", java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30867xcad56011.fui));
        hashMap.put("shakeapp", java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30867xcad56011.fvl));
        hashMap.put("medianote", java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30867xcad56011.fur));
        hashMap.put("qqfriend", java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30867xcad56011.fv9));
        hashMap.put("newsapp", java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30867xcad56011.fvh));
        hashMap.put("facebookapp", java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30867xcad56011.fu7));
        hashMap.put("masssendapp", java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30867xcad56011.fuo));
        hashMap.put("meishiapp", java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30867xcad56011.fuu));
        hashMap.put("feedsapp", java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30867xcad56011.fu_));
        hashMap.put("voipapp", java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30867xcad56011.fvr));
        hashMap.put("weixin", java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30867xcad56011.hdp));
        hashMap.put("filehelper", java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30867xcad56011.fto));
        hashMap.put("cardpackage", java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30867xcad56011.fty));
        hashMap.put("officialaccounts", java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30867xcad56011.fuz));
        hashMap.put("service_officialaccounts", java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30867xcad56011.msy));
        hashMap.put("voicevoipapp", java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30867xcad56011.fvu));
        hashMap.put("helper_entry", java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30867xcad56011.fuf));
        hashMap.put("voiceinputapp", java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30867xcad56011.fvo));
        hashMap.put("linkedinplugin", java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30867xcad56011.ful));
        hashMap.put("notifymessage", java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30867xcad56011.fuw));
        hashMap.put("gh_f0a92aa7146c", java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30867xcad56011.f573805fw2));
        hashMap.put("gh_e087bb5b95e6", java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30867xcad56011.f573804fw1));
        hashMap.put("appbrandcustomerservicemsg", java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30867xcad56011.ftp));
        hashMap.put("appbrand_notify_message", java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30867xcad56011.fts));
        hashMap.put("opencustomerservicemsg", java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30867xcad56011.f573801fv5));
        hashMap.put("conversationboxservice", java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30867xcad56011.f573791fu1));
        hashMap.put("BrandEcsTemplateMsg@fakeuser", java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30867xcad56011.msw));
        if (1 == j62.e.g().i("clicfg_minishop_plugin_enabled", 1, true, true)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WorkerProfile", "hardcode mini shop nickname");
            hashMap.put("gh_579db1f2cf89", java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30867xcad56011.fuv));
        }
        hashMap.put("gh_b4af18eac3d5", java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30867xcad56011.f573803fw0));
        hashMap.put("gh_3dfda90e39d6", java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30867xcad56011.bvz));
        hashMap.put("gh_25d9ac85a4bc", java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30867xcad56011.fvx));
        hashMap.put("gh_43f2581f6fd6", java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30867xcad56011.lez));
        ((java.util.HashMap) s7Var.f135306b).put("weixin", java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30867xcad56011.hdo));
        com.p314xaae8f345.mm.p670x38b72420.s.I2 = s7Var;
        com.p314xaae8f345.mm.p670x38b72420.s.H2 = new com.p314xaae8f345.mm.app.t7();
        com.p314xaae8f345.mm.app.w7 w7Var2 = com.p314xaae8f345.mm.app.w7.f135429f;
        c01.d9.e().a(-1, w7Var2);
        com.p314xaae8f345.mm.p944x882e457a.y2.f152373h = w7Var2;
        c01.u.f119031f = w7Var2;
        com.p314xaae8f345.mm.app.a8 a8Var = com.p314xaae8f345.mm.app.a8.f134862b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VAS.WxVAS", "init isVASOpen:" + a8Var.e());
        com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f.f39357x18545862 = com.p314xaae8f345.mm.app.a8.f134864d;
        com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37.f39695x233c02ec.getClass();
        com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37.f39716x5a4134e4 = a8Var;
        com.p314xaae8f345.mm.p2495xc50a8b8b.n.f273705a = j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2535xb5e903a3.C20304x46eb2f5c());
        com.p314xaae8f345.mm.p2495xc50a8b8b.n.f273706b = new ax1.e0();
        zn4.f.f556035d = j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2568xddd166e0.C20696x4654c3ab()) != 1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SerializeTelemetryHelper.XML", "useLegacyParser: " + zn4.f.f556035d);
        zn4.f.f556033b = ax1.f0.f96528d;
        zn4.f.f556034c = ax1.g0.f96531d;
        com.p314xaae8f345.mm.ui.b4.f278743a = j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2527xae0a552.C20130xeaa1ea21()) == 1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Edge2EdgeHelper", "initExp SwitchEnable=" + com.p314xaae8f345.mm.ui.b4.f278743a + " from=SplashServer");
        com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.m48579xc597c0c2(new bt.z0(this));
        com.p314xaae8f345.mm.ui.yk.f294127a = new bt.a1(this);
        android.app.Application application = a17.f390522c;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.e(application);
        try {
            java.util.HashMap hashMap2 = (java.util.HashMap) com.p314xaae8f345.mm.sdk.p2603x2137b148.b2.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.e(application.getAssets().open("profile.ini")));
            java.lang.String str2 = (java.lang.String) hashMap2.get("PROFILE_DEVICE_TYPE");
            if (str2 == null) {
                str2 = "";
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.f273975e = str2;
            if (str2.length() <= 0) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.f273975e = "" + android.os.Build.VERSION.SDK_INT;
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.d((java.lang.String) hashMap2.get("UPDATE_MODE")) != 0) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.f273971a = com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.d((java.lang.String) hashMap2.get("UPDATE_MODE"));
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.f273976f = com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.d((java.lang.String) hashMap2.get("BUILD_REVISION"));
            try {
                z17 = java.lang.Boolean.parseBoolean((java.lang.String) hashMap2.get("GPRS_ALERT"));
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.ChannelUtil", e17, "", new java.lang.Object[0]);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SDK.ChannelUtil", e17.getMessage());
                z17 = false;
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.f273980j = z17;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.f273974d = com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.d((java.lang.String) hashMap2.get("AUTO_ADD_ACOUNT"));
            try {
                z18 = java.lang.Boolean.parseBoolean((java.lang.String) hashMap2.get("NOKIA_AOL"));
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.ChannelUtil", e18, "", new java.lang.Object[0]);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SDK.ChannelUtil", e18.getMessage());
                z18 = false;
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.f273981k = z18;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SDK.ChannelUtil", "profileDeviceType=" + com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.f273975e);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SDK.ChannelUtil", "updateMode=" + com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.f273971a);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SDK.ChannelUtil", "shouldShowGprsAlert=" + com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.f273980j);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SDK.ChannelUtil", "autoAddAccount=" + com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.f273974d);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SDK.ChannelUtil", "isNokiaol=" + com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.f273981k);
            java.lang.String str3 = (java.lang.String) hashMap2.get("MARKET_URL");
            if (str3 != null && str3.trim().length() != 0 && android.net.Uri.parse(str3) != null) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.f273977g = str3;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SDK.ChannelUtil", "marketURL=" + com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.f273977g);
            i17 = 0;
        } catch (java.lang.Exception e19) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.ChannelUtil", "setup profile from profile.ini failed");
            i17 = 0;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.ChannelUtil", e19, "", new java.lang.Object[0]);
        }
        try {
            java.lang.String str4 = application.getPackageManager().getPackageInfo(application.getPackageName(), i17).applicationInfo.sourceDir;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WorkerProfile", "initChannelUtil sourceFile = %s", str4);
            if (application.getApplicationInfo().targetSdkVersion <= 29) {
                com.p314xaae8f345.mm.app.w7.a(str4);
                uk.b b17 = uk.b.b(str4);
                if (b17 == null || (cVar = b17.f510015b) == null) {
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    objArr[0] = java.lang.Boolean.valueOf(b17 == null);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WorkerProfile", "initChannelUtil something null %s", objArr);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WorkerProfile", "apk external info not null");
                    int i27 = cVar.f510017e;
                    if (i27 != 0) {
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.f273972b = i27;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WorkerProfile", "read channelId from apk external");
                    }
                    int i28 = cVar.f510019g;
                    if (i28 != 0) {
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.f273971a = i28;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WorkerProfile", "ext.updateMode = %s", java.lang.Integer.valueOf(i28));
                    }
                    java.lang.String str5 = cVar.f510020h;
                    if (str5 != null) {
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.f273976f = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(str5, 0);
                    }
                    java.lang.String str6 = cVar.f510021i;
                    if (str6 != null) {
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.f273977g = str6;
                    }
                    java.lang.String str7 = cVar.f510018f;
                    if (str7 != null) {
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.f273975e = str7;
                    }
                    boolean z19 = cVar.f510024o;
                    if (z19) {
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.f273981k = z19;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WorkerProfile", "ext.isNokiaol = %s", java.lang.Boolean.valueOf(z19));
                    }
                    int i29 = cVar.f510023n;
                    if (i29 != 0) {
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.f273974d = i29;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WorkerProfile", "ext.autoAddAccount = %s", java.lang.Integer.valueOf(i29));
                    }
                    boolean z27 = cVar.f510022m;
                    if (z27) {
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.f273980j = z27;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WorkerProfile", "ext.shouldShowGprsAlert = %s", java.lang.Boolean.valueOf(z27));
                    }
                }
            }
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WorkerProfile", "initChannelUtil NameNotFoundException");
        } catch (java.lang.Exception e27) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WorkerProfile", "Exception in initChannel, %s", e27.getMessage());
        }
        if (com.p314xaae8f345.mm.app.c0.b()) {
            java.io.RandomAccessFile randomAccessFile = null;
            try {
                try {
                    java.io.RandomAccessFile B = com.p314xaae8f345.mm.vfs.w6.B(com.p314xaae8f345.mm.app.c0.f134888a, true);
                    long length = B.length();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChannelHistory", "correctChannleIdBySource fileLen:%d  curChannelId:%d", java.lang.Long.valueOf(length), java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.f273972b));
                    if (length <= 0) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChannelHistory", "channel history file fileLen <= 0");
                        try {
                            B.close();
                        } catch (java.lang.Exception e28) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ChannelHistory", e28, "Close ChannelHistory History file failed.", "");
                        }
                    } else {
                        java.lang.String readLine = B.readLine();
                        int i37 = com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.f273972b;
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.f273973c = i37;
                        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(readLine)) {
                            str = "";
                            i18 = i37;
                        } else {
                            str = "" + readLine + ",";
                            i18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(readLine, 0);
                            if (i18 != com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.f273972b) {
                                com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.f273973c = i18;
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChannelHistory", "real correct final channelid: " + com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.f273972b);
                            }
                        }
                        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274607d) {
                            while (true) {
                                java.lang.String readLine2 = B.readLine();
                                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(readLine2)) {
                                    break;
                                }
                                str = str + readLine2 + ",";
                                i18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(readLine2, 0);
                            }
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChannelHistory", "channel list: %s", str);
                            if (i18 != i37) {
                                B.seek(length);
                                B.write(java.lang.String.format("%d\n", java.lang.Integer.valueOf(i37)).getBytes());
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChannelHistory", "channelid change from %d to %d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i37));
                            }
                        }
                        try {
                            B.close();
                        } catch (java.lang.Exception e29) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ChannelHistory", e29, "Close ChannelHistory History file failed.", "");
                        }
                    }
                } finally {
                }
            } catch (java.lang.Exception e37) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ChannelHistory", e37, "Open ChannelHistory History file failed.", "");
                if (0 != 0) {
                    try {
                        randomAccessFile.close();
                    } catch (java.lang.Exception e38) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ChannelHistory", e38, "Close ChannelHistory History file failed.", "");
                    }
                }
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChannelHistory", "channel history file does not exit!");
        }
        com.p314xaae8f345.mm.p642xad8b531f.s b18 = com.p314xaae8f345.mm.p642xad8b531f.s.b(application);
        if (b18 != null && (i19 = b18.f145095a) != -1) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.f273972b = i19;
        }
        android.content.Context applicationContext = a17.f390522c.getApplicationContext();
        int i38 = com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.f273972b;
        int i39 = o45.wf.f424562g;
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
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.f273976f > 0) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.f273978h = true;
        }
        com.p314xaae8f345.mm.app.w7.b(-1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LegacyWorkProfileOnSplashService", "set device type :%s  %s", wo.q.f529313a, com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274506a);
        com.p314xaae8f345.mm.p689xc5a27af6.app.p691xdb7d1c3f.w0.f146565d = com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf.m78472x26f04c88(((km0.c) gm0.j1.p().a()).f390522c.getBaseContext());
        oo3.j jVar = (oo3.j) i95.n0.c(oo3.j.class);
        c01.m8 wi6 = wi();
        ((mo3.g) jVar).f411940d = wi6;
        mo3.f.f411939a = wi6;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.w wVar = new com.p314xaae8f345.mm.p2470x93e71c27.ui.w(new com.p314xaae8f345.mm.app.b0());
        java.util.Objects.toString(wVar);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.u.f273558a = wVar;
        k35.p.f385476a = new bt.b1(this);
        this.f105600e.mo48813x58998cd();
    }

    public c01.m8 wi() {
        if (this.f105599d == null) {
            synchronized (this) {
                if (this.f105599d == null) {
                    this.f105599d = new com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getApplicationContext());
                }
            }
        }
        return this.f105599d;
    }
}
