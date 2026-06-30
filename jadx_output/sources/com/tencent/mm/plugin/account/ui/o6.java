package com.tencent.mm.plugin.account.ui;

/* loaded from: classes13.dex */
public class o6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean[] f74086d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.LoginPasswordUI f74087e;

    public o6(com.tencent.mm.plugin.account.ui.LoginPasswordUI loginPasswordUI, boolean[] zArr) {
        this.f74087e = loginPasswordUI;
        this.f74086d = zArr;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/ui/LoginPasswordUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.account.ui.LoginPasswordUI loginPasswordUI = this.f74087e;
        if (loginPasswordUI.f73327f.f73194x) {
            yj0.a.h(this, "com/tencent/mm/plugin/account/ui/LoginPasswordUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        boolean[] zArr = this.f74086d;
        if (zArr[0]) {
            zArr[0] = false;
        } else {
            loginPasswordUI.f73365l1 = fo3.l.a(2);
            fo3.s sVar = fo3.s.INSTANCE;
            sVar.qb("ce_login_id", "<LoginByID>", loginPasswordUI.f73365l1);
            sVar.H2("ce_login_id", android.view.MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 65535));
            sVar.Qa("ce_login_id");
        }
        loginPasswordUI.i7();
        loginPasswordUI.Z6();
        yj0.a.h(this, "com/tencent/mm/plugin/account/ui/LoginPasswordUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
