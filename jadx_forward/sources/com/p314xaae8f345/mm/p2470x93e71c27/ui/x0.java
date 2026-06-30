package com.p314xaae8f345.mm.p2470x93e71c27.ui;

/* loaded from: classes8.dex */
public final class x0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.ActivityC19638x462df501 f273622d;

    public x0(com.p314xaae8f345.mm.p2470x93e71c27.ui.ActivityC19638x462df501 activityC19638x462df501) {
        this.f273622d = activityC19638x462df501;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/FileSelectorPreviewUI$onCreate$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.p314xaae8f345.mm.p2470x93e71c27.ui.ActivityC19638x462df501.f271300i;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doSend() called dataList:");
        com.p314xaae8f345.mm.p2470x93e71c27.ui.ActivityC19638x462df501 activityC19638x462df501 = this.f273622d;
        sb6.append(activityC19638x462df501.f271303f.size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileSelectorPreviewUI", sb6.toString());
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(activityC19638x462df501.f271303f)) {
            activityC19638x462df501.f271304g.putExtra("RESULT_KEY_ACTION_SEND", true);
            activityC19638x462df501.overridePendingTransition(0, 0);
            activityC19638x462df501.finish();
        }
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/FileSelectorPreviewUI$onCreate$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
