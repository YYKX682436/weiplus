package com.tencent.mm.plugin.appbrand.jsapi.channels;

/* loaded from: classes7.dex */
public final class b1 implements zy2.i5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.channels.d1 f80228a;

    public b1(com.tencent.mm.plugin.appbrand.jsapi.channels.d1 d1Var) {
        this.f80228a = d1Var;
    }

    @Override // zy2.i5
    public final void a(java.lang.Object obj) {
        r45.j33 j33Var = obj instanceof r45.j33 ? (r45.j33) obj : null;
        int i17 = j33Var != null ? 0 : -1;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiOpenChannelsRewardedVideoAd", "succCallback#handleRequest#OpenChannelsRewardedVideoAdTask, errCode: " + i17);
        this.f80228a.finishProcess(new com.tencent.mm.plugin.appbrand.jsapi.channels.OpenChannelsRewardedVideoAdResult(i17, j33Var));
    }
}
