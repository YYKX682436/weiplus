package com.p314xaae8f345.mm.p1006xc5476f33.fts.ui;

/* loaded from: classes12.dex */
public class s implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15588x58c11aee f219706d;

    public s(com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15588x58c11aee activityC15588x58c11aee) {
        this.f219706d = activityC15588x58c11aee;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fts/ui/FTSAddFriendUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15588x58c11aee activityC15588x58c11aee = this.f219706d;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC15588x58c11aee.f219443n)) {
            activityC15588x58c11aee.L = true;
            su4.k3.c(activityC15588x58c11aee.f219443n, activityC15588x58c11aee.M, 1, 16);
        }
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15588x58c11aee.f219402p1;
        activityC15588x58c11aee.j7();
        if ("yuanbao".equals(activityC15588x58c11aee.Y)) {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("yuanbao_real_account_profile", "view_clk", java.util.Collections.emptyMap(), 34004);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
