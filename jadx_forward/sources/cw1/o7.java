package cw1;

/* loaded from: classes.dex */
public final class o7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13124x71d67823 f304742d;

    public o7(com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13124x71d67823 activityC13124x71d67823) {
        this.f304742d = activityC13124x71d67823;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/clean/ui/fileindexui/StorageDisableAlertUI$showDialogView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StorageDisableAlertUI", "Go to CleanNewUI");
        java.lang.String n07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.n0(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        jx3.f fVar = jx3.f.INSTANCE;
        com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13124x71d67823 activityC13124x71d67823 = this.f304742d;
        fVar.d(25984, 203, activityC13124x71d67823.f177335f, n07, "", java.lang.Double.valueOf(activityC13124x71d67823.f177333d));
        android.content.Intent putExtra = new android.content.Intent(activityC13124x71d67823, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13122x435a878b.class).putExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(putExtra, "putExtra(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13124x71d67823 activityC13124x71d678232 = this.f304742d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(putExtra);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(activityC13124x71d678232, arrayList2.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/StorageDisableAlertUI$showDialogView$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC13124x71d678232.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(activityC13124x71d678232, "com/tencent/mm/plugin/clean/ui/fileindexui/StorageDisableAlertUI$showDialogView$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC13124x71d67823.overridePendingTransition(0, 0);
        yj0.a.h(this, "com/tencent/mm/plugin/clean/ui/fileindexui/StorageDisableAlertUI$showDialogView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
