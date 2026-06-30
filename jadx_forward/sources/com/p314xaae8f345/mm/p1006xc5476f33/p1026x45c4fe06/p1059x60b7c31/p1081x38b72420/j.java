package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420;

/* loaded from: classes15.dex */
public class j extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f34051x366c91de = 226;

    /* renamed from: NAME */
    public static final java.lang.String f34052x24728b = "addPhoneContact";

    public static void C(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420.j jVar, android.content.Intent intent, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420.c cVar, android.app.Activity activity, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar) {
        android.graphics.Bitmap createScaledBitmap;
        jVar.getClass();
        intent.setFlags(268435456);
        java.util.ArrayList<? extends android.os.Parcelable> arrayList = new java.util.ArrayList<>();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420.b bVar = cVar.f162045a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String str = bVar.f162042a;
        boolean A0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.A0(str);
        java.lang.String str2 = bVar.f162043b;
        java.lang.String str3 = bVar.f162044c;
        if (A0 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.A0(str2) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.A0(str3)) {
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
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(sb7)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiAddPhoneContact", "no contact user name");
        } else {
            intent.putExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, sb7);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(cVar.f162046b)) {
            java.lang.String str4 = cVar.f162046b;
            android.content.ContentValues contentValues = new android.content.ContentValues();
            contentValues.put("mimetype", "vnd.android.cursor.item/nickname");
            contentValues.put("data1", str4);
            contentValues.put("data2", (java.lang.Integer) 1);
            arrayList.add(contentValues);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(cVar.f162057m)) {
            java.lang.String str5 = cVar.f162057m;
            android.content.ContentValues contentValues2 = new android.content.ContentValues();
            contentValues2.put("mimetype", "vnd.android.cursor.item/note");
            contentValues2.put("data1", str5);
            arrayList.add(contentValues2);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(cVar.f162059o) || !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(cVar.f162056l)) {
            android.content.ContentValues contentValues3 = new android.content.ContentValues();
            contentValues3.put("mimetype", "vnd.android.cursor.item/organization");
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(cVar.f162059o)) {
                contentValues3.put("data1", cVar.f162059o);
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(cVar.f162056l)) {
                contentValues3.put("data4", cVar.f162056l);
            }
            contentValues3.put("data2", (java.lang.Integer) 1);
            arrayList.add(contentValues3);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(cVar.f162058n)) {
            java.lang.String str6 = cVar.f162058n;
            android.content.ContentValues contentValues4 = new android.content.ContentValues();
            contentValues4.put("mimetype", "vnd.android.cursor.item/website");
            contentValues4.put("data1", str6);
            contentValues4.put("data2", (java.lang.Integer) 1);
            arrayList.add(contentValues4);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(cVar.f162055k)) {
            intent.putExtra(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5852x3f0537c, cVar.f162055k);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(cVar.f162051g)) {
            jVar.E(arrayList, cVar.f162051g, 2);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(cVar.f162052h)) {
            jVar.E(arrayList, cVar.f162052h, 1);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(cVar.f162054j)) {
            jVar.E(arrayList, cVar.f162054j, 3);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(cVar.f162053i)) {
            jVar.E(arrayList, cVar.f162053i, 10);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(cVar.f162061q)) {
            jVar.E(arrayList, cVar.f162061q, 5);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(cVar.f162060p)) {
            jVar.E(arrayList, cVar.f162060p, 4);
        }
        jVar.D(arrayList, cVar.f162050f, 3);
        jVar.D(arrayList, cVar.f162049e, 2);
        jVar.D(arrayList, cVar.f162048d, 1);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(cVar.f162062r)) {
            java.lang.String str7 = cVar.f162062r;
            java.lang.String string = activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l89);
            android.content.ContentValues contentValues5 = new android.content.ContentValues();
            contentValues5.put("mimetype", "vnd.android.cursor.item/im");
            contentValues5.put("data1", str7);
            contentValues5.put("data5", (java.lang.Integer) (-1));
            contentValues5.put("data6", string);
            arrayList.add(contentValues5);
        }
        com.p314xaae8f345.mm.vfs.r6 mo49620x1d537609 = lVar.mo50354x59eafec1().mo49620x1d537609(cVar.f162047c);
        if (mo49620x1d537609 != null && mo49620x1d537609.m()) {
            try {
                android.graphics.Bitmap c17 = com.p314xaae8f345.mm.p786x600aa8b.e.c(mo49620x1d537609.o());
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
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.JsApiAddPhoneContact", th6, "processContactIntent, close avatar stream", new java.lang.Object[0]);
                        }
                        try {
                            c17.recycle();
                        } catch (java.lang.Throwable unused2) {
                        }
                    }
                }
            } catch (java.lang.OutOfMemoryError unused3) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiAddPhoneContact", "processContactIntent, put avatar bitmap oom, file=%s", mo49620x1d537609);
            }
        }
        intent.putParcelableArrayListExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, arrayList);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        if (jSONObject == null) {
            lVar.a(i17, o("fail:data is null"));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiAddPhoneContact", "data is null");
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(jSONObject.optString("firstName"))) {
            lVar.a(i17, o("fail:firstName is null"));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiAddPhoneContact", "firstName is null");
            return;
        }
        android.content.Context mo50352x76847179 = lVar.mo50352x76847179();
        if (mo50352x76847179 == null || !(mo50352x76847179 instanceof android.app.Activity)) {
            lVar.a(i17, o("fail"));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiAddPhoneContact", "activity is null, invoke fail!");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420.c cVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420.c();
        cVar.f162047c = jSONObject.optString("photoFilePath");
        cVar.f162046b = jSONObject.optString("nickName");
        cVar.f162045a = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420.b(jSONObject.optString("firstName"), jSONObject.optString("middleName"), jSONObject.optString("lastName"));
        cVar.f162057m = jSONObject.optString("remark");
        cVar.f162051g = jSONObject.optString("mobilePhoneNumber");
        cVar.f162062r = jSONObject.optString("weChatNumber");
        cVar.f162050f = F(jSONObject, "address");
        cVar.f162059o = jSONObject.optString("organization");
        cVar.f162056l = jSONObject.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
        cVar.f162060p = jSONObject.optString("workFaxNumber");
        cVar.f162054j = jSONObject.optString("workPhoneNumber");
        cVar.f162053i = jSONObject.optString("hostNumber");
        cVar.f162055k = jSONObject.optString(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5852x3f0537c);
        cVar.f162058n = jSONObject.optString("url");
        cVar.f162049e = F(jSONObject, "workAddress");
        cVar.f162061q = jSONObject.optString("homeFaxNumber");
        cVar.f162052h = jSONObject.optString("homePhoneNumber");
        cVar.f162048d = F(jSONObject, "homeAddress");
        lVar.m(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420.d(this, mo50352x76847179, cVar, lVar, i17));
    }

    public final void D(java.util.ArrayList arrayList, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420.a aVar, int i17) {
        if (aVar == null || aVar.a().length() <= 0) {
            return;
        }
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("mimetype", "vnd.android.cursor.item/postal-address_v2");
        contentValues.put("data1", aVar.a());
        contentValues.put("data9", aVar.f162036e);
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

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420.a F(org.json.JSONObject jSONObject, java.lang.String str) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420.a(jSONObject.optString(str + "Country"), jSONObject.optString(str + "State"), jSONObject.optString(str + "City"), jSONObject.optString(str + "Street"), jSONObject.optString(str + "PostalCode"));
    }
}
