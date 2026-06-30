package com.tencent.mm.plugin.brandservice.ui.timeline;

/* loaded from: classes9.dex */
public final class m3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineSettingUI f94163d;

    public m3(com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineSettingUI bizTimeLineSettingUI) {
        this.f94163d = bizTimeLineSettingUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineSettingUI bizTimeLineSettingUI = this.f94163d;
        if (!bizTimeLineSettingUI.f94093n || bizTimeLineSettingUI.isFinishing()) {
            return;
        }
        com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineSettingUI.V6(bizTimeLineSettingUI);
    }
}
