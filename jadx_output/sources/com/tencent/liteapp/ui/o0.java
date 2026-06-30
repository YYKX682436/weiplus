package com.tencent.liteapp.ui;

/* loaded from: classes15.dex */
public class o0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.LiteAppCenter.PageInfo f46209d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.liteapp.ui.WxaLiteAppTransparentUI f46210e;

    public o0(com.tencent.liteapp.ui.WxaLiteAppTransparentUI wxaLiteAppTransparentUI, com.tencent.mm.plugin.lite.LiteAppCenter.PageInfo pageInfo) {
        this.f46210e = wxaLiteAppTransparentUI;
        this.f46209d = pageInfo;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.lite.LiteAppCenter.PageInfo pageInfo = this.f46209d;
        int i17 = pageInfo.flags;
        com.tencent.liteapp.ui.WxaLiteAppTransparentUI wxaLiteAppTransparentUI = this.f46210e;
        wxaLiteAppTransparentUI.setFlags(i17);
        wxaLiteAppTransparentUI.setPageOrientation(pageInfo.pageOrientation);
        if (pageInfo.appId.equals(wxaLiteAppTransparentUI.f46095w)) {
            return;
        }
        wxaLiteAppTransparentUI.S6(false, true);
    }
}
