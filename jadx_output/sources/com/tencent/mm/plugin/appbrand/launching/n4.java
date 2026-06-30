package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class n4 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicBoolean f84804d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sdk.platformtools.b4 f84805e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.q4 f84806f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.z6 f84807g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n4(java.util.concurrent.atomic.AtomicBoolean atomicBoolean, com.tencent.mm.sdk.platformtools.b4 b4Var, com.tencent.mm.plugin.appbrand.launching.q4 q4Var, com.tencent.mm.plugin.appbrand.launching.z6 z6Var) {
        super(1);
        this.f84804d = atomicBoolean;
        this.f84805e = b4Var;
        this.f84806f = q4Var;
        this.f84807g = z6Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String str;
        boolean z17;
        java.lang.Integer num;
        java.lang.Object[] objArr;
        r45.jr5 jr5Var;
        java.lang.String str2;
        r45.me3[] urls = (r45.me3[]) obj;
        kotlin.jvm.internal.o.g(urls, "urls");
        if (!this.f84804d.get()) {
            this.f84805e.d();
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.CommonPkgFetcher", "cgiExecutor.onSuccess, " + this.f84806f.f85059b.f84851d + " print urls --START--");
            int length = urls.length;
            int i17 = 0;
            int i18 = 0;
            while (true) {
                str = null;
                java.lang.Long l17 = null;
                z17 = true;
                if (i17 >= length) {
                    break;
                }
                r45.me3 me3Var = urls[i17];
                int i19 = i18 + 1;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("cgiExecutor.onSuccess, print url, index:");
                sb6.append(i18 != 0 ? i18 != 1 ? i18 != 2 ? java.lang.String.valueOf(i18) : "PATCH" : "ZSTD" : "LEGACY");
                sb6.append(", item:{errcode:");
                sb6.append(me3Var != null ? java.lang.Integer.valueOf(me3Var.f380398d) : null);
                sb6.append(", url:");
                sb6.append(me3Var != null ? me3Var.f380399e : null);
                sb6.append(", md5:");
                sb6.append(me3Var != null ? me3Var.f380400f : null);
                sb6.append(", app_version:");
                sb6.append(me3Var != null ? java.lang.Integer.valueOf(me3Var.f380402h) : null);
                sb6.append(", is_patch:");
                sb6.append(me3Var != null ? me3Var.f380403i : false);
                sb6.append(", is_zstd:");
                sb6.append(me3Var != null ? me3Var.f380404m : false);
                sb6.append(", crc32:");
                if (me3Var != null) {
                    l17 = java.lang.Long.valueOf(me3Var.f380408q & io.flutter.embedding.android.KeyboardMap.kValueMask);
                }
                sb6.append(l17);
                sb6.append('}');
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.CommonPkgFetcher", sb6.toString());
                i17++;
                i18 = i19;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.CommonPkgFetcher", "cgiExecutor.onSuccess, " + this.f84806f.f85059b.f84851d + " print urls --END--");
            int length2 = urls.length;
            int i27 = 0;
            while (true) {
                if (i27 >= length2) {
                    num = null;
                    break;
                }
                r45.me3 me3Var2 = urls[i27];
                if (me3Var2 != null) {
                    num = java.lang.Integer.valueOf(me3Var2.f380398d);
                    break;
                }
                i27++;
            }
            if (((num != null && num.intValue() == -2000011) || (num != null && num.intValue() == -2000004)) == true) {
                com.tencent.mm.plugin.appbrand.appcache.cc ccVar = (com.tencent.mm.plugin.appbrand.appcache.cc) i95.n0.c(com.tencent.mm.plugin.appbrand.appcache.cc.class);
                com.tencent.mm.plugin.appbrand.launching.z6 z6Var = this.f84807g;
                java.lang.String appId = z6Var.f85461d;
                int i28 = z6Var.f85465h;
                java.lang.String str3 = z6Var.f85462e;
                if (str3 == null) {
                    str3 = "";
                }
                com.tencent.mm.plugin.appbrand.appcache.c4 c4Var = (com.tencent.mm.plugin.appbrand.appcache.c4) ccVar;
                c4Var.getClass();
                kotlin.jvm.internal.o.g(appId, "appId");
                if (gm0.j1.b().m()) {
                    if ((str3.length() == 0 ? 1 : 0) != 0 || kotlin.jvm.internal.o.b(com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo.MAIN_MODULE_NAME, str3)) {
                        com.tencent.mm.vfs.w6.h(c4Var.wi(appId, i28));
                    } else {
                        com.tencent.mm.vfs.w6.h(c4Var.wi(appId, i28));
                    }
                } else {
                    com.tencent.mars.xlog.Log.e("MicroMsg.WxaVersionPagePathIndexStorage.IndexStorageMM", "removeIndexByAppId(" + appId + "), account().hasInitialized()==FALSE");
                }
                ((com.tencent.mm.plugin.appbrand.launching.j4) this.f84806f.f85065h).invoke(com.tencent.mm.plugin.appbrand.launching.a6.f84490h, num.toString());
            } else if (num != null && num.intValue() == 0) {
                if (this.f84807g.f85469o) {
                    com.tencent.mm.plugin.appbrand.appcache.eb ebVar = (com.tencent.mm.plugin.appbrand.appcache.eb) com.tencent.mm.plugin.appbrand.app.r9.fj(com.tencent.mm.plugin.appbrand.appcache.eb.class);
                    int length3 = urls.length;
                    int i29 = 0;
                    while (true) {
                        if (i29 >= length3) {
                            jr5Var = null;
                            break;
                        }
                        r45.me3 me3Var3 = urls[i29];
                        if (me3Var3 != null) {
                            jr5Var = me3Var3.f380405n;
                            break;
                        }
                        i29++;
                    }
                    kotlin.jvm.internal.o.d(jr5Var);
                    java.lang.String appid = jr5Var.f378070d;
                    kotlin.jvm.internal.o.f(appid, "appid");
                    java.lang.Integer a17 = com.tencent.mm.plugin.appbrand.launching.y6.a(urls);
                    kotlin.jvm.internal.o.d(a17);
                    int intValue = a17.intValue();
                    int length4 = urls.length;
                    int i37 = 0;
                    while (true) {
                        if (i37 >= length4) {
                            str2 = null;
                            break;
                        }
                        r45.me3 me3Var4 = urls[i37];
                        if (me3Var4 != null) {
                            str2 = me3Var4.f380406o;
                            break;
                        }
                        i37++;
                    }
                    ebVar.getClass();
                    if (str2 == null) {
                        com.tencent.mars.xlog.Log.e("Luggage.WxaPluginCodeVersionInfoStorage", "setPluginStringVersion with id:" + appid + ", version:" + intValue + ", invalid stringVersion");
                    } else {
                        com.tencent.mm.plugin.appbrand.appcache.cb cbVar = new com.tencent.mm.plugin.appbrand.appcache.cb();
                        cbVar.field_pluginAppID = appid;
                        cbVar.field_pluginAppVersion = intValue;
                        cbVar.field_pluginStringVersion = str2;
                        com.tencent.mm.plugin.appbrand.appcache.db dbVar = new com.tencent.mm.plugin.appbrand.appcache.db(ebVar, cbVar);
                        java.lang.Long valueOf = java.lang.Long.valueOf(java.lang.Thread.currentThread().getId());
                        l75.k0 k0Var = ebVar.f75518e;
                        long F = k0Var.F(valueOf);
                        try {
                            java.lang.Object invoke = dbVar.invoke();
                            k0Var.w(java.lang.Long.valueOf(F));
                            com.tencent.mars.xlog.Log.i("Luggage.WxaPluginCodeVersionInfoStorage", "setPluginStringVersion id:" + appid + " version:" + intValue + " stringVersion:" + str2 + " updated:" + ((java.lang.Boolean) invoke).booleanValue());
                        } catch (java.lang.Throwable th6) {
                            k0Var.w(java.lang.Long.valueOf(F));
                            throw th6;
                        }
                    }
                }
                com.tencent.mm.plugin.appbrand.launching.q4 q4Var = this.f84806f;
                com.tencent.mm.plugin.appbrand.launching.w6 w6Var = q4Var.f85059b.f84855h;
                if (w6Var instanceof com.tencent.mm.plugin.appbrand.launching.u6) {
                    java.lang.Integer a18 = com.tencent.mm.plugin.appbrand.launching.y6.a(urls);
                    kotlin.jvm.internal.o.d(a18);
                    w6Var = new com.tencent.mm.plugin.appbrand.launching.v6(a18.intValue(), 0L, 2, null);
                }
                com.tencent.mm.plugin.appbrand.appcache.s a19 = com.tencent.mm.plugin.appbrand.launching.h4.a(com.tencent.mm.plugin.appbrand.launching.q4.f85057t, q4Var.a(), q4Var.f85067j, q4Var.f85059b.f84854g, w6Var);
                if (a19 != null) {
                    objArr = true;
                } else {
                    com.tencent.mm.plugin.appbrand.appcache.b4 a27 = q4Var.a();
                    com.tencent.mm.plugin.appbrand.appcache.a6 a6Var = q4Var.f85067j;
                    int i38 = q4Var.f85059b.f84854g;
                    if (a27 instanceof com.tencent.mm.plugin.appbrand.appcache.qa) {
                        a19 = new com.tencent.mm.plugin.appbrand.appcache.n9();
                    } else {
                        if (!(a27 instanceof com.tencent.mm.plugin.appbrand.appcache.k9)) {
                            throw new java.lang.IllegalStateException("Unrecognized storage class:".concat(a27.getClass().getName()).toString());
                        }
                        a19 = new com.tencent.mm.plugin.appbrand.appcache.o9();
                    }
                    a19.field_appId = a6Var.toString();
                    a19.field_debugType = i38;
                    if (w6Var instanceof com.tencent.mm.plugin.appbrand.launching.v6) {
                        a19.field_version = ((com.tencent.mm.plugin.appbrand.launching.v6) w6Var).f85263a;
                    } else if (w6Var instanceof com.tencent.mm.plugin.appbrand.launching.t6) {
                        ((com.tencent.mm.plugin.appbrand.appcache.o9) a19).field_versionDesc = ((com.tencent.mm.plugin.appbrand.launching.t6) w6Var).f85159a;
                    }
                    objArr = false;
                }
                java.lang.String str4 = a19.field_versionMd5;
                java.lang.String str5 = a19.field_NewMd5;
                long j17 = a19.field_checksum;
                if (str4 != null && str4.length() != 0) {
                    z17 = false;
                }
                if (z17) {
                    a19.field_versionMd5 = com.tencent.mm.plugin.appbrand.launching.y6.c(urls);
                }
                a19.field_NewMd5 = com.tencent.mm.plugin.appbrand.launching.y6.c(urls);
                a19.field_checksum = com.tencent.mm.plugin.appbrand.launching.y6.b(urls);
                java.lang.Integer a28 = com.tencent.mm.plugin.appbrand.launching.y6.a(urls);
                kotlin.jvm.internal.o.d(a28);
                a19.field_version = a28.intValue();
                r45.me3 me3Var5 = urls[0];
                a19.field_downloadURL = me3Var5 != null ? me3Var5.f380399e : null;
                a19.field_createTime = com.tencent.mm.sdk.platformtools.t8.i1();
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.CommonPkgFetcher", "cgiExecutor.onSuccess, updated(" + (objArr != false ? com.tencent.mm.plugin.appbrand.appcache.ra.c(this.f84806f.a(), a19) : com.tencent.mm.plugin.appbrand.appcache.ra.a(this.f84806f.a(), a19)) + ") md5(" + str4 + '|' + str5 + ")->(" + a19.field_versionMd5 + '|' + a19.field_NewMd5 + ") crc32(" + j17 + ")->(" + a19.field_checksum + ") with key(" + a19.field_appId + "), versionType(" + a19.field_debugType + "), version(" + a19.field_version + ')');
                boolean z18 = this.f84807g.f85469o;
                com.tencent.mm.plugin.appbrand.launching.i4 i4Var = com.tencent.mm.plugin.appbrand.launching.i4.f84656a;
                if (z18) {
                    java.lang.String str6 = a19.field_appId;
                    int i39 = a19.field_debugType;
                    int i47 = a19.field_version;
                    com.tencent.mm.plugin.appbrand.launching.w6 w6Var2 = this.f84806f.f85059b.f84855h;
                    com.tencent.mm.plugin.appbrand.launching.t6 t6Var = w6Var2 instanceof com.tencent.mm.plugin.appbrand.launching.t6 ? (com.tencent.mm.plugin.appbrand.launching.t6) w6Var2 : null;
                    android.util.Pair b17 = com.tencent.mm.plugin.appbrand.appcache.WxaPkgIntegrityChecker.b(str6, i39, i47, t6Var != null ? t6Var.f85159a : null);
                    kotlin.jvm.internal.o.d(b17);
                    com.tencent.mm.plugin.appbrand.appcache.l9 l9Var = (com.tencent.mm.plugin.appbrand.appcache.l9) b17.first;
                    com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo wxaPkgWrappingInfo = (com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo) b17.second;
                    if (wxaPkgWrappingInfo != null) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.CommonPkgFetcher", "cgiExecutor.onSuccess, latest request already cached, request=" + this.f84806f.f85059b + ", version:" + wxaPkgWrappingInfo.pkgVersion() + " md5:" + wxaPkgWrappingInfo.checksumMd5() + " path:" + wxaPkgWrappingInfo.pkgPath());
                        if (l9Var == com.tencent.mm.plugin.appbrand.appcache.l9.APP_LOCAL_EXIST) {
                            a19.field_pkgPath = wxaPkgWrappingInfo.pkgPath;
                            com.tencent.mm.plugin.appbrand.appcache.ra.b(this.f84806f.a(), a19);
                        }
                        com.tencent.mm.plugin.appbrand.launching.q4 q4Var2 = this.f84806f;
                        yz5.l lVar = q4Var2.f85064g;
                        com.tencent.mm.plugin.appbrand.launching.o6 o6Var = q4Var2.f85059b;
                        java.lang.String pkgPath = wxaPkgWrappingInfo.pkgPath;
                        kotlin.jvm.internal.o.f(pkgPath, "pkgPath");
                        ((com.tencent.mm.plugin.appbrand.launching.l4) lVar).invoke(i4Var.a(o6Var, pkgPath, wxaPkgWrappingInfo.f75372md5, a19.field_version, new com.tencent.mm.plugin.appbrand.launching.q6(0)));
                    } else {
                        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.CommonPkgFetcher", "cgiExecutor.onSuccess, latest request find cached pkg with error:" + l9Var + " request:" + this.f84806f.f85059b);
                        if (l9Var == com.tencent.mm.plugin.appbrand.appcache.l9.ENV_ERR || l9Var == com.tencent.mm.plugin.appbrand.appcache.l9.APP_MANIFEST_NULL) {
                            ((com.tencent.mm.plugin.appbrand.launching.j4) this.f84806f.f85065h).invoke(com.tencent.mm.plugin.appbrand.launching.a6.f84495p, "find cached pkg failed");
                        }
                    }
                }
                com.tencent.mm.plugin.appbrand.launching.p6 b18 = i4Var.b(this.f84806f.a(), this.f84806f.f85059b, a19);
                if (b18 != null) {
                    ((com.tencent.mm.plugin.appbrand.launching.l4) this.f84806f.f85064g).invoke(b18);
                } else {
                    com.tencent.mm.plugin.appbrand.launching.q4 q4Var3 = this.f84806f;
                    com.tencent.mm.plugin.appbrand.launching.k6 k6Var = q4Var3.f85062e;
                    if (k6Var != null) {
                        com.tencent.mm.plugin.appbrand.launching.o6 o6Var2 = q4Var3.f85059b;
                        java.lang.Integer a29 = com.tencent.mm.plugin.appbrand.launching.y6.a(urls);
                        kotlin.jvm.internal.o.d(a29);
                        int intValue2 = a29.intValue();
                        int length5 = urls.length;
                        while (true) {
                            if (r3 >= length5) {
                                break;
                            }
                            r45.me3 me3Var6 = urls[r3];
                            if (me3Var6 != null) {
                                str = me3Var6.f380406o;
                                break;
                            }
                            r3++;
                        }
                        k6Var.a(o6Var2, intValue2, str);
                    }
                    com.tencent.mm.plugin.appbrand.launching.q4 q4Var4 = this.f84806f;
                    com.tencent.mm.plugin.appbrand.launching.f4 f4Var = new com.tencent.mm.plugin.appbrand.launching.f4(q4Var4);
                    com.tencent.mm.plugin.appbrand.launching.z6 request = this.f84807g;
                    java.lang.String c17 = com.tencent.mm.plugin.appbrand.launching.y6.c(urls);
                    kotlin.jvm.internal.o.g(request, "request");
                    if (!q4Var4.f85072o.get()) {
                        ((com.tencent.mm.plugin.appbrand.launching.k4) q4Var4.f85066i).invoke(com.tencent.mm.plugin.appbrand.launching.q4.f85058u);
                        lm5.d.f319601b.a(new com.tencent.mm.plugin.appbrand.launching.e4(request, urls, f4Var, q4Var4, c17));
                    }
                }
            } else {
                ((com.tencent.mm.plugin.appbrand.launching.j4) this.f84806f.f85065h).invoke(com.tencent.mm.plugin.appbrand.launching.a6.f84493n, java.lang.String.valueOf(num));
            }
        }
        return jz5.f0.f302826a;
    }
}
