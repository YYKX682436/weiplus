package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class f6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.LoginIndepPass f73843d;

    public f6(com.tencent.mm.plugin.account.ui.LoginIndepPass loginIndepPass) {
        this.f73843d = loginIndepPass;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/ui/LoginIndepPass$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        com.tencent.mm.plugin.account.ui.LoginIndepPass loginIndepPass = this.f73843d;
        sb6.append(loginIndepPass.getString(com.tencent.mm.R.string.hxd));
        sb6.append(loginIndepPass.f73357i);
        db5.e1.u(loginIndepPass, sb6.toString(), loginIndepPass.getString(com.tencent.mm.R.string.hxe), new com.tencent.mm.plugin.account.ui.d6(this), new com.tencent.mm.plugin.account.ui.e6(this));
        yj0.a.h(this, "com/tencent/mm/plugin/account/ui/LoginIndepPass$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
