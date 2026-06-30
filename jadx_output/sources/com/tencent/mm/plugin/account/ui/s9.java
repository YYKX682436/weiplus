package com.tencent.mm.plugin.account.ui;

/* loaded from: classes5.dex */
public final class s9 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.MMLoginVerifyPwdUI f74187d;

    public s9(com.tencent.mm.plugin.account.ui.MMLoginVerifyPwdUI mMLoginVerifyPwdUI) {
        this.f74187d = mMLoginVerifyPwdUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/ui/MMLoginVerifyPwdUI$getBottomContentView$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.account.ui.MMLoginVerifyPwdUI.Z6(this.f74187d);
        yj0.a.h(this, "com/tencent/mm/plugin/account/ui/MMLoginVerifyPwdUI$getBottomContentView$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
