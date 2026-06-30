package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e;

/* loaded from: classes8.dex */
public final class c0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f222778d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C16005x8451a937 f222779e;

    public c0(android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C16005x8451a937 c16005x8451a937) {
        this.f222778d = view;
        this.f222779e = c16005x8451a937;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/ui/chat_tab/GameMsgNoticeFragment$onBindHeaderViewHolder$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("game_msg_center_tab_type", 2);
        java.lang.Integer num = null;
        j45.l.j(this.f222778d.getContext(), "game", ".ui.message.GameMsgCenterUI", intent, null);
        java.lang.Object tag = view.getTag();
        if (tag != null) {
            num = java.lang.Integer.valueOf(tag instanceof java.lang.Integer ? ((java.lang.Number) tag).intValue() : 0);
        }
        com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 21, 2101, 2, 6, (int) e63.a.f331350a, this.f222779e.j0(num));
        yj0.a.h(this, "com/tencent/mm/plugin/game/ui/chat_tab/GameMsgNoticeFragment$onBindHeaderViewHolder$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
