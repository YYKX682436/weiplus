package cw1;

/* loaded from: classes.dex */
public final class p7 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13124x71d67823 f304786d;

    public p7(com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13124x71d67823 activityC13124x71d67823) {
        this.f304786d = activityC13124x71d67823;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/clean/ui/fileindexui/StorageDisableAlertUI$showDialogView$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13124x71d67823 activityC13124x71d67823 = this.f304786d;
        intent.setClassName(activityC13124x71d67823, "com.tencent.mm.plugin.repairer.ui.RepairerMainUI");
        com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13124x71d67823 activityC13124x71d678232 = this.f304786d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(activityC13124x71d678232, arrayList2.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/StorageDisableAlertUI$showDialogView$3", "onLongClick", "(Landroid/view/View;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC13124x71d678232.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(activityC13124x71d678232, "com/tencent/mm/plugin/clean/ui/fileindexui/StorageDisableAlertUI$showDialogView$3", "onLongClick", "(Landroid/view/View;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC13124x71d67823.finish();
        yj0.a.i(false, this, "com/tencent/mm/plugin/clean/ui/fileindexui/StorageDisableAlertUI$showDialogView$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return false;
    }
}
