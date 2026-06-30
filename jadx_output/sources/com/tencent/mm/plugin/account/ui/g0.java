package com.tencent.mm.plugin.account.ui;

/* loaded from: classes8.dex */
public class g0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f73869d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.BaseLoginVoiceUI f73870e;

    public g0(com.tencent.mm.plugin.account.ui.BaseLoginVoiceUI baseLoginVoiceUI, com.tencent.mm.ui.widget.dialog.k0 k0Var) {
        this.f73870e = baseLoginVoiceUI;
        this.f73869d = k0Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/ui/BaseLoginVoiceUI$31", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.account.ui.BaseLoginVoiceUI baseLoginVoiceUI = this.f73870e;
        baseLoginVoiceUI.hideVKB();
        this.f73869d.v();
        if (baseLoginVoiceUI.Z6()) {
            q61.j.g(1, 0);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/account/ui/BaseLoginVoiceUI$31", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
