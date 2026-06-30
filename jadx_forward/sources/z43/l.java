package z43;

/* loaded from: classes8.dex */
public class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f551656d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z43.m f551657e;

    public l(z43.m mVar, org.json.JSONObject jSONObject) {
        this.f551657e = mVar;
        this.f551656d = jSONObject;
    }

    @Override // java.lang.Runnable
    public void run() {
        org.json.JSONObject jSONObject;
        java.lang.Object obj;
        org.json.JSONObject jSONObject2;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        android.content.Context context;
        int i17;
        java.lang.String str6;
        android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        org.json.JSONObject jSONObject3 = this.f551656d;
        org.json.JSONArray optJSONArray = jSONObject3.optJSONArray(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56317xb68cafb1);
        boolean optBoolean = jSONObject3.optBoolean("isQueryDetail", false);
        java.lang.String str7 = com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56315xfd38653e;
        java.lang.String str8 = "versionName";
        java.lang.String str9 = com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56321xa96d32a5;
        z43.m mVar = this.f551657e;
        if (optJSONArray != null) {
            org.json.JSONObject jSONObject4 = new org.json.JSONObject();
            org.json.JSONObject jSONObject5 = new org.json.JSONObject();
            org.json.JSONObject jSONObject6 = new org.json.JSONObject();
            org.json.JSONObject jSONObject7 = new org.json.JSONObject();
            org.json.JSONObject jSONObject8 = new org.json.JSONObject();
            int i18 = 0;
            boolean z17 = false;
            while (i18 < optJSONArray.length()) {
                try {
                    java.lang.String optString = optJSONArray.optString(i18);
                    org.json.JSONArray jSONArray = optJSONArray;
                    android.content.pm.PackageInfo a17 = ik1.b.a(context2, optString);
                    if (a17 == null) {
                        context = context2;
                        i17 = 0;
                    } else {
                        context = context2;
                        i17 = a17.versionCode;
                    }
                    if (a17 == null) {
                        str3 = str7;
                        str6 = "null";
                    } else {
                        str3 = str7;
                        try {
                            str6 = a17.versionName;
                        } catch (java.lang.Exception unused) {
                        }
                    }
                    str4 = str8;
                    try {
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                        str5 = str9;
                        try {
                            sb6.append("getInstallState, packageName = ");
                            sb6.append(optString);
                            sb6.append(", version = ");
                            sb6.append(i17);
                            sb6.append(", versionName = ");
                            sb6.append(str6);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppJsApiGetInstallState", sb6.toString());
                            if (!z17 && i17 > 0) {
                                z17 = true;
                            }
                            jSONObject4.put(optString, i17);
                            jSONObject5.put(optString, str6);
                            if (optBoolean && a17 != null) {
                                com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(a17.applicationInfo.sourceDir);
                                ((uz.a2) ((vz.y1) i95.n0.c(vz.y1.class))).getClass();
                                java.lang.String a18 = e02.k.a(r6Var);
                                java.lang.String Ai = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a18) ? ((uz.a2) ((vz.y1) i95.n0.c(vz.y1.class))).Ai(r6Var) : "";
                                if (r6Var.C() > com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26666xd71a0a76.f56078x428b3be8) {
                                    jSONObject7.put(optString, false);
                                } else {
                                    jSONObject7.put(optString, true);
                                }
                                jSONObject6.put(optString, a18);
                                jSONObject8.put(optString, Ai);
                            }
                            i18++;
                            optJSONArray = jSONArray;
                            context2 = context;
                            str7 = str3;
                            str8 = str4;
                            str9 = str5;
                        } catch (java.lang.Exception unused2) {
                        }
                    } catch (java.lang.Exception unused3) {
                    }
                } catch (java.lang.Exception unused4) {
                }
            }
            str3 = str7;
            str4 = str8;
            str5 = str9;
            java.util.HashMap hashMap = new java.util.HashMap();
            if (z17) {
                hashMap.put(str5, jSONObject4);
                hashMap.put(str4, jSONObject5);
                hashMap.put(str3, jSONObject6);
                hashMap.put("isCloudApk", jSONObject7);
                hashMap.put("apkSignBlockMd5", jSONObject8);
            }
            hashMap.put("state", java.lang.Boolean.valueOf(z17));
            mVar.f224976f.b(hashMap);
            return;
        }
        java.lang.String optString2 = jSONObject3.optString(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56317xb68cafb1);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppJsApiGetInstallState", "packageName is null or nil");
            mVar.f224976f.a("get_install_state:no_null_packageName");
            return;
        }
        android.content.pm.PackageInfo a19 = ik1.b.a(context2, optString2);
        int i19 = a19 == null ? 0 : a19.versionCode;
        java.lang.String str10 = a19 == null ? "null" : a19.versionName;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppJsApiGetInstallState", "doGetInstallState, packageName = " + optString2 + ", version = " + i19 + ", versionName = " + str10);
        if (a19 == null) {
            java.util.HashMap hashMap2 = new java.util.HashMap();
            hashMap2.put("state", java.lang.Boolean.FALSE);
            mVar.f224976f.b(hashMap2);
            return;
        }
        java.util.HashMap hashMap3 = new java.util.HashMap();
        org.json.JSONObject jSONObject9 = new org.json.JSONObject();
        org.json.JSONObject jSONObject10 = new org.json.JSONObject();
        try {
            jSONObject9.put(optString2, i19);
            jSONObject10.put(optString2, str10);
        } catch (org.json.JSONException unused5) {
        }
        if (optBoolean) {
            org.json.JSONObject jSONObject11 = new org.json.JSONObject();
            jSONObject = jSONObject10;
            org.json.JSONObject jSONObject12 = new org.json.JSONObject();
            org.json.JSONObject jSONObject13 = new org.json.JSONObject();
            com.p314xaae8f345.mm.vfs.r6 r6Var2 = new com.p314xaae8f345.mm.vfs.r6(a19.applicationInfo.sourceDir);
            ((uz.a2) ((vz.y1) i95.n0.c(vz.y1.class))).getClass();
            java.lang.String a27 = e02.k.a(r6Var2);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a27)) {
                str = "LiteAppJsApiGetInstallState";
                str2 = ((uz.a2) ((vz.y1) i95.n0.c(vz.y1.class))).Ai(r6Var2);
                try {
                    jSONObject13.put(optString2, str2);
                } catch (org.json.JSONException e17) {
                    throw new java.lang.RuntimeException(e17);
                }
            } else {
                str = "LiteAppJsApiGetInstallState";
                try {
                    jSONObject11.put(optString2, a27);
                    str2 = "";
                } catch (org.json.JSONException e18) {
                    throw new java.lang.RuntimeException(e18);
                }
            }
            try {
                jSONObject12.put(optString2, r6Var2.C() > com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26666xd71a0a76.f56078x428b3be8);
                hashMap3.put("isCloudApk", jSONObject12);
                hashMap3.put(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56315xfd38653e, jSONObject11);
                hashMap3.put("apkSignBlockMd5", jSONObject13);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "doGetInstallState, packageName = " + optString2 + ", version = " + i19 + ", versionName = " + str10 + ", channelId = " + a27 + ", apkSignBlockMd5 = " + str2);
                jSONObject2 = jSONObject9;
                obj = com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56321xa96d32a5;
            } catch (org.json.JSONException e19) {
                throw new java.lang.RuntimeException(e19);
            }
        } else {
            jSONObject = jSONObject10;
            obj = com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56321xa96d32a5;
            jSONObject2 = jSONObject9;
        }
        hashMap3.put(obj, jSONObject2);
        hashMap3.put("versionName", jSONObject);
        hashMap3.put("state", java.lang.Boolean.TRUE);
        mVar.f224976f.b(hashMap3);
    }
}
