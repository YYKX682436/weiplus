package com.tencent.mm.plugin.appbrand.jsapi.profile;

/* loaded from: classes7.dex */
public final class d0 implements ab0.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.profile.e0 f82791a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f82792b;

    public d0(com.tencent.mm.plugin.appbrand.jsapi.profile.e0 e0Var, com.tencent.mm.ui.widget.dialog.u3 u3Var) {
        this.f82791a = e0Var;
        this.f82792b = u3Var;
    }

    @Override // ab0.f0
    public final void onResult(boolean z17, java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.appbrand.jsapi.profile.JumpToProfileResult jumpToProfileResult;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.OpenWeComUserProfile", "handleRequest, isSucceed: " + z17 + ", errMsg: " + str);
        if (z17) {
            jumpToProfileResult = new com.tencent.mm.plugin.appbrand.jsapi.profile.JumpToProfileResult(com.tencent.mm.plugin.appbrand.jsapi.profile.b0.f82775f, "");
        } else {
            if (str == null) {
                str = "";
            }
            jumpToProfileResult = new com.tencent.mm.plugin.appbrand.jsapi.profile.JumpToProfileResult(com.tencent.mm.plugin.appbrand.jsapi.profile.b0.f82778i, str);
        }
        this.f82791a.finishProcess(jumpToProfileResult);
        this.f82792b.dismiss();
    }
}
