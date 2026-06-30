package com.tencent.mm.plugin.cloudvoip.cloudvoice.service;

/* loaded from: classes13.dex */
public class x1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f96128d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0 f96129e;

    public x1(com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0 p0Var, java.lang.String str) {
        this.f96129e = p0Var;
        this.f96128d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.os.Bundle bundle = new android.os.Bundle();
        com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0 p0Var = this.f96129e;
        bundle.putString("appId", p0Var.f96028q);
        bundle.putString("roomId", "" + p0Var.Y);
        bundle.putString("record_path", this.f96128d);
        bundle.putString(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_EXTRA_DATA, p0Var.R1);
        android.os.Bundle bundle2 = (android.os.Bundle) com.tencent.mm.ipcinvoker.d0.f(com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0.f96009c2, bundle, com.tencent.mm.plugin.cloudvoip.cloudvoice.service.o2.class);
        if (bundle2 != null) {
            bundle2.getBoolean("result", false);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.OpenVoice.OpenVoiceService", "can not insert or update room record to mm");
        }
    }
}
