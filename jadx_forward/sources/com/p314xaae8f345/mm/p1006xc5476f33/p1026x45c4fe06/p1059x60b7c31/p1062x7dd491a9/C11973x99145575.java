package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.appdownload.JsApiQueryDownloadTask$QueryDownloadTask */
/* loaded from: classes.dex */
class C11973x99145575 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.C11973x99145575> f33715x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.k1();

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 f160431f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 f160432g;

    /* renamed from: h, reason: collision with root package name */
    public final int f160433h;

    /* renamed from: i, reason: collision with root package name */
    public long f160434i;

    /* renamed from: m, reason: collision with root package name */
    public org.json.JSONArray f160435m;

    /* renamed from: n, reason: collision with root package name */
    public org.json.JSONArray f160436n;

    /* renamed from: o, reason: collision with root package name */
    public org.json.JSONArray f160437o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f160438p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f160439q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f160440r;

    /* renamed from: s, reason: collision with root package name */
    public long f160441s;

    public C11973x99145575(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 k0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var, int i17, org.json.JSONObject jSONObject) {
        this.f160431f = k0Var;
        this.f160432g = e9Var;
        this.f160433h = i17;
        this.f160434i = jSONObject.optLong("downloadId");
        this.f160435m = jSONObject.optJSONArray("downloadIdArray");
        this.f160436n = jSONObject.optJSONArray("appIdArray");
        this.f160438p = true;
    }

    public final org.json.JSONObject B(com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13222x107de37 c13222x107de37) {
        java.lang.String str;
        int i17;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        int i18 = c13222x107de37.f178496f;
        if (i18 == -1) {
            this.f160439q = "fail_apilevel_too_low";
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
            } else if (com.p314xaae8f345.mm.vfs.w6.j(c13222x107de37.f178497g)) {
                str = "download_succ";
            }
        } else {
            str = "download_pause";
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiQueryDownloadTask", "doQueryDownloadTask, state = %s", str);
        if (c13222x107de37.f178504q && !com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) && (i17 = c13222x107de37.f178496f) != 3 && i17 != 1) {
            str = "download_wait_wifi";
        }
        long j17 = 0;
        if (str == "downloading" || str == "download_pause") {
            long j18 = c13222x107de37.f178501n;
            if (j18 != 0) {
                j17 = (((float) c13222x107de37.f178500m) / ((float) j18)) * 100.0f;
            }
        }
        try {
            jSONObject.put("appId", c13222x107de37.f178499i);
            jSONObject.put("downloadId", c13222x107de37.f178494d);
            jSONObject.put("state", str);
            jSONObject.put("progress", j17);
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiQueryDownloadTask", e17.getMessage());
        }
        return jSONObject;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void v(android.os.Parcel parcel) {
        this.f160434i = parcel.readLong();
        this.f160438p = parcel.readInt() == 1;
        this.f160439q = parcel.readString();
        this.f160440r = parcel.readString();
        this.f160441s = parcel.readLong();
        java.lang.String readString = parcel.readString();
        java.lang.String readString2 = parcel.readString();
        java.lang.String readString3 = parcel.readString();
        if (readString != null) {
            try {
                this.f160435m = new org.json.JSONArray(readString);
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.JsApiQueryDownloadTask", e17, "", new java.lang.Object[0]);
                return;
            }
        }
        if (readString2 != null) {
            this.f160436n = new org.json.JSONArray(readString2);
        }
        if (readString3 != null) {
            this.f160437o = new org.json.JSONArray(readString3);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeLong(this.f160434i);
        parcel.writeInt(this.f160438p ? 1 : 0);
        parcel.writeString(this.f160439q);
        parcel.writeString(this.f160440r);
        parcel.writeLong(this.f160441s);
        org.json.JSONArray jSONArray = this.f160435m;
        parcel.writeString(jSONArray != null ? jSONArray.toString() : null);
        org.json.JSONArray jSONArray2 = this.f160436n;
        parcel.writeString(jSONArray2 != null ? jSONArray2.toString() : null);
        org.json.JSONArray jSONArray3 = this.f160437o;
        parcel.writeString(jSONArray3 != null ? jSONArray3.toString() : null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void y() {
        x();
        boolean z17 = this.f160438p;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 k0Var = this.f160431f;
        int i17 = this.f160433h;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = this.f160432g;
        if (z17) {
            e9Var.a(i17, k0Var.o(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f160439q) ? "fail" : java.lang.String.format("fail:%s", this.f160439q)));
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        org.json.JSONArray jSONArray = this.f160437o;
        if (jSONArray != null) {
            hashMap.put("result", jSONArray);
        } else {
            hashMap.put("downloadId", java.lang.Long.valueOf(this.f160434i));
            hashMap.put("state", this.f160440r);
            hashMap.put("progress", java.lang.Long.valueOf(this.f160441s));
        }
        e9Var.a(i17, k0Var.p("ok", hashMap));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void z() {
        int i17;
        int i18;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiQueryDownloadTask", "doQueryDownloadTask, downloadId = %d", java.lang.Long.valueOf(this.f160434i));
        org.json.JSONArray jSONArray = this.f160435m;
        if (jSONArray == null || jSONArray.length() <= 0) {
            org.json.JSONArray jSONArray2 = this.f160436n;
            if (jSONArray2 != null && jSONArray2.length() > 0) {
                this.f160437o = new org.json.JSONArray();
                for (int i19 = 0; i19 < this.f160436n.length(); i19++) {
                    java.lang.String optString = this.f160436n.optString(i19);
                    ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13222x107de37 q17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().q(optString);
                    org.json.JSONArray jSONArray3 = this.f160437o;
                    org.json.JSONObject B = B(q17);
                    try {
                        B.put("appId", optString);
                    } catch (org.json.JSONException e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiQueryDownloadTask", e17.getMessage());
                    }
                    jSONArray3.put(B);
                }
                this.f160438p = false;
            } else if (this.f160434i <= 0) {
                this.f160439q = "downloadId invalid";
            } else {
                ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13222x107de37 p17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().p(this.f160434i);
                if (p17.f178504q && (i18 = p17.f178496f) != 1 && i18 != 3) {
                    this.f160440r = "download_wait_wifi";
                }
                int i27 = p17.f178496f;
                if (i27 != -1) {
                    if (i27 == 1) {
                        this.f160440r = "downloading";
                    } else if (i27 == 2) {
                        this.f160440r = "download_pause";
                    } else if (i27 != 3) {
                        if (i27 != 4) {
                            this.f160440r = "default";
                        } else {
                            this.f160440r = "download_fail";
                        }
                    } else if (com.p314xaae8f345.mm.vfs.w6.j(p17.f178497g)) {
                        this.f160440r = "download_succ";
                    } else {
                        this.f160440r = "default";
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiQueryDownloadTask", "doQueryDownloadTask, state = %s", this.f160440r);
                    java.lang.String str = this.f160440r;
                    if (str == "downloading" || str == "download_pause") {
                        if (p17.f178501n != 0) {
                            this.f160441s = (((float) p17.f178500m) / ((float) r1)) * 100.0f;
                        }
                    }
                    if (p17.f178504q && !com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) && (i17 = p17.f178496f) != 3 && i17 != 1) {
                        this.f160440r = "download_wait_wifi";
                    }
                    this.f160438p = false;
                } else {
                    this.f160439q = "fail_apilevel_too_low";
                }
            }
        } else {
            this.f160437o = new org.json.JSONArray();
            for (int i28 = 0; i28 < this.f160435m.length(); i28++) {
                long optLong = this.f160435m.optLong(i28);
                ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13222x107de37 p18 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().p(optLong);
                org.json.JSONArray jSONArray4 = this.f160437o;
                org.json.JSONObject B2 = B(p18);
                try {
                    B2.put("downloadId", optLong);
                } catch (org.json.JSONException e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiQueryDownloadTask", e18.getMessage());
                }
                jSONArray4.put(B2);
            }
            this.f160438p = false;
        }
        c();
    }

    public C11973x99145575(android.os.Parcel parcel) {
        v(parcel);
    }
}
