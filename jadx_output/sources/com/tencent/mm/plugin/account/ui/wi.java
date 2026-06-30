package com.tencent.mm.plugin.account.ui;

/* loaded from: classes5.dex */
public class wi implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.VerifyPwdUI f74308d;

    public wi(com.tencent.mm.plugin.account.ui.VerifyPwdUI verifyPwdUI) {
        this.f74308d = verifyPwdUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/ui/VerifyPwdUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.account.ui.VerifyPwdUI.f73675o;
        com.tencent.mm.plugin.account.ui.VerifyPwdUI verifyPwdUI = this.f74308d;
        verifyPwdUI.T6("");
        gm0.j1.d().g(new com.tencent.mm.modelsimple.l1(1, verifyPwdUI.f73679g.getText().toString(), "", "", "", false, verifyPwdUI.f73683n));
        verifyPwdUI.f73682m = db5.e1.Q(verifyPwdUI, verifyPwdUI.getString(com.tencent.mm.R.string.f490573yv), verifyPwdUI.getString(com.tencent.mm.R.string.f490552yb), true, false, null);
        yj0.a.h(this, "com/tencent/mm/plugin/account/ui/VerifyPwdUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
