package com.tencent.mm.plugin.appbrand.jsapi.appdownload;

/* loaded from: classes.dex */
public class JsApiQueryDownloadTaskForNative$QueryDownloadTask extends com.tencent.mm.plugin.appbrand.ipc.MainProcessTask {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.appdownload.JsApiQueryDownloadTaskForNative$QueryDownloadTask> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.appdownload.m1();

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.k0 f78909f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.e9 f78910g;

    /* renamed from: h, reason: collision with root package name */
    public final int f78911h;

    /* renamed from: i, reason: collision with root package name */
    public long f78912i;

    /* renamed from: m, reason: collision with root package name */
    public org.json.JSONArray f78913m;

    /* renamed from: n, reason: collision with root package name */
    public org.json.JSONArray f78914n;

    /* renamed from: o, reason: collision with root package name */
    public org.json.JSONArray f78915o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f78916p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f78917q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f78918r;

    /* renamed from: s, reason: collision with root package name */
    public long f78919s;

    /* renamed from: t, reason: collision with root package name */
    public float f78920t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f78921u;

    public JsApiQueryDownloadTaskForNative$QueryDownloadTask(com.tencent.mm.plugin.appbrand.jsapi.k0 k0Var, com.tencent.mm.plugin.appbrand.e9 e9Var, int i17, org.json.JSONObject jSONObject) {
        this.f78909f = k0Var;
        this.f78910g = e9Var;
        this.f78911h = i17;
        this.f78912i = jSONObject.optLong("downloadId");
        this.f78913m = jSONObject.optJSONArray("downloadIdArray");
        this.f78914n = jSONObject.optJSONArray("appIdArray");
        this.f78916p = true;
    }

    public final org.json.JSONObject B(com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo fileDownloadTaskInfo) {
        java.lang.String str;
        float f17;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        int i17 = fileDownloadTaskInfo.f96963f;
        if (i17 == -1) {
            this.f78917q = "fail_apilevel_too_low";
            return jSONObject;
        }
        int i18 = 1;
        if (i17 == 1) {
            str = "downloading";
        } else if (i17 != 2) {
            str = "default";
            if (i17 != 3) {
                if (i17 == 4) {
                    str = "download_fail";
                }
            } else if (com.tencent.mm.vfs.w6.j(fileDownloadTaskInfo.f96964g)) {
                str = "download_succ";
            }
        } else {
            str = "download_pause";
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiQueryDownloadTaskForNative", "doQueryDownloadTask, state = %s", str);
        long j17 = fileDownloadTaskInfo.f96968n;
        long j18 = 0;
        if (j17 != 0) {
            long j19 = fileDownloadTaskInfo.f96967m;
            f17 = (((float) j19) * 100.0f) / ((float) j17);
            j18 = (100 * j19) / j17;
        } else {
            f17 = 0.0f;
        }
        try {
            jSONObject.put("appId", fileDownloadTaskInfo.f96966i);
            jSONObject.put("downloadId", fileDownloadTaskInfo.f96961d);
            jSONObject.put("state", str);
            jSONObject.put("progress", j18);
            jSONObject.put("progress_float", f17);
            if (!fileDownloadTaskInfo.f96972r) {
                i18 = 0;
            }
            jSONObject.put("reserve_for_wifi", i18);
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiQueryDownloadTaskForNative", e17.getMessage());
        }
        return jSONObject;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void v(android.os.Parcel parcel) {
        this.f78912i = parcel.readLong();
        this.f78916p = parcel.readInt() == 1;
        this.f78917q = parcel.readString();
        this.f78918r = parcel.readString();
        this.f78919s = parcel.readLong();
        java.lang.String readString = parcel.readString();
        java.lang.String readString2 = parcel.readString();
        java.lang.String readString3 = parcel.readString();
        if (readString != null) {
            try {
                this.f78913m = new org.json.JSONArray(readString);
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.JsApiQueryDownloadTaskForNative", e17, "", new java.lang.Object[0]);
            }
        }
        if (readString2 != null) {
            this.f78914n = new org.json.JSONArray(readString2);
        }
        if (readString3 != null) {
            this.f78915o = new org.json.JSONArray(readString3);
        }
        this.f78921u = parcel.readInt() == 1;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeLong(this.f78912i);
        parcel.writeInt(this.f78916p ? 1 : 0);
        parcel.writeString(this.f78917q);
        parcel.writeString(this.f78918r);
        parcel.writeLong(this.f78919s);
        org.json.JSONArray jSONArray = this.f78913m;
        parcel.writeString(jSONArray != null ? jSONArray.toString() : null);
        org.json.JSONArray jSONArray2 = this.f78914n;
        parcel.writeString(jSONArray2 != null ? jSONArray2.toString() : null);
        org.json.JSONArray jSONArray3 = this.f78915o;
        parcel.writeString(jSONArray3 != null ? jSONArray3.toString() : null);
        parcel.writeInt(this.f78921u ? 1 : 0);
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void y() {
        x();
        boolean z17 = this.f78916p;
        com.tencent.mm.plugin.appbrand.jsapi.k0 k0Var = this.f78909f;
        int i17 = this.f78911h;
        com.tencent.mm.plugin.appbrand.e9 e9Var = this.f78910g;
        if (z17) {
            e9Var.a(i17, k0Var.o(com.tencent.mm.sdk.platformtools.t8.K0(this.f78917q) ? "fail" : java.lang.String.format("fail:%s", this.f78917q)));
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        org.json.JSONArray jSONArray = this.f78915o;
        if (jSONArray != null) {
            hashMap.put("result", jSONArray);
        } else {
            hashMap.put("downloadId", java.lang.Long.valueOf(this.f78912i));
            hashMap.put("state", this.f78918r);
            hashMap.put("progress", java.lang.Long.valueOf(this.f78919s));
            hashMap.put("progress_float", java.lang.Float.valueOf(this.f78920t));
            hashMap.put("reserve_for_wifi", java.lang.Boolean.valueOf(this.f78921u));
        }
        e9Var.a(i17, k0Var.p("ok", hashMap));
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void z() {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiQueryDownloadTaskForNative", "doQueryDownloadTask, downloadId = %d", java.lang.Long.valueOf(this.f78912i));
        org.json.JSONArray jSONArray = this.f78913m;
        if (jSONArray == null || jSONArray.length() <= 0) {
            org.json.JSONArray jSONArray2 = this.f78914n;
            if (jSONArray2 != null && jSONArray2.length() > 0) {
                this.f78915o = new org.json.JSONArray();
                for (int i17 = 0; i17 < this.f78914n.length(); i17++) {
                    java.lang.String optString = this.f78914n.optString(i17);
                    ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
                    com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo q17 = com.tencent.mm.plugin.downloader.model.r0.i().q(optString);
                    org.json.JSONArray jSONArray3 = this.f78915o;
                    org.json.JSONObject B = B(q17);
                    try {
                        B.put("appId", optString);
                    } catch (org.json.JSONException e17) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.JsApiQueryDownloadTaskForNative", e17.getMessage());
                    }
                    jSONArray3.put(B);
                }
                this.f78916p = false;
            } else if (this.f78912i <= 0) {
                this.f78917q = "downloadId invalid";
            } else {
                ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
                com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo p17 = com.tencent.mm.plugin.downloader.model.r0.i().p(this.f78912i);
                int i18 = p17.f96963f;
                if (i18 != -1) {
                    if (i18 == 1) {
                        this.f78918r = "downloading";
                    } else if (i18 == 2) {
                        this.f78918r = "download_pause";
                    } else if (i18 != 3) {
                        if (i18 != 4) {
                            this.f78918r = "default";
                        } else {
                            this.f78918r = "download_fail";
                        }
                    } else if (com.tencent.mm.vfs.w6.j(p17.f96964g)) {
                        this.f78918r = "download_succ";
                    } else {
                        this.f78918r = "default";
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.JsApiQueryDownloadTaskForNative", "doQueryDownloadTask, state = %s", this.f78918r);
                    long j17 = p17.f96968n;
                    if (j17 != 0) {
                        float f17 = (float) p17.f96967m;
                        this.f78919s = (f17 / r1) * 100.0f;
                        this.f78920t = (f17 * 100.0f) / ((float) j17);
                    }
                    this.f78921u = p17.f96972r;
                    this.f78916p = false;
                } else {
                    this.f78917q = "fail_apilevel_too_low";
                }
            }
        } else {
            this.f78915o = new org.json.JSONArray();
            for (int i19 = 0; i19 < this.f78913m.length(); i19++) {
                long optLong = this.f78913m.optLong(i19);
                ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
                com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo p18 = com.tencent.mm.plugin.downloader.model.r0.i().p(optLong);
                org.json.JSONArray jSONArray4 = this.f78915o;
                org.json.JSONObject B2 = B(p18);
                try {
                    B2.put("downloadId", optLong);
                } catch (org.json.JSONException e18) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.JsApiQueryDownloadTaskForNative", e18.getMessage());
                }
                jSONArray4.put(B2);
            }
            this.f78916p = false;
        }
        c();
    }

    public JsApiQueryDownloadTaskForNative$QueryDownloadTask(android.os.Parcel parcel) {
        v(parcel);
    }
}
