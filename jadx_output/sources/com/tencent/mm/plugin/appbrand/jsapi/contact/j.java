package com.tencent.mm.plugin.appbrand.jsapi.contact;

/* loaded from: classes15.dex */
public class j extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 226;
    public static final java.lang.String NAME = "addPhoneContact";

    public static void C(com.tencent.mm.plugin.appbrand.jsapi.contact.j jVar, android.content.Intent intent, com.tencent.mm.plugin.appbrand.jsapi.contact.c cVar, android.app.Activity activity, com.tencent.mm.plugin.appbrand.jsapi.l lVar) {
        android.graphics.Bitmap createScaledBitmap;
        jVar.getClass();
        intent.setFlags(268435456);
        java.util.ArrayList<? extends android.os.Parcelable> arrayList = new java.util.ArrayList<>();
        com.tencent.mm.plugin.appbrand.jsapi.contact.b bVar = cVar.f80512a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String str = bVar.f80509a;
        boolean A0 = com.tencent.mm.sdk.platformtools.t8.A0(str);
        java.lang.String str2 = bVar.f80510b;
        java.lang.String str3 = bVar.f80511c;
        if (A0 || com.tencent.mm.sdk.platformtools.t8.A0(str2) || com.tencent.mm.sdk.platformtools.t8.A0(str3)) {
            if (str3.trim().length() > 0) {
                sb6.append(str3);
            }
            if (str2.trim().length() > 0) {
                sb6.append(str2);
            }
            if (str.trim().length() > 0) {
                sb6.append(str);
            }
        } else {
            if (str.trim().length() > 0) {
                sb6.append(str);
            }
            if (str2.trim().length() > 0) {
                sb6.append(" ");
                sb6.append(str2);
            }
            if (str3.trim().length() > 0) {
                sb6.append(" ");
                sb6.append(str3);
            }
        }
        java.lang.String sb7 = sb6.toString();
        if (com.tencent.mm.sdk.platformtools.t8.K0(sb7)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiAddPhoneContact", "no contact user name");
        } else {
            intent.putExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, sb7);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(cVar.f80513b)) {
            java.lang.String str4 = cVar.f80513b;
            android.content.ContentValues contentValues = new android.content.ContentValues();
            contentValues.put("mimetype", "vnd.android.cursor.item/nickname");
            contentValues.put("data1", str4);
            contentValues.put("data2", (java.lang.Integer) 1);
            arrayList.add(contentValues);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(cVar.f80524m)) {
            java.lang.String str5 = cVar.f80524m;
            android.content.ContentValues contentValues2 = new android.content.ContentValues();
            contentValues2.put("mimetype", "vnd.android.cursor.item/note");
            contentValues2.put("data1", str5);
            arrayList.add(contentValues2);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(cVar.f80526o) || !com.tencent.mm.sdk.platformtools.t8.K0(cVar.f80523l)) {
            android.content.ContentValues contentValues3 = new android.content.ContentValues();
            contentValues3.put("mimetype", "vnd.android.cursor.item/organization");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(cVar.f80526o)) {
                contentValues3.put("data1", cVar.f80526o);
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(cVar.f80523l)) {
                contentValues3.put("data4", cVar.f80523l);
            }
            contentValues3.put("data2", (java.lang.Integer) 1);
            arrayList.add(contentValues3);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(cVar.f80525n)) {
            java.lang.String str6 = cVar.f80525n;
            android.content.ContentValues contentValues4 = new android.content.ContentValues();
            contentValues4.put("mimetype", "vnd.android.cursor.item/website");
            contentValues4.put("data1", str6);
            contentValues4.put("data2", (java.lang.Integer) 1);
            arrayList.add(contentValues4);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(cVar.f80522k)) {
            intent.putExtra(com.google.android.gms.common.Scopes.EMAIL, cVar.f80522k);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(cVar.f80518g)) {
            jVar.E(arrayList, cVar.f80518g, 2);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(cVar.f80519h)) {
            jVar.E(arrayList, cVar.f80519h, 1);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(cVar.f80521j)) {
            jVar.E(arrayList, cVar.f80521j, 3);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(cVar.f80520i)) {
            jVar.E(arrayList, cVar.f80520i, 10);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(cVar.f80528q)) {
            jVar.E(arrayList, cVar.f80528q, 5);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(cVar.f80527p)) {
            jVar.E(arrayList, cVar.f80527p, 4);
        }
        jVar.D(arrayList, cVar.f80517f, 3);
        jVar.D(arrayList, cVar.f80516e, 2);
        jVar.D(arrayList, cVar.f80515d, 1);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(cVar.f80529r)) {
            java.lang.String str7 = cVar.f80529r;
            java.lang.String string = activity.getString(com.tencent.mm.R.string.l89);
            android.content.ContentValues contentValues5 = new android.content.ContentValues();
            contentValues5.put("mimetype", "vnd.android.cursor.item/im");
            contentValues5.put("data1", str7);
            contentValues5.put("data5", (java.lang.Integer) (-1));
            contentValues5.put("data6", string);
            arrayList.add(contentValues5);
        }
        com.tencent.mm.vfs.r6 absoluteFile = lVar.getFileSystem().getAbsoluteFile(cVar.f80514c);
        if (absoluteFile != null && absoluteFile.m()) {
            try {
                android.graphics.Bitmap c17 = com.tencent.mm.graphics.e.c(absoluteFile.o());
                if (c17 != null) {
                    if (c17.getByteCount() > 819200) {
                        while (true) {
                            createScaledBitmap = android.graphics.Bitmap.createScaledBitmap(c17, c17.getWidth() / 2, c17.getHeight() / 2, false);
                            try {
                                c17.recycle();
                            } catch (java.lang.Throwable unused) {
                            }
                            if (createScaledBitmap == null || createScaledBitmap.getByteCount() <= 819200) {
                                break;
                            } else {
                                c17 = createScaledBitmap;
                            }
                        }
                        c17 = createScaledBitmap;
                    }
                    if (c17 != null) {
                        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                        c17.compress(android.graphics.Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        android.content.ContentValues contentValues6 = new android.content.ContentValues();
                        contentValues6.put("mimetype", "vnd.android.cursor.item/photo");
                        contentValues6.put("data15", byteArray);
                        arrayList.add(contentValues6);
                        try {
                            byteArrayOutputStream.close();
                        } catch (java.lang.Throwable th6) {
                            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.JsApiAddPhoneContact", th6, "processContactIntent, close avatar stream", new java.lang.Object[0]);
                        }
                        try {
                            c17.recycle();
                        } catch (java.lang.Throwable unused2) {
                        }
                    }
                }
            } catch (java.lang.OutOfMemoryError unused3) {
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiAddPhoneContact", "processContactIntent, put avatar bitmap oom, file=%s", absoluteFile);
            }
        }
        intent.putParcelableArrayListExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, arrayList);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        if (jSONObject == null) {
            lVar.a(i17, o("fail:data is null"));
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiAddPhoneContact", "data is null");
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(jSONObject.optString("firstName"))) {
            lVar.a(i17, o("fail:firstName is null"));
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiAddPhoneContact", "firstName is null");
            return;
        }
        android.content.Context context = lVar.getContext();
        if (context == null || !(context instanceof android.app.Activity)) {
            lVar.a(i17, o("fail"));
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiAddPhoneContact", "activity is null, invoke fail!");
            return;
        }
        com.tencent.mm.plugin.appbrand.jsapi.contact.c cVar = new com.tencent.mm.plugin.appbrand.jsapi.contact.c();
        cVar.f80514c = jSONObject.optString("photoFilePath");
        cVar.f80513b = jSONObject.optString("nickName");
        cVar.f80512a = new com.tencent.mm.plugin.appbrand.jsapi.contact.b(jSONObject.optString("firstName"), jSONObject.optString("middleName"), jSONObject.optString("lastName"));
        cVar.f80524m = jSONObject.optString("remark");
        cVar.f80518g = jSONObject.optString("mobilePhoneNumber");
        cVar.f80529r = jSONObject.optString("weChatNumber");
        cVar.f80517f = F(jSONObject, "address");
        cVar.f80526o = jSONObject.optString("organization");
        cVar.f80523l = jSONObject.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        cVar.f80527p = jSONObject.optString("workFaxNumber");
        cVar.f80521j = jSONObject.optString("workPhoneNumber");
        cVar.f80520i = jSONObject.optString("hostNumber");
        cVar.f80522k = jSONObject.optString(com.google.android.gms.common.Scopes.EMAIL);
        cVar.f80525n = jSONObject.optString("url");
        cVar.f80516e = F(jSONObject, "workAddress");
        cVar.f80528q = jSONObject.optString("homeFaxNumber");
        cVar.f80519h = jSONObject.optString("homePhoneNumber");
        cVar.f80515d = F(jSONObject, "homeAddress");
        lVar.m(new com.tencent.mm.plugin.appbrand.jsapi.contact.d(this, context, cVar, lVar, i17));
    }

    public final void D(java.util.ArrayList arrayList, com.tencent.mm.plugin.appbrand.jsapi.contact.a aVar, int i17) {
        if (aVar == null || aVar.a().length() <= 0) {
            return;
        }
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("mimetype", "vnd.android.cursor.item/postal-address_v2");
        contentValues.put("data1", aVar.a());
        contentValues.put("data9", aVar.f80503e);
        contentValues.put("data2", java.lang.Integer.valueOf(i17));
        arrayList.add(contentValues);
    }

    public final void E(java.util.ArrayList arrayList, java.lang.String str, int i17) {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("mimetype", "vnd.android.cursor.item/phone_v2");
        contentValues.put("data1", str);
        contentValues.put("data2", java.lang.Integer.valueOf(i17));
        arrayList.add(contentValues);
    }

    public final com.tencent.mm.plugin.appbrand.jsapi.contact.a F(org.json.JSONObject jSONObject, java.lang.String str) {
        return new com.tencent.mm.plugin.appbrand.jsapi.contact.a(jSONObject.optString(str + "Country"), jSONObject.optString(str + "State"), jSONObject.optString(str + "City"), jSONObject.optString(str + "Street"), jSONObject.optString(str + "PostalCode"));
    }
}
