package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class ze implements com.tencent.mm.sdk.platformtools.s3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.RegByMobileRegAIOUI f74364a;

    public ze(com.tencent.mm.plugin.account.ui.RegByMobileRegAIOUI regByMobileRegAIOUI) {
        this.f74364a = regByMobileRegAIOUI;
    }

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x005f: IF  (r3 I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) == (0 ??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:28:?, block:B:27:0x005f */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0066: IF  (r3 I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) == (0 ??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:32:0x006b, block:B:30:0x0066 */
    @Override // com.tencent.mm.sdk.platformtools.s3
    public boolean a() {
        java.net.HttpURLConnection httpURLConnection;
        java.net.HttpURLConnection httpURLConnection2;
        com.tencent.mm.plugin.account.ui.RegByMobileRegAIOUI regByMobileRegAIOUI = this.f74364a;
        java.io.InputStream inputStream = null;
        try {
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.RegByMobileRegAIOUI", e17, "get avatar from http failed!", new java.lang.Object[0]);
            if (httpURLConnection2 == null) {
                return true;
            }
        }
        try {
            try {
                httpURLConnection2 = (java.net.HttpURLConnection) new java.net.URL(regByMobileRegAIOUI.L).openConnection();
                try {
                    inputStream = httpURLConnection2.getInputStream();
                    regByMobileRegAIOUI.E = com.tencent.mm.sdk.platformtools.x.O(inputStream);
                    android.graphics.Bitmap bitmap = regByMobileRegAIOUI.E;
                    if (bitmap != null && !bitmap.isRecycled()) {
                        com.tencent.mm.sdk.platformtools.x.D0(regByMobileRegAIOUI.E, 100, android.graphics.Bitmap.CompressFormat.PNG, lp0.b.j() + "temp.avatar", false);
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

    @Override // com.tencent.mm.sdk.platformtools.s3
    public boolean b() {
        android.graphics.Bitmap bitmap;
        com.tencent.mm.plugin.account.ui.RegByMobileRegAIOUI regByMobileRegAIOUI = this.f74364a;
        if (!regByMobileRegAIOUI.f73582z && (bitmap = regByMobileRegAIOUI.E) != null && !bitmap.isRecycled()) {
            regByMobileRegAIOUI.A.setImageBitmap(regByMobileRegAIOUI.E);
            regByMobileRegAIOUI.B.setVisibility(8);
            regByMobileRegAIOUI.f73582z = true;
        }
        return true;
    }
}
