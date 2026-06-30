package com.p314xaae8f345.mm.p1006xc5476f33.p1356x80d8abc0;

/* loaded from: classes12.dex */
public class l implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1356x80d8abc0.ActivityC13198x17b4d807 f178399d;

    public l(com.p314xaae8f345.mm.p1006xc5476f33.p1356x80d8abc0.ActivityC13198x17b4d807 activityC13198x17b4d807) {
        this.f178399d = activityC13198x17b4d807;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1356x80d8abc0.ActivityC13198x17b4d807 activityC13198x17b4d807 = this.f178399d;
        if (activityC13198x17b4d807.f178319m == 0) {
            com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26940xf23b9b2 c26940xf23b9b2 = com.p314xaae8f345.mm.p1006xc5476f33.p1356x80d8abc0.e0.f178374m;
            com.p314xaae8f345.mm.ui.vb.h(true);
            return;
        }
        android.view.View view = activityC13198x17b4d807.f178314e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/dbbackup/DBRecoveryUI$1", "onClick", "(Landroid/content/DialogInterface;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/dbbackup/DBRecoveryUI$1", "onClick", "(Landroid/content/DialogInterface;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = activityC13198x17b4d807.f178315f;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/dbbackup/DBRecoveryUI$1", "onClick", "(Landroid/content/DialogInterface;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/dbbackup/DBRecoveryUI$1", "onClick", "(Landroid/content/DialogInterface;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
