package zd;

/* loaded from: classes.dex */
public class a extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f77563x366c91de = 1207;

    /* renamed from: NAME */
    public static final java.lang.String f77564x24728b = "getWxCommFont";

    public static boolean C(java.io.File file) {
        java.lang.String absolutePath = file.getAbsolutePath();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetWxCommFont", "getWxCommFont isSafePath input: [%s]", absolutePath);
        java.lang.String j17 = j62.e.g().j("clicfg_android_wxcommfont_paths", "[\"/system/fonts\", \"/system/etc/fonts\"]", true, true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetWxCommFont", "getWxCommFont isSafePath whiteList: [%s]", j17);
        org.json.JSONArray jSONArray = new org.json.JSONArray(j17);
        for (int i17 = 0; i17 < jSONArray.length(); i17++) {
            java.lang.String string = jSONArray.getString(i17);
            if (absolutePath.startsWith(string)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetWxCommFont", "getWxCommFont isSafePath isWhite?yes[%s]", string);
                return true;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetWxCommFont", "getWxCommFont isSafePath isWhite?skip[%s]", string);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetWxCommFont", "getWxCommFont isSafePath no white accept");
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, final int i17) {
        final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) lVar;
        final java.lang.String optString = jSONObject.optString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714);
        if (!android.text.TextUtils.isEmpty(optString)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetWxCommFont", "getWxCommFont start [%s] ", optString);
            ((ku5.t0) ku5.t0.f394148d).q(new java.lang.Runnable() { // from class: zd.a$$a
                @Override // java.lang.Runnable
                public final void run() {
                    java.lang.String[] strArr;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var2 = e9Var;
                    int i18 = i17;
                    zd.a aVar = zd.a.this;
                    aVar.getClass();
                    java.lang.String str = optString;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetWxCommFont", "getWxCommFont start, in iothread [%s]", str);
                    try {
                        java.io.File file = new java.io.File(str);
                        if (!zd.a.C(file)) {
                            java.lang.String str2 = android.text.TextUtils.isEmpty(null) ? "fail:Path permission denied" : null;
                            java.lang.String str3 = str2 == null ? "" : str2;
                            java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                            try {
                                jSONObject2.put("errno", 1300014);
                            } catch (java.lang.Exception e17) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
                            }
                            e9Var2.a(i18, aVar.u(str3, jSONObject2));
                            return;
                        }
                        if (file.isDirectory()) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetWxCommFont", "getWxCommFont isDirectory [%s]", str);
                            java.io.File[] listFiles = file.listFiles();
                            java.util.HashMap hashMap = new java.util.HashMap();
                            if (listFiles == null) {
                                strArr = new java.lang.String[0];
                            } else {
                                strArr = new java.lang.String[listFiles.length];
                                for (int i19 = 0; i19 < listFiles.length; i19++) {
                                    strArr[i19] = listFiles[i19].toString();
                                }
                            }
                            hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, strArr);
                            java.lang.Object[] objArr = new java.lang.Object[2];
                            objArr[0] = str;
                            objArr[1] = java.lang.Integer.valueOf(listFiles == null ? -1 : listFiles.length);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetWxCommFont", "getWxCommFont isDirectory [%s] [%d]", objArr);
                            java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                            hashMap.put("errno", 0);
                            e9Var2.a(i18, aVar.t("ok", hashMap));
                            return;
                        }
                        try {
                            if (!file.isFile()) {
                                java.lang.String str6 = android.text.TextUtils.isEmpty(null) ? "fail:load resource file fail" : null;
                                if (str6 == null) {
                                    str6 = "";
                                }
                                java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                                org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                                try {
                                    jSONObject3.put("errno", 1107012);
                                } catch (java.lang.Exception e18) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
                                }
                                e9Var2.a(i18, aVar.u(str6, jSONObject3));
                                return;
                            }
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetWxCommFont", "getWxCommFont isFile [%s]", str);
                            java.util.HashMap hashMap2 = new java.util.HashMap();
                            try {
                                byte[] b17 = ik1.f.b(new java.io.FileInputStream(file));
                                java.nio.ByteBuffer wrap = b17 != null ? java.nio.ByteBuffer.wrap(b17) : null;
                                hashMap2.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, wrap);
                                java.lang.Object[] objArr2 = new java.lang.Object[2];
                                objArr2[0] = str;
                                objArr2[1] = java.lang.Integer.valueOf(wrap == null ? -1 : wrap.limit());
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetWxCommFont", "getWxCommFont isFile [%s] length = [%d]", objArr2);
                                e9Var2.a(i18, aVar.x(e9Var2, jc1.f.f380445a, hashMap2));
                                return;
                            } catch (java.io.FileNotFoundException e19) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.JsApiGetWxCommFont", e19, "file not found %s", str);
                                java.lang.String str8 = android.text.TextUtils.isEmpty(null) ? "fail:target file not exists" : null;
                                java.lang.String str9 = str8 == null ? "" : str8;
                                java.lang.String str10 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                                org.json.JSONObject jSONObject4 = new org.json.JSONObject();
                                try {
                                    jSONObject4.put("errno", 1103002);
                                } catch (java.lang.Exception e27) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e27);
                                }
                                e9Var2.a(i18, aVar.u(str9, jSONObject4));
                                return;
                            }
                        } catch (java.lang.Exception unused) {
                        }
                    } catch (java.lang.Exception unused2) {
                        str = null;
                    }
                    str = null;
                    java.lang.String str11 = android.text.TextUtils.isEmpty(str) ? "fail:internal error" : str;
                    java.lang.String str12 = str11 != null ? str11 : "";
                    java.lang.String str13 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                    org.json.JSONObject jSONObject5 = new org.json.JSONObject();
                    try {
                        jSONObject5.put("errno", 4);
                    } catch (java.lang.Exception e28) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e28);
                    }
                    e9Var2.a(i18, aVar.u(str12, jSONObject5));
                }
            });
            return;
        }
        java.lang.String str = android.text.TextUtils.isEmpty(null) ? "fail:invalid request parameter" : null;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject2.put("errno", 1001);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
        }
        e9Var.a(i17, u(str, jSONObject2));
    }
}
