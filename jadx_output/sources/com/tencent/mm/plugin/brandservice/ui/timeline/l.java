package com.tencent.mm.plugin.brandservice.ui.timeline;

/* loaded from: classes.dex */
public final class l implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.ui.timeline.BizTestUI f94154d;

    public l(com.tencent.mm.plugin.brandservice.ui.timeline.BizTestUI bizTestUI) {
        this.f94154d = bizTestUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/brandservice/ui/timeline/BizTestUI$onCreate$4$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.brandservice.ui.timeline.BizTestUI bizTestUI = this.f94154d;
        boolean z17 = !bizTestUI.e.i("biz_tl_video_auto_play", false);
        com.tencent.mm.sdk.platformtools.o4 o4Var = bizTestUI.e;
        o4Var.G("biz_tl_video_auto_play", z17);
        o4Var.G("biz_tl_flutter_large_card_auto_play", z17);
        o4Var.G("biz_tl_flutter_scroll_list_card_auto_play", z17);
        o4Var.G("biz_tl_flutter_often_read_video_auto_play", z17);
        o4Var.G("biz_tl_flutter_live_card_auto_play", z17);
        o4Var.G("biz_tl_flutter_rec_flow_live_dual_card_auto_play", z17);
        o4Var.G("biz_tl_flutter_often_read_live_auto_play", z17);
        bizTestUI.e.getClass();
        com.tencent.mm.plugin.brandservice.ui.timeline.BizTestUI.T6(bizTestUI);
        yj0.a.h(this, "com/tencent/mm/plugin/brandservice/ui/timeline/BizTestUI$onCreate$4$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
