package com.tencent.mm.plugin.account.ui;

/* loaded from: classes12.dex */
public class oc implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f74093d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.MobileLoginOrForceReg f74094e;

    public oc(com.tencent.mm.plugin.account.ui.MobileLoginOrForceReg mobileLoginOrForceReg, java.lang.String str) {
        this.f74094e = mobileLoginOrForceReg;
        this.f74093d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.graphics.Bitmap bitmap;
        try {
            bitmap = com.tencent.mm.sdk.platformtools.x.O(com.tencent.mm.network.n.b(this.f74093d, 10000, com.tencent.thumbplayer.tmediacodec.codec.CodecError.START_ILLEGAL));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MobileLoginOrForceReg", "download avatar failed");
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MobileLoginOrForceReg", e17, "", new java.lang.Object[0]);
            bitmap = null;
        }
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f74094e.f73521x;
        n3Var.sendMessage(n3Var.obtainMessage(0, bitmap));
    }

    public java.lang.String toString() {
        return super.toString() + "|loadBitmap";
    }
}
