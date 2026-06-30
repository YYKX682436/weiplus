package com.tencent.mm.plugin.account.ui;

/* loaded from: classes.dex */
public final class v0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.ChooseLanguageUI f74260d;

    public v0(com.tencent.mm.plugin.account.ui.ChooseLanguageUI chooseLanguageUI) {
        this.f74260d = chooseLanguageUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/ui/ChooseLanguageUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.account.ui.ChooseLanguageUI chooseLanguageUI = this.f74260d;
        java.lang.Object value = ((jz5.n) chooseLanguageUI.f73267e).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        ((com.tencent.mm.ui.widget.button.WeButton) value).postDelayed(new com.tencent.mm.plugin.account.ui.u0(chooseLanguageUI), 200L);
        yj0.a.h(this, "com/tencent/mm/plugin/account/ui/ChooseLanguageUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
