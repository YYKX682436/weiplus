package com.tencent.mm.plugin.appbrand.jsapi.fakenative;

/* loaded from: classes7.dex */
public class n0 implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.fakenative.WxaOpenLiteAppBusinessViewTask f80984a;

    public n0(com.tencent.mm.plugin.appbrand.jsapi.fakenative.WxaOpenLiteAppBusinessViewTask wxaOpenLiteAppBusinessViewTask) {
        this.f80984a = wxaOpenLiteAppBusinessViewTask;
    }

    @Override // q80.f0
    public void fail() {
        com.tencent.mars.xlog.Log.e("MicroMsg.WxaOpenLiteAppBusinessViewTask", "start liteApp fail");
        com.tencent.mm.plugin.appbrand.jsapi.fakenative.WxaOpenLiteAppBusinessViewResult wxaOpenLiteAppBusinessViewResult = new com.tencent.mm.plugin.appbrand.jsapi.fakenative.WxaOpenLiteAppBusinessViewResult();
        wxaOpenLiteAppBusinessViewResult.f80918d = 10002;
        wxaOpenLiteAppBusinessViewResult.f80919e = "fail: start liteApp fail";
        this.f80984a.finishProcess(wxaOpenLiteAppBusinessViewResult);
    }

    @Override // q80.f0
    public void success() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WxaOpenLiteAppBusinessViewTask", "start liteApp success");
    }
}
