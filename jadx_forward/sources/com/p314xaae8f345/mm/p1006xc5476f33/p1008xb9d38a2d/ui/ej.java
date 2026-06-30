package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* loaded from: classes.dex */
public final class ej implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11474x746047e0 f155363d;

    public ej(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11474x746047e0 activityC11474x746047e0) {
        this.f155363d = activityC11474x746047e0;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/ui/VoicePhoneLanguageTipsUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("btnOk:OnClickListener language:");
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11474x746047e0 activityC11474x746047e0 = this.f155363d;
        sb6.append(activityC11474x746047e0.f155223i);
        sb6.append(' ');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoicePhoneLanguageTipsUI", sb6.toString());
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("INTENT_KEY_LANGUAGE_CODE", activityC11474x746047e0.f155223i);
        activityC11474x746047e0.setResult(-1, intent);
        activityC11474x746047e0.finish();
        yj0.a.h(this, "com/tencent/mm/plugin/account/ui/VoicePhoneLanguageTipsUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
