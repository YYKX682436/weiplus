package com.tencent.mm.plugin.account.ui;

/* loaded from: classes.dex */
public class ba implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMActivity f73746d;

    public ba(com.tencent.mm.plugin.account.ui.fa faVar, com.tencent.mm.ui.MMActivity mMActivity) {
        this.f73746d = mMActivity;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.app.y7 y7Var = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d;
        com.tencent.mm.ui.MMActivity mMActivity = this.f73746d;
        android.content.Intent b17 = y7Var.b(mMActivity);
        b17.addFlags(67108864);
        com.tencent.mm.ui.MMActivity mMActivity2 = this.f73746d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(b17);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(mMActivity2, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/MobileAutoLogin$3", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        mMActivity2.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(mMActivity2, "com/tencent/mm/plugin/account/ui/MobileAutoLogin$3", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        mMActivity.finish();
    }
}
