package com.tencent.mm.plugin.appbrand.jsapi.appdownload;

/* loaded from: classes.dex */
class JsApiQueryDownloadTask$QueryDownloadTask extends com.tencent.mm.plugin.appbrand.ipc.MainProcessTask {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.appdownload.JsApiQueryDownloadTask$QueryDownloadTask> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.appdownload.k1();

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.k0 f78898f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.e9 f78899g;

    /* renamed from: h, reason: collision with root package name */
    public final int f78900h;

    /* renamed from: i, reason: collision with root package name */
    public long f78901i;

    /* renamed from: m, reason: collision with root package name */
    public org.json.JSONArray f78902m;

    /* renamed from: n, reason: collision with root package name */
    public org.json.JSONArray f78903n;

    /* renamed from: o, reason: collision with root package name */
    public org.json.JSONArray f78904o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f78905p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f78906q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f78907r;

    /* renamed from: s, reason: collision with root package name */
    public long f78908s;

    public JsApiQueryDownloadTask$QueryDownloadTask(com.tencent.mm.plugin.appbrand.jsapi.k0 k0Var, com.tencent.mm.plugin.appbrand.e9 e9Var, int i17, org.json.JSONObject jSONObject) {
        this.f78898f = k0Var;
        this.f78899g = e9Var;
        this.f78900h = i17;
        this.f78901i = jSONObject.optLong("downloadId");
        this.f78902m = jSONObject.optJSONArray("downloadIdArray");
        this.f78903n = jSONObject.optJSONArray("appIdArray");
        this.f78905p = true;
    }

    public final org.json.JSONObject B(com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo fileDownloadTaskInfo) {
        java.lang.String str;
        int i17;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        int i18 = fileDownloadTaskInfo.f96963f;
        if (i18 == -1) {
            this.f78906q = "fail_apilevel_too_low";
            return jSONObject;
        }
        if (i18 == 1) {
            str = "downloading";
        } else if (i18 != 2) {
            str = "default";
            if (i18 != 3) {
                if (i18 == 4) {
                    str = "download_fail";
                }
            } else if (com.tencent.mm.vfs.w6.j(fileDownloadTaskInfo.f96964g)) {
                str = "download_succ";
            }
        } else {
            str = "download_pause";
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiQueryDownloadTask", "doQueryDownloadTask, state = %s", str);
        if (fileDownloadTaskInfo.f96971q && !com.tencent.mars.comm.NetStatusUtil.isWifi(com.tencent.mm.sdk.platformtools.x2.f193071a) && (i17 = fileDownloadTaskInfo.f96963f) != 3 && i17 != 1) {
            str = "download_wait_wifi";
        }
        long j17 = 0;
        if (str == "downloading" || str == "download_pause") {
            long j18 = fileDownloadTaskInfo.f96968n;
            if (j18 != 0) {
                j17 = (((float) fileDownloadTaskInfo.f96967m) / ((float) j18)) * 100.0f;
            }
        }
        try {
            jSONObject.put("appId", fileDownloadTaskInfo.f96966i);
            jSONObject.put("downloadId", fileDownloadTaskInfo.f96961d);
            jSONObject.put("state", str);
            jSONObject.put("progress", j17);
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiQueryDownloadTask", e17.getMessage());
        }
        return jSONObject;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void v(android.os.Parcel parcel) {
        this.f78901i = parcel.readLong();
        this.f78905p = parcel.readInt() == 1;
        this.f78906q = parcel.readString();
        this.f78907r = parcel.readString();
        this.f78908s = parcel.readLong();
        java.lang.String readString = parcel.readString();
        java.lang.String readString2 = parcel.readString();
        java.lang.String readString3 = parcel.readString();
        if (readString != null) {
            try {
                this.f78902m = new org.json.JSONArray(readString);
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.JsApiQueryDownloadTask", e17, "", new java.lang.Object[0]);
                return;
            }
        }
        if (readString2 != null) {
            this.f78903n = new org.json.JSONArray(readString2);
        }
        if (readString3 != null) {
            this.f78904o = new org.json.JSONArray(readString3);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeLong(this.f78901i);
        parcel.writeInt(this.f78905p ? 1 : 0);
        parcel.writeString(this.f78906q);
        parcel.writeString(this.f78907r);
        parcel.writeLong(this.f78908s);
        org.json.JSONArray jSONArray = this.f78902m;
        parcel.writeString(jSONArray != null ? jSONArray.toString() : null);
        org.json.JSONArray jSONArray2 = this.f78903n;
        parcel.writeString(jSONArray2 != null ? jSONArray2.toString() : null);
        org.json.JSONArray jSONArray3 = this.f78904o;
        parcel.writeString(jSONArray3 != null ? jSONArray3.toString() : null);
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void y() {
        x();
        boolean z17 = this.f78905p;
        com.tencent.mm.plugin.appbrand.jsapi.k0 k0Var = this.f78898f;
        int i17 = this.f78900h;
        com.tencent.mm.plugin.appbrand.e9 e9Var = this.f78899g;
        if (z17) {
            e9Var.a(i17, k0Var.o(com.tencent.mm.sdk.platformtools.t8.K0(this.f78906q) ? "fail" : java.lang.String.format("fail:%s", this.f78906q)));
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        org.json.JSONArray jSONArray = this.f78904o;
        if (jSONArray != null) {
            hashMap.put("result", jSONArray);
        } else {
            hashMap.put("downloadId", java.lang.Long.valueOf(this.f78901i));
            hashMap.put("state", this.f78907r);
            hashMap.put("progress", java.lang.Long.valueOf(this.f78908s));
        }
        e9Var.a(i17, k0Var.p("ok", hashMap));
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void z() {
        int i17;
        int i18;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiQueryDownloadTask", "doQueryDownloadTask, downloadId = %d", java.lang.Long.valueOf(this.f78901i));
        org.json.JSONArray jSONArray = this.f78902m;
        if (jSONArray == null || jSONArray.length() <= 0) {
            org.json.JSONArray jSONArray2 = this.f78903n;
            if (jSONArray2 != null && jSONArray2.length() > 0) {
                this.f78904o = new org.json.JSONArray();
                for (int i19 = 0; i19 < this.f78903n.length(); i19++) {
                    java.lang.String optString = this.f78903n.optString(i19);
                    ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
                    com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo q17 = com.tencent.mm.plugin.downloader.model.r0.i().q(optString);
                    org.json.JSONArray jSONArray3 = this.f78904o;
                    org.json.JSONObject B = B(q17);
                    try {
                        B.put("appId", optString);
                    } catch (org.json.JSONException e17) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.JsApiQueryDownloadTask", e17.getMessage());
                    }
                    jSONArray3.put(B);
                }
                this.f78905p = false;
            } else if (this.f78901i <= 0) {
                this.f78906q = "downloadId invalid";
            } else {
                ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
                com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo p17 = com.tencent.mm.plugin.downloader.model.r0.i().p(this.f78901i);
                if (p17.f96971q && (i18 = p17.f96963f) != 1 && i18 != 3) {
                    this.f78907r = "download_wait_wifi";
                }
                int i27 = p17.f96963f;
                if (i27 != -1) {
                    if (i27 == 1) {
                        this.f78907r = "downloading";
                    } else if (i27 == 2) {
                        this.f78907r = "download_pause";
                    } else if (i27 != 3) {
                        if (i27 != 4) {
                            this.f78907r = "default";
                        } else {
                            this.f78907r = "download_fail";
                        }
                    } else if (com.tencent.mm.vfs.w6.j(p17.f96964g)) {
                        this.f78907r = "download_succ";
                    } else {
                        this.f78907r = "default";
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.JsApiQueryDownloadTask", "doQueryDownloadTask, state = %s", this.f78907r);
                    java.lang.String str = this.f78907r;
                    if (str == "downloading" || str == "download_pause") {
                        if (p17.f96968n != 0) {
                            this.f78908s = (((float) p17.f96967m) / ((float) r1)) * 100.0f;
                        }
                    }
                    if (p17.f96971q && !com.tencent.mars.comm.NetStatusUtil.isWifi(com.tencent.mm.sdk.platformtools.x2.f193071a) && (i17 = p17.f96963f) != 3 && i17 != 1) {
                        this.f78907r = "download_wait_wifi";
                    }
                    this.f78905p = false;
                } else {
                    this.f78906q = "fail_apilevel_too_low";
                }
            }
        } else {
            this.f78904o = new org.json.JSONArray();
            for (int i28 = 0; i28 < this.f78902m.length(); i28++) {
                long optLong = this.f78902m.optLong(i28);
                ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
                com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo p18 = com.tencent.mm.plugin.downloader.model.r0.i().p(optLong);
                org.json.JSONArray jSONArray4 = this.f78904o;
                org.json.JSONObject B2 = B(p18);
                try {
                    B2.put("downloadId", optLong);
                } catch (org.json.JSONException e18) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.JsApiQueryDownloadTask", e18.getMessage());
                }
                jSONArray4.put(B2);
            }
            this.f78905p = false;
        }
        c();
    }

    public JsApiQueryDownloadTask$QueryDownloadTask(android.os.Parcel parcel) {
        v(parcel);
    }
}
