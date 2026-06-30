package com.p314xaae8f345.mm.p1006xc5476f33.p1772x193c2b20;

/* renamed from: com.tencent.mm.plugin.gwallet.GWalletQueryProvider */
/* loaded from: classes15.dex */
public class C16082xfb3f4f99 extends android.content.ContentProvider {

    /* renamed from: m, reason: collision with root package name */
    public static final java.lang.String[] f223771m = {"_id", "product_id", "full_price", "product_state", "price_currency", "price_amount"};

    /* renamed from: d, reason: collision with root package name */
    public b73.i f223772d = null;

    /* renamed from: e, reason: collision with root package name */
    public boolean f223773e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f223774f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.ArrayList f223775g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.ArrayList f223776h;

    /* renamed from: i, reason: collision with root package name */
    public int f223777i;

    @Override // android.content.ContentProvider
    public int delete(android.net.Uri uri, java.lang.String str, java.lang.String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public java.lang.String getType(android.net.Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public android.net.Uri insert(android.net.Uri uri, android.content.ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public android.database.Cursor query(android.net.Uri uri, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2) {
        int i17;
        java.lang.String string;
        java.lang.String string2;
        java.lang.String string3;
        java.lang.String string4;
        java.lang.Object[] objArr;
        int i18;
        synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p1772x193c2b20.C16082xfb3f4f99.class) {
            if (strArr2 != null) {
                if (strArr2.length != 0) {
                    this.f223772d = new b73.i(getContext());
                    this.f223773e = true;
                    this.f223774f = false;
                    this.f223776h = new java.util.ArrayList();
                    for (java.lang.String str3 : strArr2) {
                        this.f223776h.add(str3);
                    }
                    this.f223772d.h(new a73.b(this));
                    long j17 = 0;
                    while (j17 <= 30000 && this.f223773e && !this.f223774f) {
                        try {
                            java.lang.Thread.sleep(100L);
                            j17 += 100;
                        } catch (java.lang.InterruptedException e17) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GWalletQueryProvider", e17.toString());
                        }
                    }
                    if (!this.f223773e) {
                        android.database.MatrixCursor matrixCursor = new android.database.MatrixCursor(f223771m);
                        java.util.Iterator it = this.f223776h.iterator();
                        while (it.hasNext()) {
                            matrixCursor.addRow(new java.lang.Object[]{0, (java.lang.String) it.next(), "", 10234, "", ""});
                        }
                        return matrixCursor;
                    }
                    if (j17 > 30000) {
                        android.database.MatrixCursor matrixCursor2 = new android.database.MatrixCursor(f223771m);
                        java.util.Iterator it6 = this.f223776h.iterator();
                        while (it6.hasNext()) {
                            matrixCursor2.addRow(new java.lang.Object[]{0, (java.lang.String) it6.next(), "", 10235, "", ""});
                        }
                        return matrixCursor2;
                    }
                    android.database.MatrixCursor matrixCursor3 = new android.database.MatrixCursor(f223771m);
                    if (this.f223777i == 0) {
                        java.util.ArrayList arrayList = this.f223775g;
                        if (arrayList != null) {
                            java.util.Iterator it7 = arrayList.iterator();
                            i17 = 0;
                            while (it7.hasNext()) {
                                java.lang.String str4 = (java.lang.String) it7.next();
                                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4)) {
                                    try {
                                        org.json.JSONObject jSONObject = new org.json.JSONObject(str4);
                                        string = jSONObject.getString("productId");
                                        string2 = jSONObject.getString(ya.b.f77496x48db929);
                                        string3 = jSONObject.getString("price_currency_code");
                                        string4 = jSONObject.getString("price_amount_micros");
                                        objArr = new java.lang.Object[6];
                                        i18 = i17 + 1;
                                    } catch (org.json.JSONException e18) {
                                        e = e18;
                                    }
                                    try {
                                        objArr[0] = java.lang.Integer.valueOf(i17);
                                        objArr[1] = string;
                                        objArr[2] = string2;
                                        objArr[3] = 10232;
                                        objArr[4] = string3;
                                        objArr[5] = string4;
                                        matrixCursor3.addRow(objArr);
                                        this.f223776h.remove(string);
                                        i17 = i18;
                                    } catch (org.json.JSONException e19) {
                                        e = e19;
                                        i17 = i18;
                                        e.toString();
                                    }
                                }
                            }
                        } else {
                            i17 = 0;
                        }
                        java.util.Iterator it8 = this.f223776h.iterator();
                        while (it8.hasNext()) {
                            matrixCursor3.addRow(new java.lang.Object[]{java.lang.Integer.valueOf(i17), (java.lang.String) it8.next(), "", 10233, "", ""});
                            i17++;
                        }
                    } else {
                        java.util.Iterator it9 = this.f223776h.iterator();
                        while (it9.hasNext()) {
                            matrixCursor3.addRow(new java.lang.Object[]{0, (java.lang.String) it9.next(), "", 10236, "", ""});
                        }
                    }
                    return matrixCursor3;
                }
            }
            throw new java.lang.IllegalArgumentException("no product id selected or size is 0");
        }
    }

    @Override // android.content.ContentProvider
    public int update(android.net.Uri uri, android.content.ContentValues contentValues, java.lang.String str, java.lang.String[] strArr) {
        return 0;
    }
}
