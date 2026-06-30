package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes.dex */
public final class xa implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderLiveMoreOptionSettingUI f110729d;

    public xa(com.tencent.mm.plugin.finder.feed.ui.FinderLiveMoreOptionSettingUI finderLiveMoreOptionSettingUI) {
        this.f110729d = finderLiveMoreOptionSettingUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/ui/FinderLiveMoreOptionSettingUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.plugin.finder.feed.ui.FinderLiveMoreOptionSettingUI finderLiveMoreOptionSettingUI = this.f110729d;
        if (finderLiveMoreOptionSettingUI.getContext() instanceof com.tencent.mm.ui.MMActivity) {
            android.content.Intent intent2 = !(finderLiveMoreOptionSettingUI.getContext() instanceof android.app.Activity) ? intent : null;
            if (intent2 != null) {
                intent2.addFlags(268435456);
            }
            intent.setClassName(finderLiveMoreOptionSettingUI.getContext(), "com.tencent.mm.plugin.finder.feed.ui.FinderSettingGameRankUI");
            androidx.appcompat.app.AppCompatActivity context = finderLiveMoreOptionSettingUI.getContext();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderLiveMoreOptionSettingUI$onCreate$3", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveMoreOptionSettingUI$onCreate$3", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveMoreOptionSettingUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
