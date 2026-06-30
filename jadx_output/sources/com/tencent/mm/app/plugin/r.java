package com.tencent.mm.app.plugin;

/* loaded from: classes9.dex */
public class r implements q80.f0 {
    public r(com.tencent.mm.app.plugin.s sVar) {
    }

    @Override // q80.f0
    public void fail() {
        com.tencent.mars.xlog.Log.e("MicroMsg.URISpanHandler", "startLiteApp failed");
    }

    @Override // q80.f0
    public void success() {
        com.tencent.mars.xlog.Log.i("MicroMsg.URISpanHandler", "startLiteApp success");
    }
}
