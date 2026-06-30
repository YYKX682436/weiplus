package com.tencent.mm.plugin.account.ui;

/* loaded from: classes8.dex */
public class k implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f73965d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.BaseLoginVoiceUI f73966e;

    public k(com.tencent.mm.plugin.account.ui.BaseLoginVoiceUI baseLoginVoiceUI, com.tencent.mm.ui.widget.dialog.k0 k0Var) {
        this.f73966e = baseLoginVoiceUI;
        this.f73965d = k0Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/ui/BaseLoginVoiceUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f73966e.hideVKB();
        this.f73965d.v();
        yj0.a.h(this, "com/tencent/mm/plugin/account/ui/BaseLoginVoiceUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
