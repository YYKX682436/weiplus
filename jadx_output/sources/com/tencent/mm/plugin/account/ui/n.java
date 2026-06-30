package com.tencent.mm.plugin.account.ui;

/* loaded from: classes.dex */
public class n implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.BaseLoginVoiceUI f74050d;

    public n(com.tencent.mm.plugin.account.ui.BaseLoginVoiceUI baseLoginVoiceUI) {
        this.f74050d = baseLoginVoiceUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/ui/BaseLoginVoiceUI$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.account.ui.BaseLoginVoiceUI baseLoginVoiceUI = this.f74050d;
        j45.l.h(baseLoginVoiceUI, "login_exdevice", ".ui.LoginAsExDeviceUI");
        baseLoginVoiceUI.overridePendingTransition(com.tencent.mm.R.anim.f477810c4, com.tencent.mm.R.anim.f477728p);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.J(1570L, 4L);
        yj0.a.h(this, "com/tencent/mm/plugin/account/ui/BaseLoginVoiceUI$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
