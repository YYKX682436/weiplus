package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes8.dex */
public final class t7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderKitUI f211396d;

    public t7(com.tencent.mm.plugin.finder.ui.FinderKitUI finderKitUI) {
        this.f211396d = finderKitUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.lang.CharSequence text;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/ui/FinderKitUI$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.ui.FinderKitUI finderKitUI = this.f211396d;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = finderKitUI.mo55332x76847179();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a();
        aVar.f293242a = "端外H5内测入口";
        aVar.f293247d = "粘贴H5链接，点击确定";
        aVar.f293249f = true;
        aVar.f293265v = "确定";
        aVar.f293266w = "取消";
        aVar.E = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.s7(finderKitUI);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0(mo55332x76847179, com.p314xaae8f345.mm.R.C30868x68b1db1.f576324wd);
        j0Var.e(aVar);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.d0 d0Var = aVar.f293256m;
        if (d0Var != null) {
            d0Var.a(j0Var.f293370r);
        }
        java.lang.Object systemService = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("clipboard");
        android.content.ClipboardManager clipboardManager = systemService instanceof android.content.ClipboardManager ? (android.content.ClipboardManager) systemService : null;
        android.content.ClipData primaryClip = clipboardManager != null ? clipboardManager.getPrimaryClip() : null;
        if (primaryClip != null) {
            android.content.ClipData.Item itemAt = primaryClip.getItemAt(0);
            if (itemAt == null || (text = itemAt.getText()) == null || (str = text.toString()) == null) {
                str = "";
            }
            j0Var.f293370r.setVisibility(0);
            j0Var.f293370r.setText(str);
        }
        j0Var.show();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/ui/FinderKitUI$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
