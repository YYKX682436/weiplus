package com.tencent.mm.plugin.account.ui;

/* loaded from: classes11.dex */
public class yh extends v61.r0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.ShareToFacebookRedirectUI f74349d;

    public yh(com.tencent.mm.plugin.account.ui.ShareToFacebookRedirectUI shareToFacebookRedirectUI) {
        this.f74349d = shareToFacebookRedirectUI;
    }

    @Override // v61.r0, v61.p0
    public void a(int i17, java.lang.String str) {
        int i18 = com.tencent.mm.plugin.account.ui.ShareToFacebookRedirectUI.f73653m;
        com.tencent.mars.xlog.Log.e("MicroMsg.ShareToFacebookRedirectUI", "refresh token error. errType:%d, errMsg:%s", java.lang.Integer.valueOf(i17), str);
        super.a(i17, str);
        if (i17 == 3) {
            com.tencent.mm.plugin.account.ui.ShareToFacebookRedirectUI shareToFacebookRedirectUI = this.f74349d;
            shareToFacebookRedirectUI.getClass();
            com.tencent.mars.xlog.Log.e("MicroMsg.ShareToFacebookRedirectUI", "dealWithRefreshTokenFail");
            java.lang.String string = shareToFacebookRedirectUI.getContext().getString(com.tencent.mm.R.string.f490573yv);
            db5.e1.u(shareToFacebookRedirectUI.getContext(), shareToFacebookRedirectUI.getContext().getString(com.tencent.mm.R.string.c8h), string, new com.tencent.mm.plugin.account.ui.bi(shareToFacebookRedirectUI), null);
        }
    }

    @Override // v61.r0, v61.p0
    public void b(android.os.Bundle bundle) {
        super.b(bundle);
    }
}
