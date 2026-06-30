package com.tencent.mm.feature.lite;

/* loaded from: classes15.dex */
public class k implements com.tencent.mm.plugin.lite.api.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.liteapp.gen.LiteAppReporter f67203a;

    public k(com.tencent.mm.feature.lite.i iVar, com.tencent.liteapp.gen.LiteAppReporter liteAppReporter) {
        this.f67203a = liteAppReporter;
    }

    @Override // com.tencent.mm.plugin.lite.api.h
    public void fail(java.lang.String str, int i17) {
        this.f67203a.logStart(com.tencent.liteapp.gen.StartAction.ASYNC_CHECK_PACKAGE_UPDATE_FAILED, i17);
    }

    @Override // com.tencent.mm.plugin.lite.api.h
    public void success(com.tencent.liteapp.storage.WxaLiteAppInfo wxaLiteAppInfo, int i17) {
        if (wxaLiteAppInfo != null) {
            this.f67203a.logStart(com.tencent.liteapp.gen.StartAction.ASYNC_CHECK_PACKAGE_UPDATE_SUCCESS, wxaLiteAppInfo.iLinkVersion);
        }
    }
}
