package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes5.dex */
public class oo implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18100xdd963dbb f251648d;

    public oo(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18100xdd963dbb activityC18100xdd963dbb) {
        this.f251648d = activityC18100xdd963dbb;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI$3");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/SnsSelectChatRoomUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getTag() != null && (view.getTag() instanceof com.p314xaae8f345.mm.p2621x8fb0427b.z3)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18100xdd963dbb.w7(this.f251648d, (com.p314xaae8f345.mm.p2621x8fb0427b.z3) view.getTag());
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/SnsSelectChatRoomUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI$3");
    }
}
