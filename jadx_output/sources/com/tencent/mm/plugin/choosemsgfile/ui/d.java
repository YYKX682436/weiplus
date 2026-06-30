package com.tencent.mm.plugin.choosemsgfile.ui;

/* loaded from: classes12.dex */
public class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.choosemsgfile.ui.ChooseMsgFileListUI f95618d;

    public d(com.tencent.mm.plugin.choosemsgfile.ui.ChooseMsgFileListUI chooseMsgFileListUI) {
        this.f95618d = chooseMsgFileListUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        boolean z17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/choosemsgfile/ui/ChooseMsgFileListUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.choosemsgfile.ui.ChooseMsgFileListUI chooseMsgFileListUI = this.f95618d;
        xv1.b bVar = chooseMsgFileListUI.f95572i;
        synchronized (bVar) {
            java.util.Set set = bVar.f457390d;
            if (set != null) {
                if (((java.util.HashSet) set).size() > 0) {
                    z17 = true;
                }
            }
            z17 = false;
        }
        if (!z17) {
            android.content.Intent intent = new android.content.Intent();
            intent.putParcelableArrayListExtra("FILEPATHS", chooseMsgFileListUI.f95572i.a());
            chooseMsgFileListUI.setResult(-1, intent);
            chooseMsgFileListUI.finish();
            yj0.a.h(this, "com/tencent/mm/plugin/choosemsgfile/ui/ChooseMsgFileListUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(chooseMsgFileListUI);
        u1Var.g(chooseMsgFileListUI.getString(com.tencent.mm.R.string.b77));
        u1Var.a(true);
        u1Var.b(new com.tencent.mm.plugin.choosemsgfile.ui.c(this));
        u1Var.q(false);
        yj0.a.h(this, "com/tencent/mm/plugin/choosemsgfile/ui/ChooseMsgFileListUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
