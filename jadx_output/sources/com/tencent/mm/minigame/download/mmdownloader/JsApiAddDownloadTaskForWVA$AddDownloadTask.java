package com.tencent.mm.minigame.download.mmdownloader;

@kotlin.Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0012\u001a\u00020\t\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016B\u0011\b\u0012\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0015\u0010\u0017J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u0018"}, d2 = {"com/tencent/mm/minigame/download/mmdownloader/JsApiAddDownloadTaskForWVA$AddDownloadTask", "Lcom/tencent/mm/plugin/appbrand/ipc/MainProcessTask;", "Ljz5/f0;", "z", "y", "Landroid/os/Parcel;", "parcel", org.chromium.base.BaseSwitches.V, "dest", "", "flags", "writeToParcel", "", "mFromMainProcess", "Lcom/tencent/mm/plugin/appbrand/jsapi/k0;", "mApi", "Lcom/tencent/mm/plugin/appbrand/service/c0;", "mService", "mCallbackId", "Lorg/json/JSONObject;", com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, "<init>", "(ZLcom/tencent/mm/plugin/appbrand/jsapi/k0;Lcom/tencent/mm/plugin/appbrand/service/c0;ILorg/json/JSONObject;)V", "(Landroid/os/Parcel;)V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class JsApiAddDownloadTaskForWVA$AddDownloadTask extends com.tencent.mm.plugin.appbrand.ipc.MainProcessTask {
    public static final android.os.Parcelable.Creator<com.tencent.mm.minigame.download.mmdownloader.JsApiAddDownloadTaskForWVA$AddDownloadTask> CREATOR = new com.tencent.mm.minigame.download.mmdownloader.a();
    public int A;
    public int B;
    public java.lang.String C;
    public boolean D;
    public java.lang.String E;
    public long F;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.k0 f69010f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.service.c0 f69011g;

    /* renamed from: h, reason: collision with root package name */
    public final int f69012h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f69013i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f69014m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f69015n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f69016o;

    /* renamed from: p, reason: collision with root package name */
    public long f69017p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f69018q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f69019r;

    /* renamed from: s, reason: collision with root package name */
    public int f69020s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo f69021t;

    /* renamed from: u, reason: collision with root package name */
    public int f69022u;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.report.quality.QualitySession f69023v;

    /* renamed from: w, reason: collision with root package name */
    public java.util.Map f69024w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f69025x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f69026y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f69027z;

    public /* synthetic */ JsApiAddDownloadTaskForWVA$AddDownloadTask(android.os.Parcel parcel, kotlin.jvm.internal.i iVar) {
        this(parcel);
    }

    public static final void D(com.tencent.mm.minigame.download.mmdownloader.JsApiAddDownloadTaskForWVA$AddDownloadTask jsApiAddDownloadTaskForWVA$AddDownloadTask, com.tencent.mm.plugin.appbrand.launching.nc ncVar) {
        java.lang.String str;
        jsApiAddDownloadTaskForWVA$AddDownloadTask.getClass();
        java.lang.String str2 = ncVar.f84820a;
        boolean z17 = false;
        boolean z18 = !(str2 == null || str2.length() == 0);
        java.lang.String str3 = ncVar.f84825f;
        if (z18 && str3 == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WVA.addDownloadTaskForWVA", "proceedWithDownload: patchUrl exists but no old version available");
        }
        if (z18) {
            if (!(str3 == null || str3.length() == 0)) {
                z17 = true;
            }
        }
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WVA.addDownloadTaskForWVA", "proceedWithDownload: using PATCH download");
            str = ncVar.f84820a;
            kotlin.jvm.internal.o.d(str);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.WVA.addDownloadTaskForWVA", "proceedWithDownload: using FULL package download");
            str = ncVar.f84821b;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WVA.addDownloadTaskForWVA", "proceedWithDownload: downloadUrl is null or empty");
            jsApiAddDownloadTaskForWVA$AddDownloadTask.D = true;
            jsApiAddDownloadTaskForWVA$AddDownloadTask.E = "fail_download_url_not_found";
            jsApiAddDownloadTaskForWVA$AddDownloadTask.c();
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("proceedWithDownload: downloadUrl=");
        sb6.append(str);
        sb6.append(", patchSize=");
        sb6.append(ncVar.f84823d);
        sb6.append(", md5=");
        java.lang.String str4 = ncVar.f84822c;
        sb6.append(str4);
        com.tencent.mars.xlog.Log.i("MicroMsg.WVA.addDownloadTaskForWVA", sb6.toString());
        jsApiAddDownloadTaskForWVA$AddDownloadTask.f69015n = str;
        if (str4 == null) {
            str4 = "";
        }
        jsApiAddDownloadTaskForWVA$AddDownloadTask.f69016o = str4;
        int i17 = ncVar.f84824e;
        if (z17) {
            java.lang.String str5 = jsApiAddDownloadTaskForWVA$AddDownloadTask.C;
            java.lang.String str6 = jsApiAddDownloadTaskForWVA$AddDownloadTask.f69019r;
            java.lang.String format = java.lang.String.format(java.util.Locale.US, "%s_%d_%d_%d.wxapkg.diff", java.util.Arrays.copyOf(new java.lang.Object[]{com.tencent.mm.plugin.appbrand.appcache.d9.e(str6), java.lang.Integer.valueOf(str6.hashCode()), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(jsApiAddDownloadTaskForWVA$AddDownloadTask.f69020s)}, 4));
            kotlin.jvm.internal.o.f(format, "format(...)");
            jsApiAddDownloadTaskForWVA$AddDownloadTask.C = format;
            com.tencent.mars.xlog.Log.i("MicroMsg.WVA.addDownloadTaskForWVA", "proceedWithDownload: patch destPath=" + jsApiAddDownloadTaskForWVA$AddDownloadTask.C + ", finalDestPath=" + str5);
        }
        jsApiAddDownloadTaskForWVA$AddDownloadTask.H(z17, str3, i17);
    }

    public final void H(boolean z17, java.lang.String str, int i17) {
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        if (z17) {
            java.lang.String str5 = this.f69019r;
            java.lang.String a17 = com.tencent.mm.plugin.appbrand.appcache.a6.a(this.f69014m);
            if (com.tencent.mm.sdk.platformtools.t8.K0(null)) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(str5);
                if (com.tencent.mm.sdk.platformtools.t8.K0(a17)) {
                    str4 = "";
                } else {
                    str4 = "$" + a17;
                }
                sb6.append(str4);
                str3 = sb6.toString();
            } else {
                str3 = null;
            }
            str2 = com.tencent.mm.plugin.appbrand.appcache.e9.f(str3, this.f69020s);
        } else {
            str2 = this.C;
        }
        java.lang.String str6 = str2;
        com.tencent.mars.xlog.Log.i("MicroMsg.WVA.addDownloadTaskForWVA", "doAddDownloadTaskStraight taskUrl:%s mTaskSize:%d, md5:%s destPath:%s, isPatch=%b", this.f69015n, java.lang.Long.valueOf(this.f69017p), this.f69016o, this.C, java.lang.Boolean.valueOf(z17));
        com.tencent.mm.minigame.download.mmdownloader.e eVar = com.tencent.mm.minigame.download.mmdownloader.g.f69052g;
        if (!com.tencent.mm.minigame.download.mmdownloader.g.f69055m) {
            com.tencent.mm.plugin.downloader.model.r0 i18 = ((vz.v1) i95.n0.c(vz.v1.class)) != null ? com.tencent.mm.plugin.downloader.model.r0.i() : null;
            if (i18 != null) {
                i18.a(com.tencent.mm.minigame.download.mmdownloader.g.f69054i);
            }
            com.tencent.mm.minigame.download.mmdownloader.g.f69055m = true;
        }
        com.tencent.mm.plugin.downloader.model.t0 t0Var = new com.tencent.mm.plugin.downloader.model.t0(null);
        t0Var.f97150a = this.f69015n;
        t0Var.f97152c = 0L;
        t0Var.f97153d = this.f69013i;
        t0Var.f97158i = false;
        t0Var.f97155f = 5;
        t0Var.f97161l = this.B;
        t0Var.f97166q = this.f69018q;
        t0Var.f97164o = true;
        t0Var.f97175z = this.C;
        t0Var.f97163n = this.f69025x;
        t0Var.f97159j = this.f69026y;
        t0Var.A = this.f69027z;
        t0Var.D = true;
        ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
        com.tencent.mm.plugin.downloader.model.r0 i19 = com.tencent.mm.plugin.downloader.model.r0.i();
        long c17 = this.A == 1 ? i19.c(t0Var) : i19.b(t0Var);
        com.tencent.mars.xlog.Log.i("MicroMsg.WVA.addDownloadTaskForWVA", "doAddDownloadTaskStraight, downloadId = " + c17);
        if (c17 <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WVA.addDownloadTaskForWVA", "doAddDownloadTaskStraight fail, downloadId = " + c17);
            this.E = "";
        } else {
            this.D = false;
            this.F = c17;
            java.lang.String appId = this.f69019r;
            java.lang.String moduleName = this.f69014m;
            int i27 = this.f69020s;
            int i28 = this.f69022u;
            java.lang.String md52 = this.f69016o;
            kotlin.jvm.internal.o.g(appId, "appId");
            kotlin.jvm.internal.o.g(moduleName, "moduleName");
            kotlin.jvm.internal.o.g(md52, "md5");
            com.tencent.mm.minigame.download.mmdownloader.g.f69053h.put(java.lang.Long.valueOf(c17), new com.tencent.mm.minigame.download.mmdownloader.f(appId, moduleName, i27, i28, md52, z17, str, i17, str6));
        }
        c();
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void v(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        java.lang.String readString = parcel.readString();
        if (readString == null) {
            readString = "";
        }
        this.f69013i = readString;
        java.lang.String readString2 = parcel.readString();
        if (readString2 == null) {
            readString2 = "";
        }
        this.f69014m = readString2;
        java.lang.String readString3 = parcel.readString();
        if (readString3 == null) {
            readString3 = "";
        }
        this.f69015n = readString3;
        java.lang.String readString4 = parcel.readString();
        if (readString4 == null) {
            readString4 = "";
        }
        this.f69016o = readString4;
        this.f69017p = parcel.readLong();
        java.lang.String readString5 = parcel.readString();
        if (readString5 == null) {
            readString5 = "";
        }
        this.f69018q = readString5;
        java.lang.String readString6 = parcel.readString();
        if (readString6 == null) {
            readString6 = "";
        }
        this.f69019r = readString6;
        this.f69020s = parcel.readInt();
        this.f69022u = parcel.readInt();
        android.os.Parcelable readParcelable = parcel.readParcelable(com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo.class.getClassLoader());
        kotlin.jvm.internal.o.d(readParcelable);
        this.f69021t = (com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo) readParcelable;
        android.os.Parcelable readParcelable2 = parcel.readParcelable(com.tencent.mm.plugin.appbrand.report.quality.QualitySession.class.getClassLoader());
        kotlin.jvm.internal.o.d(readParcelable2);
        this.f69023v = (com.tencent.mm.plugin.appbrand.report.quality.QualitySession) readParcelable2;
        java.util.HashMap hashMap = new java.util.HashMap();
        parcel.readMap(hashMap, hashMap.getClass().getClassLoader());
        this.f69024w = hashMap;
        this.f69025x = parcel.readInt() == 1;
        this.f69026y = parcel.readInt() == 1;
        this.A = parcel.readInt();
        this.D = parcel.readInt() == 1;
        java.lang.String readString7 = parcel.readString();
        if (readString7 == null) {
            readString7 = "";
        }
        this.E = readString7;
        this.F = parcel.readLong();
        this.B = parcel.readInt();
        java.lang.String readString8 = parcel.readString();
        if (readString8 == null) {
            readString8 = "";
        }
        this.C = readString8;
        java.lang.String readString9 = parcel.readString();
        this.f69027z = readString9 != null ? readString9 : "";
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask, android.os.Parcelable
    public void writeToParcel(android.os.Parcel dest, int i17) {
        kotlin.jvm.internal.o.g(dest, "dest");
        dest.writeString(this.f69013i);
        dest.writeString(this.f69014m);
        dest.writeString(this.f69015n);
        dest.writeString(this.f69016o);
        dest.writeLong(this.f69017p);
        dest.writeString(this.f69018q);
        dest.writeString(this.f69019r);
        dest.writeInt(this.f69020s);
        dest.writeInt(this.f69022u);
        dest.writeParcelable(this.f69021t, 0);
        dest.writeParcelable(this.f69023v, 0);
        dest.writeMap(this.f69024w);
        dest.writeInt(this.f69025x ? 1 : 0);
        dest.writeInt(this.f69026y ? 1 : 0);
        dest.writeInt(this.A);
        dest.writeInt(this.D ? 1 : 0);
        dest.writeString(this.E);
        dest.writeLong(this.F);
        dest.writeInt(this.B);
        dest.writeString(this.C);
        dest.writeString(this.f69027z);
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void y() {
        java.lang.String str;
        x();
        boolean z17 = this.D;
        com.tencent.mm.plugin.appbrand.jsapi.k0 k0Var = this.f69010f;
        int i17 = this.f69012h;
        com.tencent.mm.plugin.appbrand.service.c0 c0Var = this.f69011g;
        if (z17) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(this.E)) {
                str = "fail";
            } else {
                str = "fail:" + this.E;
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.WVA.addDownloadTaskForWVA", "runInClientProcess: fail, failMsg=" + str);
            kotlin.jvm.internal.o.d(c0Var);
            kotlin.jvm.internal.o.d(k0Var);
            c0Var.a(i17, k0Var.o(str));
            return;
        }
        if (kotlin.jvm.internal.o.b("already_downloaded", this.E)) {
            java.util.Map k17 = kz5.c1.k(new jz5.l("downloadId", 0L), new jz5.l("alreadyDownloaded", java.lang.Boolean.TRUE));
            com.tencent.mars.xlog.Log.i("MicroMsg.WVA.addDownloadTaskForWVA", "runInClientProcess: alreadyDownloaded");
            kotlin.jvm.internal.o.d(c0Var);
            kotlin.jvm.internal.o.d(k0Var);
            c0Var.a(i17, k0Var.p("ok", k17));
            return;
        }
        java.util.Map e17 = kz5.b1.e(new jz5.l("downloadId", java.lang.Long.valueOf(this.F)));
        com.tencent.mars.xlog.Log.i("MicroMsg.WVA.addDownloadTaskForWVA", "runInClientProcess: downloadId=" + this.F);
        kotlin.jvm.internal.o.d(c0Var);
        kotlin.jvm.internal.o.d(k0Var);
        c0Var.a(i17, k0Var.p("ok", e17));
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void z() {
        java.lang.String str;
        java.lang.String str2;
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.C)) {
            java.lang.String str3 = this.f69019r;
            java.lang.String a17 = com.tencent.mm.plugin.appbrand.appcache.a6.a(this.f69014m);
            if (com.tencent.mm.sdk.platformtools.t8.K0(null)) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(str3);
                if (com.tencent.mm.sdk.platformtools.t8.K0(a17)) {
                    str2 = "";
                } else {
                    str2 = "$" + a17;
                }
                sb6.append(str2);
                str = sb6.toString();
            } else {
                str = null;
            }
            this.C = com.tencent.mm.plugin.appbrand.appcache.e9.f(str, this.f69020s);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f69014m)) {
            if (!gm0.j1.u().l()) {
                this.E = "fail_sdcard_not_ready";
                c();
                return;
            }
            long j17 = this.f69017p;
            if (j17 > 0 && !fp.i.c(j17)) {
                this.E = "fail_sdcard_has_not_enough_space";
                c();
                return;
            } else if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f69015n)) {
                H(false, null, 0);
                return;
            } else {
                this.E = "fail_invalid_url";
                c();
                return;
            }
        }
        com.tencent.mm.minigame.e1 a18 = com.tencent.mm.minigame.g1.f69071a.a(this.f69019r, this.f69014m, this.f69020s, this.f69022u, this.C);
        if (a18.f69062a) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WVA.addDownloadTaskForWVA", "Module already downloaded: moduleName=" + this.f69014m + ", pkgPath=" + a18.f69063b);
            this.D = false;
            this.E = "already_downloaded";
            c();
            return;
        }
        com.tencent.mm.plugin.appbrand.report.quality.QualitySession qualitySession = this.f69023v;
        if (qualitySession == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WVA.addDownloadTaskForWVA", "fetchDownloadUrlAndAddDownloadTask: reportQualitySession is null");
            this.D = true;
            this.E = "fail_report_quality_session_null";
            c();
            return;
        }
        com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo wxaAttributes$WxaVersionInfo = this.f69021t;
        if (wxaAttributes$WxaVersionInfo == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WVA.addDownloadTaskForWVA", "fetchDownloadUrlAndAddDownloadTask: wxaVersionInfo is null");
            this.D = true;
            this.E = "fail_wxa_version_info_null";
            c();
            return;
        }
        r45.y50 y50Var = new r45.y50();
        y50Var.f390797d = qualitySession.f88138h;
        y50Var.f390798e = false;
        y50Var.f390799f = 101;
        com.tencent.mm.plugin.appbrand.launching.qc.f85087a.a(this.f69019r, this.f69014m, wxaAttributes$WxaVersionInfo, this.f69022u, qualitySession, y50Var, new com.tencent.mm.minigame.download.mmdownloader.b(this), new com.tencent.mm.minigame.download.mmdownloader.c(this));
    }

    public JsApiAddDownloadTaskForWVA$AddDownloadTask(boolean z17, com.tencent.mm.plugin.appbrand.jsapi.k0 k0Var, com.tencent.mm.plugin.appbrand.service.c0 c0Var, int i17, org.json.JSONObject jSONObject) {
        this.f69010f = k0Var;
        this.f69011g = c0Var;
        this.f69012h = i17;
        java.lang.String str = "";
        this.f69013i = "";
        this.f69014m = "";
        this.f69015n = "";
        this.f69016o = "";
        this.f69018q = "";
        this.f69019r = "";
        this.f69027z = "";
        this.D = true;
        if (z17) {
            return;
        }
        kotlin.jvm.internal.o.d(c0Var);
        com.tencent.mm.plugin.appbrand.o6 t37 = c0Var.t3();
        kotlin.jvm.internal.o.d(jSONObject);
        java.lang.String optString = jSONObject.optString("taskName", "《" + t37.n0() + "》高性能模式");
        kotlin.jvm.internal.o.f(optString, "optString(...)");
        this.f69013i = optString;
        java.lang.String optString2 = jSONObject.optString("taskUrl");
        kotlin.jvm.internal.o.f(optString2, "optString(...)");
        this.f69015n = optString2;
        java.lang.String optString3 = jSONObject.optString(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.PACKAGENAME);
        kotlin.jvm.internal.o.f(optString3, "optString(...)");
        this.f69014m = optString3;
        java.lang.String optString4 = jSONObject.optString("fileMd5");
        kotlin.jvm.internal.o.f(optString4, "optString(...)");
        this.f69016o = optString4;
        this.f69017p = jSONObject.optLong("taskSize", 0L);
        try {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("appId", c0Var.getAppId());
            jSONObject2.put("showFloatBall", java.lang.Boolean.parseBoolean(jSONObject.optString("showFloatBall")));
            java.lang.String jSONObject3 = jSONObject2.toString();
            kotlin.jvm.internal.o.d(jSONObject3);
            this.f69018q = jSONObject3;
            java.lang.String str2 = t37.f74803n;
            kotlin.jvm.internal.o.f(str2, "getAppId(...)");
            this.f69019r = str2;
            this.f69020s = t37.u0().L;
            this.f69021t = t37.u0().N;
            this.f69022u = t37.f74805p.f77281g;
            this.f69023v = t37.u0().f77298k2;
            java.util.HashMap hashMap = new java.util.HashMap();
            com.tencent.mm.plugin.appbrand.appcache.a4 o17 = com.tencent.mm.plugin.appbrand.appcache.la.o(t37, false);
            com.tencent.mm.plugin.appbrand.appcache.la laVar = o17 instanceof com.tencent.mm.plugin.appbrand.appcache.la ? (com.tencent.mm.plugin.appbrand.appcache.la) o17 : null;
            com.tencent.mm.plugin.appbrand.appcache.y3 y3Var = laVar != null ? laVar.f75655a : null;
            com.tencent.mm.plugin.appbrand.appcache.ac acVar = y3Var instanceof com.tencent.mm.plugin.appbrand.appcache.ac ? (com.tencent.mm.plugin.appbrand.appcache.ac) y3Var : null;
            if (acVar != null) {
                com.tencent.mm.plugin.appbrand.appcache.WxaRuntimeModulePluginListMap wxaRuntimeModulePluginListMap = acVar.f75444c.f75404i;
                java.util.List<com.tencent.mm.plugin.appbrand.appcache.WxaPluginPkgInfo> c17 = wxaRuntimeModulePluginListMap != null ? wxaRuntimeModulePluginListMap.c() : null;
                if (c17 != null) {
                    for (com.tencent.mm.plugin.appbrand.appcache.WxaPluginPkgInfo wxaPluginPkgInfo : c17) {
                        hashMap.put(wxaPluginPkgInfo.provider, java.lang.Integer.valueOf(wxaPluginPkgInfo.version));
                    }
                }
            }
            this.f69024w = hashMap;
            this.f69025x = jSONObject.optBoolean("downloadInWifi", false);
            this.f69026y = jSONObject.optBoolean("showNotification", true);
            java.lang.String optString5 = jSONObject.optString("notificationTitle", "");
            kotlin.jvm.internal.o.f(optString5, "optString(...)");
            this.f69027z = optString5;
            this.A = 1;
            this.B = 1378;
            if (this.f69017p == 0) {
                this.f69017p = com.tencent.mm.minigame.g1.f69071a.b(this.f69014m, this.f69021t);
            }
            try {
                java.lang.String optString6 = jSONObject.optString("destPath");
                com.tencent.mars.xlog.Log.i("MicroMsg.WVA.addDownloadTaskForWVA", "wva.addDownloadTask: [%s] taskUrl:%s, path:%s", this.f69013i, this.f69015n, optString6);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(optString6)) {
                    com.tencent.mm.plugin.appbrand.appstorage.u1 fileSystem = this.f69011g.getFileSystem();
                    if (fileSystem != null) {
                        com.tencent.mm.vfs.r6 resolvePath = fileSystem.resolvePath(optString6);
                        if (resolvePath != null) {
                            str = resolvePath.o();
                        } else {
                            throw new java.io.IOException("destPath resolve failed");
                        }
                    } else {
                        throw new java.io.IOException("destPath resolve failed");
                    }
                }
                this.C = str;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WVA.addDownloadTaskForWVA", e17, "destPath resolve failed", new java.lang.Object[0]);
                throw new java.io.IOException("destPath resolve failed");
            }
        } catch (org.json.JSONException e18) {
            throw new java.lang.RuntimeException(e18);
        }
    }

    private JsApiAddDownloadTaskForWVA$AddDownloadTask(android.os.Parcel parcel) {
        this(true, null, null, 0, null);
        v(parcel);
    }
}
