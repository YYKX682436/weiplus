package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31;

/* loaded from: classes5.dex */
public class y0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f221309d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f221310e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f221311f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f221312g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f221313h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ sd.b f221314i;

    public y0(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.a1 a1Var, android.graphics.Bitmap bitmap, int i17, boolean z17, java.lang.String str, org.json.JSONObject jSONObject, sd.b bVar) {
        this.f221309d = bitmap;
        this.f221310e = i17;
        this.f221311f = z17;
        this.f221312g = str;
        this.f221313h = jSONObject;
        this.f221314i = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        sd.b bVar = this.f221314i;
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        android.graphics.Bitmap.CompressFormat compressFormat = android.graphics.Bitmap.CompressFormat.JPEG;
        android.graphics.Bitmap bitmap = this.f221309d;
        int i17 = this.f221310e;
        bitmap.compress(compressFormat, i17, byteArrayOutputStream);
        java.lang.String str = "data:image/jpg;base64," + android.util.Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
        boolean z17 = this.f221311f;
        org.json.JSONObject jSONObject = this.f221313h;
        if (!z17) {
            java.lang.String str2 = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.x3.g("bundle", null) + this.f221312g;
            try {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(bitmap, i17, android.graphics.Bitmap.CompressFormat.JPEG, str2, true);
                com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d c10756x2a5d7b2d = (com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d) com.p314xaae8f345.mm.p794xb0fa9b5e.d0.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d(str2), com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.z0.class);
                jSONObject.put(dm.i4.f66867x2a5c95c7, c10756x2a5d7b2d != null ? c10756x2a5d7b2d.f149939d : "");
            } catch (java.io.IOException | org.json.JSONException unused) {
            }
        }
        if (!bitmap.isRecycled()) {
            bitmap.recycle();
        }
        try {
            bVar.e(jSONObject.put("imgData", str));
        } catch (org.json.JSONException unused2) {
            bVar.c("fail", null);
        }
    }
}
