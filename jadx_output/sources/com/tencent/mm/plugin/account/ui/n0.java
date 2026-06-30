package com.tencent.mm.plugin.account.ui;

/* loaded from: classes5.dex */
public class n0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.BaseLoginVoiceUI f74051d;

    public n0(com.tencent.mm.plugin.account.ui.BaseLoginVoiceUI baseLoginVoiceUI) {
        this.f74051d = baseLoginVoiceUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/ui/BaseLoginVoiceUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ((yn1.h4) ((mv.w) i95.n0.c(mv.w.class))).fj(this.f74051d);
        yj0.a.h(this, "com/tencent/mm/plugin/account/ui/BaseLoginVoiceUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
