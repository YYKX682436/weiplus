package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class ja implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f73954d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f73955e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ db5.h4 f73956f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.la f73957g;

    public ja(com.tencent.mm.plugin.account.ui.la laVar, com.tencent.mm.ui.widget.dialog.k0 k0Var, java.util.List list, db5.h4 h4Var) {
        this.f73957g = laVar;
        this.f73954d = k0Var;
        this.f73955e = list;
        this.f73956f = h4Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/ui/MobileInputLoginLogic$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.account.ui.la laVar = this.f73957g;
        laVar.f74008d.hideVKB();
        this.f73954d.v();
        if (this.f73955e.contains(this.f73956f)) {
            com.tencent.mm.autogen.mmdata.rpt.ThirdAppRegisterStruct thirdAppRegisterStruct = laVar.f74009e;
            thirdAppRegisterStruct.f61234d = 1L;
            thirdAppRegisterStruct.f61235e = 9L;
            thirdAppRegisterStruct.k();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/account/ui/MobileInputLoginLogic$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
