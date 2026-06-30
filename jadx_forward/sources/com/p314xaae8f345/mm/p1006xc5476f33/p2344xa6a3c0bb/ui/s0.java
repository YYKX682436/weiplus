package com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui;

/* loaded from: classes.dex */
public final class s0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.ActivityC18845xae54c8ee f257808d;

    public s0(com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.ActivityC18845xae54c8ee activityC18845xae54c8ee) {
        this.f257808d = activityC18845xae54c8ee;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/voiceprint/ui/VoicePrintStateSettingUI$showSwitchView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoicePrintStateSettingUI", "showSwitchView: check layout click");
        com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.ActivityC18845xae54c8ee activityC18845xae54c8ee = this.f257808d;
        android.content.Intent intent = new android.content.Intent(activityC18845xae54c8ee, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.ActivityC18849x3feb382a.class);
        intent.putExtra("kscene_type", 73);
        intent.putExtra("trans_out_anim", com.p314xaae8f345.mm.R.C30854x2dc211.f559388dd);
        com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.ActivityC18845xae54c8ee activityC18845xae54c8ee2 = this.f257808d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(activityC18845xae54c8ee2, arrayList2.toArray(), "com/tencent/mm/plugin/voiceprint/ui/VoicePrintStateSettingUI$showSwitchView$3", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC18845xae54c8ee2.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(activityC18845xae54c8ee2, "com/tencent/mm/plugin/voiceprint/ui/VoicePrintStateSettingUI$showSwitchView$3", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC18845xae54c8ee.overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559390df, com.p314xaae8f345.mm.R.C30854x2dc211.f559261p);
        yj0.a.h(this, "com/tencent/mm/plugin/voiceprint/ui/VoicePrintStateSettingUI$showSwitchView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
