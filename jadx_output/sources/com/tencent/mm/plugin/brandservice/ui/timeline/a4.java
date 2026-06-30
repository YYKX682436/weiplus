package com.tencent.mm.plugin.brandservice.ui.timeline;

/* loaded from: classes9.dex */
public final class a4 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineSettingUI f94101d;

    public a4(com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineSettingUI bizTimeLineSettingUI) {
        this.f94101d = bizTimeLineSettingUI;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        this.f94101d.finish();
    }
}
