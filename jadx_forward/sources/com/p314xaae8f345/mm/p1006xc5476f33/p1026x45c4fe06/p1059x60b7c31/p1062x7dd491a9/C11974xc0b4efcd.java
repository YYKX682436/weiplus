package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.appdownload.JsApiQueryDownloadTaskForNative$QueryDownloadTask */
/* loaded from: classes.dex */
public class C11974xc0b4efcd extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.C11974xc0b4efcd> f33716x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.m1();

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 f160442f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 f160443g;

    /* renamed from: h, reason: collision with root package name */
    public final int f160444h;

    /* renamed from: i, reason: collision with root package name */
    public long f160445i;

    /* renamed from: m, reason: collision with root package name */
    public org.json.JSONArray f160446m;

    /* renamed from: n, reason: collision with root package name */
    public org.json.JSONArray f160447n;

    /* renamed from: o, reason: collision with root package name */
    public org.json.JSONArray f160448o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f160449p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f160450q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f160451r;

    /* renamed from: s, reason: collision with root package name */
    public long f160452s;

    /* renamed from: t, reason: collision with root package name */
    public float f160453t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f160454u;

    public C11974xc0b4efcd(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 k0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var, int i17, org.json.JSONObject jSONObject) {
        this.f160442f = k0Var;
        this.f160443g = e9Var;
        this.f160444h = i17;
        this.f160445i = jSONObject.optLong("downloadId");
        this.f160446m = jSONObject.optJSONArray("downloadIdArray");
        this.f160447n = jSONObject.optJSONArray("appIdArray");
        this.f160449p = true;
    }

    public final org.json.JSONObject B(com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13222x107de37 c13222x107de37) {
        java.lang.String str;
        float f17;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        int i17 = c13222x107de37.f178496f;
        if (i17 == -1) {
            this.f160450q = "fail_apilevel_too_low";
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
            } else if (com.p314xaae8f345.mm.vfs.w6.j(c13222x107de37.f178497g)) {
                str = "download_succ";
            }
        } else {
            str = "download_pause";
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiQueryDownloadTaskForNative", "doQueryDownloadTask, state = %s", str);
        long j17 = c13222x107de37.f178501n;
        long j18 = 0;
        if (j17 != 0) {
            long j19 = c13222x107de37.f178500m;
            f17 = (((float) j19) * 100.0f) / ((float) j17);
            j18 = (100 * j19) / j17;
        } else {
            f17 = 0.0f;
        }
        try {
            jSONObject.put("appId", c13222x107de37.f178499i);
            jSONObject.put("downloadId", c13222x107de37.f178494d);
            jSONObject.put("state", str);
            jSONObject.put("progress", j18);
            jSONObject.put("progress_float", f17);
            if (!c13222x107de37.f178505r) {
                i18 = 0;
            }
            jSONObject.put("reserve_for_wifi", i18);
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiQueryDownloadTaskForNative", e17.getMessage());
        }
        return jSONObject;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void v(android.os.Parcel parcel) {
        this.f160445i = parcel.readLong();
        this.f160449p = parcel.readInt() == 1;
        this.f160450q = parcel.readString();
        this.f160451r = parcel.readString();
        this.f160452s = parcel.readLong();
        java.lang.String readString = parcel.readString();
        java.lang.String readString2 = parcel.readString();
        java.lang.String readString3 = parcel.readString();
        if (readString != null) {
            try {
                this.f160446m = new org.json.JSONArray(readString);
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.JsApiQueryDownloadTaskForNative", e17, "", new java.lang.Object[0]);
            }
        }
        if (readString2 != null) {
            this.f160447n = new org.json.JSONArray(readString2);
        }
        if (readString3 != null) {
            this.f160448o = new org.json.JSONArray(readString3);
        }
        this.f160454u = parcel.readInt() == 1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeLong(this.f160445i);
        parcel.writeInt(this.f160449p ? 1 : 0);
        parcel.writeString(this.f160450q);
        parcel.writeString(this.f160451r);
        parcel.writeLong(this.f160452s);
        org.json.JSONArray jSONArray = this.f160446m;
        parcel.writeString(jSONArray != null ? jSONArray.toString() : null);
        org.json.JSONArray jSONArray2 = this.f160447n;
        parcel.writeString(jSONArray2 != null ? jSONArray2.toString() : null);
        org.json.JSONArray jSONArray3 = this.f160448o;
        parcel.writeString(jSONArray3 != null ? jSONArray3.toString() : null);
        parcel.writeInt(this.f160454u ? 1 : 0);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void y() {
        x();
        boolean z17 = this.f160449p;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 k0Var = this.f160442f;
        int i17 = this.f160444h;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = this.f160443g;
        if (z17) {
            e9Var.a(i17, k0Var.o(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f160450q) ? "fail" : java.lang.String.format("fail:%s", this.f160450q)));
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        org.json.JSONArray jSONArray = this.f160448o;
        if (jSONArray != null) {
            hashMap.put("result", jSONArray);
        } else {
            hashMap.put("downloadId", java.lang.Long.valueOf(this.f160445i));
            hashMap.put("state", this.f160451r);
            hashMap.put("progress", java.lang.Long.valueOf(this.f160452s));
            hashMap.put("progress_float", java.lang.Float.valueOf(this.f160453t));
            hashMap.put("reserve_for_wifi", java.lang.Boolean.valueOf(this.f160454u));
        }
        e9Var.a(i17, k0Var.p("ok", hashMap));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void z() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiQueryDownloadTaskForNative", "doQueryDownloadTask, downloadId = %d", java.lang.Long.valueOf(this.f160445i));
        org.json.JSONArray jSONArray = this.f160446m;
        if (jSONArray == null || jSONArray.length() <= 0) {
            org.json.JSONArray jSONArray2 = this.f160447n;
            if (jSONArray2 != null && jSONArray2.length() > 0) {
                this.f160448o = new org.json.JSONArray();
                for (int i17 = 0; i17 < this.f160447n.length(); i17++) {
                    java.lang.String optString = this.f160447n.optString(i17);
                    ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13222x107de37 q17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().q(optString);
                    org.json.JSONArray jSONArray3 = this.f160448o;
                    org.json.JSONObject B = B(q17);
                    try {
                        B.put("appId", optString);
                    } catch (org.json.JSONException e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiQueryDownloadTaskForNative", e17.getMessage());
                    }
                    jSONArray3.put(B);
                }
                this.f160449p = false;
            } else if (this.f160445i <= 0) {
                this.f160450q = "downloadId invalid";
            } else {
                ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13222x107de37 p17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().p(this.f160445i);
                int i18 = p17.f178496f;
                if (i18 != -1) {
                    if (i18 == 1) {
                        this.f160451r = "downloading";
                    } else if (i18 == 2) {
                        this.f160451r = "download_pause";
                    } else if (i18 != 3) {
                        if (i18 != 4) {
                            this.f160451r = "default";
                        } else {
                            this.f160451r = "download_fail";
                        }
                    } else if (com.p314xaae8f345.mm.vfs.w6.j(p17.f178497g)) {
                        this.f160451r = "download_succ";
                    } else {
                        this.f160451r = "default";
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiQueryDownloadTaskForNative", "doQueryDownloadTask, state = %s", this.f160451r);
                    long j17 = p17.f178501n;
                    if (j17 != 0) {
                        float f17 = (float) p17.f178500m;
                        this.f160452s = (f17 / r1) * 100.0f;
                        this.f160453t = (f17 * 100.0f) / ((float) j17);
                    }
                    this.f160454u = p17.f178505r;
                    this.f160449p = false;
                } else {
                    this.f160450q = "fail_apilevel_too_low";
                }
            }
        } else {
            this.f160448o = new org.json.JSONArray();
            for (int i19 = 0; i19 < this.f160446m.length(); i19++) {
                long optLong = this.f160446m.optLong(i19);
                ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13222x107de37 p18 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().p(optLong);
                org.json.JSONArray jSONArray4 = this.f160448o;
                org.json.JSONObject B2 = B(p18);
                try {
                    B2.put("downloadId", optLong);
                } catch (org.json.JSONException e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiQueryDownloadTaskForNative", e18.getMessage());
                }
                jSONArray4.put(B2);
            }
            this.f160449p = false;
        }
        c();
    }

    public C11974xc0b4efcd(android.os.Parcel parcel) {
        v(parcel);
    }
}
