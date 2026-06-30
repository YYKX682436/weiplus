package com.tencent.mm.plugin.account.ui;

/* loaded from: classes.dex */
public class m implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.BaseLoginVoiceUI f74023d;

    public m(com.tencent.mm.plugin.account.ui.BaseLoginVoiceUI baseLoginVoiceUI) {
        this.f74023d = baseLoginVoiceUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/ui/BaseLoginVoiceUI$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.account.ui.BaseLoginVoiceUI.U6(this.f74023d);
        yj0.a.h(this, "com/tencent/mm/plugin/account/ui/BaseLoginVoiceUI$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
