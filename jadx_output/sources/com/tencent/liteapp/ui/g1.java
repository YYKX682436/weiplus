package com.tencent.liteapp.ui;

/* loaded from: classes15.dex */
public class g1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.LiteAppCenter.PageInfo f46159d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.liteapp.ui.WxaLiteAppUI f46160e;

    public g1(com.tencent.liteapp.ui.WxaLiteAppUI wxaLiteAppUI, com.tencent.mm.plugin.lite.LiteAppCenter.PageInfo pageInfo) {
        this.f46160e = wxaLiteAppUI;
        this.f46159d = pageInfo;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.lite.LiteAppCenter.PageInfo pageInfo = this.f46159d;
        int i17 = pageInfo.flags;
        com.tencent.liteapp.ui.WxaLiteAppUI wxaLiteAppUI = this.f46160e;
        wxaLiteAppUI.setFlags(i17);
        wxaLiteAppUI.setPageOrientation(pageInfo.pageOrientation);
        if (pageInfo.appId.equals(wxaLiteAppUI.f46114x)) {
            return;
        }
        wxaLiteAppUI.c7(false, true);
    }
}
