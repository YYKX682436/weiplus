package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes11.dex */
public final class sb implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderLivePostSelectContactUI f110530d;

    public sb(com.tencent.mm.plugin.finder.feed.ui.FinderLivePostSelectContactUI finderLivePostSelectContactUI) {
        this.f110530d = finderLivePostSelectContactUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/ui/FinderLivePostSelectContactUI$initView$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.finder.feed.ui.FinderLivePostSelectContactUI.T;
        com.tencent.mm.plugin.finder.feed.ui.FinderLivePostSelectContactUI finderLivePostSelectContactUI = this.f110530d;
        finderLivePostSelectContactUI.getClass();
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName(finderLivePostSelectContactUI, "com.tencent.mm.ui.contact.SelectContactUI");
        intent.putExtra("list_type", 1);
        intent.putExtra("titile", finderLivePostSelectContactUI.getString(com.tencent.mm.R.string.eol));
        intent.putExtra("without_openim", true);
        com.tencent.mm.ui.contact.i5.e();
        intent.putExtra("list_attr", com.tencent.mm.ui.contact.i5.g(com.tencent.mm.ui.contact.i5.f206782c & (-16777217), 131072));
        intent.putExtra("already_select_contact", com.tencent.mm.sdk.platformtools.t8.c1(finderLivePostSelectContactUI.G, ","));
        int i18 = finderLivePostSelectContactUI.I;
        if (i18 <= 0) {
            i18 = 500;
        }
        intent.putExtra("max_limit_num", i18);
        intent.putExtra("Forbid_SelectChatRoom", true);
        intent.putExtra("always_select_contact", com.tencent.mm.sdk.platformtools.t8.c1(finderLivePostSelectContactUI.N, ","));
        finderLivePostSelectContactUI.startActivityForResult(intent, 2);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/FinderLivePostSelectContactUI$initView$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
