package vw3;

/* loaded from: classes.dex */
public final class q1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerFolderUI f522612d;

    public q1(com.tencent.mm.plugin.repairer.ui.RepairerFolderUI repairerFolderUI) {
        this.f522612d = repairerFolderUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/RepairerFolderUI$onCreate$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent((android.content.Context) this.f522612d, (java.lang.Class<?>) com.tencent.mm.plugin.repairer.ui.RepairerFileListUI.class);
        intent.putExtra(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, "聊天记录消息");
        intent.putExtra("dirPath", "wcf://record/");
        com.tencent.mm.plugin.repairer.ui.RepairerFolderUI repairerFolderUI = this.f522612d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(repairerFolderUI, arrayList2.toArray(), "com/tencent/mm/plugin/repairer/ui/RepairerFolderUI$onCreate$8", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        repairerFolderUI.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(repairerFolderUI, "com/tencent/mm/plugin/repairer/ui/RepairerFolderUI$onCreate$8", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/RepairerFolderUI$onCreate$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
