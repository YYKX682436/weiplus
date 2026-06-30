package com.tencent.mm.plugin.brandservice.ui.timeline;

/* loaded from: classes9.dex */
public final class b4 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineSettingUI f94107d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f94108e;

    public b4(com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineSettingUI bizTimeLineSettingUI, java.lang.String str) {
        this.f94107d = bizTimeLineSettingUI;
        this.f94108e = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        dialogInterface.dismiss();
        com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineSettingUI bizTimeLineSettingUI = this.f94107d;
        com.tencent.mm.ui.base.preference.CheckBoxPreference W6 = bizTimeLineSettingUI.W6();
        r45.x26 x26Var = bizTimeLineSettingUI.f94090h;
        W6.S(x26Var.f389700d);
        ((com.tencent.mm.ui.base.preference.CheckBoxPreference) ((jz5.n) bizTimeLineSettingUI.f94087e).getValue()).S(x26Var.f389704h == 1);
        ((com.tencent.mm.ui.base.preference.CheckBoxPreference) ((jz5.n) bizTimeLineSettingUI.f94088f).getValue()).S(x26Var.f389701e);
        bizTimeLineSettingUI.Y6(x26Var, this.f94108e);
        com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineSettingUI.V6(bizTimeLineSettingUI);
    }
}
