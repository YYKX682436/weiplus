package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes5.dex */
public class x2 implements k70.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f281730a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f281731b;

    public x2(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.y2 y2Var, java.lang.String str, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        this.f281730a = str;
        this.f281731b = f9Var;
    }

    @Override // k70.u
    public void a(android.graphics.Bitmap bitmap, byte[] bArr) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f281731b;
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = this.f281730a;
        java.lang.Object obj = "null";
        objArr[1] = bitmap == null ? "null" : java.lang.Integer.valueOf(bitmap.getByteCount());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.ChattingBizHalfScreenComponent", "downloadCoverImg callBack cover:%s, result:%s", objArr);
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.ChattingBizHalfScreenComponent", "downloadCoverImg result is not null");
        try {
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            bitmap.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            if (byteArray != null) {
                obj = java.lang.Integer.valueOf(byteArray.length);
            }
            objArr2[0] = obj;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.ChattingBizHalfScreenComponent", "downloadCoverImg bytes：%s", objArr2);
            if (byteArray == null || byteArray.length <= 0) {
                return;
            }
            java.lang.String B = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.B(f9Var, byteArray, false, android.graphics.Bitmap.CompressFormat.PNG, false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.ChattingBizHalfScreenComponent", "downloadCoverImg thumbData path:" + B);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(B)) {
                return;
            }
            ((kt.g) ((lt.n0) i95.n0.c(lt.n0.class))).Ai(java.lang.String.valueOf(f9Var.I0()), B);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ChattingUI.ChattingBizHalfScreenComponent", e17, "", new java.lang.Object[0]);
        }
    }
}
