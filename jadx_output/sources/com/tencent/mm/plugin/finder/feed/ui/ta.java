package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class ta implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderLiveMentionsUI f110562d;

    public ta(com.tencent.mm.plugin.finder.feed.ui.FinderLiveMentionsUI finderLiveMentionsUI) {
        this.f110562d = finderLiveMentionsUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/ui/FinderLiveMentionsUI$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.plugin.finder.feed.ui.FinderLiveMentionsUI finderLiveMentionsUI = this.f110562d;
        intent.setClass(finderLiveMentionsUI.getContext(), com.tencent.mm.plugin.finder.feed.ui.FinderLiveMentionSettingUI.class);
        androidx.appcompat.app.AppCompatActivity context = finderLiveMentionsUI.getContext();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderLiveMentionsUI$initView$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveMentionsUI$initView$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        com.tencent.mm.plugin.finder.assist.a4 a4Var = com.tencent.mm.plugin.finder.assist.a4.f102002a;
        finderLiveMentionsUI.getClass();
        java.lang.String valueOf = java.lang.String.valueOf(com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1);
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        a4Var.b(valueOf, b52.b.b(), "person_page_message_page_more", "");
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveMentionsUI$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
