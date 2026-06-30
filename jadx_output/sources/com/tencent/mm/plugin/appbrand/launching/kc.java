package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class kc extends com.tencent.mm.sdk.event.n {
    public kc() {
        super(0);
    }

    public final void b(android.content.Context context, int i17) {
        com.tencent.mm.plugin.appbrand.ipc.d.a(context, i17 == 1 ? com.tencent.mm.plugin.appbrand.utils.s0.b(com.tencent.mm.R.string.f490089kl, new java.lang.Object[0]) : i17 == 2 ? com.tencent.mm.plugin.appbrand.utils.s0.b(com.tencent.mm.R.string.f490207ny, new java.lang.Object[0]) : null, com.tencent.mm.plugin.appbrand.utils.s0.b(com.tencent.mm.R.string.f490573yv, new java.lang.Object[0]), com.tencent.mm.plugin.appbrand.utils.s0.b(com.tencent.mm.R.string.f490507x1, new java.lang.Object[0]), "", null, null, null);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer appBrandLaunchReferrer;
        java.lang.String string;
        com.tencent.mm.plugin.appbrand.appcache.n9 f07;
        com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent startAppBrandUIFromOuterEvent = (com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent) iEvent;
        boolean z17 = false;
        if (!gm0.j1.a()) {
            return false;
        }
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(startAppBrandUIFromOuterEvent.f54857g.f7466a);
        am.ox oxVar = startAppBrandUIFromOuterEvent.f54858h;
        am.nx nxVar = startAppBrandUIFromOuterEvent.f54857g;
        if (!K0 || !com.tencent.mm.sdk.platformtools.t8.K0(nxVar.f7473h)) {
            if (2 != nxVar.f7468c && !com.tencent.mm.sdk.platformtools.t8.K0(nxVar.f7473h) && !com.tencent.mm.sdk.platformtools.t8.K0(nxVar.f7480o.f70417f)) {
                ((com.tencent.mm.plugin.appbrand.launching.a5) com.tencent.mm.plugin.appbrand.app.r9.fj(com.tencent.mm.plugin.appbrand.launching.a5.class)).z0(nxVar.f7473h, nxVar.f7468c, nxVar.f7480o.f70417f);
            }
            com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel launchParcel = new com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel();
            com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject = new com.tencent.mm.plugin.appbrand.report.AppBrandStatObject();
            int i17 = nxVar.f7469d;
            appBrandStatObject.f87790f = i17;
            appBrandStatObject.f87791g = nxVar.f7470e;
            appBrandStatObject.f87788d = com.tencent.mm.plugin.appbrand.report.z0.a(i17, nxVar.f7489x);
            appBrandStatObject.f87789e = com.tencent.mm.plugin.appbrand.report.z0.b(appBrandStatObject.f87790f, nxVar.f7489x);
            appBrandStatObject.f87803v = nxVar.f7488w;
            appBrandStatObject.f87801t = nxVar.f7487v;
            appBrandStatObject.f87802u = nxVar.f7484s;
            appBrandStatObject.f87800s = nxVar.f7486u;
            int i18 = nxVar.f7469d;
            if (i18 == 1037 || i18 == 1018) {
                appBrandStatObject.f87793i = 0;
            } else {
                appBrandStatObject.f87793i = i18;
            }
            if (i18 == 1007 || i18 == 1008 || i18 == 1036 || i18 == 1044 || i18 == 1096) {
                appBrandStatObject.f87798q = nxVar.f7482q;
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(nxVar.f7491z)) {
                appBrandLaunchReferrer = new com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer();
                appBrandLaunchReferrer.f77327i = nxVar.f7491z;
                appBrandLaunchReferrer.f77323e = nxVar.f7490y;
                appBrandLaunchReferrer.f77325g = nxVar.A;
                appBrandLaunchReferrer.f77322d = 2;
                appBrandLaunchReferrer.f77324f = nxVar.E;
                if (launchParcel.f84920w == null) {
                    launchParcel.f84920w = new android.os.PersistableBundle();
                }
                launchParcel.f84920w.putString("adUxInfo", nxVar.B);
                launchParcel.f84920w.putString("commonUxInfo", nxVar.C);
            } else if (!com.tencent.mm.sdk.platformtools.t8.K0(nxVar.F)) {
                appBrandLaunchReferrer = new com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer();
                appBrandLaunchReferrer.f77326h = nxVar.F;
                appBrandLaunchReferrer.f77322d = 6;
            } else if (com.tencent.mm.sdk.platformtools.t8.K0(nxVar.D)) {
                appBrandLaunchReferrer = null;
            } else {
                appBrandLaunchReferrer = new com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer();
                appBrandLaunchReferrer.f77323e = nxVar.D;
                appBrandLaunchReferrer.f77322d = 5;
            }
            java.lang.String str = nxVar.f7466a;
            launchParcel.f84901d = str;
            launchParcel.f84902e = nxVar.f7473h;
            if (!android.text.TextUtils.isEmpty(str)) {
                launchParcel.f84902e = null;
            }
            launchParcel.f84906i = nxVar.f7467b;
            com.tencent.mm.plugin.appbrand.launching.g5 g5Var = com.tencent.mm.plugin.appbrand.launching.g5.f84619a;
            if (com.tencent.mm.plugin.appbrand.launching.g5.f84620b.a()) {
                sk1.b.a(com.tencent.mm.sdk.platformtools.x2.f193071a);
                com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel.B1 = true;
                launchParcel.f84906i = com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel.a(launchParcel.f84906i);
            }
            int i19 = nxVar.f7468c;
            launchParcel.f84904g = i19;
            if (!(com.tencent.mm.plugin.appbrand.appcache.g0.b(i19) || com.tencent.mm.plugin.appbrand.appcache.g0.a(i19))) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandLaunchFromOuterEventListener", "start with invalid versionType[%d], use 0 instead, stack=%s", java.lang.Integer.valueOf(launchParcel.f84904g), android.util.Log.getStackTraceString(new java.lang.Throwable()));
                launchParcel.f84904g = 0;
            }
            launchParcel.f84910o = appBrandStatObject;
            launchParcel.f84911p = appBrandLaunchReferrer;
            launchParcel.f84914q = nxVar.f7480o;
            launchParcel.f84918u = nxVar.G;
            launchParcel.f84921x = (com.tencent.luggage.sdk.launching.ActivityStarterIpcDelegate) nxVar.f7472g;
            launchParcel.D = nxVar.f7483r;
            launchParcel.E = nxVar.f7484s;
            launchParcel.f84907l1 = nxVar.f7485t;
            launchParcel.f84905h = nxVar.f7475j;
            if (k01.j.f303039a.b(launchParcel.f84901d, launchParcel.f84902e)) {
                com.tencent.mm.plugin.appbrand.config.AppBrandCustomLoadingConfig appBrandCustomLoadingConfig = new com.tencent.mm.plugin.appbrand.config.AppBrandCustomLoadingConfig();
                appBrandCustomLoadingConfig.f77204e = nxVar.f7481p;
                launchParcel.Y = appBrandCustomLoadingConfig;
            }
            com.tencent.mm.modelappbrand.LaunchParamsOptional launchParamsOptional = nxVar.f7480o;
            if (launchParamsOptional != null && launchParamsOptional.f70419h != 0) {
                launchParcel.F = 1;
            }
            if (launchParamsOptional != null) {
                launchParcel.f84913p1 = launchParamsOptional.f70420i;
            }
            int i27 = nxVar.f7468c;
            if (i27 != 0) {
                if (i27 == 1) {
                    if (nxVar.f7478m) {
                        java.lang.String e17 = k91.k4.e(nxVar.f7466a);
                        nxVar.f7473h = e17;
                        if (com.tencent.mm.sdk.platformtools.t8.K0(e17)) {
                            oxVar.f7581a = false;
                            oxVar.f7582b = "local pkg not exists";
                        } else {
                            com.tencent.mm.plugin.appbrand.appcache.qa Di = com.tencent.mm.plugin.appbrand.app.r9.Di();
                            java.lang.String str2 = nxVar.f7473h;
                            int i28 = nxVar.f7468c;
                            java.util.Locale locale = java.util.Locale.US;
                            android.database.Cursor E = Di.f75921d.E("AppBrandWxaPkgManifestRecord", new java.lang.String[]{"pkgPath"}, java.lang.String.format(locale, "%s=? and %s=?", "appId", "debugType"), new java.lang.String[]{str2, java.lang.String.valueOf(i28)}, null, null, null);
                            if (E == null) {
                                string = null;
                            } else {
                                string = E.moveToFirst() ? E.getString(0) : null;
                                E.close();
                            }
                            if (com.tencent.mm.sdk.platformtools.t8.K0(string) || !com.tencent.mm.vfs.w6.j(string)) {
                                com.tencent.mm.plugin.appbrand.appcache.qa Di2 = com.tencent.mm.plugin.appbrand.app.r9.Di();
                                java.lang.String str3 = nxVar.f7473h;
                                int i29 = nxVar.f7468c;
                                Di2.getClass();
                                int i37 = com.tencent.mm.plugin.appbrand.appcache.g0.a(i29) ? 1 : (com.tencent.mm.sdk.platformtools.t8.K0(str3) || !com.tencent.mm.plugin.appbrand.appcache.g0.b(i29) || (f07 = Di2.f0(str3, i29, "version")) == null) ? 0 : f07.field_version;
                                if (i37 < 0) {
                                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandWxaPkgStorage", "hasModuleList, appId(%s), type(%s), version(%d), not records", str3, java.lang.Integer.valueOf(i29), java.lang.Integer.valueOf(i37));
                                } else {
                                    android.database.Cursor f17 = Di2.f75921d.f(java.lang.String.format(locale, "select count(*) from %s %s", "AppBrandWxaPkgManifestRecord", java.lang.String.format(locale, "where %s like '%s$%%' and %s=%d and %s=%d", "appId", str3, "debugType", java.lang.Integer.valueOf(i29), "version", java.lang.Integer.valueOf(i37))), null, 2);
                                    if (f17 == null || f17.isClosed()) {
                                        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandWxaPkgStorage", "hasModuleList, appId(%s), type(%s), version(%d), cursor nil", str3, java.lang.Integer.valueOf(i29), java.lang.Integer.valueOf(i37));
                                    } else {
                                        int i38 = f17.moveToFirst() ? f17.getInt(0) : 0;
                                        f17.close();
                                        if (i38 > 0) {
                                            z17 = true;
                                        }
                                    }
                                    z17 = false;
                                }
                                if (z17) {
                                    oxVar.f7581a = true;
                                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandLaunchFromOuterEventListener", "callback with appId(%s) type(%d), hasModuleList=true", nxVar.f7473h, java.lang.Integer.valueOf(nxVar.f7468c));
                                    launchParcel.f84903f = 0;
                                    ((com.tencent.mm.plugin.appbrand.launching.a) com.tencent.mm.plugin.appbrand.launching.precondition.x.f85032a).a(nxVar.f7471f, launchParcel);
                                } else {
                                    oxVar.f7581a = false;
                                    oxVar.f7582b = "local pkg not exists";
                                }
                            } else {
                                oxVar.f7581a = true;
                                launchParcel.f84903f = 0;
                                ((com.tencent.mm.plugin.appbrand.launching.a) com.tencent.mm.plugin.appbrand.launching.precondition.x.f85032a).a(nxVar.f7471f, launchParcel);
                            }
                        }
                        if (nxVar.f7479n) {
                            b(nxVar.f7471f, nxVar.f7468c);
                        }
                    } else {
                        if (com.tencent.mm.sdk.platformtools.t8.K0(nxVar.f7473h)) {
                            java.lang.String e18 = k91.k4.e(nxVar.f7466a);
                            nxVar.f7473h = e18;
                            if (com.tencent.mm.sdk.platformtools.t8.K0(e18)) {
                                if (com.tencent.mm.sdk.platformtools.t8.K0(nxVar.f7491z)) {
                                    oxVar.f7581a = false;
                                    oxVar.f7582b = "invalid username or appId";
                                } else {
                                    oxVar.f7581a = true;
                                    ((com.tencent.mm.plugin.appbrand.launching.a) com.tencent.mm.plugin.appbrand.launching.precondition.x.f85032a).a(nxVar.f7471f, launchParcel);
                                }
                            }
                        }
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(nxVar.f7476k) && !com.tencent.mm.sdk.platformtools.t8.K0(nxVar.f7477l)) {
                            if (com.tencent.mm.plugin.appbrand.app.r9.Di().k(nxVar.f7473h, nxVar.f7468c, nxVar.f7476k, nxVar.f7477l, 0L, 0L)) {
                                com.tencent.mm.plugin.appbrand.task.u0.C().s(nxVar.f7473h, nxVar.f7468c);
                            } else if (!com.tencent.mm.plugin.appbrand.app.r9.Di().r(nxVar.f7473h, nxVar.f7468c)) {
                                oxVar.f7581a = false;
                                oxVar.f7582b = "install app failed";
                            }
                            appBrandStatObject.f87791g = nxVar.f7476k;
                            launchParcel.f84903f = -1;
                            ((com.tencent.mm.plugin.appbrand.launching.a) com.tencent.mm.plugin.appbrand.launching.precondition.x.f85032a).a(nxVar.f7471f, launchParcel);
                            oxVar.f7581a = true;
                            return true;
                        }
                        if (android.text.TextUtils.isEmpty(nxVar.f7491z)) {
                            oxVar.f7581a = false;
                            oxVar.f7582b = "invalid downloadURL or checkSumMd5";
                        } else if (android.text.TextUtils.isEmpty(((com.tencent.mm.plugin.appbrand.launching.a5) com.tencent.mm.plugin.appbrand.app.r9.fj(com.tencent.mm.plugin.appbrand.launching.a5.class)).y0(nxVar.f7473h, nxVar.f7468c)) && 0 == nxVar.f7475j) {
                            oxVar.f7581a = false;
                            oxVar.f7582b = "local pkg not exists";
                            b(nxVar.f7471f, nxVar.f7468c);
                        } else {
                            oxVar.f7581a = true;
                            ((com.tencent.mm.plugin.appbrand.launching.a) com.tencent.mm.plugin.appbrand.launching.precondition.x.f85032a).a(nxVar.f7471f, launchParcel);
                        }
                    }
                    return true;
                }
                if (i27 != 2) {
                    oxVar.f7581a = false;
                    oxVar.f7582b = "invalid openType";
                }
            }
            int i39 = nxVar.f7474i;
            launchParcel.f84903f = i39 > 0 ? i39 : -1;
            ((com.tencent.mm.plugin.appbrand.launching.a) com.tencent.mm.plugin.appbrand.launching.precondition.x.f85032a).a(nxVar.f7471f, launchParcel);
            oxVar.f7581a = true;
            return true;
        }
        oxVar.f7581a = false;
        oxVar.f7582b = "invalid username or appId";
        return true;
    }
}
