package com.tencent.mm.plugin.account.ui;

/* loaded from: classes8.dex */
public class h0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f73894d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.BaseLoginVoiceUI f73895e;

    public h0(com.tencent.mm.plugin.account.ui.BaseLoginVoiceUI baseLoginVoiceUI, java.util.List list) {
        this.f73895e = baseLoginVoiceUI;
        this.f73894d = list;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/ui/BaseLoginVoiceUI$32", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.account.ui.BaseLoginVoiceUI.T6(this.f73895e, ((db5.h4) this.f73894d.get(0)).f228366g);
        yj0.a.h(this, "com/tencent/mm/plugin/account/ui/BaseLoginVoiceUI$32", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
