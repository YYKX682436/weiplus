package com.tencent.mm.plugin.appbrand.jsapi.share;

/* loaded from: classes7.dex */
public final class h2 implements com.tencent.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f83155d;

    public h2(yz5.l lVar) {
        this.f83155d = lVar;
    }

    @Override // com.tencent.mm.ui.xc
    public final void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 != com.tencent.mm.plugin.appbrand.jsapi.share.i2.f83162a) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.ShareGifToConversationLogic", "doShare, requestCode: " + i17 + " is not match");
            return;
        }
        yz5.l lVar = this.f83155d;
        if (i18 == -1) {
            lVar.invoke(com.tencent.mm.plugin.appbrand.jsapi.share.t2.f83249f);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.ShareGifToConversationLogic", "doShare, resultCode is not RESULT_OK: " + i18);
        lVar.invoke(com.tencent.mm.plugin.appbrand.jsapi.share.t2.f83250g);
    }
}
