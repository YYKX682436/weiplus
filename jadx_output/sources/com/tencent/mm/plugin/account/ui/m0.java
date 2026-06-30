package com.tencent.mm.plugin.account.ui;

/* loaded from: classes.dex */
public class m0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.BaseLoginVoiceUI f74024d;

    public m0(com.tencent.mm.plugin.account.ui.BaseLoginVoiceUI baseLoginVoiceUI) {
        this.f74024d = baseLoginVoiceUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/ui/BaseLoginVoiceUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        com.tencent.mm.plugin.account.ui.BaseLoginVoiceUI baseLoginVoiceUI = this.f74024d;
        sb6.append(baseLoginVoiceUI.getString(com.tencent.mm.R.string.f492405gi2));
        sb6.append(com.tencent.mm.sdk.platformtools.m2.d());
        com.tencent.mm.plugin.account.ui.BaseLoginVoiceUI.e7(baseLoginVoiceUI, sb6.toString());
        yj0.a.h(this, "com/tencent/mm/plugin/account/ui/BaseLoginVoiceUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
