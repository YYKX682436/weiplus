package cw1;

/* loaded from: classes.dex */
public final class n7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13124x71d67823 f304717d;

    public n7(com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13124x71d67823 activityC13124x71d67823) {
        this.f304717d = activityC13124x71d67823;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/clean/ui/fileindexui/StorageDisableAlertUI$showDialogView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StorageDisableAlertUI", "Go to Storage Setting");
        java.lang.String n07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.n0(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        jx3.f fVar = jx3.f.INSTANCE;
        com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13124x71d67823 activityC13124x71d67823 = this.f304717d;
        fVar.d(25984, 202, activityC13124x71d67823.f177335f, n07, "", java.lang.Double.valueOf(activityC13124x71d67823.f177333d));
        activityC13124x71d67823.getClass();
        try {
            android.content.Intent intent = new android.content.Intent();
            intent.setAction("android.settings.INTERNAL_STORAGE_SETTINGS");
            intent.addFlags(268435456);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(activityC13124x71d67823, arrayList2.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/StorageDisableAlertUI", "openStorageSettings", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activityC13124x71d67823.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(activityC13124x71d67823, "com/tencent/mm/plugin/clean/ui/fileindexui/StorageDisableAlertUI", "openStorageSettings", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } catch (android.content.ActivityNotFoundException unused) {
        }
        yj0.a.h(this, "com/tencent/mm/plugin/clean/ui/fileindexui/StorageDisableAlertUI$showDialogView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
