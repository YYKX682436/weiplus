package com.tencent.mm.plugin.account.ui;

/* loaded from: classes.dex */
public class xi implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.VerifyPwdUI f74328d;

    public xi(com.tencent.mm.plugin.account.ui.VerifyPwdUI verifyPwdUI) {
        this.f74328d = verifyPwdUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/ui/VerifyPwdUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.account.ui.VerifyPwdUI verifyPwdUI = this.f74328d;
        verifyPwdUI.hideVKB();
        j45.l.h(verifyPwdUI, "setting", ".ui.setting.SettingsForgetPwdUI");
        yj0.a.h(this, "com/tencent/mm/plugin/account/ui/VerifyPwdUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
