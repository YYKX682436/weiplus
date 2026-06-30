package com.tencent.mm.plugin.account.ui;

/* loaded from: classes13.dex */
public class u7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean[] f74242d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.LoginUI f74243e;

    public u7(com.tencent.mm.plugin.account.ui.LoginUI loginUI, boolean[] zArr) {
        this.f74243e = loginUI;
        this.f74242d = zArr;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/ui/LoginUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.account.ui.LoginUI loginUI = this.f74243e;
        if (loginUI.f73415s.f73194x) {
            yj0.a.h(this, "com/tencent/mm/plugin/account/ui/LoginUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        boolean[] zArr = this.f74242d;
        if (zArr[0]) {
            zArr[0] = false;
        } else {
            loginUI.H = fo3.l.a(2);
            fo3.s sVar = fo3.s.INSTANCE;
            sVar.qb("ce_login_id", "<LoginByID>", loginUI.H);
            sVar.H2("ce_login_id", android.view.MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 65535));
            sVar.Qa("ce_login_id");
        }
        loginUI.V6();
        yj0.a.h(this, "com/tencent/mm/plugin/account/ui/LoginUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
