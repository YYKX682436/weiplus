package com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui;

/* loaded from: classes.dex */
public final class c0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.ActivityC18844x9df91d1e f257772d;

    public c0(com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.ActivityC18844x9df91d1e activityC18844x9df91d1e) {
        this.f257772d = activityC18844x9df91d1e;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/voiceprint/ui/VoicePrintCreateFinishUI$initPageView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.ActivityC18844x9df91d1e.f257734f;
        com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.ActivityC18844x9df91d1e activityC18844x9df91d1e = this.f257772d;
        activityC18844x9df91d1e.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoicePrintCreateFinishUI", "checkLock() called");
        android.content.Intent intent = new android.content.Intent(activityC18844x9df91d1e, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.ActivityC18849x3feb382a.class);
        intent.putExtra("kscene_type", 73);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(activityC18844x9df91d1e, arrayList2.toArray(), "com/tencent/mm/plugin/voiceprint/ui/VoicePrintCreateFinishUI", "checkLock", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC18844x9df91d1e.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(activityC18844x9df91d1e, "com/tencent/mm/plugin/voiceprint/ui/VoicePrintCreateFinishUI", "checkLock", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC18844x9df91d1e.finish();
        yj0.a.h(this, "com/tencent/mm/plugin/voiceprint/ui/VoicePrintCreateFinishUI$initPageView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
