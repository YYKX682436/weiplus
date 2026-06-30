package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* loaded from: classes14.dex */
public class ze implements com.p314xaae8f345.mm.sdk.p2603x2137b148.s3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11461x47892174 f155897a;

    public ze(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11461x47892174 activityC11461x47892174) {
        this.f155897a = activityC11461x47892174;
    }

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x005f: IF  (r3 I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) == (0 ??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:28:?, block:B:27:0x005f */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0066: IF  (r3 I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) == (0 ??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:32:0x006b, block:B:30:0x0066 */
    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.s3
    public boolean a() {
        java.net.HttpURLConnection httpURLConnection;
        java.net.HttpURLConnection httpURLConnection2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11461x47892174 activityC11461x47892174 = this.f155897a;
        java.io.InputStream inputStream = null;
        try {
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.RegByMobileRegAIOUI", e17, "get avatar from http failed!", new java.lang.Object[0]);
            if (httpURLConnection2 == null) {
                return true;
            }
        }
        try {
            try {
                httpURLConnection2 = (java.net.HttpURLConnection) new java.net.URL(activityC11461x47892174.L).openConnection();
                try {
                    inputStream = httpURLConnection2.getInputStream();
                    activityC11461x47892174.E = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.O(inputStream);
                    android.graphics.Bitmap bitmap = activityC11461x47892174.E;
                    if (bitmap != null && !bitmap.isRecycled()) {
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(activityC11461x47892174.E, 100, android.graphics.Bitmap.CompressFormat.PNG, lp0.b.j() + "temp.avatar", false);
                    }
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    httpURLConnection2.disconnect();
                    return true;
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    throw th;
                }
            } catch (java.lang.Throwable th7) {
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                throw th7;
            }
        } catch (java.lang.Throwable th8) {
            th = th8;
        }
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.s3
    public boolean b() {
        android.graphics.Bitmap bitmap;
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11461x47892174 activityC11461x47892174 = this.f155897a;
        if (!activityC11461x47892174.f155115z && (bitmap = activityC11461x47892174.E) != null && !bitmap.isRecycled()) {
            activityC11461x47892174.A.setImageBitmap(activityC11461x47892174.E);
            activityC11461x47892174.B.setVisibility(8);
            activityC11461x47892174.f155115z = true;
        }
        return true;
    }
}
