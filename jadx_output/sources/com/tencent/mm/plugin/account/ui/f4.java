package com.tencent.mm.plugin.account.ui;

/* loaded from: classes.dex */
public class f4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.LoginFaceUI f73842d;

    public f4(com.tencent.mm.plugin.account.ui.LoginFaceUI loginFaceUI) {
        this.f73842d = loginFaceUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/ui/LoginFaceUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11557, 2);
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.plugin.account.ui.LoginFaceUI loginFaceUI = this.f73842d;
        intent.putExtra("k_user_name", loginFaceUI.C);
        intent.putExtra("k_purpose", 2);
        intent.putExtra("k_need_signature", true);
        j45.l.n(loginFaceUI.getContext(), "facedetect", ".ui.FaceDetectUI", intent, 1025);
        yj0.a.h(this, "com/tencent/mm/plugin/account/ui/LoginFaceUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
