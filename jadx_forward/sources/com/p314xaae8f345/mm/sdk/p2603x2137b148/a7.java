package com.p314xaae8f345.mm.sdk.p2603x2137b148;

/* loaded from: classes12.dex */
public class a7 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.ContentResolver f273993a;

    /* renamed from: b, reason: collision with root package name */
    public final android.net.Uri f273994b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f273995c;

    public a7(android.content.ContentResolver contentResolver, android.net.Uri uri, java.lang.String str) {
        this.f273993a = contentResolver;
        this.f273994b = uri;
        this.f273995c = str;
    }

    public void a() {
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ScopedStorageUtil", "item should not be actively deleted");
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ScopedStorageUtil", "MediaStore delete fail: " + th6.getMessage());
        }
    }

    public java.io.OutputStream b() {
        try {
            return this.f273993a.openOutputStream(this.f273994b);
        } catch (java.io.FileNotFoundException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ScopedStorageUtil", "MediaStore getOutputStream fail: " + e17.getMessage());
            return null;
        }
    }

    public void c() {
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            try {
                android.content.ContentValues contentValues = new android.content.ContentValues();
                contentValues.put("is_pending", (java.lang.Integer) 0);
                this.f273993a.update(this.f273994b, contentValues, null);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ScopedStorageUtil", "MediaStore update uri pending failed: " + e17.getMessage());
            }
        }
    }
}
