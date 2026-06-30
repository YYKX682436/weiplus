package c55;

/* loaded from: classes12.dex */
public final class g implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2499xd05e7f95.ui.ActivityC19821xb90ad83a f120268d;

    public g(com.p314xaae8f345.mm.p2499xd05e7f95.ui.ActivityC19821xb90ad83a activityC19821xb90ad83a) {
        this.f120268d = activityC19821xb90ad83a;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/recovery/ui/RecoveryToolsUI$initSaveLogsToDownloadDir$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.p314xaae8f345.mm.p2499xd05e7f95.ui.ActivityC19821xb90ad83a.f273719i;
        com.p314xaae8f345.mm.p2499xd05e7f95.ui.ActivityC19821xb90ad83a activityC19821xb90ad83a = this.f120268d;
        activityC19821xb90ad83a.getClass();
        boolean z17 = true;
        if (android.os.Build.VERSION.SDK_INT < 29 && b3.l.m9698x3fed0563(activityC19821xb90ad83a, "android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            z2.h.a(activityC19821xb90ad83a, new java.lang.String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 1);
            z17 = false;
        }
        if (z17) {
            activityC19821xb90ad83a.O6();
        }
        yj0.a.h(this, "com/tencent/mm/recovery/ui/RecoveryToolsUI$initSaveLogsToDownloadDir$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
