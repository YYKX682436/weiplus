package com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui;

/* loaded from: classes.dex */
public final class b0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.ActivityC18844x9df91d1e f257767d;

    public b0(com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.ActivityC18844x9df91d1e activityC18844x9df91d1e) {
        this.f257767d = activityC18844x9df91d1e;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/voiceprint/ui/VoicePrintCreateFinishUI$initPageView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoicePrintCreateFinishUI", "iknown button clicked");
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.ActivityC18844x9df91d1e.f257734f;
        com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.ActivityC18844x9df91d1e activityC18844x9df91d1e = this.f257767d;
        if (((java.lang.Number) ((jz5.n) activityC18844x9df91d1e.f257736e).mo141623x754a37bb()).intValue() == 75) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoicePrintCreateFinishUI", "create");
            android.content.Intent intent = new android.content.Intent(activityC18844x9df91d1e, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.ActivityC18840xef9a7fc2.class);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(activityC18844x9df91d1e, arrayList2.toArray(), "com/tencent/mm/plugin/voiceprint/ui/VoicePrintCreateFinishUI", "create", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activityC18844x9df91d1e.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(activityC18844x9df91d1e, "com/tencent/mm/plugin/voiceprint/ui/VoicePrintCreateFinishUI", "create", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activityC18844x9df91d1e.overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559390df, com.p314xaae8f345.mm.R.C30854x2dc211.f559261p);
        }
        activityC18844x9df91d1e.finish();
        yj0.a.h(this, "com/tencent/mm/plugin/voiceprint/ui/VoicePrintCreateFinishUI$initPageView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
