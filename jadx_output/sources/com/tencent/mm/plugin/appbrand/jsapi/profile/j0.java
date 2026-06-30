package com.tencent.mm.plugin.appbrand.jsapi.profile;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0014¨\u0006\b"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/profile/j0;", "Lcom/tencent/mm/plugin/appbrand/ipc/v;", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessRequest;", "request", "Ljz5/f0;", "handleRequest", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class j0 extends com.tencent.mm.plugin.appbrand.ipc.v {
    @Override // com.tencent.mm.plugin.appbrand.ipc.v
    public void handleRequest(com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest request) {
        kotlin.jvm.internal.o.g(request, "request");
        com.tencent.mm.plugin.appbrand.jsapi.profile.ProfileResult profileResult = new com.tencent.mm.plugin.appbrand.jsapi.profile.ProfileResult();
        if (!(request instanceof com.tencent.mm.plugin.appbrand.jsapi.profile.ProfileRequest)) {
            com.tencent.mars.xlog.Log.w("ProfileTask", "handleRequest, request not instance of ProfileRequest");
            profileResult.f82765d = 0;
            finishProcess(profileResult);
            return;
        }
        if (!gm0.j1.b().n()) {
            com.tencent.mars.xlog.Log.e("ProfileTask", "handleRequest, MMKernel.account().hasLogin() is false");
            profileResult.f82765d = 0;
            finishProcess(profileResult);
            return;
        }
        com.tencent.mm.plugin.appbrand.jsapi.profile.ProfileRequest profileRequest = (com.tencent.mm.plugin.appbrand.jsapi.profile.ProfileRequest) request;
        int i17 = profileRequest.getCom.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE java.lang.String();
        java.lang.String str = profileRequest.getDm.i4.COL_USERNAME java.lang.String();
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
        if (n17 == null || ((int) n17.E2) <= 0) {
            n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().g0(str);
        }
        if (n17 == null || ((int) n17.E2) <= 0) {
            com.tencent.mars.xlog.Log.i("ProfileTask", "handleRequest, request contact info");
            ((c01.k7) c01.n8.a()).b(str, 19, new com.tencent.mm.plugin.appbrand.jsapi.profile.h0(this, profileResult, db5.e1.Q(getActivityContext(), getActivityContext().getString(com.tencent.mm.R.string.f490573yv), getActivityContext().getString(com.tencent.mm.R.string.f490604zq), true, true, new com.tencent.mm.plugin.appbrand.jsapi.profile.i0(str, profileResult, this)), i17));
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_User", str);
        profileResult.f82767f = n17.d1();
        if (n17.k2()) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(10298, n17.d1() + ',' + i17);
            profileResult.f82766e = profileResult.f82766e | 1;
            intent.putExtra("Contact_Scene", i17);
        }
        if (n17.r2()) {
            profileResult.f82766e |= 2;
            com.tencent.mm.autogen.events.SetLocalQQMobileEvent setLocalQQMobileEvent = new com.tencent.mm.autogen.events.SetLocalQQMobileEvent();
            am.au auVar = setLocalQQMobileEvent.f54766g;
            auVar.f6187a = intent;
            auVar.f6188b = str;
            setLocalQQMobileEvent.e();
        }
        profileResult.f82765d = 1;
        finishProcess(profileResult);
    }
}
