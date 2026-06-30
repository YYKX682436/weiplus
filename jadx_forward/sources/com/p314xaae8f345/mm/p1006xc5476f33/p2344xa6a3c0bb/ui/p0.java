package com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui;

/* loaded from: classes.dex */
public final class p0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.ActivityC18845xae54c8ee f257802d;

    public p0(com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.ActivityC18845xae54c8ee activityC18845xae54c8ee) {
        this.f257802d = activityC18845xae54c8ee;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/voiceprint/ui/VoicePrintStateSettingUI$showCreateView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.ActivityC18845xae54c8ee activityC18845xae54c8ee = this.f257802d;
        java.lang.String string = activityC18845xae54c8ee.getString(com.p314xaae8f345.mm.R.C30867xcad56011.j0y);
        ((sb0.f) jVar).getClass();
        boolean a17 = j35.u.a(activityC18845xae54c8ee, "android.permission.RECORD_AUDIO", 80, "", string);
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(a17);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoicePrintStateSettingUI", "summerper checkPermission checkmicrophone[%b], stack[%s], activity[%s]", valueOf, new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3(), activityC18845xae54c8ee);
        if (a17) {
            activityC18845xae54c8ee.V6();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/voiceprint/ui/VoicePrintStateSettingUI$showCreateView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
