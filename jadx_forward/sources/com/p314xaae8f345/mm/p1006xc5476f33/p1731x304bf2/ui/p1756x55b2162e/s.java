package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e;

/* loaded from: classes8.dex */
public class s implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.ActivityC16002xae5f607f f222842d;

    public s(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.ActivityC16002xae5f607f activityC16002xae5f607f) {
        this.f222842d = activityC16002xae5f607f;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/ui/chat_tab/GameChatTabUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.ActivityC16002xae5f607f activityC16002xae5f607f = this.f222842d;
        long intExtra = activityC16002xae5f607f.getIntent().getIntExtra("game_report_from_scene", 0);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6633xea2e527d c6633xea2e527d = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6633xea2e527d();
        c6633xea2e527d.f139873d = 2L;
        c6633xea2e527d.f139874e = 201L;
        c6633xea2e527d.f139875f = 0L;
        c6633xea2e527d.f139876g = 7L;
        c6633xea2e527d.f139877h = intExtra;
        c6633xea2e527d.k();
        r53.f.u(activityC16002xae5f607f, activityC16002xae5f607f.f222652q);
        yj0.a.h(this, "com/tencent/mm/plugin/game/ui/chat_tab/GameChatTabUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
