package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\b"}, d2 = {"Lcom/tencent/mm/plugin/lite/jsapi/comms/y5;", "Lcom/tencent/mm/plugin/lite/api/p;", "<init>", "()V", "com/tencent/mm/plugin/lite/jsapi/comms/r5", "com/tencent/mm/plugin/lite/jsapi/comms/t5", "com/tencent/mm/plugin/lite/jsapi/comms/u5", "com/tencent/mm/plugin/lite/jsapi/comms/v5", "luggage-lite-app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class y5 extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p {

    /* renamed from: g, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.vfs.r6 f225368g;

    static {
        com.p314xaae8f345.mm.vfs.r7 r7Var = com.p314xaae8f345.mm.vfs.q7.f294674a;
        f225368g = lp0.b.h0("liteappjsapi_savefile");
    }

    public final void A(java.util.List list) {
        e40.c0 c0Var = (e40.c0) i95.n0.c(e40.c0.class);
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.v5 v5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.v5) it.next();
            arrayList.add(new e40.y(v5Var.f225341a, v5Var.f225342b, v5Var.f225346f, v5Var.f225343c, v5Var.f225344d, 0L, 32, null));
        }
        ((d40.t) c0Var).Zi(arrayList, new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.w5(this, list));
    }

    public final void B(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.t5 t5Var, java.lang.String str2) {
        int ordinal = t5Var.ordinal();
        if (ordinal == 0) {
            zb0.b0 b0Var = (zb0.b0) i95.n0.c(zb0.b0.class);
            android.content.Context c17 = c();
            ((yb0.g) b0Var).getClass();
            com.p314xaae8f345.mm.p1004x2137b148.C11325x6ace8b92.b(c17, str, null);
            return;
        }
        if (ordinal == 1) {
            zb0.b0 b0Var2 = (zb0.b0) i95.n0.c(zb0.b0.class);
            c();
            ((yb0.g) b0Var2).getClass();
            com.p314xaae8f345.mm.p1004x2137b148.C11325x6ace8b92.g(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, str, null, null);
            return;
        }
        if (ordinal != 2) {
            return;
        }
        if (str2 == null) {
            zb0.b0 b0Var3 = (zb0.b0) i95.n0.c(zb0.b0.class);
            android.content.Context c18 = c();
            ((yb0.g) b0Var3).getClass();
            com.p314xaae8f345.mm.p1004x2137b148.C11325x6ace8b92.d(c18, str, null);
            return;
        }
        zb0.b0 b0Var4 = (zb0.b0) i95.n0.c(zb0.b0.class);
        android.content.Context c19 = c();
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.x5 x5Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.x5(str2);
        ((yb0.g) b0Var4).getClass();
        com.p314xaae8f345.mm.p1004x2137b148.C11325x6ace8b92.e(c19, str, str2, x5Var);
    }

    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject data, boolean z17) {
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        int i17;
        java.lang.String str5 = "fileId";
        java.lang.String str6 = "MicroMsg.LiteAppJsApiSaveFile";
        java.lang.String str7 = "fileList";
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        try {
            org.json.JSONArray jSONArray = data.getJSONArray("fileList");
            if (jSONArray.length() < 1) {
                return;
            }
            if (jSONArray.getJSONObject(0).has("fileId")) {
                try {
                    java.util.ArrayList arrayList = new java.util.ArrayList(jSONArray.length());
                    int length = jSONArray.length();
                    int i18 = 0;
                    while (i18 < length) {
                        java.lang.Object obj = jSONArray.get(i18);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
                        org.json.JSONObject jSONObject = (org.json.JSONObject) obj;
                        java.lang.String string = jSONObject.getString(str5);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                        java.lang.String str8 = str5;
                        java.lang.String string2 = jSONObject.getString("aesKey");
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
                        int i19 = length;
                        java.lang.String string3 = jSONObject.getString(com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26667x4be17176.f56084x2da4207);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string3, "getString(...)");
                        str3 = str6;
                        try {
                            java.lang.String string4 = jSONObject.getString("md5");
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string4, "getString(...)");
                            java.lang.String str9 = str7;
                            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.s5 s5Var = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.t5.f225314d;
                            java.lang.String string5 = jSONObject.getString("fileType");
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string5, "getString(...)");
                            arrayList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.v5(string, string2, string3, string4, s5Var.a(string5)));
                            i18++;
                            str5 = str8;
                            length = i19;
                            str6 = str3;
                            str7 = str9;
                        } catch (java.lang.Exception e17) {
                            e = e17;
                            str2 = str3;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str2, e.getMessage() + ": " + jz5.a.b(e));
                            this.f224975e.a();
                        }
                    }
                    str3 = str6;
                    str4 = str7;
                    A(arrayList);
                    i17 = 0;
                } catch (java.lang.Exception e18) {
                    e = e18;
                    str3 = str6;
                    str2 = str3;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str2, e.getMessage() + ": " + jz5.a.b(e));
                    this.f224975e.a();
                }
            } else {
                str3 = "MicroMsg.LiteAppJsApiSaveFile";
                str4 = "fileList";
                i17 = 0;
            }
            if (jSONArray.getJSONObject(i17).has(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56316x2db2ba1)) {
                java.util.ArrayList<com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.u5> arrayList2 = new java.util.ArrayList(jSONArray.length());
                int length2 = jSONArray.length();
                for (int i27 = 0; i27 < length2; i27++) {
                    java.lang.Object obj2 = jSONArray.get(i27);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj2, "get(...)");
                    org.json.JSONObject jSONObject2 = (org.json.JSONObject) obj2;
                    java.lang.String string6 = jSONObject2.getString(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56316x2db2ba1);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string6, "getString(...)");
                    java.lang.String string7 = jSONObject2.getString(com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26667x4be17176.f56084x2da4207);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string7, "getString(...)");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.s5 s5Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.t5.f225314d;
                    java.lang.String string8 = jSONObject2.getString("fileType");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string8, "getString(...)");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.u5 u5Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.u5(string6, string7, s5Var2.a(string8));
                    if (r26.i0.A(u5Var.f225332a, "liteappLocalId://", false, 2, null)) {
                        java.lang.String m65346x5462dac5 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65346x5462dac5(this.f224975e.f380557a, str, u5Var.f225332a);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m65346x5462dac5, "getPathByLiteAppLocalId(...)");
                        u5Var.f225332a = m65346x5462dac5;
                    }
                    arrayList2.add(u5Var);
                }
                for (com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.u5 u5Var2 : arrayList2) {
                    B(u5Var2.f225332a, u5Var2.f225334c, u5Var2.f225333b);
                }
                java.util.ArrayList arrayList3 = new java.util.ArrayList(jSONArray.length());
                int length3 = jSONArray.length();
                for (int i28 = 0; i28 < length3; i28++) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONArray.get(i28), "get(...)");
                    arrayList3.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.r5(e40.a0.f329141n, null, null, null, 14, null));
                }
                org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                org.json.JSONArray jSONArray2 = new org.json.JSONArray();
                java.util.Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    jSONArray2.put(((com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.r5) it.next()).a());
                }
                jSONObject3.put(str4, jSONArray2);
                jSONObject3.put("complete", true);
                str2 = str3;
                try {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "callbackResponse = " + jSONObject3);
                    this.f224975e.f(jSONObject3, false);
                } catch (java.lang.Exception e19) {
                    e = e19;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str2, e.getMessage() + ": " + jz5.a.b(e));
                    this.f224975e.a();
                }
            }
        } catch (java.lang.Exception e27) {
            e = e27;
            str2 = "MicroMsg.LiteAppJsApiSaveFile";
        }
    }
}
